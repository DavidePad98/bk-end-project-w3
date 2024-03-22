package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "prestiti")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestito")
    private int id_prestito;
    @ManyToOne
    @JoinColumn(name = "users-d")
    private Utente utente;
    @ManyToOne
     @JoinColumn(name = "univoco")
    private Catalogo elemento;
    @Column(name = "data_prestito")
    private LocalDate data_prestito;
    @Column(name = "data_r_prevista")
    private LocalDate data_r_prevista;
    @Column(name = "data_r_effettiva")
    private LocalDate data_r_effettiva;


    public Prestito(Utente utente, Catalogo elemento, LocalDate data_prestito, LocalDate data_r_prevista, LocalDate data_r_effettiva) {
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

    public int getId_prestito() {
        return id_prestito;
    }



    public Catalogo getElemento() {
        return elemento;
    }

    public void setElemento(Catalogo elemento) {
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
