/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yerlan
 */
public class Board {
    private int [] houses;
    private int [] score;
    
    public Board(){
        houses = new int[12];
        score = new int[2];
        score[0] = 0;
        score[1] = 0;
        for(int i = 0; i < 12; i++){
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
    public void makeMove(int player, int position){
        if(player == 0){
            
        }else{
            
        }
    }
    public String toString(){
        System.out.println("Player0:" + score[0]);
        System.out.println("a    b    c    d    e    f");
        for(int i = 0;i < 6; i++){
            System.out.print(houses[i]+"    ");
        }
        System.out.println("");
        
        for(int i = 6;i < 12; i++){
            System.out.print(houses[i]+"    ");
        }
        System.out.println("\nA    B    C    D    E    F");
        System.out.println("Player1:" + score[1]);
        return null;
    }
    
}
