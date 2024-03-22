package entities;

import enums.Periodicita;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "magazine")
public class Riviste extends Catalogo {
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;


    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Riviste() {
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", numero_pagine=" + numero_pagine +
                '}';
    }
}
