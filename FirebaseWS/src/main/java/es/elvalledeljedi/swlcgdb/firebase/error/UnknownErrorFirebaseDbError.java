package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class UnknownErrorFirebaseDbError extends FirebaseDbError {
    public UnknownErrorFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
