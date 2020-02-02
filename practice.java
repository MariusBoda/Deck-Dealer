package practice;
import java.util.*;

public class practice {
	int Number;
	String ActSuit;

	ArrayList<String> deck = new ArrayList<String>();
	ArrayList<Integer> list = new ArrayList<Integer>();

	practice(int HandNumber) {
		Number = HandNumber;
		for(int o = 0; o < 4; o++) {
			if(o == 0) ActSuit = "Hearts";
			if(o == 1) ActSuit = "Diamonds";
			if(o == 2) ActSuit = "Spades";
			if(o == 3) ActSuit = "Clubs";
			for(int i = 0; i < 13; i++) {

				if(i == 0) {
					deck.add("Ace of " + ActSuit);
				}

				if(i == 10) {
					deck.add("Jack of " +  ActSuit);
				}

				if(i == 11) {
					deck.add("Queen of " + ActSuit);
				}
				if(i == 12) {
					deck.add("King of " + ActSuit);
				}

				if(1 < i && i != 10 && i != 11 && i != 12) {
					deck.add((Integer.toString(i)) + " of " + ActSuit);
				}

			}
		}
		hand();
	}

	public void hand() {
		for(int p = 0; p < Number; p++) {
			Random ran = new Random();
			int index = ran.nextInt(deck.size());
			String card = deck.remove(index);
			System.out.println(card);
		}
	}
}



