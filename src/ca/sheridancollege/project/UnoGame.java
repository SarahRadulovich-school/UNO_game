/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author hussamhaidara
 */
public class UnoGame  {

	/**
	 * @param args the command line arguments
	 */

		
//attributes 
private Player winnerl;
private ArrayList<Player> players;
private ArrayList<Player>loosers;

//construstor to instaliz an object
public UnoGame(){
	
}
	public static void main(String[] args) {
	
	}
	public void newGame(){
		
	}
	//Getters

	public Player getWinnerl() {
		return winnerl;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public ArrayList<Player> getLoosers() {
		return loosers;
	}

	public void setWinnerl(Player winnerl) {
		this.winnerl = winnerl;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void setLoosers(ArrayList<Player> loosers) {
		this.loosers = loosers;
	}
	
}
