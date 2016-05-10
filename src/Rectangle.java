import java.security.InvalidParameterException;

/**
 * Created by sunjing on 5/10/16.
 */
public class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        if (width < 0.0 || height < 0.0) {
            throw new InvalidParameterException();
        }

        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        if(this.width == 0 || this.height == 0) {
            return 0;
        }
        return (this.height * this.width);
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
