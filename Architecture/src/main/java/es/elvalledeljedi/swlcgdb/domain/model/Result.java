package es.elvalledeljedi.swlcgdb.domain.model;

/**
 * Created by ikari on 18/3/17.
 */

public class Result <S,E> {
    private final S success;
    private final E error;

    public Result(S success, E error) {
        this.success = success;
        this.error = error;
    }

    public S getSuccess() {
        return success;
    }

    public E getError() {
        return error;
    }

    public static <S,E> Result<S,E> withSuccess(S value){
        return new Result<>(value,null);
    }


    public static <S,E> Result<S,E> withError(E value){
        return new Result<>(null,value);
    }
}