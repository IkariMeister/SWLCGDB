package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

public class ExpiredTokenFirebaseDbError extends FirebaseDbError {
    public ExpiredTokenFirebaseDbError(String message, String details) {
        super(message, details);
    }
}
