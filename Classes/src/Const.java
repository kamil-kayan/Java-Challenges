package com.kamil;

public class Main {

    public static void main(String[] args) {



        //There are two ways of Providing values into the corresponding data types;
        //One is using the SetMethod(), to set the exact values, the other being
        //Using The main Constructor

        //Using SetMethod to set The exact Values;
       /* BankAccount ba = new BankAccount();
        ba.setBalance(70000);
        ba.setCustomerName("Kamil");
        ba.setEmail("iconicallykamil@gamil.com");
        ba.setNumber(26895372692L);*/


        //Setting Values using a Constructor;
        BankAccount ba = new BankAccount("Narj",23453, 45000, (9178112345L),
                "iconicallyKamil@gmail.com");

        ba.setCustomerName("Kamil. ");
        System.out.print("Hello, " + ba.getCustomerName());
        System.out.println("Your account number = "+ba.getNumber());
        System.out.println("Your email is " + ba.getEmail());

        ba.withdraw(15000);
        ba.deposit(23000);
        System.out.println("Now You have " + ba.getBalance());
    }
}
