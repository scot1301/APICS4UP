package activity2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Deck{

	private List<Card> cards;
	private int size;
        Random r = new Random();

	public Deck(String[] ranks, String[] suits, int[] values) {
            cards = new ArrayList<Card>();
            for(int i = 0; i <ranks.length; i++){
                for(String suitString: suits){
                    cards.add(new Card(ranks[i], suitString, values[i]));
                }
            }
            size=cards.size();
            shuffle();
	}


	public boolean isEmpty(){
            if(size==0)
                return true;
            else
                return false;
	}

	public int size(){
            return size;
	}

	public void shuffle(){
            int deckSize;
            deckSize = size();
            int[] numbers = new int[deckSize];
            for(int i=0; i<deckSize;i++){
                numbers[i]=i;
            }
	}

	public Card deal(){
            if(isEmpty()){
                return null;
            }
            size--;
            return cards.get(size);
	}

	@Override
	public String toString(){
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
