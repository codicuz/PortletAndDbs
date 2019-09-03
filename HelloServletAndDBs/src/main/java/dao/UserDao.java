package dao;

import model.User;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.transaction.UserTransaction;
import java.util.List;

public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public static int register(User u) throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        int i = 0;
        i=1;
        em.persist(u);

        em.getTransaction().commit();

        em.close();
        em.getEntityManagerFactory().close();

        return i;


    }

    @SuppressWarnings("unchecked")
    public static List<User> getAllUser() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        List < User > listOfUser = null;

        Query query = em.createQuery("SELECT c from User c");
        listOfUser = query.getResultList();

        em.close();
        em.getEntityManagerFactory().close();

        return listOfUser;
    }

//    public List<User> getAllUsr() {
//        List < User > listOfUser = null;
//        Query q = em.createNativeQuery("select c from user c");
//        listOfUser = q.getResultList();
//
//        em.close();
//        em.getEntityManagerFactory().close();
//        return listOfUser;
//    }



}