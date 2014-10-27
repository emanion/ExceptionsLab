
package lab2;

/**
 *
 * @author emanion
 */
public class BadNameFormatException extends IllegalArgumentException {
    
    private static String msg = "More than 2 parts to the input name.";

    public BadNameFormatException() {
    }

    public BadNameFormatException(String s) {
        super(msg);
    }

    public BadNameFormatException(String message, Throwable cause) {
        super(msg, cause);
    }

    public BadNameFormatException(Throwable cause) {
        super(cause);
    }
    
    
}
