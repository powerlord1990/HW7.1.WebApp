package ru.itpark.exception;

public class DatasException extends RuntimeException {

    public DatasException() {
    }

    public DatasException(String message) {
        super(message);
    }

    public DatasException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatasException(Throwable cause) {
        super(cause);
    }

    public DatasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}