package fr.polytechtours.javaperformance.tp.tp4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * L4objectif de cet exercice est de retourner la valeur du nom de l'objet Guy passé en paramètre.
 */
public class Exercice5 {

    public static final class Guy {
        private final String name;

        public Guy(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static String getName(final Guy guy) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) guy.getClass().getMethod("getName").invoke(guy);
    }

    public static String getName_1(final Guy guy) {
        return guy.getName();
    }

    public static String getName_2(final Guy guy) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = guy.getClass().getMethod("getName");
        m.setAccessible(true);
        return (String)m.invoke(guy);
    }
}
