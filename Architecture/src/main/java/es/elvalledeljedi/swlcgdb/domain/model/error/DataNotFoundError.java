package es.elvalledeljedi.swlcgdb.domain.model.error;

/**
 * Created by ikari on 18/3/17.
 */

public class DataNotFoundError<T> extends BaseError {

    private final T queryParam;

    public DataNotFoundError(String message, T queryParam) {
        super(message);
        this.queryParam = queryParam;
    }

    public DataNotFoundError(String message) {
        super(message);
        queryParam = null;
    }

    public T getQueryParam() {
        return queryParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DataNotFoundError<?> that = (DataNotFoundError<?>) o;

        return queryParam != null ? queryParam.equals(that.queryParam) : that.queryParam == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (queryParam != null ? queryParam.hashCode() : 0);
        return result;
    }
}
