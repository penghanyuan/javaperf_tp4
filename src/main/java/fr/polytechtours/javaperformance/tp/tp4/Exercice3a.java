package fr.polytechtours.javaperformance.tp.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Cet exercice permet de générer un nombre de threads nbThreads. Chacun de ces threads va incrémenter un même et unique compteur commun à tous en parallèle un nombre nbIterationByThread de fois.
 * Une fois que chaque thread a terminé, la valeur finale de ce compteur unique est retournée.
 */
public class Exercice3a {

    private static final Object MUTEX = new Object();

    private Integer count = 0;
    private int count_int = 0;

    private synchronized void incrementCounter_int() {
        count_int++;
    }

    private void iterate_int(final int nbIteration) {
        for(int i = 0; i < nbIteration; i++) {
            this.incrementCounter_int();
        }
    }

    private synchronized void incrementCounter() {
        synchronized (MUTEX) {
            count++;
        }
    }

    private synchronized void incrementCounter_1() {
            count++;
    }

    private void iterate(final int nbIteration) {
        for(Integer i = 0; i < nbIteration; i++) {
            this.incrementCounter();
        }
    }
    private void iterate_1(final int nbIteration) {
        for(Integer i = 0; i < nbIteration; i++) {
            this.incrementCounter_1();
        }
    }

    public Integer exercice3a(final Integer nbThreads, final Integer nbIterationByThread) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);
        final List<Future<Runnable>> futures = new ArrayList<>();

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate(nbIterationByThread));
            futures.add(future);
        }

        // Wait for it...
        for (final Future<Runnable> future : futures) {
            future.get();
        }
        service.shutdown();
        return count;
    }

    public Integer exercice3a_1(final Integer nbThreads, final Integer nbIterationByThread) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);
        final List<Future<Runnable>> futures = new ArrayList<>();

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate_1(nbIterationByThread));
            futures.add(future);
        }

        // Wait for it...
        for (final Future<Runnable> future : futures) {
            future.get();
        }
        service.shutdown();
        return count;
    }

    public Integer exercice3a_nolistfuture(final Integer nbThreads, final Integer nbIterationByThread) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);

        for (Integer i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate_1(nbIterationByThread));
            future.get();
        }

        // Wait for it...
//        for (final Future<Runnable> future : futures) {
//            future.get();
//        }
        service.shutdown();
        return count;
    }

    public int exercice3a_int(final int nbThreads, final int nbIterationByThread) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);

        for (int i = 0; i < nbThreads; i++) {
            final Future future = service.submit(() -> iterate_int(nbIterationByThread));
            future.get();
        }
        // Wait for it...

        service.shutdown();
        return count_int;
    }

    public Integer exercice3a_excute(final Integer nbThreads, final Integer nbIterationByThread) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newFixedThreadPool(nbThreads);

        for (Integer i = 0; i < nbThreads; i++) {
            service.execute(()->iterate(nbIterationByThread));
        }

        service.shutdown();
        while(true){
            if(service.isTerminated()){
                return count;
            }
        }
    }
}
