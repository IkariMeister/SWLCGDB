package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

class UserCodeExceptionFirebaseDbError extends FirebaseDbError {
    public UserCodeExceptionFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
