package dao;

import model.User;

import javax.persistence.*;


import java.util.List;

public class Dao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
    private EntityManager em = emf.createEntityManager();

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        Query query = em.createQuery("select c from User c");
        return query.getResultList();
    }

    public int addUser(User u) throws Exception {
        int i = 1;

        User us = new User();
        us.setEmail("MyEmail3");
        us.setPassword("MyPassword3");
        us.setName("MyName3");

        em.getTransaction().begin();
        em.persist(us);
        em.getTransaction().commit();

        return i;
    }
}