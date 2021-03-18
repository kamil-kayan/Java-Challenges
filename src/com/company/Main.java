package com.company;
/** Inheritance Allows us to Create new Classes from the Existing Once.
 * It Allows Re-usability of already created code
 * When both the Super class members and the sub class members have the same same name, then by
 * default only the sub class members are accessible. We use 'Super' Keyword when this occurs. i.e super.method()/var;
 *
 * */

/*A Simple inheritance program  */
class Student {
        //I.V of Student class
    private int id;
    private String name;
    private String address;
    private int marks;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class Teacher extends Student{
    private int id;
    private float salary;


    public int getId(){
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student st = new Student();
        teacher.setName("Osman");
        teacher.setSalary(30000);
        teacher.setAddress("Bula Dhagax, Garissa");
        teacher.setId(23);
        st.setName("Oyow");
        st.setMarks(358);
        st.setId(6023);

        System.out.println("Student's Name: "+st.getName()+"\nStudent's id: "+st.getId()+
                "\nStudent's Marks: "+st.getMarks());
        System.out.println("Teacher's name: "+teacher.getName()+"\nTeacher's id:"+teacher.getId()+
                "\nTeacher's address: "+teacher.getAddress()+"\nTeacher's Salary: "+teacher.getSalary());

    }
}
