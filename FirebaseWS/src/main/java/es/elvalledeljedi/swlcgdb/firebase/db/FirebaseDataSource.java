package es.elvalledeljedi.swlcgdb.firebase.db;


import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import es.elvalledeljedi.swlcgdb.domain.datasource.ReadWriteAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.ReadableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.WritableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public abstract class FirebaseDataSource<T extends BaseEntity,Q,K> implements ReadWriteAsyncDataSource<T,Q,K>,ChildEventListener {
    protected final ReadWriteAsyncDataSource.Callback<T> mCallback;
    protected final FirebaseDatabase mFirebaseDatabase;
    protected DatabaseReference mDbReference;


    public FirebaseDataSource(FirebaseDatabase pFirebaseDatabase, Callback<T> pCallback) {
        this.mCallback = pCallback;
        this.mFirebaseDatabase = pFirebaseDatabase;
    }

    public void init(){
        mDbReference.addChildEventListener(this);
    }
    public void stop(){
        mDbReference.removeEventListener(this);
    }
}
