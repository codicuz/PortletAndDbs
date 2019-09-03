package dao;

import model.User;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.transaction.UserTransaction;
import java.util.List;

public class Dao {
    @PersistenceContext(unitName = "connDB")
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        EntityManagerFactory emff =  Persistence.createEntityManagerFactory("connDB");
        EntityManager emm = emff.createEntityManager();
//        ut.begin();
//        em = emf.createEntityManager();

        Query query = emm.createQuery("select c from User c");


        return query.getResultList();
    }

    public int addUser(User u) {
        EntityManagerFactory emff =  Persistence.createEntityManagerFactory("connDB");
        EntityManager emm = emff.createEntityManager();
        EntityTransaction et = emm.getTransaction();
        et.begin();
        int i = 1;

        emm.persist(u);
        emm.getTransaction().commit();
        emm.close();

        return i;
    }

}
