package com.company;

import java.util.Scanner;

public class Main2 {
    public static Scanner sc = new Scanner(System.in);
    public static Button btnprint = new Button("Helen icon");


    public static void main(String[] args) {


            //a local inner class within the Main Method;
        class ClickListener implements Button.OnClickListener {
            public ClickListener(){
                System.out.println("Invoked the Click Listener Constructor");
            }

                //An interface method that displays
            @Override
            public void onClick(String title) {
                System.out.println(title+" was Clicked");
            }
        }
        btnprint.setOnClickListener(new ClickListener());
        listen();
    }
    private static void listen(){
        boolean quit = false;
        while (!quit) {
            int choice = sc.nextByte();
            sc.nextLine();
            switch (choice) {
                case 0 -> quit = true;
                case 1 -> btnprint.onClick();
            }

        }
    }
}


