import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Menu extends JFrame {
    private JPanel menuPanel;
    private JLabel inicioLabel;
    private JLabel userLabel;
    private JTextField nameField;
    private JLabel passwordLabel;
    private JTextField PasswordField;
    private JButton checkInformationButton;

    public Menu(){

        //LOG IN INFO
        String correctUser = "Sebas";
        String correctPassword = "1234";
        //Set panel
        setTitle("Log In");
        setSize(500,500);
        setContentPane(menuPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window
        setLocationRelativeTo(null);
        setVisible(true);
        checkInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Objects.equals(correctUser, nameField.getText())) && ((Objects.equals(correctPassword, PasswordField.getText())))){
                    JOptionPane.showMessageDialog(null, "Welcome to the system!");}
                else{JOptionPane.showMessageDialog(null, "Wrong information, try again!");}
            }

        });

    }
}
