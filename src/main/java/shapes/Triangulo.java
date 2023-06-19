package shapes;

import exceptions.InvalidProportionsExeception;

public class Triangulo extends Shape{
    private float sizeOne;
    private float sizeTwo;
    private float sizeThree;

    public Triangulo(float sizeOne, float sizeTwo, float sizeThree) throws InvalidProportionsExeception {
        super("Triângulo");
        if(sizeOne <=0 || sizeTwo <= 0 || sizeThree <= 0){
            throw new InvalidProportionsExeception();
        }
        if (sizeOne + sizeTwo <= sizeThree || sizeTwo + sizeThree <= sizeOne || sizeOne + sizeThree <= sizeTwo) {
            throw new InvalidProportionsExeception();
        }
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
    }

    @Override
    public double getArea() {
        double semiPerimetro = (this.sizeOne + this.sizeTwo + this.sizeThree) / 2;
        double area = Math.sqrt(semiPerimetro *
                (semiPerimetro - this.sizeOne) *
                (semiPerimetro - this.sizeTwo) *
                (semiPerimetro - this.sizeThree));
        return area;
    }
}
