package dao;

import jakarta.persistence.EntityManager;

public class PrestitiDAO {
    private final EntityManager em;
    
    public PrestitiDAO(EntityManager em) {
        this.em = em;
    }
}
