package enum2.coffee;

public class Coffee {
    CoffeeSize coffee = CoffeeSize.LARGE;

    /**
     * Method prints out Coffee Size and its corresponding ordinal.
     */
    public void printNameOrdinal(){
        System.out.println(coffee + ": "+ coffee.ordinal());
    }
}
