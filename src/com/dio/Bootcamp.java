package com.dio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private final String name;
    private final String description;
    private final LocalDate initialDate;
    private final LocalDate finalDate;
    private final Set<Dev> signedDevs;
    private final Set<Conteudo> contents;

    public Bootcamp(String name, String description
    ) {
        this.name = name;
        this.signedDevs = new HashSet<>();
        this.description = description;
        this.contents = new LinkedHashSet<>();
        initialDate = LocalDate.now();
        finalDate = initialDate.plusDays(45);

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSignedDevs() {
        return signedDevs;
    }

    public void addNewSignedDevs(Dev dev) {
        signedDevs.add(dev);
    }
    public void addNewContent( Conteudo content){
        this.contents.add(content);
    }

    public Set<Conteudo> getContents() {
        return contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass   () != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(signedDevs, bootcamp.signedDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", initialDate=" + initialDate +
                ", finalDate=" + finalDate +
                ", signedDevs=" + signedDevs +
                ", contents=" + contents +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, signedDevs, contents);
    }
}