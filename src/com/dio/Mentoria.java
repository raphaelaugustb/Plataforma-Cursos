package com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private final LocalDate date;
    private double xp_adicional;
    public Mentoria(String title, String description, LocalDate date, double xp_adicional){
        super(title,description);
        this.date = date;
        this.xp_adicional = xp_adicional;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + xp_adicional;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Tittle='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date + "XP=" + xp_adicional +
                '}';
    }
}
