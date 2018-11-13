package fr.polytechtours.javaperformance.tp.tp4;

/**
 * Cette exercice met en place un algorithme permettant de calculer le 43eme facteur de la suite de Fibonacci.
 */
public class Exercice2 {

    public static int fibonacci(final Integer i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid input value");
        }

        return (i < 3) ? i : fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int my_fibonacci(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid input value");
        }

        return (i < 3) ? i : fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static final int my_fibonacci_final(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid input value");
        }

        return (i < 3) ? i : fibonacci(i - 1) + fibonacci(i - 2);
    }


    public static int my_fibonacci_for(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid input value");
        }
        int result = 1;
        int[] temp = new int[100];
        temp[0] = 1;
        temp[1] = 1;
        for (int j = 2; j <= i; j++) {
            temp[j] = temp[j - 2] + temp[j - 1];
        }
        return temp[i];
    }
}
