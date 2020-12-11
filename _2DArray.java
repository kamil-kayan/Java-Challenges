import java.util.Scanner;

class _2DArray {
    public static void main(String[] args) {


        //Directly passing the array elements;

       /* float [][] f = {{2.3f, 45.32f, 4.2f, 8.3f},
                {2.4f, 65.3f, 5.6f, 7.2f},{3.4f, 9.1f, 4.8f, 6.3f}};

        // Displaying array values
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j ++){
                System.out.print(f[i][j]+"  ");
                if(j == 3){
                    System.out.println(f[i][j]+" ");
                }
            }
            System.out.println(" ");
        }*/

        //Displaying Matrix in Transpose form;

        //Inputs from the Keyboard;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the Values of rows And Columns");

        //Accepting the array values;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Displaying The Matrix;
        for (int i = 0; i < r; i ++){
            for (int j = 0; j < c; j ++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }

        //Matrix In Transpose Form:

        System.out.println("Matrix in Transpose form: ");
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j ++){
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println("");
        }

    }
}
