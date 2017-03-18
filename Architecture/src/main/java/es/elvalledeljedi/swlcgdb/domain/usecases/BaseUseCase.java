package es.elvalledeljedi.swlcgdb.domain.usecases;

import es.elvalledeljedi.swlcgdb.domain.interactor.AbstractInteractor;
import es.elvalledeljedi.swlcgdb.domain.executor.InteractorExecutor;
import es.elvalledeljedi.swlcgdb.domain.executor.MainThreadExecutor;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public abstract class BaseUseCase extends AbstractInteractor {
    protected UseCaseCallback listener;

    public BaseUseCase(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        super(interactorExecutor, mainThreadExecutor);
    }

    protected void executionOk(final Object o) {
        if (listener != null) {
            getMainThreadExecutor().execute(new Runnable() {
                @Override public void run() {
                    listener.onUseCaseResponse(o);
                }
            });
        }
    }

    protected void executionError(final Object o) {
        if (listener != null) {
            getMainThreadExecutor().execute(new Runnable() {
                @Override public void run() {
                    listener.onUseCaseError(o);
                }
            });
        }
    }

    public interface UseCaseCallback {
        void onUseCaseResponse(Object result);

        void onUseCaseError(Object result);
    }
}
