/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import owari.Exceptions.QuitGameException;
import model.Board;
import owari.Exceptions.IllegalMoveException;

/**
 *
 * @author Yerlan
 */
public class HumanPlayer implements PlayerInterface {

    @Override
    public int getMove(Board b, int playerNum) throws QuitGameException {
        b.toString();
        boolean legalMove = false;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.toLowerCase().equals("quit")) {
            throw new QuitGameException("Game over, you quit");
        } else if (input.toLowerCase().equals("save")) {
            System.out.println("Enter file name.");
            String filename = sc.next();
            File savefile = new File(filename + ".txt");
            FileWriter fw;
            try {
                fw = new FileWriter(savefile);
                fw.write(input);
                fw.close();
                throw new QuitGameException("saved");
                //System.exit(1);
            } catch (IOException ex) {
                Logger.getLogger(HumanPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            int i = new Integer(input);
            while (!legalMove) {
                if (i >= 1 && i <= 6) {
                    try {
                        int seeds = b.getSeeds(b.houseToArrayPossition(i, playerNum), playerNum);
                        if (seeds > 0) {
                            legalMove = true;
                            return i;
                        }else{
                            System.out.println("No seeds");
                        }
                    } catch (IllegalMoveException ex) {
                        
                    }

                } else {
                    System.out.println("That was wrong, make new move");
                    i = sc.nextInt();
                }
            }
            return 0;
        }
        return 0;
    }
}
