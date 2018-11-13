package fr.polytechtours.javaperformance.tp.tp4;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1)
@Fork(value = 2)
public class BenchMark {

    final int[][] matrix = {
            {1, 1, 2, 2, 2, 1, 1},
            {1, 2, 3, 4, 3, 2, 1},
            {2, 3, 4, 5, 4, 3, 2},
            {2, 4, 5, 8, 5, 4, 2},
            {2, 3, 4, 5, 4, 3, 2},
            {1, 2, 3, 4, 3, 2, 1},
            {1, 1, 2, 2, 2, 1, 1}
    };

    @Benchmark

    public void testOrigin(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            float[][] result = Exercice1.multiply(matrix);
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testFloat2float(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            float[][] result = Exercice1.my_multiply(matrix);
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void testFloat2float_Integer2int(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            float[][] result = Exercice1.my_multiply2(matrix);
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void testFloat2float_out(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            float[][] result = Exercice1.my_multiply2_out(matrix);
            blackhole.consume(result);
        }
    }
}
