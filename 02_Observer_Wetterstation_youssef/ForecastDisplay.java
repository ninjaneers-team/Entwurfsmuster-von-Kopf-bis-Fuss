public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Vorhersage: ");
        if (currentPressure > lastPressure) {
            System.out.println("Wetter bessert sich!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Gleichbleibend.");
        } else {
            System.out.println("Es wird kälter und regnerischer.");
        }
    }
}
