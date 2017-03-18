package es.elvalledeljedi.swlcgdb.domain.model.error;

/**
 * Created by ikari on 18/3/17.
 */

public class BaseError {
    private final String message;

    public BaseError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseError baseError = (BaseError) o;

        return message != null ? message.equals(baseError.message) : baseError.message == null;

    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }
}
