package enum1;


import enum1.ex2.WeekDays;

public class Main {
    public static void main(String[] args){


        //EX. 1, 4
//        Planets planets = Planets.SATURN;
//        for(Planets aPlanet: Planets.values()){
//            System.out.print(aPlanet + ", ");
//        }
//        System.out.println((planets.getName() + " has " + planets.getYearLength() + " Earth days in a year."));
//        System.out.println(planets.distanceFromSun());


        //EX. 2
        WeekDays days = WeekDays.SATURDAY;
        System.out.println(days.numberWeekDay(WeekDays.TUESDAY));


        //EX. 3
//        Shapes shape = Shapes.RECTANGLE;
//        System.out.println(shape.area(5, 6));

        //EX. 5
//        Unit unit = Unit.METER;
//        System.out.println(unit.getBase());
//        System.out.println(Unit.KILOGRAM.getBaseUnit());


        //EX. 6

//        ShapeSub shape = new ShapeSub();
//        shape.setSides(ShapeType.valueOf("CIRCLE"), 6);
//        System.out.println(shape.getPerimeter(ShapeType.valueOf("CIRCLE")));


    }
}
