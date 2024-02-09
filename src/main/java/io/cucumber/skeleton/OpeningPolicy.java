package io.cucumber.skeleton;

public class OpeningPolicy {
    public static boolean isOpen(String dayOfTheWeek, String timeOfDay) {
        boolean isSunday = DayOfWeek.SUNDAY.toString().equalsIgnoreCase(dayOfTheWeek);

        if(isSunday) {
            return false;
        }

        return isTimeInRangeString(timeOfDay);
    }

    private static boolean isTimeInRangeString(String time) {
        return time.compareTo("19:00") >= 0 && time.compareTo("23:00") <= 0;
    }
}
