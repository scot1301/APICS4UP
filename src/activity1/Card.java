package activity1;
public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
            suit = cardSuit;
            rank = cardRank;
            pointValue = cardPointValue;
            
	}

	public String suit() {
            return suit;
        }

	public String rank() {
            return rank;
	}

	public int pointValue() {
            return pointValue;
	}

	public boolean matches(Card otherCard) {
            if(this.suit.equals(otherCard.suit())
                    &&this.rank.equals(otherCard.rank())
                    &&this.pointValue==otherCard.pointValue())
                        return true;
            else
                    return false;
	}

	@Override
	public String toString() {
            return "[" + this.rank + "] of [" + this.suit + "] (point value = " + this.pointValue + ")]";
	}
}
