package entities;

import enums.Genere;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Libri extends Catalogo{
private  String autore;
@Enumerated(EnumType.STRING)
private  Genere genere;
    public Libri(String titolo, int annoPubblicazione, int numeroPagine, String autore, Genere genere) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.autore=autore;
        this.genere=genere;
    }

    public Libri() {

    }

    public String getAutore() {
        return autore;
    }

    public Genere getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", numero_pagine=" + numero_pagine +
                '}';
    }
}
