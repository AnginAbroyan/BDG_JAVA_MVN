package org.example.enum1.ex5;

//EX. 5
public enum Unit {
    METER("meter", 1){
        public int getBaseUnit(){
            return METER.baseUnit;
        }
    },
    KILOGRAM("kilogram", 2){
        public int getBaseUnit(){
            return KILOGRAM.baseUnit;
        }
    },
    SECOND("second", 3){
        public int getBaseUnit(){
            return SECOND.baseUnit;
        }
    },
    AMPERE("ampere", 4){
        public int getBaseUnit(){
            return AMPERE.baseUnit;
        }
    },
    KELVIN("kelvin", 5){
        public int getBaseUnit(){
            return KELVIN.baseUnit;
        }
    },
    MOLE("mole", 6){
        public int getBaseUnit(){
            return MOLE.baseUnit;
        }
    },
    CANDELA("candela", 7){
        public int getBaseUnit(){
            return CANDELA.baseUnit;
        }
    };
//    NEWTON("newton", KILOGRAM, METER, SECOND){
//        public int getBaseUnit(){
//            return KILOGRAM.baseUnit* METER.baseUnit/Math.pow((SECOND.baseUnit), 2);
//        }
//    },
//    JOULE("joule", KILOGRAM, METER, SECOND);


    private String name;
    private int baseUnit;

    Unit(String name, int baseUnit) {
        this.name = name;
        this.baseUnit = baseUnit;
    }

    //NEWTON constructor
    Unit(String name, Unit KILOGRAM, Unit METER, Unit SECOND) {
        this.name = name;
    }

    public abstract int getBaseUnit();


}

