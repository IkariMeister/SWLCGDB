package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class MaxRetriesFirebaseDbError extends FirebaseDbError {
    public MaxRetriesFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
