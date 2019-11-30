/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hussamhaidara
 */
public class UnoGame  {

	/**
	 * @param args the command line arguments
	 */

		
//attributes 
private Player winner;
private ArrayList<Player> players;
private ArrayList<Player>losers;

//construstor to instaliz an object
public UnoGame(){
	
}
	public static void main(String[] args) {
            
            UnoGame uno = new UnoGame();
            
            System.out.println("Welcome to UNO!");
            
            //Creating 4 Player objects in the ArrayList to represent the 4 players of the game
            //This program REQUIRES 4 players exactly
            uno.players = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                uno.players.add(new Player());
            }

            //Taking user input for the names of the 4 players
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                System.out.println("Please enter Player " + (i+1) + "'s name: ");
                uno.players.get(i).setPlayerName(scan.next());
            }
            
            //starting the game
            uno.newGame();
            System.out.println("Thanks for playing!");
	}
        
	public void newGame() {
            //create the deck object
            Deck deck = new Deck();
            //create the pile object
            Pile pile = new Pile();
            //initializing winner
            winner = new Player();

            //shuffle the deck
            deck.shuffle();
            //start the game by selecting the first card from the deck onto the pile
            pile.setTopCard(deck.nextCard());
            
            //loop continues, as long as the win condition hasn't been met
            boolean reverse = false;
            //Starts at one because player1 will have the first turn. 
            int turnIndex = 0;
            
            while (winner.getPlayerName() == null) {
                //Remind the player what card is on top
                System.out.println("Top card: " + pile.getTopCard().getValue() + " , " + pile.getTopCard().getColour());
                //play game
                PlayerTurn turn = new PlayerTurn(players.get(turnIndex));
                //find out if we're switching the order of turns
                reverse = turn.getReverseCard();
                
                //player turns going in numerical order
                if (!reverse) {
                    turnIndex++;
                    //if we've gone through all the players, it will return back to player1
                    if(turnIndex > 3) {
                        turnIndex = 0;
                    }
                }
                //player turns going in non-numerical
                else if (reverse) {
                    turnIndex--;
                    //if we've gone through all the players (in reverse), it will return back to player4
                    if(turnIndex < 0) {
                        turnIndex = 3;
                    }
                }
            }
            
//            //game ends
            System.out.println("Congratulations " + winner.getPlayerName() + " you are the winner!");
//            //losers
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Sorry " + losers.get(i).getPlayerName() + " you lose.");
//            }
	}
        
	//getters
	public Player getWinner() {
		return winner;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public ArrayList<Player> getLosers() {
		return losers;
	}

        //setters
	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void setLosers(ArrayList<Player> losers) {
		this.losers = losers;
	}
	
}
