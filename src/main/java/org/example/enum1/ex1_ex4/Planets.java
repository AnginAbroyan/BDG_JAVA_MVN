package org.example.enum1.ex1_ex4;

//EX. 1 and 4
public enum Planets {
    MERCURY("Mercury", 88){
        @Override
        public String distanceFromSun() {
            return "58 million kilometers";
        }
    },
    VENUS("Venus", 225){
        @Override
        public String distanceFromSun() {
            return "108 million kilometers";
        }
    },
    EARTH("Earth", 365){
        @Override
        public String distanceFromSun() {
            return "150 million kilometers";
        }
    },
    MARS("Mars", 687){
        @Override
        public String distanceFromSun() {
            return "228 million kilometers";
        }
    },
    JUPYTER("Jupyter", 4333){
        @Override
        public String distanceFromSun() {
            return "778 million kilometers";
        }
    },
    SATURN("Saturn", 10759){
        @Override
        public String distanceFromSun() {
            return "1.4 billion kilometers";
        }
    },
    URANUS("Uranus", 30687){
        @Override
        public String distanceFromSun() {
            return "1.8 billion kilometers";
        }
    },
    NEPTUNE("Neptune", 60200){
        @Override
        public String distanceFromSun() {
            return "2.8 billion kilometers";
        }
    };


    private final String name;
    private final int yearLength;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;

    }


    /**
     * @returns the name of the planet.
     */
    public String getName() {
        return name;
    }

    /**
     * @returns the year length in the planet, the base is Earth days.
     */
    public int getYearLength() {
        return yearLength;
    }


    //ex. 4

    /**
     * @returns the distance between the planet and the Sun.
     */
    public abstract String distanceFromSun();
}
