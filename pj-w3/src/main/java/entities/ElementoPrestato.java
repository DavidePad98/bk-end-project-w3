package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class ElementoPrestato {
    private Libri libro;
    private Riviste riviste;

    public ElementoPrestato(Libri libro, Riviste riviste) {
        this.libro = libro;
        this.riviste = riviste;
    }

    public Libri getLibro() {
        return libro;
    }

    public void setLibro(Libri libro) {
        this.libro = libro;
    }

    public Riviste getRiviste() {
        return riviste;
    }

    public void setRiviste(Riviste riviste) {
        this.riviste = riviste;
    }

    @Override
    public String toString() {
        return "ElementoPrestato{" +
                "libro=" + libro +
                ", riviste=" + riviste +
                '}';
    }
}
