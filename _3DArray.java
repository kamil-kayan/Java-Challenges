

import java.util.Scanner;

public class _3DArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        int arr[][][] = new int[3][3][2];

        int department, subjects;
        int student1;
        int student2;

        int s1Marks = 0;
        int s2Marks = 0;

        int total = 0;

        int dCount = 1;
        int s1Count;
        int s2Count;

        for (department = 0; department < 3; department++) {
            System.out.println("Department " + dCount + " results:");
            System.out.println("Result for Student 1:");
            s1Count = 1;
            s2Count = 1;
            for (subjects = 0; subjects < 3; subjects++) {
                System.out.print("Subject " + s1Count + ": ");
                student1 = sc.nextInt();
                s1Marks += student1;
                s1Count++;
            }
            System.out.println("Result for Student 2:");
            for (subjects = 0; subjects < 3; subjects++) {
                System.out.print("Subject " + s2Count + ": ");
                student2 = sc.nextInt();
                s2Marks += student2;
                s2Count++;
            }
            System.out.println("Total Marks for Student 1: " + s1Marks);
            System.out.println("Total Marks for Student 2: " + s2Marks);
            s1Marks = 0;
            s2Marks = 0;

            dCount++;
        }
        System.out.println();
    }
}

//        Scanner sc = new Scanner(System.in);
/*
        int department = 0, student, marks, total = 0;

        int arr[][][] = {{{98, 92, 94}, {96, 95, 93}},
                {{89, 88, 87}, {78, 77, 76}},
                {{68, 67, 66}}, {{56,57,58}}};

        while(department< 3)
        {
            System.out.println("Department " + (department+1) + " results:");
            for (student = 0; student < 2; student++) {
                System.out.print("Student " + (student+1) + " marks: ");
                for (marks = 0; marks < 3; marks++) {
                    System.out.print(arr[department][student][marks] + " ");
                    total += arr[department][student][marks];
                }
                System.out.println("Total :" + total);
                total = 0;
            }
            department++;
        }
      }
}*/


