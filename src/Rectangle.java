import java.security.InvalidParameterException;

/**
 * Created by sunjing on 5/10/16.
 */
public class Rectangle implements IShape{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        if (width < 0.0 || height < 0.0) {
            throw new InvalidParameterException();
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.height * this.width);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
