/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdulrahman
 */
public class PileTest {
    
    public PileTest() {
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
     * Test of getTopCard method, of class Pile.
     */
    @Test
    public void testGetTopCard() {
        System.out.println("getTopCard");
        Pile instance = new Pile();
        Card expResult = null;
        Card result = instance.getTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTopCard method, of class Pile.
     */
    @Test
    public void testSetTopCard() {
        System.out.println("setTopCard");
        Card topCard = null;
        Pile instance = new Pile();
        instance.setTopCard(topCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
