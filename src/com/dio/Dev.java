package com.dio;

import com.dio.exception.InvalidBootcampException;
import com.dio.exception.InvalidContentException;

import java.util.*;

public class Dev {
    private final String  name;
    private final List<Conteudo> signedContents;
    private final List<Conteudo> finishedContent;

    public Dev(String name) {
        this.name = name;
        this.signedContents = new ArrayList<>();
        this.finishedContent = new ArrayList<>();
    }
    public void addNewSignedBootcamp(Bootcamp bootcamp) throws InvalidBootcampException {
        if (bootcamp.getContents().isEmpty()){
            throw new InvalidBootcampException("Bootcamp não encontrado");
        } else {
            signedContents.addAll(bootcamp.getContents());
            bootcamp.addNewSignedDevs(this);
            System.out.println("Inscrição Concluída no bootcamp: " + bootcamp.getName());
        }
    }
    public void addNewContent(Conteudo content){
        signedContents.add(content);
    }

    public List<Conteudo> getFinishedContent() {
        return finishedContent;
    }

    public double calcularTotalXp() {
        double soma = 0;
        for (Conteudo c : signedContents){
            double next = c.calcularXp();
            soma += next;
        }
        return soma;
    }
    public void studying() throws  InvalidContentException{

        Optional<Conteudo> addFinishedContents = signedContents.stream().findFirst();
        if (signedContents.isEmpty()){
            throw new InvalidContentException("Você não está matriculado em nenhum conteúdo!");
        } else {

            finishedContent.add(addFinishedContents.get());
            signedContents.remove(addFinishedContents.get());
        }
    }

    public List<Conteudo> getSignedContents() {
        return signedContents;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", signedContents=" + signedContents +
                ", finishedContent=" + finishedContent +
                '}';
    }
}
