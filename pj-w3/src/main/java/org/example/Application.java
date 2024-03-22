package org.example;

import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogo");
    public static final Faker faker = new Faker();
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("ei");

    }
}
