public class Cube {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
