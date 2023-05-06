package magnitude;

public abstract class Temperature {
    protected double degree;

    public Temperature(){
        this.degree = 0;
    }

    public Temperature(double degree){
    this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public abstract double convKelvin();
    public abstract double convCelsius();
    public abstract double convFahrenheit();

}
