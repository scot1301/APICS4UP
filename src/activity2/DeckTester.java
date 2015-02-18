package activity2;
public class DeckTester {

	public static void main(String[] args) {
            String suits[] ={"Hearts", "Diamonds", "Spades", "Clubs"};
            String ranks[] ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            int values[] = {2,3,4,5,6,7,8,9,10,10,10,10,11};
            Deck d = new Deck(ranks, suits, values);
            
            System.out.println("Dealt a " + d.deal());
            System.out.println("Dealt a " + d.deal());
            System.out.println("Dealt a " + d.deal());
            System.out.println("Dealt a " + d.deal());
            System.out.println(d);
            
	}
}
