package fr.polytechtours.javaperformance.tp.tp4;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1)
@Fork(value = 2)
public class BenchMarkEx5 {
    @Param({"bob","mark", "peng"})
    String param;
    @Benchmark
    public void testOrigin(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            String result = "";
            try {
                result = Exercice5.getName(new Exercice5.Guy(param));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testGet_1(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            String result = Exercice5.getName_1(new Exercice5.Guy(param));

            blackhole.consume(result);
        }
    }

    @Benchmark
    public void testGet_2(Blackhole blackhole) {
        for (int i = 0; i < 1000; i++) {
            String result = "";
            try {
                result = Exercice5.getName_2(new Exercice5.Guy(param));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            blackhole.consume(result);
        }
    }
}
