import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example extends JFrame implements ActionListener{
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    ButtonGroup group;

    public Example(){
        this.setLayout(new FlowLayout());
        radioButton1 = new JRadioButton("Azul");
        radioButton2 = new JRadioButton("Rojo");
        radioButton3 = new JRadioButton("Morado");
        group = new ButtonGroup();

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);

        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (radioButton1.isSelected()) {
            this.getContentPane().setBackground(Color.BLUE);
        }
        else if (radioButton2.isSelected()) {
            this.getContentPane().setBackground(Color.RED);
        }
        else if (radioButton3.isSelected()) {
            this.getContentPane().setBackground(Color.MAGENTA);
        }
        else {
            this.getContentPane().setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        Example frame = new Example();

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
