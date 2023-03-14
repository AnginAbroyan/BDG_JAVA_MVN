package classes_and_objects.cars;

public class Car {
    String model;
    String color;
    int currentSpeed;
    boolean isEngineStart;

    public Car(String model, String color, boolean isEngineStart) {
        this.model = model;
        this.color = color;
        this.isEngineStart = isEngineStart;
    }

    boolean stopEngine(){
        isEngineStart = false;
        return false;
    }
    boolean startEngine(){
        isEngineStart = true;
        return true;
    }
}
