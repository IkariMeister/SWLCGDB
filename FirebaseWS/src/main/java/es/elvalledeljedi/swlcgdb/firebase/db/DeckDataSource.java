package es.elvalledeljedi.swlcgdb.firebase.db;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.firebase.commons.Consts;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public class DeckDataSource extends FirebaseDataSource {

    private final FirebaseDataSourceRWListener mRWCallbackListener;

    @Inject
    public DeckDataSource(FirebaseDatabase pFirebaseDatabase,
                          FirebaseDataSourceRWListener pCallbackListener) {
        super(pFirebaseDatabase, pCallbackListener);
        this.mRWCallbackListener = pCallbackListener;
        mCardReference = mFirebaseDatabase.getReference().child(Consts.DECKS_TABLE);
    }

    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        mRWCallbackListener.onItemRetrieved(dataSnapshot.getValue());
    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {
        mRWCallbackListener.onItemUpdated(dataSnapshot.getValue());
    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {
        mRWCallbackListener.onItemDeleted(dataSnapshot.getValue());
    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

        //TODO trate error
        mRWCallbackListener.onReadError(new Error());
    }
}
