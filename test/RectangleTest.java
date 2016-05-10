import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 5/10/16.
 */
public class RectangleTest {
    @Test
    public void shouldAddIntegers() {
        assertEquals(2,1+1);
    }

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2,3);
        assertEquals(6,rectangle.calculateArea(),0);
    }

    @Test
    public void zeroLengthRectangleHasNoArea() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.calculateArea(), 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldOnlyAcceptPositiveParameters() {
        Rectangle rectangle = new Rectangle(-1, 3);
    }

    @Test
    public void zeroWidthRectangleHasNoArea() {
        Rectangle rectangle = new Rectangle(1.0,0.0);
        assertEquals(0.0, rectangle.calculateArea(), 0);
    }

    @Test
    public void areaShouldBeEqualToBiggestDimensionWhenOneSideEqualsToOne() {
        Rectangle rectangle = new Rectangle(1, 10);
        assertEquals(10, rectangle.calculateArea(), 0);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(1, 3);
        assertEquals(8, rectangle.calculatePerimeter(), 0);
    }

    @Test
    public void zeroLengthRectangleHasNoPerimeter() {
        Rectangle rectangle = new Rectangle(0.0, 0.0);
        assertEquals(0.0, rectangle.calculatePerimeter(), 0);
    }

    @Test
    public void perimeterShouldBeTwiceTheHeightForZeroLength() {
        Rectangle rectangle = new Rectangle(0.0, 2);
        assertEquals(4, rectangle.calculatePerimeter(), 0);
    }
}
