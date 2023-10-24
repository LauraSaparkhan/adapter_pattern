import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();

        //Mobile Application data
        StandardWeatherData standardWeatherData = new StandardWeatherData("Almaty", 26.3, "Cloudy");
        System.out.println(standardWeatherData.getClass().getSimpleName() + " for Mobile Application");
        weatherApp.printWeatherDetails(standardWeatherData);

        //API number one
        WeatherAPIData weatherAPIData = new WeatherAPIData(List.of("Location: Los Angeles", "Temperature: 30.4", "Description: Windy"));
        WeatherAPI weatherAPI = new WeatherAPI();
        System.out.println(weatherAPIData.getClass().getSimpleName() + " for weatherAPI");
        //The formal way to show the weather through weather api number 1
        weatherAPI.printWeatherDetails(weatherAPIData);
        System.out.println();
        //But with adapter:
        WeatherAdapterForApiData adapterForApiData = new WeatherAdapterForApiData(weatherAPIData);
        weatherApp.printWeatherDetails(adapterForApiData.getWeatherData());

        //API number two
        Map<String, String> map = new HashMap<>();
        map.put("Location", "Astana");
        map.put("Temperature", "22.1");
        map.put("Description", "Windy");
        WeatherAPI2Data weatherAPI2Data = new WeatherAPI2Data(map);
        WeatherAPI2 weatherAPI2 = new WeatherAPI2();
        System.out.println(weatherAPI2Data.getClass().getSimpleName() + " for weatherAPI2");
        //The formal way to show the weather through weather api number 2
        weatherAPI2.printWeatherDetails(weatherAPI2Data);
        System.out.println();
        //But with Adapter
        WeatherAdapterForApi2Data adapterForApi2Data = new WeatherAdapterForApi2Data(weatherAPI2Data);
        weatherApp.printWeatherDetails(adapterForApi2Data.getWeatherData());
    }
}
