public class Main {
    public static void main(String[] args) {

        System.out.println("-----------program to display any message----------");
        DisplayMassage display=new DisplayMassage();
        display.Massage();

        System.out.println("-----------program to display the default value of all primitive data types of Java----------");
        DisplaydefaultValue obj1 =new DisplaydefaultValue();
        obj1.print();

        System.out.println("-----------program to check two strings are equal or not----------");
        CheckString check1=new CheckString("Mumbai","Mumbai");
        check1.check();

        System.out.println("-----------the Year is a Leap Year or not a Leap Year----------");
        LeapYear checkYear=new LeapYear();
        checkYear.check(2022);
    }
}