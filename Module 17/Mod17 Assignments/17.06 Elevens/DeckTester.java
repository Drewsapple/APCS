/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Spades", "Diamonds","Clubs"};
		int[] pointValues = {11,12,13};
		Deck d1 = new Deck(ranks,suits,pointValues);
		System.out.println(d1.toString());
		
		String[] ranks2 = {"Three", "Seven", "Ace"};
		String[] suits2 = {"Clubs", "Hearts","Clubs"};
		int[] pointValues2 = {3,7,1};
		Deck d2 = new Deck(ranks2,suits2,pointValues2);
		Card dealt = d2.deal();
		System.out.println(d2.toString());
		
		String[] ranks3 = {"Four", "Eight", "Five"};
		String[] suits3 = {"Hearts", "Hearts","Spades"};
		int[] pointValues3 = {4,8,5};
		Deck d3 = new Deck(ranks3,suits3,pointValues3);
		System.out.println(d3.toString());
		
	}
}
