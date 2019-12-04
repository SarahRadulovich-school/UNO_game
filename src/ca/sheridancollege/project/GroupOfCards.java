/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public abstract class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
   // list of cards
	private ArrayList <Card> cards;
   // the number of cards in the list 
	
    private int size;//the size of the grouping
    //constructor, that creats a new group of cards with the spacified sized
    //ex:if we want to creat a group of ten cards,we use 
    // groupOfCard tenCards = new GroupOfCards(10);
    //create a new group of cards then hold a max of 10 cards
    public GroupOfCards(int givenSize) 
    {
        size = givenSize;
	// the max that should grou hc
	cards = new ArrayList(givenSize);
    }
   
    
    public boolean shuffle()
    {
        if(cards.isEmpty()) {
            //cards is empty and cannot be shuffled
            return false;
        }
        Collections.shuffle(cards);
        return true;
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    
}//end class
