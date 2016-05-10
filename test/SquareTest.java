import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 5/10/16.
 */
public class SquareTest {
    @Test
    public void shouldCalculateArea() {
        Square square = new Square(4);
        assertEquals(16, square.calculateArea(), 0);
    }

    @Test
    public void areaShouldBeZeroForLengthZero(){
        Square square = new Square(0.0);
        assertEquals(0.0, square.calculateArea(), 0);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square(3);
        assertEquals(12, square.calculatePerimeter(), 0);
    }

    @Test
    public void perimeterShouldBeZeroLenghtZero () {
        Square square = new Square(0.0);
        assertEquals(0.0, square.calculatePerimeter(), 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldNotAcceptNegativeParameter() {
        Square square  = new Square(-2);
    }
}
