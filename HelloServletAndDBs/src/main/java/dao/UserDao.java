package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDao {

    public static int register(User u){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        int i = 0;
        i=1;
        em.persist(u);

        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }
        em.getEntityManagerFactory().close();
        em.close();

        return i;
    }

    @SuppressWarnings("unchecked")
    public static List<User> getAllUser() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connDB");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List < User > listOfUser = null;
        Query query = em.createQuery("SELECT c from User c");
        listOfUser = query.getResultList();

        return listOfUser;
    }


}