package shapes;

import exceptions.InvalidProportionsExeception;

public class Quadrado extends Shape{
    private float altura;
    private float largura;

    public Quadrado(float altura, float largura) throws InvalidProportionsExeception {
        super("Quadrado");
        if(altura <=0 || largura <= 0){
            throw new InvalidProportionsExeception();
        }
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return this.largura * this.altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws InvalidProportionsExeception {
        if(altura <= 0){
            throw new InvalidProportionsExeception();
        }
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura)  throws InvalidProportionsExeception {
        if(largura <= 0){
            throw new InvalidProportionsExeception();
        }
        this.largura = largura;
    }
}
