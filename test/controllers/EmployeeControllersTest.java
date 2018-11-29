/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Department;
import entities.Employee;
import entities.Job;
import java.math.BigDecimal;
import java.util.List;
import latihanormojdbc.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tikamhrdk
 */
public class EmployeeControllersTest {
    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public EmployeeControllersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class EmployeeControllers.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        EmployeeControllers instance = new EmployeeControllers(factory);
        List<Employee> expResult = instance.gets();
        List<Employee> result = instance.gets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetAll1() {
        System.out.println("getAll");
        EmployeeControllers instance = new EmployeeControllers(factory);
        List<Employee> expResult = null;
        List<Employee> result = instance.gets();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class EmployeeControllers.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Object id = null;
        EmployeeControllers instance = new EmployeeControllers(factory);
        Employee expResult = instance.getEmployeeId(100);
        Employee result = instance.getEmployeeId(100);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testGetId1() {
        System.out.println("getId");
//        Object id = null;
        EmployeeControllers instance = new EmployeeControllers(factory);
        Employee expResult = null;
        Employee result = instance.getEmployeeId(100);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    
    

    /**
     * Test of Search method, of class EmployeeControllers.
     */
    @Test
    public void testSearch() {
        System.out.println("Search");
        Object data = null;
        EmployeeControllers instance = new EmployeeControllers(factory);
        List<Employee> expResult = instance.getSearch(data);
        List<Employee> result = instance.getSearch(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSearch1() {
        System.out.println("Search");
//        Object data = null;
        EmployeeControllers instance = new EmployeeControllers(factory);
        List<Employee> expResult = null;
        List<Employee> result = instance.getSearch(100);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EmployeeControllers.
     */
   
    @Test
    public void testDelete() {
        System.out.println("Search");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Object data = 1;
        EmployeeControllers instance = new EmployeeControllers(factory);
        Employee employee = new Employee(209);
        assertTrue(instance.deleteData(employee));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    

    /**
     * Test of getEmployeeId method, of class EmployeeControllers.
     */
    

    /**
     * Test of updateEmployee method, of class EmployeeControllers.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        String employeeId = "10";
        String firstName = "e";
        String lastName = "k";
        String email = "ui@gmail.com";
        String phoneNumber = "89";
        String hireDate = "09/09/2018";
        String jobId = "IT_PROG";
        String salary = "200";
        String commissionPct = "0.0";
        String managerId = "100";
        String departmentId = "100";
        EmployeeControllers instance = new EmployeeControllers();
        boolean expResult = false;
        boolean result = instance.updateEmployee(employeeId, firstName, lastName, email, phoneNumber, hireDate, jobId, salary, commissionPct, managerId, departmentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class EmployeeControllers.
     */
    

    /**
     * Test of getSearch method, of class EmployeeControllers.
     */
   


    /**
     * Test of insertEmployee method, of class EmployeeControllers.
     */
    @Test
    public void testInsertEmployee() {
        System.out.println("insertEmployee");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        String employeeId = "10";
        String firstName = "e";
        String lastName = "k";
        String email = "o";
        String phoneNumber = "234";
        String hireDate = "09/09/2018";
        String jobId = "IT_PROG";
        String salary = "100";
        String commissionPct = "0.0";
        String managerId = "100";
        String departmentId = "100";
        EmployeeControllers instance = new EmployeeControllers(factory);
        boolean expResult = true;
        boolean result = instance.insertEmployee(employeeId, firstName, lastName, email, phoneNumber, hireDate, jobId, salary, commissionPct, managerId, departmentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//        System.out.println("Search");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        Object data = 1;
//        EmployeeControllers instance = new EmployeeControllers(factory);
//        Employee employee = new Employee(209);
//        assertTrue(instance.deleteData(employee));
    }
}