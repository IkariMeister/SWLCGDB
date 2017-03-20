package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class WriteCanceledFirebaseDbError extends FirebaseDbError {
    public WriteCanceledFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
