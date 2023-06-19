import exceptions.InvalidProportionsExeception;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import shapes.Quadrado;
import shapes.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadradoTest {
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "4, 5, 20"})
    public void getAreaTest(int num1, int num2, int expected) throws InvalidProportionsExeception {
        Shape shape = new Quadrado(num1, num2);
        double area = shape.getArea();
        assertEquals(expected, area);
    }

    @ParameterizedTest
    @CsvSource({"0, 1, 0", "1, 0, 0"})
    public void InvalidProportionsTest(int num1, int num2, int expected) throws InvalidProportionsExeception {
        assertThrows(InvalidProportionsExeception.class, () -> {
            Shape shape = new Quadrado(num1, num2);
            double area = shape.getArea();
            assertEquals(expected, area);
        });
    }

    @ParameterizedTest
    @CsvSource({"1", "4"})
    public void setAlturaTest(int num1) throws InvalidProportionsExeception {
        Shape shape = new Quadrado(10, 5);
        ((Quadrado) shape).setAltura(num1);
        assertEquals(num1, ((Quadrado) shape).getAltura());
    }

    @ParameterizedTest
    @CsvSource({"0", "-1"})
    public void setInvalidAlturaTest(int num1) throws InvalidProportionsExeception {
        Shape shape = new Quadrado(10, 5);
        assertThrows(InvalidProportionsExeception.class, () -> {
            ((Quadrado) shape).setAltura(num1);
            assertEquals(num1, ((Quadrado) shape).getAltura());
        });
    }

    @ParameterizedTest
    @CsvSource({"1", "4"})
    public void setLarguraTest(int num1) throws InvalidProportionsExeception {
        Shape shape = new Quadrado(10, 5);
        ((Quadrado) shape).setLargura(num1);
        assertEquals(num1, ((Quadrado) shape).getLargura());
    }

    @ParameterizedTest
    @CsvSource({"0", "-1"})
    public void setInvalidLarguraTest(int num1) throws InvalidProportionsExeception {
        Shape shape = new Quadrado(10, 5);
        assertThrows(InvalidProportionsExeception.class, () -> {
            ((Quadrado) shape).setLargura(num1);
            assertEquals(num1, ((Quadrado) shape).getLargura());
        });
    }
}