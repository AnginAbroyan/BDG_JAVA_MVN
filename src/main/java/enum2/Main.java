package enum2;


import enum2.coffee.Coffee;
import enum2.pizza.PizzaSize;
import enum2.pizza.Topping;
import enum2.planets.SolarPlanets;
import enum2.seasons.Season;
import enum2.traffic_lights.Program;
import enum2.weeks.DayOfWeek;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        //EX1
//    Program program = new Program();
//    program.changeState();

        //EX2
//        Coffee obj = new Coffee();
//        obj.printNameOrdinal();

        //EX3
//       SolarPlanets.stream().forEach((System.out::println));


//        for (SolarPlanets planets1 : SolarPlanets.values()){
//            planets1.printNameMass();
//        }


        //EX4
//        DayOfWeek day = DayOfWeek.MONDAY;
//        day.isWeekday();


        //EX5
        Season obj1 = Season.SPRING;
        obj1.checkSeason();



        //EX6
//        Topping obj2 = Topping.PEPPER;
//        PizzaSize obj =PizzaSize.SMALL;
//        System.out.println(obj.sizePriceCalculator() + obj2.toppingPriceCalculator());

    }
}
