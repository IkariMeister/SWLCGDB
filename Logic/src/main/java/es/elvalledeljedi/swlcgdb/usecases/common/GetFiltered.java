package es.elvalledeljedi.swlcgdb.usecases.common;

import java.util.List;

import es.elvalledeljedi.swlcgdb.common.repository.Repository;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.executor.InteractorExecutor;
import es.elvalledeljedi.swlcgdb.executor.MainThreadExecutor;
import es.elvalledeljedi.swlcgdb.usecases.BaseUseCase;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public class GetFiltered<T extends BaseEntity> extends BaseUseCase {
    Repository<T> localRepository;
    Repository<T> remoteRepository;
    String id;

    public GetFiltered(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor,
                       Repository<T> localRepository, Repository<T> remoteRepository) {

        super(interactorExecutor, mainThreadExecutor);
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;
    }

    public void execute(String id, BaseUseCase.UseCaseCallback listener) {
        this.id = id;
        this.listener = listener;
        getInteractorExecutor().run(this);
    }

    private void localPersistance(List<T> remoteList) {
        for (T entity : remoteList) {
            localRepository.add(entity);
        }
    }

    @Override public void run() {
        List<T> list = null;
        if (remoteRepository != null) {
            list = remoteRepository.getFiltered(id);
            //localPersistance(listado);
        } else {
            //list = localRepository.getFiltered(id);
        }
        executionOk(list);
    }
}
