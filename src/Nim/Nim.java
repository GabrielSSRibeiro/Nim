/*
 * File: Nim.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

import java.util.Random;

/**
A game of Nim that receives the players as an argument and has a play method
 */
public class Nim {
    
    private Player[] Players ; //A Player array object that stores the 
    //players of the game
    
    /**
     * Creates a Nim game
     * @param newPlayers user specified player of the game
     */
    public Nim(Player[] newPlayers){
        Players = newPlayers ;
    }
    
    /**
     * Calls the move method for both player and prints the current state of 
     * the game until a winner is decided
     * @return the winner of the game
     */
    public String Play(){
        
        String winner = "" ;
        int move = 0 ;
        
        Random r = new Random() ;  
        int pileSize = 10 + r.nextInt(91) ;       
        Pile nimPile = new Pile(pileSize) ;
        
        //Keeps calling moves until there is only one possible move or the end
        //of the game
        while(nimPile.GetSize() > 1){
            for(int i = 0 ; i < 2 ; i++){
                
                if(nimPile.GetSize() == 2){
                    move = 1;
                }
                else{
                    move = Players[i].Move(nimPile.GetSize()) ;               
                }
                nimPile.SetSize(nimPile.GetSize() - move) ;
                
                System.out.println("The player " + Players[i].GetName() + 
                        " removed " + move + " marble(s). " + nimPile.GetSize()
                        + " marble(s) remaining.") ;
                
                //when is not possible to call a move anymore, the winner is decided
                if(nimPile.GetSize() == 1){
                    winner = Players[i].GetName() ;  
                }
            }
        }                      
  
    return winner ;
    }
    
    
}
