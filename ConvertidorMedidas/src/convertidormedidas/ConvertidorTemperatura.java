package convertidormedidas;

public class ConvertidorTemperatura {
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }
}

