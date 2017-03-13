package es.elvalledeljedi.swlcgdb.firebase.db;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.firebase.commons.Consts;

/**
 * Created by jcgarcia on 13/03/2017.
 */

//TODO add callback type
public class CardDataSource extends FirebaseDataSource<Object>  {

    @Inject
    public CardDataSource(FirebaseDatabase pFirebaseDatabase,
                          FirebaseDataSourceReadListener<Object> pCallbackListener) {
        super(pFirebaseDatabase, pCallbackListener);
        mCardReference = mFirebaseDatabase.getReference().child(Consts.CARDS_TABLE);
    }



    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        this.mCallbackListener.onItemRetrieved(dataSnapshot.getValue());
    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}
