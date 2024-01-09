import java.util.Scanner;

public class ZeroTask {
    //0. Создать трехмерный массив из целых чисел.
    //С помощью циклов пройтись по массиву и увеличить каждый элемент на заданное число.
    //Число задается из консоли.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[][][] arr = new int[][][]{
                {
                        {4, 5, 6},
                        {4, 5, 6},
                        {1, 1, 0},
                        {9, 1, 6}
                },
                {
                        {4, 3, 1},
                        {6, 7, 1},
                        {0, 1, 1},
                        {8, 2, 1}
                },
                {
                        {9, 9, 1},
                        {4, 3, 1},
                        {4, 3, 2},
                        {0, 1, 2}
                }
        };

        try {
            System.out.print("Enter a num: ");
            String input = scn.nextLine();
            int result = Integer.parseInt(input);

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        arr[i][j][k] += result;
                    }
                }
            }


            //print
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        System.out.print(arr[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }
    }
}
