import javax.xml.crypto.Data;

/** Interface contains only abstract methods and no concrete ones;
 *  They're flexible since their implementation is done on a different class
 *  and each class can have its own implementation;
 *
 *  Lets write a program that connects to different databases and retrieves data
 *  from them to be used in a program;
 *
 *  forName() method Accepts ClassName as a String;
 *  newInstance creates objects to the a className
 * */

interface Databases {
    //All methods are public and abstract in nature;
    void connect();
    void disconnect();

}



    //For us to use an interface we have to implement it in a class
public class MySqlDB implements Databases{
    public void connect(){
            //Code specific to Mysql  Database;
        System.out.println("Connecting to My Sql database...");
    }
    public void disconnect(){
            //Code to disconnect to Mysql Database;
        System.out.println("Disconnecting from My Sql ");
    }

}

    //Now a different DB is implementing the same interface
class OracleDB implements Databases{
        public void connect(){
                //Code to connect to Oracle Database;
            System.out.println("Connecting to Oracle database...");
        }

        public void disconnect(){
            System.out.println("Disconnecting from Oracle.");
        }
}

class Main {
    public static void main(String[] args) throws Exception {
         /**   //Since the programmer doesn't know the name of the implementation class at the time of writing
            //The interface, he should create an obj to implementation class without knowing its name;

            //forName() accepts Class Name as String;
        Class c = Class.forName(args[0]);

            //Creating an object to the ClassName(c) and letting the reference var of interface point to it ;
        Databases db = (Databases) c.newInstance();
*/
                //We can Create an object to an interface but we can create a reference to it;
        Databases db;

        db = new MySqlDB();
        System.out.println("My Sql Database: ");
        db.connect();
        db.disconnect();

        db = new OracleDB();
        System.out.println("Oracle Database: ");
        db.connect();
        db.disconnect();


    }
}