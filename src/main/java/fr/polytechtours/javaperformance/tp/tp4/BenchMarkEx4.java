package fr.polytechtours.javaperformance.tp.tp4;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import static javax.xml.bind.DatatypeConverter.parseHexBinary;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 2, time = 1)
@Fork(value = 2)
public class BenchMarkEx4 {

//    @Param({"0123","4567"})
//    String param1;
//    @Param({"4567","3234"})
//    String param2;
    @Benchmark
    public void testOrigin(Blackhole blackhole) {
        byte[] result = null;
        for (int i = 0; i < 1000; i++) {
            result = Exercice4.exercice4(
                    parseHexBinary("0123"),
                    parseHexBinary("4567"),
                    parseHexBinary("89"),
                    parseHexBinary("ab"),
                    parseHexBinary("cdef")
            );
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testOrigin_1(Blackhole blackhole) {
        byte[] result = null;
        for (int i = 0; i < 1000; i++) {
            result = Exercice4.exercice4_array(
                    parseHexBinary("0123"),
                    parseHexBinary("4567"),
                    parseHexBinary("89"),
                    parseHexBinary("ab"),
                    parseHexBinary("cdef")
            );
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testOrigin_2(Blackhole blackhole) {
        byte[] result = null;
        for (int i = 0; i < 1000; i++) {
            result = Exercice4.exercice4_nolist(
                    parseHexBinary("0123"),
                    parseHexBinary("4567"),
                    parseHexBinary("89"),
                    parseHexBinary("ab"),
                    parseHexBinary("cdef")
            );
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testOrigin_3(Blackhole blackhole) {
        byte[] result = null;
        for (int i = 0; i < 1000; i++) {
            result = Exercice4.exercice4_nolist_int(
                    parseHexBinary("0123"),
                    parseHexBinary("4567"),
                    parseHexBinary("89"),
                    parseHexBinary("ab"),
                    parseHexBinary("cdef")
            );
            blackhole.consume(result);
        }

    }

    @Benchmark
    public void testOrigin_4(Blackhole blackhole) {
        byte[] result = null;
        for (int i = 0; i < 100; i++) {
            result = Exercice4.exercice4_nolist_int_byte(
                    parseHexBinary("0123"),
                    parseHexBinary("4567"),
                    parseHexBinary("89"),
                    parseHexBinary("ab"),
                    parseHexBinary("cdef")
            );
            blackhole.consume(result);
        }

    }
}
