public class TwoDimensionalArray {
    public static void main(CreatingStrings[] args) {

        int[][] marks = {{45, 46, 32}, {30, 26, 23,}, {45, 23, 19}};

        int sum = 0;
        int student1;
        int student2;
        int student3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                sum = marks[i][j]+marks[i][j]+marks[i][j];
                System.out.println(marks[j][i]);
            }

        }
        float avg = sum / 3;
        System.out.println(avg);
    }
}
