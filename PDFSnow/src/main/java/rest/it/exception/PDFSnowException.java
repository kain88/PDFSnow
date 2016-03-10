package it.exception;

public class PDFSnowException extends RuntimeException {

	    private static final long serialVersionUID = -4618618138968733277L;


	    public PDFSnowException() {
	        super();
	    }

	    public PDFSnowException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public PDFSnowException(String message) {
	        super(message);
	    }

	    public PDFSnowException(Throwable cause) {
	        super(cause);
	    }
}
