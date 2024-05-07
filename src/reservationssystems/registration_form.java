package reservationssystems;

import javax.swing.JFrame;

/**
 * Represents a registration form.
 */
public class registration_form {
    
    public static void main(String[] args) {
        // Create an instance of RegistrationFrame
        RegistrationFrame registrationFrame = new RegistrationFrame();
        
        // Set the default close operation
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the frame visible
        registrationFrame.setVisible(true);
    }
}