/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esegui;

import entity_for_validation.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mauronew
 */
public class CreaCustomer {
 static EntityManagerFactory emf;
 
    public static void persist(Object object) {
      //   emf = Persistence.createEntityManagerFactory("MyPu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void main(String[] args) {
       emf = Persistence.createEntityManagerFactory("MyPu");
        Customer c= new Customer("archimede");
        persist(c);
        if(emf.isOpen()){
            emf.close();
                    }
        
    }
    
}
