/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

import entity_for_validation.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Size;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauronew
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
   
     private static EntityManagerFactory emf;
    private EntityManager em;

    @BeforeClass
    public static void createEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("MyPu");
    }

    @AfterClass
    public static void closeEntityManagerFactory() {
        emf.close();
    }

    @Before
    public void beginTransaction() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void rollbackTransaction() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        if (em.isOpen()) {
            em.close();
        }
    }

    @Test
    public void nameTooShort() {
        try {
            Customer customer = new Customer("Bo");
            em.persist(customer);
            em.flush();
            fail("Expected ConstraintViolationException wasn't thrown.");
        } catch (ConstraintViolationException e) {
            assertEquals(1, e.getConstraintViolations().size());
            ConstraintViolation<?> violation = e.getConstraintViolations().iterator().next();

            assertEquals("name", violation.getPropertyPath().toString());
            assertEquals(Size.class, violation.getConstraintDescriptor().getAnnotation().annotationType());
        }
    }
    
    @Test
    public void nameisok(){
        
     Customer customer;
    try {
     customer = new Customer("Pluto");
            em.persist(customer);
            em.flush();
           
             System.out.println("\nthe new custormer is :"+customer);   
             JOptionPane.showMessageDialog(null, "the new custormer is :"+customer);
    }
    catch(Exception e){
     //   System.out.println("the new custormer is :"+customer);            
        System.out.println("the exception :"+e.getMessage());
    }
    }
    
     @Test
    public void nameTooShort2() {
        try {
            Customer customer = new Customer("bio");
            
            em.persist(customer);
            em.flush();
              JOptionPane.showMessageDialog(null, "the new custormer is :"+customer);
            fail("Expected ConstraintViolationException wasn't thrown.");
        } catch (ConstraintViolationException e) {
            assertEquals(1, e.getConstraintViolations().size());
            ConstraintViolation<?> violation = e.getConstraintViolations().iterator().next();

            assertEquals("name", violation.getPropertyPath().toString());
            assertEquals(Size.class, violation.getConstraintDescriptor().getAnnotation().annotationType());
        }
    }
}
