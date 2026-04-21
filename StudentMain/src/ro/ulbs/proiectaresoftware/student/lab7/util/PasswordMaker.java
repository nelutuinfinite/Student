package ro.ulbs.proiectaresoftware.student.lab7.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;
    public static PasswordMaker current=null;
    private static int counter=0;

    private String name;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);

    }

    public static PasswordMaker getInstance(){
        if(current==null){
            current= new PasswordMaker("Ion");
        }
        counter++;
        return  current;
    }
    private PasswordMaker(String name) {
        this.name = name;

    }

    public String getPassword() {
        java.util.Random r = new java.util.Random();
        String ln = ""+name.length();
        ln += r.nextInt(101);
        StringRandomizer srand = new StringRandomizer();
        return srand.randomString(MAGIC_NUMBER) + srand.randomString(10, MAGIC_STRING) + ln;
    }
    public static int getCallingCounts(){
        return counter;
    }
}

