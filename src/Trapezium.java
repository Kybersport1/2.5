import java.util.Objects;

public class Trapezium extends Figure {
    protected final double x , y ,z,m, h;

    public Trapezium(double x , double y , double h,double z,double m){
        this.x = x;
        this.y = y;
        this.z = z;
        this.m = m;
        this.h = h;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public double getM(){
        return m;
    }
    public double getH(){
        return h;
    }

    @Override
    public double getArea(){
        double S = x + y;
        S = S/2;
        S = S * h;
        return S;
    }

    @Override
    public double getPerimeter(){
        double P = x + y + z + m;
        return P;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", m=" + m +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezium trapezium = (Trapezium) o;
        return Double.compare(trapezium.x, x) == 0 &&
                Double.compare(trapezium.y, y) == 0 &&
                Double.compare(trapezium.z, z) == 0 &&
                Double.compare(trapezium.m, m) == 0 &&
                Double.compare(trapezium.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, m, h);
    }
}
