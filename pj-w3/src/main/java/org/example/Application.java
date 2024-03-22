package org.example;

import com.github.javafaker.Faker;
import dao.CatalogoDAO;
import dao.PrestitiDAO;
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
        PrestitiDAO pd = new PrestitiDAO(em);
        System.out.println("ei");

        //++++++++++++++++++++++++++++ AGGIUNTA ELEMENTI ++++++++++++++++++++++++++++++
//        Utente u1 = new Utente("Mario", "Rossi", LocalDate.of(1998, 10, 15));
//        Utente u2 = new Utente("Napoleone", "Bonaparte", LocalDate.of(1995, 1, 1));
//        Utente u3 = new Utente("Luca", "Roi", LocalDate.of(1999, 2, 5));
//        Utente u4 = new Utente("Marco", "Viola", LocalDate.of(2000, 12, 25));
//        Utente u5 = new Utente("Josef", "Banana", LocalDate.of(1500, 6, 9));
//        ud.save(u1);ud.save(u2);ud.save(u3);ud.save(u4);ud.save(u5);

//        Libri l1 = new Libri(faker.book().title(), LocalDate.of(2015,1,2), 150, faker.book().author(), Genere.THRILLER);
//        cd.save(l1);
//        cd.save(new Libri(faker.book().title(), 1900, 150, faker.book().author(), Genere.THRILLER));
//        cd.save(new Libri(faker.book().title(), 1999, 250, faker.book().author(), Genere.ACTION));
//        cd.save(new Libri(faker.book().title(), 2000, 350, faker.book().author(), Genere.FANTASY));
//        cd.save(new Libri(faker.book().title(), 2010, 450, faker.book().author(), Genere.HORROR));
//        cd.save(new Libri(faker.book().title(), 2020, 550, faker.book().author(), Genere.FANTASY));

//        Riviste r3 = new Riviste(faker.book().title(), LocalDate.of(2024, 1, 2), 30, Periodicita.SETTIMANALE);
//        cd.save(r3);

        //MI è COSTATO CARO NON LEGGERE BENE LA CONSEGNA :') <------

//        cd.save(new Riviste(faker.book().title(), 2010, 30, Periodicita.SETTIMANALE));
//        cd.save(new Riviste(faker.book().title(), 2015, 30, Periodicita.MENSILE));
//        cd.save(new Riviste(faker.book().title(), 2019, 30, Periodicita.SETTIMANALE));
//        cd.save(new Riviste(faker.book().title(), 2020, 30, Periodicita.SEMESTRALE));
//        cd.save(new Riviste(faker.book().title(), 1990, 30, Periodicita.SETTIMANALE));

//        Prestito p4 = new Prestito(ud.findUsertByIdTessera(4), cd.findElementByISBN("0765341379"), LocalDate.of(2024,10,10), LocalDate.of(2024,11,10), LocalDate.of(2024,12,10));
//        pd.save(p4);

        //++++++++++++++++++++++++++++ RICERCA ELEMENTI ++++++++++++++++++++++++++++++

        //Ricerca per ISBN
//        System.out.println(cd.findElementByISBN("099541971X"));

        //Eliminazione tramite ISBN
//        cd.findAndDelete("0986637068");

        //Ricerca per anno pubblicazione
//        cd.findByPubYear(1900).forEach(System.out::println);

        //Ricerca per autore
//        cd.findByAuthor("Madelaine Ledner").forEach(System.out::println);

    }
}
