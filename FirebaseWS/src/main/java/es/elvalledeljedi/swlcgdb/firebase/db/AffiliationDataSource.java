package es.elvalledeljedi.swlcgdb.firebase.db;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.firebase.commons.Consts;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public class AffiliationDataSource extends FirebaseDataSource {


    @Inject
    public AffiliationDataSource(FirebaseDatabase pFirebaseDatabase,
                                 FirebaseDataSourceReadListener pCallbackListener) {
        super(pFirebaseDatabase, pCallbackListener);
        mCardReference = mFirebaseDatabase.getReference().child(Consts.AFFILIATION_TABLE);
    }

    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        mCallbackListener.onItemRetrieved(dataSnapshot.getValue());
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
