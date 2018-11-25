package fr.polytechtours.javaperformance.tp.tp4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * L'objectif de cet exercice est de condenser un nombre indéfini de taleaux de bytes dans un seul et unique tableau. Les tableaux seront concaténés dans l'ordre d'entrée.
 */
public class Exercice4 {

    public static byte[] exercice4(final byte[]... bytes) {
        List<Byte> list = new LinkedList<>();

        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                list.add(currentByte);
            }
        }

        final byte[] result = new byte[list.size()];

        for(Integer i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static byte[] exercice4_array(final byte[]... bytes) {
        List<Byte> list = new ArrayList<>();

        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                list.add(currentByte);
            }
        }

        final byte[] result = new byte[list.size()];

        for(Integer i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static byte[] exercice4_nolist(final byte[]... bytes) {

        int count = 0;
        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                count++;
            }
        }

        final byte[] result = new byte[count];

        Integer i = 0;
        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                result[i] = currentByte;
                i++;
            }
        }

        return result;
    }

    public static byte[] exercice4_nolist_int(final byte[]... bytes) {

        int count = 0;
        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                count++;
            }
        }

        final byte[] result = new byte[count];

        int i = 0;
        for(final byte[] byteArray : bytes) {
            for(final Byte currentByte : byteArray) {
                result[i] = currentByte;
                i++;
            }
        }

        return result;
    }

    public static byte[] exercice4_nolist_int_byte(final byte[]... bytes) {

        int count = 0;
        for(final byte[] byteArray : bytes) {
            for(int j = 0;j<byteArray.length;j++) {
                count++;
            }
        }

        final byte[] result = new byte[count];

        int i = 0;
        for(final byte[] byteArray : bytes) {
            for(final byte currentByte : byteArray) {
                result[i] = currentByte;
                i++;
            }
        }

        return result;
    }
}
