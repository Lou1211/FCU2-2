import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class FPMain extends JFrame {
    public FPMain() {
        init();
    }

    private JButton mou[] = new JButton[25];
    private JButton start = new JButton("Start");
    private JButton pause = new JButton("Pause");
    private JButton exit = new JButton("Exit");
    private JLabel lbq = new JLabel("Count : ");
    private JLabel jls = new JLabel("0");
    private JPanel jpnS = new JPanel(new GridLayout(1, 5, 2, 2));
    private JPanel jpnC = new JPanel(new GridLayout(5, 5, 2, 2));
    Boolean Flag[] = {false};
    private Timer t1, t2;
    int time = 0;
    int at = -1;
    int next = -1;
    int a = 0;

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        win.add(jpnC, BorderLayout.CENTER);
        win.add(jpnS, BorderLayout.SOUTH);

        jpnS.add(start);
        jpnS.add(pause);
        jpnS.add(lbq);
        jpnS.add(jls);
        jpnS.add(exit);

        // South

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.start();
                t2.start();
                at = (int) (Math.random() * 25);
                mou[at].setText("(@£»w£»@)");
                Flag[at] = true;
            }
        });

        pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
                Flag[at] = false;
            }
        });

        // Time

        t1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                next = (int) (Math.random() * 25);
                mou[at].setText(" ");
                Flag[at] = false;
                mou[next].setText("(@£»w£»@)");
                Flag[next] = true;
                at = next;
            }
        });

        t2 = new Timer(1000 * 60, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
                Flag[at] = false;
                JOptionPane.showMessageDialog(FPMain.this, "Finish!!!");
                System.exit(0);
            }
        });

        // Center

        for (int i = 0; i < 25; i++) {
            mou[i] = new JButton();
            jpnC.add(mou[i]);
            mou[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    if (Flag[a]) {
                        time++;
                        jls.setText(Integer.toString(time));
                    }
                }
            });
            a++;
        }
    }
}