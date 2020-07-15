public class NextDayCalculator {

    public static final int thirtyFirst = 31;
    public static final int thirty = 30;
    public static final int twentyEight = 28;
    public static final int twentyNight = 29;
    public static final int twelfth = 12;

    public static int[] nextDay(int day , int month , int year){
        int resultDay ;
        int resultMonth ;
        int resultYear ;

        boolean dateCheck31 = day == thirtyFirst;
        boolean dateCheck30 = day == thirty;
        boolean dateCheck28 = day == twentyEight;
        boolean dateCheck29 = day == twentyNight;
        boolean monthCheck = month == twelfth;

        if (dateCheck31 || dateCheck30 || dateCheck28 || dateCheck29){
            resultDay = 1;
            resultMonth = month + 1;
            resultYear = year;
        }else {
            resultDay = day + 1;
            resultMonth = month;
            resultYear = year;
        }

        if (dateCheck31 && monthCheck){
            resultDay = 1 ;
            resultMonth = 1;
            resultYear = year+1;
        }

        return new  int[] {resultDay,resultMonth,resultYear};
    }
}
