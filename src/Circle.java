import java.security.InvalidParameterException;

/**
 * Created by sunjing on 5/10/16.
 */
public class Circle {
    private final double radius;
    Circle(double radius) {
        if(radius < 0 ){
            throw new InvalidParameterException();
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return this.radius * 3.14;
    }

    public double calculatePerimeter() {
        return this.radius * 2 * 3.14;
    }
}
