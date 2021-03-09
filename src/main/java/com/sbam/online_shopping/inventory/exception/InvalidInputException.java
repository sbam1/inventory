package com.sbam.online_shopping.inventory.exception;

public class InvalidInputException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * default constructor.
     */
    public InvalidInputException() {
        super();
    }

    /**
     * RefundServiceAPIException
     *
     * @param message
     * @param throwable
     */
    public InvalidInputException(String message, Throwable throwable) {
        super(message, throwable);

    }

    /**
     * RefundServiceAPIException
     *
     * @param message
     */
    public InvalidInputException(String message) {
        super(message);

    }

    /**
     * RefundServiceAPIException
     *
     * @param throwable
     */
    public InvalidInputException(Throwable throwable) {
        super(throwable);

    }
}