import java.util.List;

//Adapter For Api number one
class WeatherAdapterForApiData implements WeatherMobileApplication {
    private StandardWeatherData data;
    private WeatherAPIData apiData;

    public WeatherAdapterForApiData(WeatherAPIData apiData) {
        this.apiData = apiData;
        this.data = new StandardWeatherData();
    }

    public void convertToMobileAppFormat() {
        List<String> list = apiData.getWeatherData();
        data.setLocation(list.get(0).substring(list.get(0).indexOf("Location: ")));
        data.setTemperature(Double.parseDouble(list.get(1).substring(list.get(1).indexOf(" ") + 1)));
        data.setDescription(list.get(2).substring(list.get(2).indexOf("Description: ")));
    }

    @Override
    public StandardWeatherData getWeatherData() {
        convertToMobileAppFormat();
        return data;
    }
}
