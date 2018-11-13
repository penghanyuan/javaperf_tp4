package fr.polytechtours.javaperformance.tp.tp4;

/**
 * Cette exercice permet de multiplier une matrice de int en entrée avec la matrice MATRIX_A et de retourner le résultat.
 */
public class Exercice1 {

    private static final Float[][] MATRIX_A = {
            {1 / 42f, 1 / 42f, 2 / 42f, 2 / 42f, 2 / 42f, 1 / 42f, 1 / 42f},
            {1 / 42f, 2 / 42f, 3 / 42f, 4 / 42f, 3 / 42f, 2 / 42f, 1 / 42f},
            {2 / 42f, 3 / 42f, 4 / 42f, 5 / 42f, 4 / 42f, 3 / 42f, 2 / 42f},
            {2 / 42f, 4 / 42f, 5 / 42f, 8 / 42f, 5 / 42f, 4 / 42f, 2 / 42f},
            {2 / 42f, 3 / 42f, 4 / 42f, 5 / 42f, 4 / 42f, 3 / 42f, 2 / 42f},
            {1 / 42f, 2 / 42f, 3 / 42f, 4 / 42f, 3 / 42f, 2 / 42f, 1 / 42f},
            {1 / 42f, 1 / 42f, 2 / 42f, 2 / 42f, 2 / 42f, 1 / 42f, 1 / 42f}
    };

    // my code
    private static final float[][] MATRIX_B = {
            {1 / 42f, 1 / 42f, 2 / 42f, 2 / 42f, 2 / 42f, 1 / 42f, 1 / 42f},
            {1 / 42f, 2 / 42f, 3 / 42f, 4 / 42f, 3 / 42f, 2 / 42f, 1 / 42f},
            {2 / 42f, 3 / 42f, 4 / 42f, 5 / 42f, 4 / 42f, 3 / 42f, 2 / 42f},
            {2 / 42f, 4 / 42f, 5 / 42f, 8 / 42f, 5 / 42f, 4 / 42f, 2 / 42f},
            {2 / 42f, 3 / 42f, 4 / 42f, 5 / 42f, 4 / 42f, 3 / 42f, 2 / 42f},
            {1 / 42f, 2 / 42f, 3 / 42f, 4 / 42f, 3 / 42f, 2 / 42f, 1 / 42f},
            {1 / 42f, 1 / 42f, 2 / 42f, 2 / 42f, 2 / 42f, 1 / 42f, 1 / 42f}
    };

    public static float[][] multiply(final int[][] matrix) {
        final float[][] result = new float[7][7];

        for (Integer i = 0; i < 7; i = i + 1) {
            for (Integer j = 0; j < 7; j = j + 1) {
                Float currentValue = 0F;

                for (Integer k = 0; k < 7; k = k + 1) {
                    currentValue = currentValue + matrix[i][k] * MATRIX_A[k][j];
                }

                result[i][j] = currentValue;
            }
        }

        return result;
    }

    public static float[][] my_multiply(final int[][] matrix) {
        final float[][] result = new float[7][7];

        for (Integer i = 0; i < 7; i = i + 1)
            for (Integer j = 0; j < 7; j = j + 1) {
                float currentValue = 0F;

                for (Integer k = 0; k < 7; k = k + 1) {
                    currentValue = currentValue + matrix[i][k] * MATRIX_B[k][j];
                }

                result[i][j] = currentValue;
            }

        return result;
    }

    public static float[][] my_multiply2(final int[][] matrix) {
        final float[][] result = new float[7][7];

        for (int i = 0; i < 7; i = i + 1)
            for (int j = 0; j < 7; j = j + 1) {
                float currentValue = 0F;

                for (int k = 0; k < 7; k = k + 1) {
                    currentValue = currentValue + matrix[i][k] * MATRIX_B[k][j];
                }

                result[i][j] = currentValue;
            }

        return result;
    }

    public static float[][] my_multiply2_out(final int[][] matrix) {
        final float[][] result = new float[7][7];
        float currentValue;
        for (int i = 0; i < 7; i = i + 1)
            for (int j = 0; j < 7; j = j + 1) {
                currentValue = 0F;

                for (int k = 0; k < 7; k = k + 1) {
                    currentValue = currentValue + matrix[i][k] * MATRIX_B[k][j];
                }

                result[i][j] = currentValue;
            }

        return result;
    }

}
