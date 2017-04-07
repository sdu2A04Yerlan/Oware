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
                fw.append(1+"\n");//game type
                fw.append(playerNum+"\n");//current player number
                int[] score = b.getScore();
                fw.append(score[0]+"\n");//score 1
                fw.append(score[1]+"\n");//score 2
                int[] house = b.getHouses();
                for (int i = 0; i < house.length; i++) {
                    fw.append(house[i]+"\n");//game type
                }
                fw.close();
                throw new QuitGameException("saved");
                //System.exit(1);
            } catch (IOException ex) {
                Logger.getLogger(HumanPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            int i = new Integer(input);
            while (!legalMove) {
                try {

                    if (i >= 1 && i <= 6) {
                        int seeds = b.getSeeds(i, playerNum);
                        if (seeds > 0) {
                            legalMove = true;
                            return i;
                        } else {

                            i = sc.nextInt();
                            System.out.println("NO SEED, try again");
                            //throw new IllegalMoveException("No seeds in this house");
                        }

                    } else {
                        i = sc.nextInt();
                        throw new IllegalMoveException("Enter correct number of house");
                    }
                } catch (Exception e) {
                }
            }
            return 0;
        }
        return 0;
    }
}
