import java.util.Map;

class WeatherAdapterForApi2Data implements WeatherMobileApplication {
    private StandardWeatherData data;
    private WeatherAPI2Data api2Data;


    public WeatherAdapterForApi2Data(WeatherAPI2Data api2Data) {
        this.api2Data = api2Data;
        this.data = new StandardWeatherData();
    }

    public void convertToMobileAppFormat() {
        Map<String, String> map = api2Data.getWeatherData();
        data.setLocation(map.get("Location"));
        data.setTemperature(Double.parseDouble(map.get("Temperature")));
        data.setDescription(map.get("Description"));
    }

    @Override
    public StandardWeatherData getWeatherData() {
        convertToMobileAppFormat();
        return data;
    }
}
