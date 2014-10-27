/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

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
