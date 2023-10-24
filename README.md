# Weather Data Adapter Project
This Java project demonstrates the Adapter design pattern, which is used to adapt data from different sources to a common format. In this project, we have a client application (WeatherApp) that displays weather data in a standard format using the StandardWeatherData class. We also have two different data sources: WeatherAPIData and WeatherAPI2Data, which have different structures. To make these data sources compatible with the WeatherApp, we create adapter classes, WeatherAdapterForApiData and WeatherAdapterForApi2Data, which implement the WeatherMobileApplication interface.

## Project Structure
### StandardWeatherData Class
This class represents standard weather data with attributes for location, temperature, and description. It provides getter and setter methods for these attributes.
### WeatherApp Class
WeatherApp is the client class responsible for displaying weather data. It has a method, printWeatherDetails, that takes an instance of StandardWeatherData and prints out the weather details in a standardized format.
#### Methods:
printWeatherDetails(StandardWeatherData data): Takes a StandardWeatherData object as a parameter and prints out the weather details, including the date, location, temperature, and description.
### WeatherMobileApplication Interface
WeatherMobileApplication is an interface that defines the common interface for weather data sources. It includes a single method, getWeatherData, which returns weather data in the StandardWeatherData format.
### WeatherAPIData Class
WeatherAPIData is a class representing weather data from API number one. It stores weather information as a list of strings. It provides methods to set and retrieve this data.
### WeatherAPI2Data Class
WeatherAPI2Data represents weather data from API number two. It uses a map to store weather information, with keys for attributes like "Location," "Temperature," and "Description." Similar to WeatherAPIData, it provides methods to set and retrieve this data.
### WeatherAPI and WeatherAPI2 Classes
WeatherAPI and WeatherAPI2 are service classes responsible for printing weather details in their original format. WeatherAPI works with WeatherAPIData, and WeatherAPI2 works with WeatherAPI2Data.  
#### Methods:
printWeatherDetails(WeatherAPIData data): This method prints weather details in the original format (list of strings).  

printWeatherDetails(WeatherAPI2Data data): This method prints weather details in the original format (map of key-value pairs).  

### WeatherAdapterForApiData and WeatherAdapterForApi2Data Classes
WeatherAdapterForApiData and WeatherAdapterForApi2Data are adapter classes that adapt WeatherAPIData and WeatherAPI2Data to the WeatherMobileApplication interface, respectively. They convert the data from the original format (list of strings or map) to the StandardWeatherData format.  

Methods:  
WeatherAdapterForApiData(WeatherAPIData apiData) and WeatherAdapterForApi2Data(WeatherAPI2Data api2Data): These are constructor methods for the adapter classes. They accept the respective data source and create instances of StandardWeatherData to adapt the data.  

convertToMobileAppFormat(): This method within both adapter classes performs the conversion of data from the original format (list of strings or map) to the StandardWeatherData format. It extracts information such as location, temperature, and description from the original data source.  

getWeatherData(): This method implements the WeatherMobileApplication interface. It calls convertToMobileAppFormat() and returns the weather data in the StandardWeatherData format.  

### Main Class
The Main class is the entry point of the application. It demonstrates how the client application (WeatherApp) can work with both data sources using the Adapter pattern. It creates instances of WeatherAPIData and WeatherAPI2Data, along with their corresponding adapters, and displays weather details using the WeatherApp class.
