package es.elvalledeljedi.swlcgdb.firebase.error;

import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 19/3/17.
 */

public class FirebaseDbError extends BaseError {
    private final String details;
    public FirebaseDbError(String message,String details) {
        super(message);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
