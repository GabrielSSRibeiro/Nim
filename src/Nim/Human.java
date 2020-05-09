/*
 * File: Human.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

import javax.swing.JOptionPane;

/**
 *
A human player that can return its name and can also asks the user for a 
* legal number of marbles to be removed 
 */
public class Human implements Player{
    
    private String name ; //stores the name of the player
    
    /**
     * Creates a human player
     * @param newName user specified name of the player
     */
    public Human(String newName){
        name = newName ;
    }
     
    /**
     * Asks the user for a valid number of marbles to be removed from the pile
     * @param currentPile the current number of marbles in the pile
     * @return the number of marbles removed
     */
    public int Move(int currentPile){
        
        boolean validMove = false ; 
        int quantityRemoved = 1 ;
        
        //while false, asks the player to type another value
        while(!validMove) {
            
            String input = JOptionPane.showInputDialog("Please remove a number "
                    + "of marbles between 1 and " + currentPile / 2 + ":") ;
            
            //checks for an input and if its valid acording the rules
            if((!input.equals("")) ){
            quantityRemoved = Integer.parseInt(input) ;                
            
                if (quantityRemoved >= 1 && quantityRemoved <= currentPile / 2){
                    validMove = true ;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter a number that "
                            + "fits the especifications.") ; 
                }   
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter a number.") ;                     
            }
        }
        return quantityRemoved ;
    }
    
    /**
     * gets the name of player
     * @return the name of the player
     */
    public String GetName(){      
        return name ;
    }
    
    
    
}
