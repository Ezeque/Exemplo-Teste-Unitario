import exceptions.InvalidProportionsExeception;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import shapes.Quadrado;
import shapes.Shape;
import shapes.Triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianguloTest {
    @ParameterizedTest
    @CsvSource({"1, 1, 1, 0.433", "3, 4, 5, 6"})
    public void getAreaTest(float num1, float num2, float num3, float expected) throws InvalidProportionsExeception {
        Shape shape = new Triangulo(num1,num2,num3);
        double area = shape.getArea();
        assertEquals(expected, area, 0.01);
    }

    @ParameterizedTest
    @CsvSource({"0, 1, 1, 1", "1, 0, 1, 1", "1, 1, 0, 1","0, 0, 0, 0", "1, 20, 3, 50"})
    public void InvalidProportionsTest(float num1, float num2, float num3, float expected) throws InvalidProportionsExeception {
        assertThrows(InvalidProportionsExeception.class, () ->{
            Shape shape = new Triangulo(num1,num2, num3);
            double area = shape.getArea();
            assertEquals(expected, area);
        });
    }
}