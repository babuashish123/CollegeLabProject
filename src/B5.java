import java.awt.*;
import javax.swing.*;

public class B5 extends JFrame {
    JButton b1, b2, b3, b4, b5;

    public B5() {
        setTitle("Box Layout");
        b1 = new JButton("I");
        b2 = new JButton("AM");
        b3 = new JButton("very ");
        b4 = new JButton("hungry hungry");
        b5 = new JButton("now");

        // Create a Box container
        Box box = Box.createVerticalBox();

        // Add buttons to the box
        box.add(Box.createVerticalStrut(10)); // Add some space at the top
        box.add(b1);
        box.add(b2);
        box.add(b3);
        box.add(b4);
        box.add(b5);
        box.add(Box.createVerticalStrut(10)); // Add some space at the bottom

        // Add the box to the content pane
        getContentPane().add(box);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a border around the entire frame
        getContentPane().setBackground(Color.WHITE); // Set background color of the content pane
        ((JComponent) getContentPane()).setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add black border

        setVisible(true);
    }

    public static void main(String[] args) {
        new B5();
    }
}

