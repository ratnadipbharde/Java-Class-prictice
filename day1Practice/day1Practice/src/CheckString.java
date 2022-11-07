public class CheckString {
    String s1;
    String s2;

    public CheckString(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void check()
    {
        if (s1.equals(s2))
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are different");
        }
    }
}
