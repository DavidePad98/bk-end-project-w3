package dao;

import entities.Libri;
import entities.Prestito;
import entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PrestitiDAO {
    private final EntityManager em;

    public PrestitiDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito prestiti) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(prestiti);
        tr.commit();
        System.out.println("Il prestito destinato a: " + prestiti.getUtente() + " è stato salvato");
    }

    public List<Prestito> ricercaPrestitiPerTessera(int n){
        TypedQuery<Prestito> query = em.createNamedQuery("ricercaPrestitiPerTessera", Prestito.class);
        query.setParameter("numero_tessera", n);
        return query.getResultList();
    }

    public List<Prestito> ricercaPrestitiScaduti(){
        TypedQuery<Prestito> query = em.createNamedQuery("pres", Prestito.class);
        return query.getResultList();
    }

}
