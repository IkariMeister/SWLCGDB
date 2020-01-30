package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class OverriddenBySetFirebaseDbError extends FirebaseDbError {
    public OverriddenBySetFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
