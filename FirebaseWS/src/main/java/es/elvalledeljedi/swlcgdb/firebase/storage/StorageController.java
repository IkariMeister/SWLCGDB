package es.elvalledeljedi.swlcgdb.firebase.storage;

import com.google.firebase.storage.FirebaseStorage;

import javax.inject.Inject;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public class StorageController {

    private final FirebaseStorage mFirebaseStorage;

    @Inject
    public StorageController(FirebaseStorage pFirebaseStorage) {
        this.mFirebaseStorage = pFirebaseStorage;
    }
}
