class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int m = mat.length;          // rows
        int n = mat[0].length;       // columns

        int startRow = 0;
        int endRow = m - 1;

        while(startRow <= endRow){
            int midRow = startRow + (endRow - startRow) / 2;

            if(mat[midRow][0]<= tar && tar <= mat[midRow][n -1]){
                // found Row 
                return searchElement( mat , tar  , midRow);

            }else if(tar > mat[midRow][n -1]){
                startRow = midRow + 1;
            }else{
                endRow = midRow - 1;
            }
        }
        return false;
    }
    public Boolean searchElement(int[][] mat, int tar, int row){
        int n = mat[0].length; 
        int start = 0, end = n -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(tar == mat[row][mid]){
                return true;
            }
            else if (tar > mat[row][mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return false;
    }
}


public class SearchIn2Darray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        int[][] arr1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target1 = 13;
        System.out.println("Solution :" + sol.searchMatrix(arr, target));
        System.out.println("Solution :" + sol.searchMatrix(arr1, target1));
    }
}
