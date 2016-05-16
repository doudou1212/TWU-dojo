import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 5/10/16.
 */
public class CircleTest {
    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle(100);
        assertEquals(314, circle.calculateArea(), 0);
    }

    @Test
    public void areaShouldBeZeroForRadiusZero() {
        Circle circle = new Circle(0.0);
        assertEquals(0.0, circle.calculateArea(), 0.0);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Circle circle = new Circle(100);
        assertEquals(628, circle.calculatePerimeter(), 0.0);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldNotAcceptNegativeParameter() {
        Circle circle = new Circle(-10);
    }

    @Test
    public void perimeterShouldBeZeroForRadiusZero() {
        Circle circle = new Circle(0.0);
        assertEquals(0.0, circle.calculatePerimeter(), 0);
    }
}
