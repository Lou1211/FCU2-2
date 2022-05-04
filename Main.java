import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main() {
        init();
    }

    int x = 0;
    int y = 0;
    int e = 80;
    int r = 35;

    private JLabel jlbE=new JLabel("East");
    private JLabel jlbN=new JLabel("North");
    private JLabel jlbW=new JLabel("West");
    private JLabel jlbS=new JLabel("South");
    private JLabel jlbC=new JLabel("Center");

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setBackground(new Color(228, 228, 228));
        win.setLayout(new BorderLayout(3,3));

        jlbE.setBackground(new Color(87, 148, 148));
        jlbE.setOpaque(true);
        jlbE.setHorizontalAlignment(JLabel.CENTER);

        jlbS.setBackground(new Color(185, 0, 0));
        jlbS.setOpaque(true);
        jlbS.setHorizontalAlignment(JLabel.CENTER);

        jlbW.setBackground(new Color(185, 129, 153));
        jlbW.setOpaque(true);
        jlbW.setHorizontalAlignment(JLabel.CENTER);

        jlbN.setBackground(new Color(140, 193, 153));
        jlbN.setOpaque(true);
        jlbN.setHorizontalAlignment(JLabel.CENTER);

        jlbC.setBackground(new Color(180, 194, 106));
        jlbC.setOpaque(true);
        jlbC.setHorizontalAlignment(JLabel.CENTER);

        win.add(jlbE,BorderLayout.EAST);
        win.add(jlbN,BorderLayout.NORTH);
        win.add(jlbW,BorderLayout.WEST);
        win.add(jlbS,BorderLayout.SOUTH);
        win.add(jlbC,BorderLayout.CENTER);
    }
}
