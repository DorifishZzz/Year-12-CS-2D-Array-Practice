public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int [][] arrStress){
        int sum = 0;
        for(int row = 0; row < arrStress.length; row++){
            for(int col = 0; col < arrStress[0].length; col++){
                sum += arrStress[row][col];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN (int [][] array, int row){
        int sum = 0;
        for(int col = 0; col < array[row].length; col++){
            sum += array[row][col];
        }
        return sum;
    }


    // 3. sumColN
    public static int sumColN(int [][] array, int col){
        int sum = 0;
        for(int row = 0; row < array.length; row++){
            sum += array[row][col];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] arr1, int row1, int col1, int row2, int col2) {
        int sum = 0;
        int startRow = row1 + 1;
        int endRow = row2 - 1;

        if (row1 == row2) {
            for (int col = col1; col <= col2; col++) {
                sum += arr1[row1][col];
            }
            return sum;
        }

        else {
            // for the rows in between colum 0 = end
            for (int row = startRow; row <= endRow; row++) {
                for (int col = 0; col < arr1[0].length; col++) {
                    sum += arr1[row][col];
                }
            }

            //first row from 0 - col1
            for (int col = col1; col < arr1[0].length; col++) {
                sum += arr1[row1][col];
            }

            //last row from 0 - col2
            for (int col = 0; col <= col2; col++) {
                sum += arr1[row2][col];
            }

            return sum;
        }
    }

}
