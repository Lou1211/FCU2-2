import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E2 extends JFrame implements ActionListener {
    static E2 cp = new E2();
    static Button btn = new Button("Draw");
    boolean Flag = false;

    public static void main(String args[]) {
        BorderLayout brlo = new BorderLayout();
        cp.setTitle("Drawing");
        cp.setLayout(brlo);
        cp.setSize(200, 100);
        cp.add(btn, brlo.SOUTH);
        cp.setVisible(true);
        btn.addActionListener(cp);
    }
    public void actionPerformed(ActionEvent ae) {
        Flag=true;
        Graphics g = getGraphics();
        paint(g);
    }
    public void paint(Graphics g) {
        if(Flag){
        g.drawRect(100, 50, 70, 55);
        }
    }
}