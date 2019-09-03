package dao;

import org.apache.openjpa.persistence.OpenJPAEntityManager;
import org.apache.openjpa.persistence.OpenJPAEntityManagerFactory;
import org.apache.openjpa.persistence.OpenJPAPersistence;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import java.util.List;

public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public int regi() {
        int i = 0;
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
//        EntityManager em = emf.createEntityManager();
//        User cat = new User();
//        cat.setEmail("mail");
//        cat.setPassword("pass");
//        cat.setName("name");
//
//        try {
//            utx.begin();
//            em.persist(cat);
//            em.flush();
//            utx.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            try {
//                utx.rollback();
//            } catch (SystemException se) {
//                se.printStackTrace();
//            }
//
//        }




        return i;
    }

    public static int register(User u) throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        UserTransaction userTransaction = null;

        Context context = new InitialContext();
        userTransaction = (UserTransaction) context.lookup("java:comp/env/testDS");

        userTransaction.begin();
        em.joinTransaction();


        int i = 0;
        i=1;
        em.persist(u);

        userTransaction.commit();

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