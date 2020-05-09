/*
 * File: NimTester.java
 * Author: Gabriel Ribeiro
 * This class simulates a game of Nim, where two player Two players take turns 
removing marbles from a pile. On each turn, the player must remove at least one 
but no more than half of the remaining marbles. The player who is forced to 
remove the last marble loses.

 */
package Nim;

import javax.swing.JOptionPane;

/**
 *Tester class that gets who is playing, create the players and game obejects, 
 * calls the play methode and prints the winner  
 */
public class NimTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean anotherGame = true ; //when true, the program starts a new game 
        //when the current one ends
        
        while(anotherGame){   
                          
            Player[] Players = new Player[2] ; //The empty Player object that 
            //will store the two players
            
            //asks the user the info about the first player
            String p1Name = JOptionPane.showInputDialog("Please inform the name "
                    + "of the player who is going to start the game:") ;

            String[] options = {"Human","SmartComputer","BelowAverageComputer"};
            int p1Choice = JOptionPane.showOptionDialog(null, "This player is a:", 
                    "Choose an Option",
                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                  null,options, options) ;
        
            //creates the correct object acording to the user's choice
            switch (p1Choice) {
                case 0:
                    {
                        Human firstPlayer = new Human(p1Name) ;
                        Players[0] = firstPlayer ;
                        break;
                    }
                case 1:
                    {
                        SmartComputer firstPlayer = new SmartComputer(p1Name) ;
                        Players[0] = firstPlayer ;
                        break;
                    }
                default:
                    {
                        BelowAverageComputer firstPlayer = new BelowAverageComputer(p1Name) ;
                        Players[0] = firstPlayer ;
                        break;
                    }
            }
            
            //asks the user the info about the first player
            String p2Name = JOptionPane.showInputDialog("Please inform the name "
                    + "of the second player:") ;
        
            int p2Choice = JOptionPane.showOptionDialog(null, "And this player "
                    + "is a:","Choose an Option",JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, null, options, options) ;
                   
            //creates the correct object acording to the user's choice
            switch (p2Choice) {
                case 0:
                    {
                        Human secondPlayer = new Human(p2Name) ;
                        Players[1] = secondPlayer ;
                        break;
                    }
                case 1:
                    {
                        SmartComputer secondPlayer = new SmartComputer(p2Name) ;
                        Players[1] = secondPlayer ;
                        break;
                    }
                default:
                    {
                        BelowAverageComputer secondPlayer = new BelowAverageComputer(p2Name) ;
                        Players[1] = secondPlayer ;
                        break;
                    }
            }    
 
            Nim game = new Nim(Players) ;
            String winner = game.Play() ;
            
            //Prints the winner of the game
            System.out.println("The winner is " + winner + "!") ;
        
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to "
                    + "play " + "again?" , "Query" , JOptionPane.YES_NO_OPTION) ;
          
            if (choice == 1){
                anotherGame = false ;
            }    
        }
    }
    
}
