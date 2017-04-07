/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yerlan
 */
public class GameManagerTest {
    
    public GameManagerTest() {
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
     * Test of main method, of class GameManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GameManager.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainMenu method, of class GameManager.
     */
    @Test
    public void testMainMenu() {
        System.out.println("mainMenu");
        GameManager instance = new GameManager();
        instance.mainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newGameHvH method, of class GameManager.
     */
    @Test
    public void testNewGameHvH() throws Exception {
        System.out.println("newGameHvH");
        GameManager.newGameHvH();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newGameHvC method, of class GameManager.
     */
    @Test
    public void testNewGameHvC() throws Exception {
        System.out.println("newGameHvC");
        GameManager.newGameHvC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGame method, of class GameManager.
     */
    @Test
    public void testLoadGame() throws Exception {
        System.out.println("loadGame");
        GameManager instance = new GameManager();
        instance.loadGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
