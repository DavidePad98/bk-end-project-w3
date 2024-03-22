package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "n_tessera")
    private int numero_tessera;
    private String nome;
    private String cognome;
    private LocalDate data_nascita;
    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti;

    public Utente(String nome, String cognome, LocalDate data_nascita, int numero_tessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_nascita = data_nascita;
        this.numero_tessera = numero_tessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getData_nascita() {
        return data_nascita;
    }

    public void setData_nascita(LocalDate data_nascita) {
        this.data_nascita = data_nascita;
    }

    public int getNumero_tessera() {
        return numero_tessera;
    }

    public void setNumero_tessera(int numero_tessera) {
        this.numero_tessera = numero_tessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", data_nascita=" + data_nascita +
                ", numero_tessera=" + numero_tessera +
                '}';
    }
}
