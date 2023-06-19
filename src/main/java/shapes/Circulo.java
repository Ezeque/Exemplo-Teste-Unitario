package shapes;

import exceptions.InvalidProportionsExeception;

public class Circulo extends Shape{
    private double raio;
    public Circulo(double raio) throws InvalidProportionsExeception {
        super("Circulo");
        if(raio <= 0){
            throw new InvalidProportionsExeception();
        }
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}
