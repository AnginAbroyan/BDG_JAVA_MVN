package enum1.ex2;

//EX. 2
public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    /**
     * This method tells you the numeric name of the weekday, for ex. Monday is the first day, Tuesday is the 2nd day...
     * @param weekdays
     * @returns
     */
    public int numberWeekDay(WeekDays weekdays) {

        return weekdays.ordinal() + 1;
    }
}

