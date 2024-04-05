import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm {
    public JPanel panel1;
    private JLabel helloLabel;
    private JButton helloButton;
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public HelloForm() {
    helloButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameTextField.getText();
            String password = passwordField.getText();

            if (username.equals("farhan") && password.equals("imwimantap"))
            {
                JOptionPane.showMessageDialog(null, "Username dan password benar, selamat datang user "+
                        usernameTextField.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Username atau password salah.");
            }

        }
    });
}
}
