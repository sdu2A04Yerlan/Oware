/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import owari.Exceptions.IllegalMoveException;

/**
 *
 * @author Yerlan
 */
public class Board {

    private int[] houses;
    private int[] score;
    private int resultOfGame;

    public Board() {
        houses = new int[12];
        score = new int[2];
        score[0] = 0;
        score[1] = 0;
        for (int i = 0; i < 12; i++) {
            houses[i] = 4;
        }

    }

    public int[] getHouses() {
        return houses;
    }

    public void setHouses(int position, int value) {
        houses[position] = value;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int position, int value) {
        score[position] = value;
    }

    public Board clone() {
        Board b = new Board();
        for (int i = 0; i < 12; i++) {
            b.setHouses(i, this.houses[i]);
        }
        b.setScore(0, this.score[0]);
        b.setScore(1, this.score[1]);
        return b;
    }

    public int getResult() {
        return 0;
    }

    public void makeMove(int player, int position) throws IllegalMoveException {
        switch (player) {
            case 0:
                if (position >= 1 && position <= 6) {
                    if (houses[position] > 0) {
                        System.out.println("we make move");
                    } else {
                        IllegalMoveException exception = new IllegalMoveException(1, "the move is illegal, no seeds there");
                    }
                } else {
                    System.out.println("the move is illegal, that is not your house");
                }

                break;
            case 1:
                if (position >= 1 && position <= 6) {
                    if (houses[position] > 0) {
                        System.out.println("we make move");
                    } else {
                        System.out.println("the move is illegal, no seeds there");
                    }
                } else {
                    System.out.println("the move is illegal, thats not your house");
                }
                break;
        }
        if (player == 0 && (position >= 0 && position <= 5)) {

        } else {
        }
    }

    public String toString() { //PRINTS THE STATE OF THE BOARD
        System.out.println("Player0:" + score[0]);
        System.out.println("6    5    4    3    2    1");
        System.out.println("--------------------------");

        for (int i = 0; i < 6; i++) {
            System.out.print(houses[i] + "    ");
        }

        System.out.println("\n||||||||||||||||||||||||||");

        for (int i = 6; i < 12; i++) {
            System.out.print(houses[i] + "    ");
        }
        System.out.println("\n--------------------------");
        System.out.println("1    2    3    4    5    6");
        System.out.println("Player1:" + score[1]);
        return null;
    }

}
