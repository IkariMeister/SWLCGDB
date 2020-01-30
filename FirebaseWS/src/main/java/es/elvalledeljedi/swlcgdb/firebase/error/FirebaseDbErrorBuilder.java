package es.elvalledeljedi.swlcgdb.firebase.error;

import com.google.firebase.database.DatabaseError;

/**
 * Created by ikari on 19/3/17.
 */

public class FirebaseDbErrorBuilder {

    private String message;
    private String details;
    private int type;

    public FirebaseDbErrorBuilder withDetails(String details){
        this.details = details;
        return this;
    }
    public FirebaseDbErrorBuilder withMessage(String message){
        this.message = message;
        return this;
    }
    public FirebaseDbErrorBuilder withType(int type){
        this.type = type;
        return this;
    }
    public FirebaseDbError build(){
        switch (type){
            case DatabaseError.DATA_STALE:
                return new DataStaleFirebaseDbError(this.message,this.details);
            case DatabaseError.DISCONNECTED:
                return new DisconnectedFirebaseDbError(this.message,this.details);
            case DatabaseError.EXPIRED_TOKEN:
                return new ExpiredTokenFirebaseDbError(this.message,this.details);
            case DatabaseError.INVALID_TOKEN:
                return new InvalidTokenFirebaseDbError(this.message,this.details);
            case DatabaseError.MAX_RETRIES:
                return new MaxRetriesFirebaseDbError(this.message,this.details);
            case DatabaseError.NETWORK_ERROR:
                return new NetworkErrorFirebaseDbError(this.message,this.details);
            case DatabaseError.OPERATION_FAILED:
                return new OperationFailedFirebaseDbError(this.message,this.details);
            case DatabaseError.OVERRIDDEN_BY_SET:
                return new OverriddenBySetFirebaseDbError(this.message,this.details);
            case DatabaseError.PERMISSION_DENIED:
                return new PermissionDeniedFirebaseDbError(this.message,this.details);
            case DatabaseError.UNAVAILABLE:
                return new UnavailableFirebaseDbError(this.message,this.details);
            case DatabaseError.USER_CODE_EXCEPTION:
                return new UserCodeExceptionFirebaseDbError(this.message,this.details);
            case DatabaseError.WRITE_CANCELED:
                return new WriteCanceledFirebaseDbError(this.message,this.details);
            case DatabaseError.UNKNOWN_ERROR:
            default:
                return new UnknownErrorFirebaseDbError(this.message,this.details);
        }
    }
}
