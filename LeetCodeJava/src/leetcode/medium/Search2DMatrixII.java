package leetcode.medium;

class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {

        System.out.println("Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:\n" +
                "\n" +
                "Integers in each row are sorted in ascending from left to right.\n" +
                "Integers in each column are sorted in ascending from top to bottom.");
        //Traverse number of rows
        for(int i=0; i<matrix.length; i++) {
            //Traverse number of columns
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}