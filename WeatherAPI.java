import java.util.List;

//Service class
class WeatherAPI {
    public void printWeatherDetails(WeatherAPIData data) {
        List<String> list = data.getWeatherData();
        System.out.println(list);
    }
}
