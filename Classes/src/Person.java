import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private int age;

    Person(){
        this.name = "Anisa";
        this.age = 19;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void accept () throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Name: ");
        name = br.readLine();

        System.out.print("Enter Your age: ");
        age = Integer.parseInt(br.readLine());
    }
    void check () throws IOException{
        if(age < 20 && age > 15){
            System.out.println(name+" You're A Teenager.");
        }
        if(age > 20){
            System.out.println(name+" You're an Adult.");
        }
        if(age < 15){
            System.out.println(name+" You're a child.");
        }
    }
}
class PersonDemo {
    public static void main(String[] args) throws IOException {

        Person one = new Person();
        one.check();

        Person two = new Person("Viduka",26);
        two.check();

        Person three = new Person();
        three.accept();
        three.check();

    }
}
