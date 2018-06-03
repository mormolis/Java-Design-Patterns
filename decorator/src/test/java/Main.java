public class Main {
    public static void main(String[] args) {
        SaladBox myDailyLaunch = new SaladBoxSIze(Size.MEDIUM);
        myDailyLaunch = new Peanuts(myDailyLaunch);
        myDailyLaunch = new Tomato(myDailyLaunch);
        System.out.println("Today I ate -> "+myDailyLaunch.getDescription() + " which costed: " + myDailyLaunch.getCost());
    }
}
