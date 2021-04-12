package weather_o_rama.observers;

import weather_o_rama.DisplayElement;
import weather_o_rama.Observer;
import weather_o_rama.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.printf("Current pressure: %.5f\nLast Pressure: %.5f\n\n", lastPressure, currentPressure);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
