
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Registration
        String username = JOptionPane.showInputDialog("Enter username (max 5 chars, include '_'):");
        String password = JOptionPane.showInputDialog("Enter password (min 8 chars, include upper case, number, special char):");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");

        Login user = new Login(username, password, firstName, lastName);
        String registrationMessage = user.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);

        // Login
        String loginUsername = JOptionPane.showInputDialog("Enter username to login:");
        String loginPassword = JOptionPane.showInputDialog("Enter password to login:");

        boolean loginSuccess = user.loginUser(loginUsername, loginPassword);
        String loginStatusMessage = user.returnLoginStatus(loginSuccess);
        JOptionPane.showMessageDialog(null, loginStatusMessage);
    }
}