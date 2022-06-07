import javax.swing.*;
import javax.swing.plaf.ScrollBarUI;
import java.awt.*;
import java.awt.event.*;

public class E3 extends Frame implements AdjustmentListener {
    static E3 cp = new E3();
    static Scrollbar scbr = new Scrollbar(Scrollbar.VERTICAL);
    static Scrollbar scbg = new Scrollbar(Scrollbar.HORIZONTAL);
    static Scrollbar scbb = new Scrollbar(Scrollbar.VERTICAL);

    public static void main(String args[]) {
        BorderLayout brlo = new BorderLayout(5, 5);
        cp.setTitle("Display colors");
        cp.setLayout(brlo);
        cp.setSize(200, 150);
        cp.add(scbr, brlo.WEST);
        cp.add(scbg, brlo.SOUTH);
        cp.add(scbb, brlo.EAST);
        scbr.setValues(255, 45, 0, 300);
        scbg.setValues(255, 45, 0, 300);
        scbb.setValues(255, 45, 0, 300);
        scbr.addAdjustmentListener(cp);
        scbg.addAdjustmentListener(cp);
        scbb.addAdjustmentListener(cp);
        cp.setVisible(true);
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
        g.drawString("Color ( "+r1+" , "+g1+" , "+b1+" )", 45, 80);
    }
}