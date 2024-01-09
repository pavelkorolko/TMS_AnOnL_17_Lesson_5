public class SecondTask {
    //2. Умножение двух матриц.
    //Создайте два массива целых чисел размером 3x3.
    //Написать программу для умножения двух матриц.

    public static void main(String[] args) {
        try {
            int[][] arr1 = new int[][]{
                    {1, 0, 0, 0},
                    {0, 1, 0, 0},
                    {0, 0, 0, 0}
            };
            int[][] arr2 = new int[][]{
                    {1, 2, 3},
                    {1, 1, 1},
                    {0, 0, 0},
                    {2, 1, 0}
            };

            int[][] result = multiplyMatrices(arr1, arr2);
            System.out.println(displayArr(result));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) throws Exception {
        int colNum = 0;
        int rowNum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                colNum++;
            }
            break;
        }

        for (int i = 0; i < b.length; i++) {
            rowNum++;
        }

        if (colNum == rowNum) {
            int[][] result = new int[rowNum][colNum];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        result[i][j] += a[i][k] * b[i][j];
                    }
                }
            }

            return result;
        } else {
            throw new Exception("Matrices can not be multiplied!");
        }
    }

    public static String displayArr(int[][] arr) {
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
