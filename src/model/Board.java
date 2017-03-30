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
    public String toString(){
        return "";
    }
}
