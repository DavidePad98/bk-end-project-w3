package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

public class Prestito {

    private Utente utente;
    private ElementoPrestato elemento;
    private LocalDate data_prestito;
    private LocalDate data_r_prevista;
    private LocalDate data_r_effettiva;

    public Prestito(Utente utente, ElementoPrestato elemento, LocalDate data_prestito, LocalDate data_r_prevista, LocalDate data_r_effettiva) {
        this.utente = utente;
        this.elemento = elemento;
        this.data_prestito = data_prestito;
        this.data_r_prevista = data_r_prevista;
        this.data_r_effettiva = data_r_effettiva;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public ElementoPrestato getElemento() {
        return elemento;
    }

    public void setElemento(ElementoPrestato elemento) {
        this.elemento = elemento;
    }

    public LocalDate getData_prestito() {
        return data_prestito;
    }

    public void setData_prestito(LocalDate data_prestito) {
        this.data_prestito = data_prestito;
    }

    public LocalDate getData_r_prevista() {
        return data_r_prevista;
    }

    public void setData_r_prevista(LocalDate data_r_prevista) {
        this.data_r_prevista = data_r_prevista;
    }

    public LocalDate getData_r_effettiva() {
        return data_r_effettiva;
    }

    public void setData_r_effettiva(LocalDate data_r_effettiva) {
        this.data_r_effettiva = data_r_effettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elemento=" + elemento +
                ", data_prestito=" + data_prestito +
                ", data_r_prevista=" + data_r_prevista +
                ", data_r_effettiva=" + data_r_effettiva +
                '}';
    }
}
