import java.util.Objects;

public class Pentagon extends Figure {
    /*
        5тиугольник
     */
    protected final double x , y ,z ,m ,n ,apofema;

    public Pentagon(double x , double y , double z ,double m , double n,double apofema){
        this.x = x;
        this.y = y;
        this.z = z;
        this.m = m;
        this.n = n;
        this.apofema = apofema;
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
    public double getN(){
        return n;
    }
    public double getApofem(){
        return apofema;
    }

    @Override
    public double getArea(){
        double S = x + y + z + m + n;
        S = S * apofema;
        S = S/2;
        return S;
    }

    @Override
    public double getPerimeter(){
        double P = x + y + z + m + n;
        return P;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", m=" + m +
                ", n=" + n +
                ", apofema=" + apofema +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pentagon pentagon = (Pentagon) o;
        return Double.compare(pentagon.x, x) == 0 &&
                Double.compare(pentagon.y, y) == 0 &&
                Double.compare(pentagon.z, z) == 0 &&
                Double.compare(pentagon.m, m) == 0 &&
                Double.compare(pentagon.n, n) == 0 &&
                Double.compare(pentagon.apofema, apofema) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, m, n, apofema);
    }
}
