import java.util.HashMap;
import java.util.Map;

class WeatherAPI2Data {
    private Map<String, String> map;

    public WeatherAPI2Data(Map<String, String> map) {
        this.map = map;
    }

    public WeatherAPI2Data() {
        map = new HashMap<>();
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getWeatherData() {
        return map;
    }
}
