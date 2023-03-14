package inherance_abstract_association.inheritance;

import inherance_abstract_association.inheritance.ex1.Child;
import inherance_abstract_association.inheritance.ex1.Parent;
import inherance_abstract_association.inheritance.ex2.SubClass;
import inherance_abstract_association.inheritance.ex4.Truck;

public class Main {

    public static void main(String[] args) {

        //EX1
        Parent obj = new Child();
        obj.showMessage();


        //EX2
        SubClass object1 = new SubClass();




        //EX4
        Truck obj2 = new Truck(3, "ESS");
        System.out.println("Passenger count: " + obj2.getPassengerCount() + "\nEngine Type: " + obj2.getEngineType() +
                "\nCapacity: " + obj2.getCapacity());


    }
}
