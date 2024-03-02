class Punto2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void mover(double x, double y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return "Punto {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Tarea5_1 {
    public static void main(String[] args) {
        Punto2D punto = new Punto2D();
        punto.setX(3.5);
        punto.setY(2.0);
        System.out.println("Posición del punto: " + punto);
        punto.mover(5.0, 7.0);
        System.out.println("Nueva posición del punto: " + punto);
    }
}

