public class FirstTask {
    //1. Шахматная доска.
    //Создать программу для раскраски шахматной доски с помощью цикла.
    //Создать двумерный массив String 8x8. Задать элементам значения B и W.

    public static void main(String[] args) {
        String[][] arr = new String[8][8];

        String temp1 = "W";
        String temp2 = "B";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        arr[i][j] = "W";
                    } else {
                        arr[i][j] = "B";
                    }
                } else {
                    if (j % 2 != 0) {
                        arr[i][j] = "W";
                    } else {
                        arr[i][j] = "B";
                    }
                }
            }
        }
        System.out.println(printArr(arr));
    }

    public static String printArr(String[][] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                str.append(arr[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
