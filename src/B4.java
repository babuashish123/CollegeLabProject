import java.awt.*;
import  javax.swing.*;
public class B4 extends JFrame{
    JButton b1,b2,b3,b4,b5;
    public B4()
    {
        setTitle("Box Layout");
        b1 =new JButton("I");
        b2 =new JButton("AM");
        b3 =new JButton("very ");
        b4 =new JButton("hungry hungry");
        b5 =new JButton("now");
        setSize(400,400);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
       setVisible(true);
       pack();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new B4();
    }

}
