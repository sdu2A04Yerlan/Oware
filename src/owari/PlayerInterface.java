/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari;

import owari.Exceptions.QuitGameException;
import model.Board;

/**
 * PlayerInterface objects represent players in the game: they select their move based on the Board they are given and which side of the board they are playing. They may quit the game before a result is decided. 
 *
 * You need to provide two implementations of this interface, one called HumanPlayer, which acts under control of the user, and one called ComputerPlayer which plays automatically and as well as it can.
 *
 * Input/Output for the human players should be done with System.in and System.out.
 *  *
 * @author Steven Bradley
 * @version 1.0
 */

public interface PlayerInterface{
    
    /**
     *
     * @param b An copy of the game that the player may experiment with. It should be a copy of the game so that the computer cannot cheat and experiments do not affect game play.
     *
     * @param playerNum
     * the number of the player: 1 or 2.
     *
     * @return the position of the house selected (counting anti-clockwise): a value in the range 1..6
     *
     * @throws QuitGameException if, instead of choosing a house, a human player chooses to quit by entering 'QUIT'. 
     *
     **/
    int getMove(Board b, int playerNum) throws QuitGameException;
}
