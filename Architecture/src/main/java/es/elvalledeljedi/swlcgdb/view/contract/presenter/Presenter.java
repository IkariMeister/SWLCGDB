package es.elvalledeljedi.swlcgdb.view.contract.presenter;

import es.elvalledeljedi.swlcgdb.view.contract.view.BaseView;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public interface Presenter<T extends BaseView> {
    void initialize();
    void start();
    void stop();
    void destroy();
}
