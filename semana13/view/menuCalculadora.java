package view;

import model.Addition;
import observer.calculatorObserver;

import javax.swing.*;
import java.awt.*;

public class menuCalculadora extends JFrame implements calculatorObserver {
    private JTextField textField;
    JPanel menuPanel;
    public menuCalculadora(){
        showMenu();
    }

    private void showMenu(){
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //finish the program when the window is closed
        setLocationRelativeTo(null); //set the window in the center of the screen
        setBackground(Color.DARK_GRAY); //set color of the panel
        setTitle("Calculadora Avanzada"); //put a title to the window

        //set panel
        menuPanel = new JPanel(new GridBagLayout()); //Create a panel
        menuPanel.setLayout(null);
        menuPanel.setBackground(Color.DARK_GRAY); //set color of the panel
        menuPanel.setBounds(0, 0, 700, 700);
        getContentPane().add(menuPanel); //put the panel on the window

        // Title
        JLabel title = new JLabel("Calculadora Avanzada");
        title.setBounds(250, 10, 400, 100);
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        title.setForeground(Color.ORANGE);  // Set text color for the title
        menuPanel.add(title);

        //
        // Sumar button
        JButton addButton = new JButton("Sumar");
        addButton.setLayout(null);
        addButton.setBounds(100, 200, 100, 50);
        //minusButton.addActionListener(backMenu);
        menuPanel.add(addButton);

        // Sumar button
        JButton minusButton = new JButton("Restar");
        minusButton.setLayout(null);
        minusButton.setBounds(250, 200, 100, 50);
        //minusButton.addActionListener(backMenu);
        menuPanel.add(minusButton);

        // Sumar button
        JButton mulButton = new JButton("Multiplicar");
        mulButton.setLayout(null);
        mulButton.setBounds(100, 300, 100, 50);
        //minusButton.addActionListener(backMenu);
        menuPanel.add(mulButton);

        // Sumar button
        JButton divideButton = new JButton("Dividir");
        divideButton.setLayout(null);
        divideButton.setBounds(250, 300, 100, 50);
        //minusButton.addActionListener(backMenu);
        menuPanel.add(divideButton);
        //

        //Text Box 1
        JTextField number1Box = new JTextField();
        number1Box.setBounds(100, 550, 200, 35);
        //number2Box.setBackground(Color.DARK_GRAY);
        number1Box.setFont(new Font("Arial", Font.PLAIN, 15));
        menuPanel.add(number1Box);

        //Text Box 2
        JTextField number2Box = new JTextField();
        number2Box.setBounds(400, 550, 200, 35);
        //number2Box.setBackground(Color.DARK_GRAY);
        number2Box.setFont(new Font("Arial", Font.PLAIN, 15));
        menuPanel.add(number2Box);

        //action listeners
        //addButton.addActionListener(e -> {resultado = new Addition().execute(number1Box.getText(),number1Box.getText())});
    }

    @Override
    public void update(String value){
        textField.setText(value);
    }
}
