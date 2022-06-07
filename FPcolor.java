/*import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import java.awt.*;
import java.awt.event.*;

public class FPcolor extends Frame implements AdjustmentListener {
    static FPcolor cp = new FPcolor();
    static Scrollbar scbr = new Scrollbar(Scrollbar.VERTICAL);
    static Scrollbar scbg = new Scrollbar(Scrollbar.HORIZONTAL);
    static Scrollbar scbb = new Scrollbar(Scrollbar.VERTICAL);
    FPMain win;
    static protected JButton scl = new JButton("Set This Color");
    static protected JButton ccl = new JButton("Close");

    public static void main(String args[]) {
        cp.setTitle("Color");
        cp.setLayout(new BorderLayout(5, 5));
        cp.setSize(200, 200);
        cp.add(scbr, BorderLayout.WEST);
        cp.add(scbg, BorderLayout.SOUTH);
        cp.add(scbb, BorderLayout.EAST);
        scbr.setValues(255, 45, 0, 300);
        scbg.setValues(255, 45, 0, 300);
        scbb.setValues(255, 45, 0, 300);
        scbr.addAdjustmentListener(cp);
        scbg.addAdjustmentListener(cp);
        scbb.addAdjustmentListener(cp);
        scl.setBounds(65, 85, 70, 30);
        ccl.setBounds(5, 5, 70, 30);
        
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        Graphics g = getGraphics();
        paint(g);
    }

    public void paint(Graphics g) {
        int r1 = scbr.getValue();
        int g1 = scbg.getValue();
        int b1 = scbb.getValue();
        g.setColor(new Color(r1, g1, b1));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawString("Color ( " + r1 + " , " + g1 + " , " + b1 + " )", 65, 5);
    }
}*/