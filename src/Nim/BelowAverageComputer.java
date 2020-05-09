/*
 * File: BelowAverageComputer.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

import java.util.Random;

/**
A BelowAverageComputer player that can return its name and can remove marbles from 
* the pile in a random way
 */
public class BelowAverageComputer implements Player{
    
    private String name ; //stores the name of the player
    
    /**
     * Creates a BelowAverageComputer player
     * @param newName user specified name of the player
     */
    public BelowAverageComputer(String newName){
        name = newName ;
    }
     
    /**
     * Selects a random number between 1 and n/2 to be removed  
     * @param currentPile the current number of marbles in the pile
     * @return the number of marbles removed
     */
    public int Move(int currentPile){
                
        Random r = new Random() ;  
        
        int quantityRemoved = 1 + r.nextInt(currentPile / 2) ;  

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
