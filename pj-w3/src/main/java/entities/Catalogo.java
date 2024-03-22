package entities;

import jakarta.persistence.*;
import org.example.Application;

import java.util.List;

@Entity
@Table(name = "catalogue")
@Inheritance(strategy = InheritanceType.JOINED)
public class Catalogo {
    @Id
    protected final String ISBN;
    protected final String titolo;
    protected final int anno_pubblicazione;
    protected final int numero_pagine;
    @OneToMany(mappedBy = "elemento")
    List<Prestito> prestiti;

    public Catalogo( String titolo, int annoPubblicazione, int numeroPagine) {
        this.ISBN = Application.faker.code().isbn10();
        this.titolo = titolo;
        this.anno_pubblicazione = annoPubblicazione;
        this.numero_pagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno_pubblicazione() {
        return anno_pubblicazione;
    }

    public int getNumero_pagine() {
        return numero_pagine;
    }
}
