public enum Month {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int daysInMonth;

    private Month(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }


    public int getMonthNum() {
        return ordinal() + 1;
    }

    public static int howManyDaysBefore(Month month, int dayInMonth) {
        int daysBefore = 0;
        Month[] arr = Month.values();
        for (int i = 0; i < month.ordinal(); i++) {
            daysBefore += arr[i].getDaysInMonth();
        }
        return daysBefore+dayInMonth-1;
    }

    public static Month whichMonth(int currentDay) {
        Month[] arr = Month.values();
        int totalDays = 0;
        int count = 0;
        while(totalDays < currentDay) {
            totalDays += arr[count].getDaysInMonth();
            count++;
        }
        return arr[count-1];
    }

}
