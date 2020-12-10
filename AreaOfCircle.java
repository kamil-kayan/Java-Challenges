package Section4Challenges;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(area(7));
        System.out.println(area(7, 22));
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        double area = Math.PI * (radius * radius);
        return area;
    }

    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("invalid");
            return -1;
        }

        double area = (length * width);
        return area;
    }
}
