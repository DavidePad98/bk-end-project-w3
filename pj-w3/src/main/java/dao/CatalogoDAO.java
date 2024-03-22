package dao;

import entities.Catalogo;
import entities.Libri;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;

public class CatalogoDAO {
    private  final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Catalogo catalogo) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(catalogo);
        tr.commit();
        System.out.println("Il catalogo: " + catalogo.getTitolo() + " è stato salvato");
    }

    public Catalogo findElementByISBN(String ISBN){
        Catalogo cat = em.find(Catalogo.class, ISBN);
        if (cat == null){
            System.out.println("errore, non trovato");
        }
        return cat;
    }

    public void findAndDelete(String ISBN){
        Catalogo cat = findElementByISBN(ISBN);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(cat);
        transaction.commit();
        System.out.println("elemento eliminato");
    }

    public List<Catalogo> findByPubYear(int anno){
        TypedQuery<Catalogo> query = em.createNamedQuery("findByPubYear", Catalogo.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<Libri> findByAuthor(String autore){
        TypedQuery<Libri> query = em.createQuery("SELECT l FROM Libri l WHERE l.autore = :autore", Libri.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }


}
