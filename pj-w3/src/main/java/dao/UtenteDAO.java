package dao;

import entities.Catalogo;
import entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Utente utente){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utente);
        transaction.commit();
        System.out.println("L'utente " + utente.getNome() + " è stato salvato correttamente!");
    }
    public Utente findUsertByIdTessera(int numero_tessera){
        Utente user = em.find(Utente.class, numero_tessera);
        if (user == null){
            System.out.println("errore, non trovato");
        }
        return user;
    }
}
