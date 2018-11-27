package fr.polytechtours.javaperformance.tp.tp4;

import org.junit.Assert;
import org.junit.Test;

import static javax.xml.bind.DatatypeConverter.parseHexBinary;

public class Exercice4Test {

    @Test
    public void testExercice4() {
        Assert.assertArrayEquals(
                parseHexBinary("0123456789abcdef"),
                Exercice4.exercice4(
                        parseHexBinary("0123"),
                        parseHexBinary("4567"),
                        parseHexBinary("89"),
                        parseHexBinary("ab"),
                        parseHexBinary("cdef")
                        ));

        Assert.assertArrayEquals(
                parseHexBinary("00112233445566778899AABBCCDDEEFF"),
                Exercice4.exercice4(
                        parseHexBinary("00"),
                        parseHexBinary("11"),
                        parseHexBinary("22"),
                        parseHexBinary("33"),
                        parseHexBinary("44"),
                        parseHexBinary("55"),
                        parseHexBinary("66"),
                        parseHexBinary("77"),
                        parseHexBinary("88"),
                        parseHexBinary("99"),
                        parseHexBinary("AA"),
                        parseHexBinary("BB"),
                        parseHexBinary("CC"),
                        parseHexBinary("DD"),
                        parseHexBinary("EE"),
                        parseHexBinary("FF")
                ));
    }

    @Test
    public void testExercice4_1() {
        Assert.assertArrayEquals(
                parseHexBinary("0123456789abcdef"),
                Exercice4.exercice4_array(
                        parseHexBinary("0123"),
                        parseHexBinary("4567"),
                        parseHexBinary("89"),
                        parseHexBinary("ab"),
                        parseHexBinary("cdef")
                ));

        Assert.assertArrayEquals(
                parseHexBinary("00112233445566778899AABBCCDDEEFF"),
                Exercice4.exercice4_array(
                        parseHexBinary("00"),
                        parseHexBinary("11"),
                        parseHexBinary("22"),
                        parseHexBinary("33"),
                        parseHexBinary("44"),
                        parseHexBinary("55"),
                        parseHexBinary("66"),
                        parseHexBinary("77"),
                        parseHexBinary("88"),
                        parseHexBinary("99"),
                        parseHexBinary("AA"),
                        parseHexBinary("BB"),
                        parseHexBinary("CC"),
                        parseHexBinary("DD"),
                        parseHexBinary("EE"),
                        parseHexBinary("FF")
                ));
    }

    @Test
    public void testExercice4_2() {
        Assert.assertArrayEquals(
                parseHexBinary("0123456789abcdef"),
                Exercice4.exercice4_nolist(
                        parseHexBinary("0123"),
                        parseHexBinary("4567"),
                        parseHexBinary("89"),
                        parseHexBinary("ab"),
                        parseHexBinary("cdef")
                ));

        Assert.assertArrayEquals(
                parseHexBinary("00112233445566778899AABBCCDDEEFF"),
                Exercice4.exercice4_nolist(
                        parseHexBinary("00"),
                        parseHexBinary("11"),
                        parseHexBinary("22"),
                        parseHexBinary("33"),
                        parseHexBinary("44"),
                        parseHexBinary("55"),
                        parseHexBinary("66"),
                        parseHexBinary("77"),
                        parseHexBinary("88"),
                        parseHexBinary("99"),
                        parseHexBinary("AA"),
                        parseHexBinary("BB"),
                        parseHexBinary("CC"),
                        parseHexBinary("DD"),
                        parseHexBinary("EE"),
                        parseHexBinary("FF")
                ));
    }

    @Test
    public void testExercice4_3() {
        Assert.assertArrayEquals(
                parseHexBinary("0123456789abcdef"),
                Exercice4.exercice4_nolist_int(
                        parseHexBinary("0123"),
                        parseHexBinary("4567"),
                        parseHexBinary("89"),
                        parseHexBinary("ab"),
                        parseHexBinary("cdef")
                ));

        Assert.assertArrayEquals(
                parseHexBinary("00112233445566778899AABBCCDDEEFF"),
                Exercice4.exercice4_nolist_int(
                        parseHexBinary("00"),
                        parseHexBinary("11"),
                        parseHexBinary("22"),
                        parseHexBinary("33"),
                        parseHexBinary("44"),
                        parseHexBinary("55"),
                        parseHexBinary("66"),
                        parseHexBinary("77"),
                        parseHexBinary("88"),
                        parseHexBinary("99"),
                        parseHexBinary("AA"),
                        parseHexBinary("BB"),
                        parseHexBinary("CC"),
                        parseHexBinary("DD"),
                        parseHexBinary("EE"),
                        parseHexBinary("FF")
                ));
    }

    @Test
    public void testExercice4_4() {
        Assert.assertArrayEquals(
                parseHexBinary("0123456789abcdef"),
                Exercice4.exercice4_nolist_int_byte(
                        parseHexBinary("0123"),
                        parseHexBinary("4567"),
                        parseHexBinary("89"),
                        parseHexBinary("ab"),
                        parseHexBinary("cdef")
                ));

        Assert.assertArrayEquals(
                parseHexBinary("00112233445566778899AABBCCDDEEFF"),
                Exercice4.exercice4_nolist_int_byte(
                        parseHexBinary("00"),
                        parseHexBinary("11"),
                        parseHexBinary("22"),
                        parseHexBinary("33"),
                        parseHexBinary("44"),
                        parseHexBinary("55"),
                        parseHexBinary("66"),
                        parseHexBinary("77"),
                        parseHexBinary("88"),
                        parseHexBinary("99"),
                        parseHexBinary("AA"),
                        parseHexBinary("BB"),
                        parseHexBinary("CC"),
                        parseHexBinary("DD"),
                        parseHexBinary("EE"),
                        parseHexBinary("FF")
                ));
    }
}
