package top.blog.exception;

/**
 * @Description: 404异常
 */

public class NotFoundException extends RuntimeException {
	public NotFoundException() {
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
