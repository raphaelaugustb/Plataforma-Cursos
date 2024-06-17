package com.dio;

public class Curso  extends Conteudo{
    private final int workLoad;

    public Curso(String title, String description, int workLoad){
        super(title, description);
        this.workLoad = workLoad;
    }


    public int getWorkLoad() {
        return workLoad;
    }
    public double calcularXp(){
        return XP_PADRAO * workLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tittle='" + getTitle()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                "h}";
    }
}
