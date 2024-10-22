
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

//    public double height() {
//        double area = area();
//        return (2 * area) / sideA;
//    }

    @Override
    public String toString() {
        return "Triangle: sides = " + sideA + ", " + sideB + ", " + sideC +
                ", area = " + area() + ", perimeter = " + perimeter();
    }
}
