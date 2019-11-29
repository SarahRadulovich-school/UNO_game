/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author hussamhaidara
 */
public class PlayerTurn {
	
private Player player;
private String playerChoice;
private boolean reverseCard;

public PlayerTurn(Player player){
	this.player = player;
}
public void pickUpTwoCards(){
	
}
public void playerWon(){
    //setWinner(player);
	
}
public void UnoOrContinue(){
	
}
public void cardDecision(){
	
}
public void pickUpOneCard(){
	
}

public void wildCardChoice() {
    //This method assumes the player played the wildcard
    //and needs to make a decision about the colour
    System.out.println("What colour do you want?");
}

	public Player getPlayer() {
		return player;
	}

	public String getPlayerChoice() {
		return playerChoice;
	}
        
        public boolean getReverseCard() {
            return reverseCard;
        }

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setPlayerChoice(String playerChoice) {
		this.playerChoice = playerChoice;
	}
        
        public void setReverseCard(boolean reverse) {
            this.reverseCard = reverse;
            
        }

}
