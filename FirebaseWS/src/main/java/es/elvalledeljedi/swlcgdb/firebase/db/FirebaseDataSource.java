package es.elvalledeljedi.swlcgdb.firebase.db;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public abstract class FirebaseDataSource<T> implements ChildEventListener {

    protected final FirebaseDatabase mFirebaseDatabase;
    protected DatabaseReference mCardReference;

    protected final FirebaseDataSource.FirebaseDataSourceReadListener<T> mCallbackListener;

    @Inject
    public FirebaseDataSource(FirebaseDatabase pFirebaseDatabase,
                              FirebaseDataSourceReadListener<T> pCallbackListener) {
        this.mFirebaseDatabase = pFirebaseDatabase;
        mCallbackListener = pCallbackListener;
    }

    public void init(){
        mCardReference.addChildEventListener(this);
    }
    public void stop(){
        mCardReference.removeEventListener(this);
    }

    public interface FirebaseDataSourceReadListener<T>{
        void onItemRetrieved(T value);
        void onReadError(Error error);
    }

    public interface FirebaseDataSourceWriteListener<T>{

        void onItemDeleted(T value);
        void onWriteError(Error error);
        void onItemUpdated(T value);
    }

    public interface FirebaseDataSourceRWListener<T> extends
            FirebaseDataSourceReadListener<T>,FirebaseDataSourceWriteListener<T>{
    }
}
