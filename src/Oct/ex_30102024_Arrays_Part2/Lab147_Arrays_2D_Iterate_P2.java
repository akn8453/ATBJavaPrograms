package Oct.ex_30102024_Arrays_Part2;

public class Lab147_Arrays_2D_Iterate_P2 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
