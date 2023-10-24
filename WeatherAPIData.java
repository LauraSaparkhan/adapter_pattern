import java.util.List;

class WeatherAPIData {
    private List<String> weatherData;

    public WeatherAPIData(List<String> weatherData) {
        this.weatherData = weatherData;
    }

    public void setWeatherData(List<String> weatherData) {
        this.weatherData = weatherData;
    }

    public List<String> getWeatherData() {
        return weatherData;
    }
}
