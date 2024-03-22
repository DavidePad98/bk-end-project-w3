package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class Catalogo {

    protected final long ISBN;
    protected final String titolo;
    protected final int anno_pubblicazione;
    protected final int numero_pagine;

    public Catalogo(long isbn, String titolo, int annoPubblicazione, int numeroPagine) {
        ISBN = isbn;
        this.titolo = titolo;
        anno_pubblicazione = annoPubblicazione;
        numero_pagine = numeroPagine;
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
