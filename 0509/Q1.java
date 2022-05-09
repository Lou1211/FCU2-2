import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {
    public Q1() {
        init();
    }

    int r = 0;
    int g = 0;
    int b = 0;
    private JLabel jlbr = new JLabel("Red");
    private JTextField rT = new JTextField("0");
    private JLabel jlbg = new JLabel("Green");
    private JTextField gT = new JTextField("0");
    private JLabel jlbb = new JLabel("Blue");
    private JTextField bT = new JTextField("0");
    private JButton Apply = new JButton("Apply");
    private JButton Exit = new JButton("Exit");
    private JPanel jpnE = new JPanel(new GridLayout(8, 1, 2, 2));
    private JLabel lb = new JLabel();

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        lb.setBackground(new Color(r, g, b));
        lb.setOpaque(true);
        win.add(lb, BorderLayout.CENTER);
        win.add(jpnE, BorderLayout.EAST);

        jpnE.add(jlbr);
        jpnE.add(rT);
        jpnE.add(jlbg);
        jpnE.add(gT);
        jpnE.add(jlbb);
        jpnE.add(bT);
        jpnE.add(Apply);
        jpnE.add(Exit);

        Apply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                float tmp = Float.parseFloat(rT.getText());
                r = (int) tmp;
                tmp = Float.parseFloat(gT.getText());
                g = (int) tmp;
                tmp = Float.parseFloat(bT.getText());
                b = (int) tmp;
                if(r>=0&&b>=0&&g>=0&&r<256&&r<256&&r<256){
                    lb.setBackground(new Color(r, g, b));
                }
                else{
                    JOptionPane.showMessageDialog(Q1.this, "The Color value is incorrect!");
                }
            }
        });

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    }
}