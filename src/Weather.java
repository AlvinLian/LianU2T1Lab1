//class definition
public class Weather {

    // instance variables
    private String day;
    private double tempInFahrenheit;

    // constructor
    public Weather(String todayDay, double todayTemperature) {
        day = todayDay;
        tempInFahrenheit = todayTemperature;
    }

    public void warmOrCold() {
        System.out.println("Today is " + day + " and the temperature is " + tempInFahrenheit + " degrees F.");
        if (tempInFahrenheit < 70) {
            System.out.println("It is a cold day.");
        } else {
            System.out.println("It is a warm day.");
        }
    }
}
