package fr.polytechtours.javaperformance.tp.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Cet exercice est exactement le même que précédemment, sauf qu'une opération modulo est appliqué au compteur lors de chaque incrémentation.
 */
public class Exercice3b {

    private static final Object MUTEX = new Object();

    private Integer count = 0;
    private int count_int = 0;

    private synchronized void incrementCounter(final Integer modulo) {
        synchronized (MUTEX) {
             count = (count + 1) % modulo;
        }
    }

    private synchronized void incrementCounter_synchro_methode(final Integer modulo) {
            count = (count + 1) % modulo;
    }

    private void incrementCounter_synchro_variable(final Integer modulo) {
        synchronized (MUTEX) {
            count = (count + 1) % modulo;
        }
    }

    private void iterate(final Integer nbIteration, final Integer modulo) {
        for(Integer i = 0; i < nbIteration; i++) {
            this.incrementCounter(modulo);
        }
    }

    private void iterate_synchro_methode(final Integer nbIteration, final Integer modulo) {
        for(Integer i = 0; i < nbIteration; i++) {
            this.incrementCounter_synchro_methode(modulo);
        }
    }

    private void iterate_synchro_variable(final Integer nbIteration, final Integer modulo) {
        for(Integer i = 0; i < nbIteration; i++) {
            this.incrementCounter_synchro_variable(modulo);
        }
    }



    public Integer exercice3b(final Integer nbThreads, final Integer nbIterationByThread, final Integer modulo) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);
        final List<Future<Runnable>> futures = new ArrayList<>();

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate(nbIterationByThread, modulo));
            futures.add(future);
        }

        // Wait for it...
        for (final Future<Runnable> future : futures) {
            future.get();
        }
//        service.shutdown();
//        while(true){
//            if (service.isTerminated()){
//                return count;
//            }
//        }
        service.shutdown();
        return count;
    }


    public Integer exercice3b_synchro_methode(final Integer nbThreads, final Integer nbIterationByThread, final Integer modulo) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);
        final List<Future<Runnable>> futures = new ArrayList<>();

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate_synchro_methode(nbIterationByThread, modulo));
            futures.add(future);
        }

        for (final Future<Runnable> future : futures) {
            future.get();
        }
        service.shutdown();

        return count;
    }

    public Integer exercice3b_synchro_varible(final Integer nbThreads, final Integer nbIterationByThread, final Integer modulo) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);
        final List<Future<Runnable>> futures = new ArrayList<>();

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate_synchro_variable(nbIterationByThread, modulo));
            futures.add(future);
        }

        // Wait for it...
        for (final Future<Runnable> future : futures) {
            future.get();
        }
//        service.shutdown();
//        while(true){
//            if (service.isTerminated()){
//                return count;
//            }
//        }
        service.shutdown();

        return count;
    }
}
