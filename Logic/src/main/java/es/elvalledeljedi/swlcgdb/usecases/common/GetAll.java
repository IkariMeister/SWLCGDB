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
public class GetAll<T extends BaseEntity> extends BaseUseCase {
    Repository<T> localRepository;
    Repository<T> remoteRepository;

    public GetAll(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor,
                  Repository<T> localRepository, Repository<T> remoteRepository) {

        super(interactorExecutor, mainThreadExecutor);
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;

    }

    private void localPersistance(List<T> remoteList) {
//        if (localRepository != null && localRepository.getDataSource() != null) {
//            for (T entity : remoteList) {
//                localRepository.add(entity);
//            }
//        }
    }

    public void execute(BaseUseCase.UseCaseCallback listener) {
        this.listener = listener;
        getInteractorExecutor().run(this);
    }

    @Override public void run() {
        List<T> listado;
        if (remoteRepository != null) {
            listado = remoteRepository.getAll();
            localPersistance(listado);
        } else {
            listado = localRepository.getAll();
        }
        if (listado == null) {
            executionError(null);
        } else {
            executionOk(listado);
        }
    }
}
