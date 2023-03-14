package classes_and_objects.cars;
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes C203", "Black", false );
        Car c2 = new Car("Mercedes S505", "White", true );
        System.out.println(c1.startEngine());
        System.out.println(c2.stopEngine());
    }
}
