import java.awt.event.*;
import javax.swing.*;

public class B2 extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3;

    B2() {

        t1 = new JTextField();
        t1.setBounds(90,90,150,30);
        add(t1);


        t2 = new JTextField();
        t2.setBounds(90,120,150,30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(90,150,150,30);
        add(t3);

        b1 = new JButton("sum");
        b1.setBounds(90,180,150,30);
        add(b1);
        b1.addActionListener(this); // Add ActionListener to the button

        b2 = new JButton("subtract");
        b2.setBounds(90,220,150,30); // Corrected y-coordinate
        add(b2);
        b2.addActionListener(this); // Add ActionListener to the button

        setLayout(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;

        if(e.getSource().equals(b1)) {
            c = a + b;
            t3.setText(String.valueOf("The sum is " + c)); // Corrected String.valueOf()
        } else if (e.getSource().equals(b2)) {
            c = a - b;
            t3.setText(String.valueOf("The difference is " + c)); // Corrected String.valueOf()
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        new B2();
    }
}
