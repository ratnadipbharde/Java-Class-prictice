public class LeapYear {

    public void check(int year){
        if (year >=1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        }
        else
            System.out.println(" corresponding to a year in the Gregorian calendar");

    }
}
