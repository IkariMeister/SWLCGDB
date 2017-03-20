package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class PermissionDeniedFirebaseDbError extends FirebaseDbError {
    public PermissionDeniedFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
