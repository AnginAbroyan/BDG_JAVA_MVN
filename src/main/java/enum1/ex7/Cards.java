package enum1.ex7;

//ex7
public class Cards {
    private final Rank rank;
    private final Suit suit;

    Cards(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    public String toString(){
        return rank + " of " + suit;
    }


}
