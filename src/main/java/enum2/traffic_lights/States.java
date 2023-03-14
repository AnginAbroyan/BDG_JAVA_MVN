package enum2.traffic_lights;

public enum States {
    GREEN(7),
    YELLOW(2),
    RED(15);

    public int sec;

    States(int sec) {

        this.sec = sec;
    }
}


