package fr.polytechtours.javaperformance.tp.tp4;

import org.junit.Assert;
import org.junit.Test;

public class Exercice2Test {

    @Test
    public void testFibonacci() {
        Assert.assertEquals(701408733, Exercice2.fibonacci(43));
    }

    @Test
    public void testFibonacci1() {
        Assert.assertEquals(701408733, Exercice2.my_fibonacci_for(43));
    }

    @Test
    public void testFibonacci2() {
        Assert.assertEquals(701408733, Exercice2.my_fibonacci(43));
    }

    @Test
    public void testFibonacci3() {
        Assert.assertEquals(701408733, Exercice2.my_fibonacci_final(43));
    }
}
