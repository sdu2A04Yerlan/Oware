/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import java.util.Scanner;
import owari.Exceptions.QuitGameException;
import model.Board;

/**
 *
 * @author Yerlan
 */
public class HumanPlayer implements PlayerInterface {
    private boolean legalMove = false;
    @Override
    public int getMove(Board b, int playerNum) throws QuitGameException {
        b.toString();
        
        Scanner sc = new Scanner(System.in);
        while (!legalMove) {
            if (sc.nextInt() < 1 || sc.nextInt() > 6) {
                return sc.nextInt();
               // legalMove = true;
            } else {
                System.out.println("That was wrong, make new move");
            }
        }
        return 0;
    }
}
