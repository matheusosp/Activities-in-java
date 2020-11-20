package celsiustofahrenheit;
public class Convert {
    double Celsius;
    double Fahrenheit;
    double Kelvin;
    public Convert(double Celsius){
        this.Celsius = Celsius;
        this.Fahrenheit = (Celsius * 9/5) + 32;
        this.Kelvin = Celsius+273.15;
    }
    public double getKelvin() {
        return Kelvin;
    }

    public void setKelvin(double Kelvin) {
        this.Kelvin = Kelvin;
    }
    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double Celsius) {
        this.Celsius = Celsius;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(double Fahrenheit) {
        this.Fahrenheit = Fahrenheit;
    }
}
