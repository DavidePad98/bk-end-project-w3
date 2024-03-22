package entities;

import jakarta.persistence.*;
import org.example.Application;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "catalogue")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Catalogo {
    @Id
    protected  String ISBN;
    protected  String titolo;
    protected  LocalDate anno_pubblicazione;
    protected  int numero_pagine;
    @OneToMany(mappedBy = "elemento")
    List<Prestito> prestiti;

    public Catalogo( String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.ISBN = Application.faker.code().isbn10();
        this.titolo = titolo;
        this.anno_pubblicazione = annoPubblicazione;
        this.numero_pagine = numeroPagine;
    }

    protected Catalogo() {
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getAnno_pubblicazione() {
        return anno_pubblicazione;
    }

    public int getNumero_pagine() {
        return numero_pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "ISBN='" + ISBN + '\'' +
                ", titolo='" + titolo + '\'' +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", numero_pagine=" + numero_pagine +
                '}';
    }
}
