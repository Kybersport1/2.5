import java.util.Objects;

public class Circle extends Figure {
    protected final double R;

    public Circle(double R){
        this.R = R;
    }

    public double getR(){
        return R;
    }

    @Override
    public double getArea(){
        double S = 3.14*Math.pow(R,2);
        return S;
    }

    @Override
    public double getPerimeter(){
        double P = 6.28 * R;
        return P;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.R, R) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(R);
    }
}
