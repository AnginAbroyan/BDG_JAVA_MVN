package inherance_abstract_association.inheritance.ex4;

public class Truck extends Car {
    private int capacity = 0;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck(int passengerCount, String engineType) {
        super(passengerCount, engineType);
    }

}
