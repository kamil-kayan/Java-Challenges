public class Wall {
    private double height;
    private double width;

   public Wall(){

    }
    public Wall (double height, double width) {
        if (height < 0) {
            height = 0;
        } else {
            setHeight(height);

        }
        if (width < 0) {
            width = 0;
        } else {
            setWidth(width);
        }
    }

    public void setHeight(double height){
       if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }

    }
   public double getHeight(){
        return this.height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        } else {
            this.width = width;
        }
    }
    public double getWidth(){
        return  this.width;
    }

    public double getArea(){
        return  getHeight() * getWidth();
    }
}

class WallDemo{
    public static void main(String[] args) {
        Wall w = new Wall(25,45);
        System.out.println("The Area = "+w.getArea());

        Wall b = new Wall();
        b.setHeight(1.23);
        b.setWidth(-1.15);
        System.out.println("The area of "+b.getHeight()+ " height and "+
                b.getWidth()+" width = "+ b.getArea());

        Wall c = new Wall(1.125,-1.0);
        System.out.println("The Area = "+b.getArea());
    }
}


//public class Wall
//{
//    private double width;
//    private double height;
//
//    public Wall()
//    {
//
//    }
//
//    public Wall(double width, double height)
//    {
//        setHeight(height);
//        setWidth(width);
//    }
//
//    public void setWidth(double width)
//    {
//        if(width<0)
//            this.width = 0;
//        else
//            this.width = width;
//    }
//
//    public void setHeight(double height)
//    {
//        if(height<0)
//            this.height = 0;
//        else
//            this.height = height;
//    }
//
//    public double getWidth()
//    {
//
//        return width;
//    }
//
//    public double getHeight()
//    {
//         return height;
//    }
//
//    public double getArea()
//    {
//        return (getHeight()*getWidth());
//    }
//}
//class WallDemo {
//    public static void main(String[] args) {
//        Wall w = new Wall();
//        w.setWidth(1.125);
//        w.setWidth(-1.5);
//        System.out.println("The area = "+ w.getArea());
//
//        Wall b = new Wall(1.125,-1.0);
//        System.out.println("The Area = "+b.getArea());
//    }
//}