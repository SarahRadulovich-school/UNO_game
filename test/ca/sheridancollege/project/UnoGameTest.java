/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class UnoGameTest {
    
    public UnoGameTest() {
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
     * Test of main method, of class UnoGame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnoGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newGame method, of class UnoGame.
     */
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        UnoGame instance = new UnoGame();
        instance.newGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinner method, of class UnoGame.
     */
    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        UnoGame instance = new UnoGame();
        Player expResult = null;
        Player result = instance.getWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class UnoGame.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        UnoGame instance = new UnoGame();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLosers method, of class UnoGame.
     */
    @Test
    public void testGetLosers() {
        System.out.println("getLosers");
        UnoGame instance = new UnoGame();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getLosers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWinner method, of class UnoGame.
     */
    @Test
    public void testSetWinner() {
        System.out.println("setWinner");
        Player winner = null;
        UnoGame instance = new UnoGame();
        instance.setWinner(winner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class UnoGame.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        UnoGame instance = new UnoGame();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLosers method, of class UnoGame.
     */
    @Test
    public void testSetLosers() {
        System.out.println("setLosers");
        ArrayList<Player> losers = null;
        UnoGame instance = new UnoGame();
        instance.setLosers(losers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
