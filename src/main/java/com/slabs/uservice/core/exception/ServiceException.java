package com.slabs.uservice.core.exception;

/**
 * Service异常
 *
 * @author Zoctan
 * @date 2018/06/09
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 4435494380349769278L;

    public ServiceException(final String message) {
        super(message);
    }

    public ServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
