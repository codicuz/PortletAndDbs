package dao;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import java.util.List;

public class UserDao {

    public int register(User u) throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        int i = 0;
        i=1;
        em.persist(u);

        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }

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


}