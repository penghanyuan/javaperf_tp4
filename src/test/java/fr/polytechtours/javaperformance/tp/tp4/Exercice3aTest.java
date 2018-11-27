package fr.polytechtours.javaperformance.tp.tp4;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class Exercice3aTest {

    @Test
    public void testExercice3a() throws ExecutionException, InterruptedException {
        Assert.assertEquals(5000, new Exercice3a().exercice3a(10, 500).intValue());
        Assert.assertEquals(35000, new Exercice3a().exercice3a(7, 5000).intValue());
        Assert.assertEquals(200000, new Exercice3a().exercice3a(2, 100000).intValue());
        Assert.assertEquals(25000000, new Exercice3a().exercice3a(5, 5000000).intValue());
        Assert.assertEquals(300000000, new Exercice3a().exercice3a(100, 3000000).intValue());
        Assert.assertEquals(500000000, new Exercice3a().exercice3a(100, 5000000).intValue());
    }

    @Test
    public void testExercice3a1() throws ExecutionException, InterruptedException {
        Assert.assertEquals(5000, new Exercice3a().exercice3a_1(10, 500).intValue());
        Assert.assertEquals(35000, new Exercice3a().exercice3a_1(7, 5000).intValue());
        Assert.assertEquals(200000, new Exercice3a().exercice3a_1(2, 100000).intValue());
        Assert.assertEquals(25000000, new Exercice3a().exercice3a_1(5, 5000000).intValue());
        Assert.assertEquals(300000000, new Exercice3a().exercice3a_1(100, 3000000).intValue());
        Assert.assertEquals(500000000, new Exercice3a().exercice3a_1(100, 5000000).intValue());
    }

    @Test
    public void testExercice3a2() throws ExecutionException, InterruptedException {
        Assert.assertEquals(5000, new Exercice3a().exercice3a_excute(10, 500).intValue());
        Assert.assertEquals(35000, new Exercice3a().exercice3a_excute(7, 5000).intValue());
        Assert.assertEquals(200000, new Exercice3a().exercice3a_excute(2, 100000).intValue());
        Assert.assertEquals(25000000, new Exercice3a().exercice3a_excute(5, 5000000).intValue());
        Assert.assertEquals(300000000, new Exercice3a().exercice3a_excute(100, 3000000).intValue());
        Assert.assertEquals(500000000, new Exercice3a().exercice3a_excute(100, 5000000).intValue());
    }

    @Test
    public void testExercice3a3() throws ExecutionException, InterruptedException {
        Assert.assertEquals(5000, new Exercice3a().exercice3a_int(10, 500));
        Assert.assertEquals(35000, new Exercice3a().exercice3a_int(7, 5000));
        Assert.assertEquals(200000, new Exercice3a().exercice3a_int(2, 100000));
        Assert.assertEquals(25000000, new Exercice3a().exercice3a_int(5, 5000000));
        Assert.assertEquals(300000000, new Exercice3a().exercice3a_int(100, 3000000));
        Assert.assertEquals(500000000, new Exercice3a().exercice3a_int(100, 5000000));
    }

    @Test
    public void testExercice3a4() throws ExecutionException, InterruptedException {
        Assert.assertEquals(5000, new Exercice3a().exercice3a_nolistfuture(10, 500).intValue());
        Assert.assertEquals(35000, new Exercice3a().exercice3a_nolistfuture(7, 5000).intValue());
        Assert.assertEquals(200000, new Exercice3a().exercice3a_nolistfuture(2, 100000).intValue());
        Assert.assertEquals(25000000, new Exercice3a().exercice3a_nolistfuture(5, 5000000).intValue());
        Assert.assertEquals(300000000, new Exercice3a().exercice3a_nolistfuture(100, 3000000).intValue());
        Assert.assertEquals(500000000, new Exercice3a().exercice3a_nolistfuture(100, 5000000).intValue());
    }
}
