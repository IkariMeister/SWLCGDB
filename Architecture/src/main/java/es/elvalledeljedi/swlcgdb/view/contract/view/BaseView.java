package es.elvalledeljedi.swlcgdb.view.contract.view;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public interface BaseView {
    void closeView();
    void enableMenu(boolean enable);
//    String getString(int idResource);
//    String[] getStringArray(int idResource);
    void showProgressDialog();
    void hideProgressDialog();
}
