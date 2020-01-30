package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

public class DisconnectedFirebaseDbError extends FirebaseDbError {
    public DisconnectedFirebaseDbError(String message, String details) {
        super(message,details);
    }
}
