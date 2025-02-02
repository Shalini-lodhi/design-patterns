public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileDisplay = new MobileDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.registerObserver(mobileDisplay);
        weatherStation.registerObserver(tvDisplay);

        System.out.println("Setting temperature to 25°C");
        weatherStation.setTemperature(25);

        System.out.println("\nRemoving TV Display...");
        weatherStation.removeObserver(tvDisplay);

        System.out.println("Setting temperature to 30°C");
        weatherStation.setTemperature(30);
    }
}
