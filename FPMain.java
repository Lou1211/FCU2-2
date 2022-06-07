/*import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.*;
import java.awt.event.*;

public class FPMain extends JFrame {
    public FPMain() {
        init();
    }

    protected JMenuBar jmnb = new JMenuBar();
    protected JMenu jmn = new JMenu("Menu");
    protected JMenuItem col = new JMenuItem("Change Color");
    protected JMenuItem set = new JMenuItem("Setting");
    protected JButton mou[] = new JButton[25];
    protected JButton start = new JButton("Start");
    protected JButton pause = new JButton("Pause");
    protected JButton exit = new JButton("Exit");
    protected JLabel lbq = new JLabel("Count : ");
    protected JLabel jls = new JLabel("0");
    protected JPanel jpnS = new JPanel(new GridLayout(1, 5, 2, 2));
    protected JPanel jpnC = new JPanel(new GridLayout(5, 5, 2, 2));
    protected Timer t1, t2;
    int time = 0;
    int at = 0;
    int next = 1;
    int a = 0;
    int b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    boolean flag[] = new boolean[25];

    protected void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        win.add(jpnC, BorderLayout.CENTER);
        win.add(jpnS, BorderLayout.SOUTH);
        this.setJMenuBar(jmnb);
        jmnb.add(jmn);
        jmn.add(col);
        jmn.add(set);
        
        //Menu

        col.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                FPcolor cp = new FPcolor();
                cp.setVisible(true);
            }
        });

        set.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        jpnS.add(start);
        jpnS.add(pause);
        jpnS.add(lbq);
        jpnS.add(jls);
        jpnS.add(exit);

        for (int i = 0; i < 24; i++) {
            flag[i] = false;
        }

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
            }
        });

        pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
            }
        });

        // Time

        t1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                next = (int) (Math.random() * 25);
                mou[at].setText(" ");
                flag[at] = false;
                mou[next].setText("(@£»w£»@)");
                flag[next] = true;
                at = next;
            }
        });

        t2 = new Timer(1000 * 60, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
                for (int i = 0; i < 25; i++) {
                    mou[i].setText(" ");
                }
                JOptionPane.showMessageDialog(FPMain.this, "Finish!!!");
                System.exit(0);
            }
        });

        // Center

        for (int i = 0; i < 25; i++) {
            mou[i] = new JButton();
            jpnC.add(mou[i]);
        }

        mou[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[0]) {
                    if (mou[0].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[0].setText(" ");
                    }
                }
            }
        });

        mou[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[1]) {
                    if (mou[1].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[1].setText(" ");
                    }
                }
            }
        });

        mou[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[2]) {
                    if (mou[2].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[2].setText(" ");
                    }
                }
            }
        });

        mou[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[3]) {
                    if (mou[3].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[3].setText(" ");
                    }
                }
            }
        });

        mou[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[4]) {
                    if (mou[4].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[4].setText(" ");
                    }
                }
            }
        });

        mou[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[5]) {
                    if (mou[5].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[5].setText(" ");
                    }
                }
            }
        });

        mou[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[6]) {
                    if (mou[6].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[6].setText(" ");
                    }
                }
            }
        });

        mou[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[7]) {
                    if (mou[7].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[7].setText(" ");
                    }
                }
            }
        });

        mou[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[8]) {
                    if (mou[8].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[8].setText(" ");
                    }
                }
            }
        });

        mou[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[9]) {
                    if (mou[9].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[9].setText(" ");
                    }
                }
            }
        });

        mou[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[10]) {
                    if (mou[10].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[10].setText(" ");
                    }
                }
            }
        });

        mou[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[11]) {
                    if (mou[11].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[11].setText(" ");
                    }
                }
            }
        });

        mou[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[12]) {
                    if (mou[12].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[12].setText(" ");
                    }
                }
            }
        });

        mou[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[13]) {
                    if (mou[13].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[13].setText(" ");
                    }
                }
            }
        });

        mou[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[14]) {
                    if (mou[14].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[14].setText(" ");
                    }
                }
            }
        });

        mou[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[15]) {
                    if (mou[15].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[15].setText(" ");
                    }
                }
            }
        });

        mou[16].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[16]) {
                    if (mou[16].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[16].setText(" ");
                    }
                }
            }
        });

        mou[17].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[17]) {
                    if (mou[17].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[17].setText(" ");
                    }
                }
            }
        });

        mou[18].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[18]) {
                    if (mou[18].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[18].setText(" ");
                    }
                }
            }
        });

        mou[19].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[19]) {
                    if (mou[19].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[19].setText(" ");
                    }
                }
            }
        });

        mou[20].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[20]) {
                    if (mou[20].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[20].setText(" ");
                    }
                }
            }
        });

        mou[21].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[21]) {
                    if (mou[21].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[21].setText(" ");
                    }
                }
            }
        });

        mou[22].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[22]) {
                    if (mou[22].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[22].setText(" ");
                    }
                }
            }
        });

        mou[23].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[23]) {
                    if (mou[23].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[23].setText(" ");
                    }
                }
            }
        });

        mou[24].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag[24]) {
                    if (mou[24].getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        mou[24].setText(" ");
                    }
                }
            }
        });
    }
}*/