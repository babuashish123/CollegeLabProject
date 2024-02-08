import java.awt.*;
import javax.swing.*;
public class B1 extends JFrame {
    B1()
    {
        setTitle("clock");
        JButton b1,b2,b3,b4,b5;
        b1 = new JButton("12");
        b2 = new JButton("3");
        b3 = new JButton("6");
        b4 = new JButton("9");
        b5= new JButton("POINTER-->");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
       add(b5,BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new B1();
    }
}
