/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import java.util.Random;
import owari.Exceptions.QuitGameException;
import model.Board;
import owari.Exceptions.IllegalMoveException;

/**
 *
 * @author Yerlan
 */
public class ComputerPlayer implements PlayerInterface {

    @Override
    public int getMove(Board b, int playerNum) throws QuitGameException {
        // here we make comp player smart
        //Our Computer is stupid
        boolean legalMove = false;
        int i = new Random().nextInt(5) + 1;
        while (!legalMove) {
            try {

                if (i >= 1 && i <= 6) {
                    int seeds = b.getSeeds(i, playerNum);
                    if (seeds > 0) {
                        legalMove = true;
                        return i;
                    } else {
                        i = new Random().nextInt(5) + 1;
                        System.out.println("NO SEED, try again");
                        //throw new IllegalMoveException("No seeds in this house");
                    }

                } else {
                    i = new Random().nextInt(5) + 1;
                    throw new IllegalMoveException("Enter correct number of house");
                }
            } catch (Exception e) {
            }
        }
        return 3; //To change body of generated methods, choose Tools | Templates.
    }

}
