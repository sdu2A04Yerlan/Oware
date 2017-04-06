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

    @Override
    public int getMove(Board b, int playerNum) throws QuitGameException {
        //b.toString();
        boolean legalMove = false;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (!legalMove) {
            if (i >= 1 && i <= 6) {
                legalMove = true;
                return i;
            } else {
                System.out.println("That was wrong, make new move");
                i = sc.nextInt();
            }
        }        return 0;
    }
}
