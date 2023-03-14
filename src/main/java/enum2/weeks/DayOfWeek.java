package enum2.weeks;

import java.util.Scanner;


public enum DayOfWeek {
    MONDAY("monday", "weekday"),
    TUESDAY("tuesday", "weekday"),
    WEDNESDAY("wednesday", "weekday"),
    THURSDAY("thursday", "weekday"),
    FRIDAY("friday", "weekday"),
    SATURDAY("saturday", "weekend"),
    SUNDAY("sunday", "weekend");

    String type;
    String name;

    DayOfWeek(String name, String type) {
        this.type = type;
        this.name = name;
    }

    //        public static Stream<DayOfWeek> stream() {
//        return Stream.of(DayOfWeek.values());
//    }
    Scanner sc = new Scanner(System.in);

    /**
     * Method check whether the day is a weekday day or a weekend day.
     */
    public void isWeekday() {
        System.out.println("Please enter the day to detect whether it's weekday or weekend day.");
        String input = sc.nextLine().toUpperCase();

        for (DayOfWeek days : DayOfWeek.values()) {
            if (input.equals(MONDAY.toString()) || input.equals(TUESDAY.toString()) || input.equals(WEDNESDAY.toString())
                    || input.equals(THURSDAY.toString()) || input.equals(FRIDAY.toString())) {
                System.out.println(input + " is a weekday day");
                break;
            }
            if (input.equals(SATURDAY.toString()) || input.equals(SUNDAY.toString())) {
                System.out.println(input + " is a weekend day");
                break;
            }
            else {
                System.out.println("Please enter a valid weekday name.");
                break;
            }
        }
    }
}





