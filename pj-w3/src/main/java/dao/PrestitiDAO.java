package dao;

import entities.Libri;
import entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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

    public List<Prestito> prestitiDataTesseraUtente()
}
