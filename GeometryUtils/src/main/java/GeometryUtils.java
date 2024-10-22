public class GeometryUtils {

    public static double areaToCentimeters(Circle circle) {
        return circle.area() * 100;
    }

    public static boolean compareTriangles(Triangle t1, Triangle t2) {
        return t1.area() == t2.area();
    }

    public static boolean compareCircles(Circle c1, Circle c2) {
        return c1.area() == c2.area();
    }
}
