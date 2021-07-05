package weather_o_rama.subject;

import weather_o_rama.Observer;
import weather_o_rama.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData class is the subject,
 * it lets its observers to retrieve what they need
 * with getters and setters
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    // notifies observer through update method
    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update();
        }
    }

    // notify observers that measurements (data) changed
    public void measurementsChange() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
