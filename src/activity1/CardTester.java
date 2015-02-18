package activity1;
public class CardTester {
    
	public static void main(String[] args) {
            Card c1, c2, c3;
            c1 = new Card("Q", "Hearts", 10);
            c2 = new Card("5", "Diamonds", 5);
            c3 = new Card("A", "Spades", 11);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            if (c1.matches(c3))
                System.out.println("Cards 1 and 3 match");
            else
                System.out.println("Cards 1 and 3 don't match");
            if (c1.matches(c2))
                System.out.println("Cards 1 and 2 match");
            else
                System.out.println("Cards 1 and 2 don't match");
            
            System.out.println("c1 is the suit " + c1.suit());
	}
}
