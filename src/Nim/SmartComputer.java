/*
 * File: SmartComputer.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

import java.util.Random;

/**
A SmartComputer player that can return its name and can remove marbles from 
* the pile in a smart way
 */
public class SmartComputer implements Player {
    
    private String name ; //stores the name of the player
    
    /**
     * Creates a SmartComputer player
     * @param newName user specified name of the player
     */
    public SmartComputer(String newName){
        name = newName ;
    }
     
    /**
     * Selects the perfect number of marbles to be removed so that the pile 
     * remaining is a power of two minus one
     * @param currentPile the current number of marbles in the pile
     * @return the number of marbles removed
     */
    public int Move(int currentPile){
     
        boolean foundMaxPower = false ;
        int power = -1 ;
        
        //while false, will continue to increment power until the max power 
        //is find
        while(!foundMaxPower){    
            power++ ;
            if((currentPile - Math.pow(2,power)) < Math.pow(2,power + 1) ){
                foundMaxPower = true ;
            }
        }
        
        //calculates the total to be removed so that the pile remaining is a 
        //power of two minus one
        int quantityRemoved = (currentPile - (int)Math.pow(2,power)) + 1 ;
        
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
