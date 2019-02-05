import java.util.Objects;

public class Triangle extends Figure{
    protected final int x, y, z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }

    @Override
    public double getArea(){
        double p = x + y + z;
        p = p /2;
        double S = p-x;
        S = S * (p-y);
        S = S * (p-z);
        S = Math.sqrt(S);
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return x == triangle.x &&
                y == triangle.y &&
                z == triangle.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
