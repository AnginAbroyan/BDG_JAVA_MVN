package enum2.planets;



public enum SolarPlanets {
    MERCURY("Mercury", "58 million kilometers", "3,285E23 kg"),
    VENUS("Venus", "108 million kilometers", "4,867E24 kg"),
    EARTH("Earth", "150 million kilometers", "5.972E24 kg"),
    MARS("Mars", "228 million kilometers", "6,39E23 kg"),
    JUPYTER("Jupyter", "778 million kilometers", "1,898E27 kg"),
    SATURN("Saturn", "1.4 billion kilometers", "5,683E26 kg"),
    URANUS("Uranus", "1.8 billion kilometers", "8,681E25 kg"),
    NEPTUNE("Neptune", "2.8 billion kilometers", "1,024E26 kg");

    private final String name;
    private final String distanceFromSun;
    private final String mass;

    SolarPlanets(String name, String distanceFromSun, String mass) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    /**
     * Method prints out the planets name, its distance from the Sun and its mass.
     */
    public void printNameMass() {
        System.out.println(name + "'s distance from the sun is equal to  " + distanceFromSun + ", and mass is " + mass+ ".");
    }
//    public static Stream<SolarPlanets> stream() {
//        return Stream.of(SolarPlanets.values());
//    }
}
