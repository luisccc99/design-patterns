package weather_o_rama;

import weather_o_rama.observers.CurrentConditionDisplay;
import weather_o_rama.observers.ForecastDisplay;
import weather_o_rama.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay
                = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay
                = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(79, 62.5f, 34.1f);
        weatherData.setMeasurements(89, 66.3f, 30.2f);
        weatherData.setMeasurements(80, 70.1f, 32.5f);

    }
}
