package percorrendo_arrays_multidimensionais;

public class PercorrendoArraysMultidimensionais {

    public static void main(String[] args) {

        // Array Multidimensional
        int[][] sudoku = {
                {3, 6, 7},
                {4, 9, 8},
                {5, 2, 1}
        };

        // Percorrendo Array Multidimensional
        // For
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        // For Each
        for (int[] linhaSudoku : sudoku) {
            for (int numero : linhaSudoku) {
                System.out.print(numero + " ");

            }
            System.out.println();
        }

    }

}
