package unit;

import magnitude.Temperature;

public class Kelvin extends Temperature{
   
    public Kelvin(){
        super();
    }
    public Kelvin(double degree){
        super(degree);
    }

    @Override
    public double convCelsius() {
        return degree - 273.15;
    }

    @Override
    public double convFahrenheit() {
        return (9*(degree - 273.15))/5 + 32;    
    }

    @Override
    public double convKelvin() {
        return degree;
    }
    
}
