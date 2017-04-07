/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import java.io.File;
import java.io.FileNotFoundException;
import owari.Exceptions.QuitGameException;
import java.util.Scanner;
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
            System.out.println(e);
            //mainMenu();
        }
    }

    public static void newGameHvH() throws QuitGameException {
        Board board = new Board();
        int currentPlayerNum = 1;
        HumanPlayer currentPlayer = new HumanPlayer();
        //board.toString();
        while (board.getResult() == 0) {
            int nextPlayerNum = 3 - currentPlayerNum;
            Board bclone = board.clone();
            int move = currentPlayer.getMove(bclone, currentPlayerNum);
            try {
                board.makeMove(currentPlayerNum, move);
                currentPlayerNum++;
            } catch (IllegalMoveException ex) {
                System.out.println(ex);
                currentPlayerNum--;
            }
            currentPlayerNum = nextPlayerNum;
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
            board.makeMove(1, 1);
        } catch (IllegalMoveException e) {
            System.out.println(e);
        }
        System.out.println("HvC");
    }

    public void loadGame() throws FileNotFoundException, QuitGameException {
        System.out.println("Load game");
        File f = selectLoadFile();
        Scanner fs = new Scanner(f);
        int gameType = fs.nextInt();
        System.out.println(gameType);
        int currentPlayerNum = fs.nextInt();
        int[] score = new int[2];
        score[0] = fs.nextInt();
        score[1] = fs.nextInt();
        int[] houses = new int[12];
        for (int i = 0; i < 12; i++) {
            houses[i] = fs.nextInt();
        }
        Board b = new Board(houses, score);
        b.toString();
        PlayerInterface currentPlayer = new HumanPlayer();
        while (b.getResult() == 0) {
            int nextPlayerNum = 3 - currentPlayerNum;
            Board bclone = b.clone();
            int move = currentPlayer.getMove(bclone, currentPlayerNum);
            try {
                b.makeMove(currentPlayerNum, move);
                currentPlayerNum++;
            } catch (IllegalMoveException ex) {
                System.out.println(ex);
                currentPlayerNum--;
            }
            currentPlayerNum = nextPlayerNum;
        }
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
        System.out.println("Please select file to load, enter number");
        int s = ss.nextInt();
        //File f = filesList[s];
        return filesList[s];
    }

}
