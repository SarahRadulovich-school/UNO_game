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
            uno.players = new ArrayList<Player>();
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
        
	public void newGame(){
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
	public void setWinner(Player winnerl) {
		this.winner = winner;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void setLosers(ArrayList<Player> loosers) {
		this.losers = loosers;
	}
	
}
