/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import owari.Exceptions.IllegalMoveException;

/**
 *
 * @author Yerlan
 */
public class Board {

    private int[] houses;
    private int[] score;
    private int resultOfGame;
    private ArrayList<Board> gameHistory;

    public Board() {
        houses = new int[12];
        score = new int[2];
        score[0] = 0;
        score[1] = 0;
        for (int i = 0; i < 12; i++) {
            houses[i] = 4;
        }
    }

    public Board(int[] houses, int[] score) {
        this.houses = houses.clone();
        this.score = score.clone();
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
        //Cloning of the board
        Board b = new Board();
        for (int i = 0; i < 12; i++) {
            b.setHouses(i, this.houses[i]);
        }
        b.setScore(0, this.score[0]);
        b.setScore(1, this.score[1]);
        return b;
    }

    public int getResult() {
        if (score[0] > 24) {
            return 1;
        } else if (score[1] > 24) {
            return 2;
        } else if (score[0] == 24 && score[1] == 24) {
            return 99;
        } else {
            return 0;
        }
    }

    public int getSeeds(int house, int playerNum) throws IllegalMoveException {
        if (house >= 1 && house <= 6) {
            if (playerNum >= 1 && playerNum <= 2) {
                return houses[houseToArrayPossition(house, playerNum)];
            } else {
                throw new IllegalArgumentException("Invalid input: player number not allowed");
            }
        } else {
            throw new IllegalMoveException(" ");
        }
    }

    public void setSeeds(int seeds, int house, int playerNum) throws IllegalMoveException {
        if (house >= 1 && house <= 6) {
            if (playerNum >= 1 && playerNum <= 2) {
                houses[houseToArrayPossition(house, playerNum)] = seeds;
            } else {
                throw new IllegalArgumentException("Invalid input: player number not allowed");
            }
        } else {
        }
    }

    /**
     *
     */
    public void makeMove(int player, int position) throws IllegalMoveException {
        int seeds = getSeeds(position, player);
        if (seeds > 0) {
            setSeeds(0, position, player);
        } else {
        }
    }

    public int houseToArrayPossition(int house, int player) {
        if (player == 1) {
            return house - 1;
        } else if (player == 2) {
            return 5 + house;
        }
        return 99;
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
