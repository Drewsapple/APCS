/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] hand = {
			new Card("Seven","Spades",7),
			new Card("Two","Clubs",2),
			new Card("Queen","Hearts",12)
		};
		for(Card obj : hand){
			System.out.println(obj.suit());
			System.out.println(obj.rank());
			System.out.println(obj.pointValue());
			System.out.println(obj.toString());
			System.out.println(obj.matches(hand[0]));
		}
	}
}
