public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather1 = new Weather("Tuesday",98);
        weather1.warmOrCold();

        Weather weather2 = new Weather("Sunday", 20);
        weather2.warmOrCold();

    }
}
