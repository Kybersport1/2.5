import java.util.Objects;

public class Parallelogram extends Figure {
    protected final double x , y , h;

    public Parallelogram(double x, double y, double h){
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getH(){
        return h;
    }

    @Override
    public double getArea(){
        double S = x * h;
        return S;
    }

    @Override
    public double getPerimeter(){
        double P = x+y;
        P=P*2;
        return P;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "x=" + x +
                ", y=" + y +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Double.compare(that.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, h);
    }
}
