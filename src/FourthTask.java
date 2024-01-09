public class FourthTask {
    //4. Создайте двумерный массив. Выведите на консоль диагонали массива.

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 13},
                {4, 5, 6, 14},
                {7, 8, 9, 15},
                {10, 11, 12, 16}
        };

        String str = new String("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    str += arr[i][j] + " ";
                }
            }
        }

        System.out.println(str);
    }
}
