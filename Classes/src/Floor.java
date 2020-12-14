public class Floor {
    private final double length;
    private final double width;

    public Floor(double length, double width) {
        if (length < 0 && width < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }
}

 class Carpet {
    private final double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}

class Calculate{
    private final Floor floor;
    private final Carpet carpet;

    public Calculate(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        double total = floor.getArea() * carpet.getCost();
        return total;
    }
}

class Main{
    public static void main(String[] args) {
        Floor floor = new Floor(2.75,4.0);
        Carpet carpet = new Carpet(3.5);
        Calculate calculate = new Calculate(floor,carpet);
        System.out.println("Total Cost = "+calculate.getTotalCost());
    }
}

/*

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {

        this.width = width;
        this.length = length;

        if ((this.width < 0 ) || (this.length < 0)) {

            this.width = 0;
            this.length = 0;
        }

    }

    public double getArea() {

        return this.width*this.length;
    }


}

class Carpet {

    private double cost;

    public Carpet(double cost) {

        this.cost = cost;

        if (this.cost < 0) {

            this.cost = 0;
        }
    }

    public double getCost() {

        return this.cost;
    }


}

 class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {

        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {

        return this.floor.getArea()*this.carpet.getCost();
    }
}
*/


/*class Main{
    public static void main(String[] args) {
        Floor floor = new Floor(2.75,4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculate = new Calculator(floor,carpet);
        System.out.println("Total Cost = "+calculate.getTotalCost());
    }
}*/

