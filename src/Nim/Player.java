/*
 * File: Player.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

/**
A interface to represent an player in a Nim game
 */
public interface Player {
    
    /**
     * calls the move method for the class that implements the interface
     * @param x the current number of marbles in the pile
     * @return the number of marbles removed
     */
    int Move(int x) ;
    
    /**
     * returns the player's name
     * @return the player's name
     */
    String GetName() ;
    
}
