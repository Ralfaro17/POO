import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Demo extends JFrame {
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JButton button;
    ButtonGroup group;

    // Constructor of Demo class.
    public Demo()
    {

        // Setting layout as null of JFrame.
        this.setLayout(null);
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        button = new JButton("Click");
        group = new ButtonGroup();

        // con esto se puede dar un nombre a los radio button
        radioButton1.setText("Button 1");
        radioButton2.setText("Button 2");

        // Se establece la posición de los botones
        radioButton1.setBounds(10, 30, 120, 50);
        radioButton2.setBounds(120, 30, 120, 50);
        button.setBounds(125, 90, 80, 30);

        if (new ImageIcon(getClass().getResource("./icons8-button-24.png")).getIconWidth() == -1) {
            System.out.println("Icon not found or cannot be loaded.");
        }

        radioButton2.setIcon(new ImageIcon(getClass().getResource("./icons8-button-24.png")));
        radioButton2.setSelectedIcon(new ImageIcon(getClass().getResource("icons8-button-24 (1).png")));


        // Se agregan los botones al grupo de botones para que solo se seleccione uno al mismo tiempo
        group.add(radioButton1);
        group.add(radioButton2);
        
        // Se añaden los botones al JFrame
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(button);

        // Se añade un escuchador de eventos al botón para que se ejecute una acción al hacer click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String message = " ";

                // Verifica que el primer botón seleccionado sea el numero 1
                if (radioButton1.isSelected()) {

                    message = "Button 1";
                }

                // Verifica que el primer botón seleccionado sea el numero 2
                else if (radioButton2.isSelected()) {

                    message = "Button 2";
                }
                else {
                    message = "NO Button selected";
                }

                // al tocar el botón, se crea un message dialog dando algo de información
                JOptionPane.showMessageDialog(Demo.this, message);
            }
        });
    }
}

class RadioButton {
    public static void main(String args[])
    {
        Demo frame = new Demo();

        // Se escribe las propiedades del JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setTitle("RadioButtons");
        frame.setVisible(true);
    }
}