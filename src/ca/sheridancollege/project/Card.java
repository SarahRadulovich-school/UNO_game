/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;


/**
 *
 * @author hussamhaidara
 */
public class Card {
	
	private Colour colour;
//CardType is enum here define thing in list that we cannot remove 
	private CardType value;

	public Card(){
		
	}

	public Colour getColour() {
		return colour;
	}

	public CardType getValue() {
		return value;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public void setValue(CardType value) {
		this.value = value;
	}

}
