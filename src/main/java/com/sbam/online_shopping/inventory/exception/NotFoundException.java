package com.sbam.online_shopping.inventory.exception;

public class NotFoundException  extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * default constructor.
     */
    public NotFoundException() {
        super();
    }

    /**
     * RefundServiceAPIException
     *
     * @param message
     * @param throwable
     */
    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);

    }

    /**
     * RefundServiceAPIException
     *
     * @param message
     */
    public NotFoundException(String message) {
        super(message);

    }

    /**
     * RefundServiceAPIException
     *
     * @param throwable
     */
    public NotFoundException(Throwable throwable) {
        super(throwable);

    }
}