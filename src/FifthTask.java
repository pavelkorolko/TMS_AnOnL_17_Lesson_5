public class FifthTask {
    //5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возврастанию.
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {4, 3, 2, 1},
                {8, 7, 6, 5},
                {12, 11, 10, 9},
                {16, 15, 14, 13}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[j].length - j - 1; k++) {
                    if (arr[j][k] > arr[j][k + 1]) {
                        int temp = arr[j][k];
                        arr[j][k] = arr[j][k + 1];
                        arr[j][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println(SecondTask.displayArr(arr));
    }
}
