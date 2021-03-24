    /** Multiple inheritance through multiple interfaces;
     * */


interface Father{
        float HT = 5.7f;
        void height();
}

interface Mother{
        float HT = 5.8f;
        void height();
}

public class Child {
    void height (){
        System.out.println("Child's Height = "+((Father.HT+Mother.HT)/2));
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.height();
    }

}
