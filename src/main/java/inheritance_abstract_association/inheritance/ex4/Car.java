package inherance_abstract_association.inheritance.ex4;

public class Car {
    private int passengerCount;
    private String engineType;


    public Car(int passengerCount, String engineType) {
        this.passengerCount = passengerCount;
        this.engineType = engineType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if(passengerCount>= 2) {
            this.passengerCount = passengerCount;
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(engineType.length() ==1) {
            if (engineType.charAt(0) >= 'a' && engineType.charAt(0) <= 'z' || engineType.charAt(0) >= 'A' &&
                    engineType.charAt(0) <= 'Z') {
            }
            this.engineType = engineType;
        }
    }
}
