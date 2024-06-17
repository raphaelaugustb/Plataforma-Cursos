package com.dio;

public abstract class Conteudo {
   protected static final double XP_PADRAO = 10d;
   private final String title;
   private final String description;

    public Conteudo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public abstract double calcularXp();
}
