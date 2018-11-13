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

    @Param({"20","30"})
    int param;
    @Benchmark

    public void testOrigin(Blackhole blackhole) {
        for (int i = 0; i < 100; i++) {
            int result = Exercice2.fibonacci(param);
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testInteger2int(Blackhole blackhole) {
        for (int i = 0; i < 100; i++) {
            int result = Exercice2.my_fibonacci(param);
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void test_for(Blackhole blackhole) {
        for (int i = 0; i < 100; i++) {
            int result = Exercice2.my_fibonacci_for(param);
            blackhole.consume(result);
        }
    }

    @Benchmark
    public void test_final(Blackhole blackhole) {
        for (int i = 0; i < 100; i++) {
            int result = Exercice2.my_fibonacci_final(param);
            blackhole.consume(result);
        }
    }

}
