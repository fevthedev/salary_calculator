public class Tax {

    static final int WEEKLY_HOURS = 40;
    static final int DAILY_HOURS = 8;

    public static float calculateDailyTotal(float hourlyRate) {
        return hourlyRate * DAILY_HOURS;
    }

    public static float calculateWeeklyTotal(float hourlyRate) {
        return hourlyRate * WEEKLY_HOURS;
    }
    public static float calculateBiWeeklyTotal(float hourlyRate) {
        return hourlyRate * WEEKLY_HOURS * 2;
    }

    public static float calculateMonthlyTotal(float hourlyRate) {
        return hourlyRate * DAILY_HOURS * 20;
    }
}
