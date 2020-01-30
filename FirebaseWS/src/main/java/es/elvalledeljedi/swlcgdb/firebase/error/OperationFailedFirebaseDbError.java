package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class OperationFailedFirebaseDbError extends FirebaseDbError {
    public OperationFailedFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
