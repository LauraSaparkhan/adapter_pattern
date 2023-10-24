import java.util.Map;

class WeatherAPI2 {
    public void printWeatherDetails(WeatherAPI2Data data) {
        Map<String, String> map = data.getWeatherData();
        for (String s : map.keySet()) {
            System.out.println("[" + s + "] = " + map.get(s));
        }
    }
}
