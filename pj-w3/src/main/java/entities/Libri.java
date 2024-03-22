package entities;

import enums.Genere;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Libri extends Catalogo{
private  String autore;
@Enumerated(EnumType.STRING)
private  Genere genere;
    public Libri( String titolo, int annoPubblicazione, int numeroPagine) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.autore=autore;
        this.genere=genere;
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
