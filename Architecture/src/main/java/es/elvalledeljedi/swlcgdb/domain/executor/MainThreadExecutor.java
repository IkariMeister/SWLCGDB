package es.elvalledeljedi.swlcgdb.domain.executor;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public interface MainThreadExecutor {
    void execute(Runnable runnable);
}
