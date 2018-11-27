package fr.polytechtours.javaperformance.tp.tp4;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 2, time = 1)
@Fork(value = 2)
public class BenchMarkEx3b {



    @Benchmark
    public void testOrigin(Blackhole blackhole) {
        Integer result = Integer.valueOf(0);
        Exercice3b ex3b1 = new Exercice3b();
        for(int i = 0;i<1;i++){
            try {
                result = ex3b1.exercice3b(100, 500000, 500);
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void test4b_synchro_methode(Blackhole blackhole) {
        Integer result = Integer.valueOf(0);
        Exercice3b ex3b1 = new Exercice3b();
        for (int i = 0; i < 1; i++) {
            try {
                result = ex3b1.exercice3b_synchro_methode(100, 500000, 500);
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void test4b_synchro_variable(Blackhole blackhole) {
        Integer result = Integer.valueOf(0);
        Exercice3b ex3b1 = new Exercice3b();
        for (int i = 0; i < 1; i++) {
            try {
                result = ex3b1.exercice3b_synchro_varible(100, 500000, 500);
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            blackhole.consume(result);
        }
    }


//
//
//    @Benchmark
//    public void test_int(Blackhole blackhole) {
//        int result = 0;
//        Exercice3a ex3a1 = new Exercice3a();
//        for(int i = 0;i<1;i++){
//            try {
//                result = ex3a1.exercice3a_int(100, 500000);
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            blackhole.consume(result);
//        }
//
//    }
//
//    @Benchmark
//    public void test_execute(Blackhole blackhole) {
//        Integer result = Integer.valueOf(0);
//        Exercice3a ex3a1 = new Exercice3a();
//        for(int i = 0;i<1;i++){
//            try {
//                result = ex3a1.exercice3a_excute(100, 500000);
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            blackhole.consume(result);
//        }
//
//    }

}
