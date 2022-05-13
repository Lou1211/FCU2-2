import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class FPMain extends JFrame {
    public FPMain() {
        init();
    }

    private JButton mou = new JButton("(@£»w£»@)");
    private JButton start = new JButton("Start");
    private JButton pause = new JButton("Pause");
    private JButton exit = new JButton("Exit");
    private JLabel lbq = new JLabel("Count : ");
    private JLabel jls = new JLabel("0");
    private JPanel jpnS = new JPanel(new GridLayout(1, 5, 2, 2));
    Boolean Flag = false;
    private JLabel lb = new JLabel();
    private Timer t1, t2;
    private int x=50, y=50;
    int time=0;

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        lb.setBackground(new Color(87, 148, 148));
        lb.setOpaque(true);
        lb.setHorizontalAlignment(JLabel.RIGHT);
        win.add(lb, BorderLayout.CENTER);
        win.add(jpnS, BorderLayout.SOUTH);
        mou.setBounds(x, y, 100, 100);
        lb.add(mou);

        jpnS.add(start);
        jpnS.add(pause);
        jpnS.add(lbq);
        jpnS.add(jls);
        jpnS.add(exit);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        mou.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag) {
                    time++;
                    jls.setText(Integer.toString(time));
                }
            }
        });

        t1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x = (int)(Math.random()*300);
                y = (int)(Math.random()*300);
                mou.setBounds(x, y, 100, 100);
            }
        });

        t2 = new Timer(1000 * 60, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
                Flag = false;
                JOptionPane.showMessageDialog(FPMain.this, "Finish!!!");
                System.exit(0);
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.start();
                t2.start();
                Flag = true;
            }
        });

        pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
            }
        });

    }
}