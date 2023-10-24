import java.util.Date;

//Client class
class WeatherApp {
    public void printWeatherDetails(StandardWeatherData data) {
        System.out.println("Weather of the date: " + (new Date()));
        System.out.println("Location: " + data.getLocation());
        System.out.println("Temperature: " + data.getTemperature());
        System.out.println("Description: " + data.getDescription());
        System.out.println("\n");
    }
}
