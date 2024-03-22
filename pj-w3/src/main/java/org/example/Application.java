package org.example;

import com.github.javafaker.Faker;
import dao.CatalogoDAO;
import dao.UtenteDAO;
import entities.Libri;
import entities.Prestito;
import entities.Riviste;
import entities.Utente;
import enums.Genere;
import enums.Periodicita;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogo");
    public static final Faker faker = new Faker();
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        UtenteDAO ud = new UtenteDAO(em);
        CatalogoDAO cd = new CatalogoDAO(em);
        System.out.println("ei");

        //++++++++++++++++++++++++++++ AGGIUNTA ELEMENTI ++++++++++++++++++++++++++++++
//        Utente u1 = new Utente("Mario", "Rossi", LocalDate.of(1998, 10, 15));
//        Utente u2 = new Utente("Napoleone", "Bonaparte", LocalDate.of(1995, 1, 1));
//        Utente u3 = new Utente("Luca", "Roi", LocalDate.of(1999, 2, 5));
//        Utente u4 = new Utente("Marco", "Viola", LocalDate.of(2000, 12, 25));
//        Utente u5 = new Utente("Josef", "Banana", LocalDate.of(1500, 6, 9));
//        ud.save(u1);ud.save(u2);ud.save(u3);ud.save(u4);ud.save(u5);

//        Libri l4 = new Libri(faker.book().title(), LocalDate.of(2015,1,2), 150, faker.book().author(), Genere.THRILLER);

//        Riviste r3 = new Riviste(faker.book().title(), LocalDate.of(2024, 1, 2), 30, Periodicita.SETTIMANALE);
//        cd.save(r3);



        //++++++++++++++++++++++++++++ RICERCA ELEMENTI ++++++++++++++++++++++++++++++

        //Ricerca per ISBN
//        System.out.println(cd.findElementByISBN("0066562791"));

        //Eliminazione tramite ISBN
//        cd.findAndDelete("0667329528");

    }
}
