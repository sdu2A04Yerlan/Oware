/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of getHouses method, of class Board.
     */
    @Test
    public void testGetHouses() {
        System.out.println("getHouses");
        Board instance = new Board();
        int[] expResult = null;
        int[] result = instance.getHouses();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHouses method, of class Board.
     */
    @Test
    public void testSetHouses() {
        System.out.println("setHouses");
        int position = 0;
        int value = 0;
        Board instance = new Board();
        instance.setHouses(position, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Board.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        int []score = {1,1};
        int []houses = {4,4,4,4,4,4,4,4,4,4,4,4};
        Board instance = new Board(houses,score);
        int[] expResult = null;
        int[] result = instance.getScore();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScore method, of class Board.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int position = 0;
        int value = 0;
        Board instance = new Board();
        instance.setScore(position, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Board.
     */
//    @Test
//    public void testClone() {
//        System.out.println("clone");
//        Board instance = new Board();
//        Board expResult = null;
//        Board result = instance.clone();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getResult method, of class Board.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSeeds method, of class Board.
     */
    @Test
    public void testGetSeeds() throws Exception {
        System.out.println("getSeeds");
        int house = 2;
        int playerNum = 1;
        Board instance = new Board();
        int expResult = 4;
        int result = instance.getSeeds(house, playerNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSeeds method, of class Board.
     */
    @Test
    public void testSetSeeds() throws Exception {
        System.out.println("setSeeds");
        int seeds = 0;
        int house = 0;
        int playerNum = 0;
        Board instance = new Board();
        instance.setSeeds(seeds, house, playerNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove() throws Exception {
        System.out.println("makeMove");
        int player = 1;
        int position = 2;
        Board instance = new Board();
        instance.makeMove(player, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of houseToArrayPossition method, of class Board.
     */
    @Test
    public void testHouseToArrayPossition() {
        System.out.println("houseToArrayPossition");
        int house = 1;
        int player = 1;
        Board instance = new Board();
        int expResult = 0;
        int result = instance.houseToArrayPossition(house, player);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Board instance = new Board();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
