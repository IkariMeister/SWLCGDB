package es.elvalledeljedi.swlcgdb.domain.interactor;

import es.elvalledeljedi.swlcgdb.domain.executor.Interactor;
import es.elvalledeljedi.swlcgdb.domain.executor.InteractorExecutor;
import es.elvalledeljedi.swlcgdb.domain.executor.MainThreadExecutor;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public abstract class AbstractInteractor implements Interactor {

    private InteractorExecutor interactorExecutor;
    private MainThreadExecutor mainThreadExecutor;

    public AbstractInteractor(InteractorExecutor interactorExecutor,
                              MainThreadExecutor mainThreadExecutor) {
        this.interactorExecutor = interactorExecutor;
        this.mainThreadExecutor = mainThreadExecutor;
    }

    public InteractorExecutor getInteractorExecutor() {
        return interactorExecutor;
    }

    public void setInteractorExecutor(InteractorExecutor interactorExecutor) {
        this.interactorExecutor = interactorExecutor;
    }

    public MainThreadExecutor getMainThreadExecutor() {
        return mainThreadExecutor;
    }

    public void setMainThreadExecutor(MainThreadExecutor mainThreadExecutor) {
        this.mainThreadExecutor = mainThreadExecutor;
    }
}
