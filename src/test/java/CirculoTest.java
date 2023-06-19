import exceptions.InvalidProportionsExeception;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import shapes.Circulo;
import shapes.Quadrado;
import shapes.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CirculoTest {
    @ParameterizedTest
    @CsvSource({"1, 3.1416", "4, 50.27"})
    public void getAreaTest(float num1, float expected) throws InvalidProportionsExeception {
        Shape shape = new Circulo(num1);
        double area = shape.getArea();
        assertEquals(expected, area, 0.01);
    }

    @ParameterizedTest
    @CsvSource({"0, 1", "-1, 0"})
    public void InvalidProportionsTest(float num1, float expected) throws InvalidProportionsExeception {
        assertThrows(InvalidProportionsExeception.class, () ->{
            Shape shape = new Circulo(num1);
            double area = shape.getArea();
            assertEquals(expected, area);
        });
    }

    @ParameterizedTest
    @CsvSource({"1", "20"})
    public void setRaioTest(float num1) throws InvalidProportionsExeception {
        Shape shape = new Circulo(78);
        ((Circulo) shape).setRaio(num1);
        assertEquals(((Circulo) shape).getRaio(), num1);
    }
}