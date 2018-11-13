package fr.polytechtours.javaperformance.tp.tp4;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 2, time = 1)
@Fork(value = 2)
public class BenchMarkEx2 {

    @Benchmark

    public void testOrigin(Blackhole blackhole) {
        for (int i = 0; i < 10; i++) {
            int result = Exercice2.fibonacci(43);
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testInteger2int(Blackhole blackhole) {
        for (int i = 0; i < 10; i++) {
            int result = Exercice2.my_fibonacci(43);
            blackhole.consume(result);
        }
    }

//    @Benchmark
//    public void testFloat2float_Integer2int(Blackhole blackhole) {
//        for (int i = 0; i < 1000; i++) {
//            float[][] result = Exercice1.my_multiply2(matrix);
//            blackhole.consume(result);
//        }
//    }
}
