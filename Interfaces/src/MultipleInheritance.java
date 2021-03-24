interface A{
    int a = 23;
    void method();

}
interface B{
    int a = 45;
    void Method();
}


public class MultipleInheritance {

    public void display(){
        System.out.println("Variable of interface A = "+A.a);
        System.out.println("Variable of interface B = "+B.a);
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.display();
    }

}
