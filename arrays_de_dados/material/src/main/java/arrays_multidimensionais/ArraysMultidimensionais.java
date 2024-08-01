package arrays_multidimensionais;

public class ArraysMultidimensionais {

    public static void main(String[] args) {

        // Matrizes / Arrays Multidimensionais
        // Formato tabular -> Linhas e colunas
        int[][] sudoku = {
                {3, 6, 7},
                {4, 9, 8},
                {5, 2, 1}
        };

        // Saída: 3
        System.out.println(sudoku[0][0]);

        // Saída: 2
        System.out.println(sudoku[2][1]);

        // Atualizar valor
        // Saída: 1
        System.out.println(sudoku[2][2]);
        sudoku[2][2] = 0;
        // Saída: 0
        System.out.println(sudoku[2][2]);

    }

}
