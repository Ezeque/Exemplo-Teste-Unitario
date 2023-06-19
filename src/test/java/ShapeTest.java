import exceptions.InvalidProportionsExeception;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import shapes.Circulo;
import shapes.Quadrado;
import shapes.Shape;
import shapes.Triangulo;

public class ShapeTest {
    @ParameterizedTest
    @CsvSource({"1, Pequeno", "1.5, Médio", "10, Grande"})
    public void CirculoSizeGroupTest(float raio, String group) throws InvalidProportionsExeception {
        Shape shape = new Circulo(raio);
        String sizeGroup = shape.getSizeGroup();
        assertEquals(group, sizeGroup);
    }

    @ParameterizedTest
    @CsvSource({"1, Circulo", "2, Quadrado", "3, Triângulo"})
    public void CirculoSizeGroupTest(int option, String name) throws InvalidProportionsExeception {
        Shape shape;
        switch(option){
            case 1 -> {shape = new Circulo(1);}
            case 2 -> {shape = new Quadrado(1,1);}
            case 3 -> {shape = new Triangulo(3,4,5);}
            default -> {shape = new Circulo(1);}
        }
        assertEquals(shape.getNome(), name);
    }
}
