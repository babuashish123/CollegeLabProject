import java.awt.*;
import javax.swing.*;

public class Broder {


    Broder() {
       JFrame f = new JFrame("MY FRAME");
        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("TOP");
        b2 = new JButton("DOWN");
        b3 = new JButton("RIGHT");
        b4 = new JButton("LEFT");
        b5 = new JButton("CENTRE");

        // Set BorderLayout for the JFrame
        f.setLayout(new BorderLayout());

        // Add buttons to specific regions
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Broder();
    }
}
