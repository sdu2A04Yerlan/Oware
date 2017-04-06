/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import owari.Exceptions.QuitGameException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Board;
import owari.Exceptions.IllegalMoveException;

/**
 *
 * @author Yerlan
 */
public class GameManager {
    private Scanner ss = new Scanner(System.in);

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.mainMenu();
    }

    public void mainMenu() {
        System.out.println("        Main menu!");
        System.out.println("        Please select one option and enter the number");
        System.out.println("1. New Game Human vs Human");
        System.out.println("2. New Game Human vs Computer");
        System.out.println("3. Load Game");
        try {
            int input = ss.nextInt();
            switch (input) {
                case 1:
                    newGameHvH();
                    break;
                case 2:
                    newGameHvC();
                    break;
                case 3:
                    loadGame();
                    break;
                //default: System.out.println("please enter one of the options!"); mainMenu();
            }
        } catch (Exception e) {
            System.out.println("please enter one of the options!" + e);
            mainMenu();
        }
    }

    public static void newGameHvH() throws QuitGameException {
        Board board = new Board();
        board.toString();
        while (board.getResult() == 0) {
            Board bclone = board.clone();
            HumanPlayer player1 = new HumanPlayer();
            HumanPlayer player2 = new HumanPlayer();
            try {
                board.makeMove(0, player1.getMove(board, 0));
            } catch (IllegalMoveException ex) {
                Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //player1.getMove(board, 1);
        //checkGameState(board);
        System.out.println("HvH");
    }

    public static void newGameHvC() throws QuitGameException {
        Board board = new Board();
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        try {
            board.makeMove(0, 0);
        } catch (IllegalMoveException e) {
            e = new IllegalMoveException(0, "");
        }
        System.out.println("HvC");
    }

    public void loadGame() throws FileNotFoundException{
        File f = selectLoadFile();
        Scanner fs = new Scanner(f);
        int gameType = fs.nextInt();
        
    }

    private File selectLoadFile() {
        //Method to choose the loading file;
        File dir = new File(".");
        File[] filesList = dir.listFiles();
        int n = 0;
        for (int i = 1; i < filesList.length; i++) {
            File file = filesList[i];
            if (file.isFile()) {
                System.out.println(i + ". " + file.getName());
                n = n + 1;
            }

        }
        int s = ss.nextInt();
        //File f = filesList[s];
        return filesList[s];
    }

}
