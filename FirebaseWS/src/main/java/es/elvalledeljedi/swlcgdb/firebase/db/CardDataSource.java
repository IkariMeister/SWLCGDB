package es.elvalledeljedi.swlcgdb.firebase.db;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.domain.datasource.ReadWriteAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.ReadableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.WritableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.cards.Card;
import es.elvalledeljedi.swlcgdb.firebase.commons.Consts;
import es.elvalledeljedi.swlcgdb.firebase.error.FirebaseDbError;
import es.elvalledeljedi.swlcgdb.firebase.error.FirebaseDbErrorBuilder;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public class CardDataSource extends FirebaseDataSource<Card,String,String>  {

    @Inject
    public CardDataSource(FirebaseDatabase pFirebaseDatabase,
                          ReadWriteAsyncDataSource.Callback<Card> pCallbackListener) {
        super(pFirebaseDatabase, pCallbackListener);
        mDbReference = mFirebaseDatabase.getReference().child(Consts.CARDS_TABLE);
    }



    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        this.mCallback.onReadSuccess(dataSnapshot.getValue(Card.class));
    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {
        this.mCallback.onWriteSuccess(dataSnapshot.getValue(Card.class));
    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {
        this.mCallback.onWriteSuccess(dataSnapshot.getValue(Card.class));
    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {
        this.mCallback.onWriteSuccess(dataSnapshot.getValue(Card.class));
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        this.mCallback.onReadError(
                new FirebaseDbErrorBuilder()
                .withType(databaseError.getCode())
                .withMessage(databaseError.getMessage())
                .withDetails(databaseError.getDetails())
                .build()) ;
    }

    @Override
    public void add(Card item, WritableAsyncDataSource.Callback callback) {

    }

    @Override
    public void delete(Card item, WritableAsyncDataSource.Callback callback) {

    }

    @Override
    public void update(Card item, WritableAsyncDataSource.Callback callback) {

    }

    @Override
    public void getAll(ReadableAsyncDataSource.Callback callback) {

    }

    @Override
    public void getQuery(String query, ReadableAsyncDataSource.Callback callback) {

    }

    @Override
    public void getByKey(String id, ReadableAsyncDataSource.Callback callback) {

    }

    @Override
    public boolean isAllValid() {
        return true;
    }

    @Override
    public boolean isValid(Card item) {
        return true;
    }
}
