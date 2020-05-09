/*
 * File: Pile.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Nim;

/**
A pile of Nim marbles that can have its size updated and also informs the size
 */
public class Pile {
    private int size = 0 ; //stores the current size of the pile 
    
    /**
     * Creates a pile of marbles
     * @param pileSize initial number of marbles 
     */
    public Pile(int pileSize){
        size = pileSize ;
    }
    
    /**
     * gets the size of the pile
     * @return the size of the pile
     */
    public int GetSize(){
        return size ;
    }
    
    /**
     * sets the size of the pile
     * @param newSize the new size of the pile
     */
    public void SetSize(int newSize){
        size = newSize ;
    }
    
}
