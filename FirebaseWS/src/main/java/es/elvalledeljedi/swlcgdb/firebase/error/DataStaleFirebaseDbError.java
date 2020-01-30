package es.elvalledeljedi.swlcgdb.firebase.error;

/**
 * Created by ikari on 19/3/17.
 */

public class DataStaleFirebaseDbError extends FirebaseDbError {
    public DataStaleFirebaseDbError(String message,String details) {
        super(message,details);
    }
}
