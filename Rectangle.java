public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 && width < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.width * this.length;
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
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
        return getArea() * this.height;
    }
}

class MainVolume {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 29);
        Cuboid ch = new Cuboid(7, 7, 8);
        System.out.println("Rectangle length = " + r.getLength());
        System.out.println("Rectangel width = " + r.getWidth());
        System.out.println("Rectangle Area = " + r.getArea());
        System.out.println("Volume = " + ch.getVolume());

    }
}
