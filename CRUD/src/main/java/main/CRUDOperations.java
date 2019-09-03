package main;

import model.Student;
import utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDOperations {
    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();;
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}


