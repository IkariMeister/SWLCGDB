package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class UnavailableFirebaseDbError extends FirebaseDbError {
    public UnavailableFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
