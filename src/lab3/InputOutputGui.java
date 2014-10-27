package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        
        
        try {
            String lastName = nameService.extractLastName(fullName);
        
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        
        } catch (lab2.BadNameFormatException bnfe) {
            JOptionPane.showMessageDialog(null, "The name must have two parts");
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Name is required.");
            return;
        }
    }
     
}
