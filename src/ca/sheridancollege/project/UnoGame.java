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
public class UnoGame {

    /**
     * @param args the command line arguments
     */
//attributes 
    private Player winner;
    private ArrayList<Player> players;
    private ArrayList<Player> losers;

//construstor to instaliz an object
    public UnoGame() {

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
            System.out.println("Please enter Player " + (i + 1) + "'s name: ");
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

        boolean pickup2 = false;
        boolean pickup4 = false;

        //shuffle the deck
        deck.shuffle();
        //give each player 7 cards
        for (int i = 0; i < 4; i++) {
            players.get(i).setHandSize(7);
            players.get(i).setHand(deck.startingCards());
        }
        //start the game by selecting the first card from the deck onto the pile
        pile.setTopCard(deck.nextCard());

        //loop continues, as long as the win condition hasn't been met
        boolean reverse = false;
        //Starts at one because player1 will have the first turn. 
        int turnIndex = 0;

        //look into deck size thing @.@
        while (winner.getPlayerName() == null || deck.getSize() != 0) {
            //Remind the player what card is on top
            System.out.println("Top card: " + pile.getTopCard().getValue() + " , " + pile.getTopCard().getColour());

            Player current_player = players.get(turnIndex);
                //play game

            System.out.println("PLAYER: " + current_player.getPlayerName());
            System.out.println("Here is your hand: ");
            ArrayList<Card> hand = current_player.getHand();

            //if the previous player played "pickup2"
            if (pickup2 || pickup4) {
                //player gets 2 cards and forfeit's their turn
                System.out.println("You must pick up cards and forfeit your turn");

                hand.add(deck.nextCard());
                hand.add(deck.nextCard());
                
                if(pickup4) {
                    hand.add(deck.nextCard());
                    hand.add(deck.nextCard());
                }
                
                pickup2 = false;
                pickup4 = false;
                
            } else {
                
                System.out.println("0. Pick up a card");
                for (int i = 0; i < hand.size(); i++) {
                    System.out.println((i + 1) + ". " + hand.get(i).getValue() + ", " + hand.get(i).getColour());
                }

                Scanner scan = new Scanner(System.in);
                int selection = scan.nextInt();

                //Player chose to pick up a card. 
                if (selection == 0) {
                    hand.add(deck.nextCard());
                } //Play a card
                else {
                    //Player wants to play a card, we must check if it's valid
                    if (pile.validPlay(hand.get(selection - 1)) == true) {
                        //card is valid, and can be played
                        pile.setTopCard(hand.get(selection - 1));
                        
                        if(hand.get(selection - 1).getValue() == CardType.PICKUP2) {
                            pickup2 = true;
                        }
                        if(hand.get(selection - 1).getValue() == CardType.PICKUP4) {
                            pickup4 = true;
                        }
                        
                        //if it's the wild card
                        
                        hand.remove(selection - 1);
                        
                    } else {
                        System.out.println("That is not a valid card. ");
                    }

                    boolean penalty = UnoOrContinue(current_player);

                    if (penalty) {
                        //penalty is to pick up two cards
                        hand.add(deck.nextCard());
                        hand.add(deck.nextCard());
                    }
                }
            }

            //turn is over, set new hand.
            current_player.setHand(hand);
           
            //find out if we're switching the order of turns
            if (pile.getTopCard().getValue() == CardType.REVERSE) {
                reverse = !reverse;
            }

            //player turns going in numerical order
            if (!reverse) {
                turnIndex++;
                if (pile.getTopCard().getValue() == CardType.SKIPTURN) {
                    turnIndex++;
                }
                //if we've gone through all the players, it will return back to player1
                turnIndex = turnIndex % 4;
            } //player turns going in non-numerical
            else if (reverse) {
                turnIndex--;
                if (pile.getTopCard().getValue() == CardType.SKIPTURN) {
                    turnIndex--;
                }
                //if we've gone through all the players (in reverse), it will return back to player4
                turnIndex = turnIndex % 4;
                if (turnIndex < 0) {
                    turnIndex += 4;
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

    public boolean UnoOrContinue(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to say UNO or continue?");
        System.out.println("1. UNO");
        System.out.println("2. Continue");
        int choice = scan.nextInt();
        boolean hasUNO = false;
        boolean penalty = false;

        if (player.getHandSize() == 1) {
            hasUNO = true;
        }

        if (choice == 1) {
            //check if it's appropriate to say UNO
            if (hasUNO) {
                //they were correct to say UNO
                System.out.println("You have said UNO.");
            } else {
                //they were not correct to say UNO
                System.out.println("You do not have 1 card left. You will continue the game as normal");
            }
        } else {
            System.out.println("You have selected: Continue");
            if (hasUNO) {
                System.out.println("You did not say UNO! You will recieve 2 extra cards");
                penalty = true;
            }
        }

        //This is false UNLESS the user forgets to say UNO
        return penalty;
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
