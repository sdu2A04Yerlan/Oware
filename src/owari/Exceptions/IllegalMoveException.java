/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owari.Exceptions;

/**
 *
 * @author Yerlan
 */
public class IllegalMoveException extends Exception{
    public IllegalMoveException(int number, String exception){
        System.out.println("Exception number" + number + " /n " + exception);
    }
}
