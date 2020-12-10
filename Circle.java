public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //Instance Methods;
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);

    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}

class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(21, 34);

        System.out.println("Volume = " + c.getVolume());

        Circle c2 = new Circle(21);
        System.out.println("Area = " + c.getArea());
    }
}
