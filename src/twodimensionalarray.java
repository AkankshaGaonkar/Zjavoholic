public class twodimensionalarray {
    public static void main(String args[]) {
        int b[][] = {{2, 3, 4}, {6, 7}, {9, 1, 2}, {2, 4, 5}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//jagged and 2 dimensional array