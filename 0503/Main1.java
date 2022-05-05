import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Main1 extends JFrame {
    public Main1() {
        init();
    }

    boolean Flag00 = true;
    boolean Flag01 = true;
    boolean Flag02 = true;
    boolean Flag10 = true;
    boolean Flag11 = true;
    boolean Flag12 = true;
    boolean Flag20 = true;
    boolean Flag21 = true;
    boolean Flag22 = true;

    int time = 0;

    int wincheck[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

    private JButton b00 = new JButton();
    private JButton b01 = new JButton();
    private JButton b02 = new JButton();
    private JButton b10 = new JButton();
    private JButton b11 = new JButton();
    private JButton b12 = new JButton();
    private JButton b20 = new JButton();
    private JButton b21 = new JButton();
    private JButton b22 = new JButton();

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setBackground(new Color(87, 148, 148));
        win.setLayout(new GridLayout(3, 3, 2, 2));

        b00.setFont(new Font(null, Font.BOLD, 30));
        b01.setFont(new Font(null, Font.BOLD, 30));
        b02.setFont(new Font(null, Font.BOLD, 30));
        b10.setFont(new Font(null, Font.BOLD, 30));
        b11.setFont(new Font(null, Font.BOLD, 30));
        b12.setFont(new Font(null, Font.BOLD, 30));
        b20.setFont(new Font(null, Font.BOLD, 30));
        b21.setFont(new Font(null, Font.BOLD, 30));
        b22.setFont(new Font(null, Font.BOLD, 30));

        b00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag00) {
                    if (time % 2 == 0) {
                        b00.setText("O");
                        wincheck[0][0] = 1;
                        Wincheck(wincheck);
                    } else {
                        b00.setText("X");
                        wincheck[0][0] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag00 = false;
                }
            }
        });

        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag01) {
                    if (time % 2 == 0) {
                        b01.setText("O");
                        wincheck[0][1] = 1;
                        Wincheck(wincheck);
                    } else {
                        b01.setText("X");
                        wincheck[0][1] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag01 = false;
                }
            }
        });

        b02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag02) {
                    if (time % 2 == 0) {
                        b02.setText("O");
                        wincheck[0][2] = 1;
                        Wincheck(wincheck);
                    } else {
                        b02.setText("X");
                        wincheck[0][2] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag02 = false;
                }
            }
        });

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag10) {
                    if (time % 2 == 0) {
                        b10.setText("O");
                        wincheck[1][0] = 1;
                        Wincheck(wincheck);
                    } else {
                        b10.setText("X");
                        wincheck[1][0] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag10 = false;
                }
            }
        });

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag11) {
                    if (time % 2 == 0) {
                        b11.setText("O");
                        wincheck[1][1] = 1;
                        Wincheck(wincheck);
                    } else {
                        b11.setText("X");
                        wincheck[1][1] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag11 = false;
                }
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag12) {
                    if (time % 2 == 0) {
                        b12.setText("O");
                        wincheck[1][2] = 1;
                        Wincheck(wincheck);
                    } else {
                        b12.setText("X");
                        wincheck[1][2] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag12 = false;
                }
            }
        });

        b20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag20) {
                    if (time % 2 == 0) {
                        b20.setText("O");
                        wincheck[2][0] = 1;
                        Wincheck(wincheck);
                    } else {
                        b20.setText("X");
                        wincheck[2][0] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag20 = false;
                }
            }
        });

        b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag21) {
                    if (time % 2 == 0) {
                        b21.setText("O");
                        wincheck[2][1] = 1;
                        Wincheck(wincheck);
                    } else {
                        b21.setText("X");
                        wincheck[2][1] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag21 = false;
                }
            }
        });

        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (Flag22) {
                    if (time % 2 == 0) {
                        b22.setText("O");
                        wincheck[2][2] = 1;
                        Wincheck(wincheck);
                    } else {
                        b22.setText("X");
                        wincheck[2][2] = 2;
                        Wincheck(wincheck);
                    }
                    time++;
                    Flag22 = false;
                }
            }
        });

        win.add(b00);
        win.add(b01);
        win.add(b02);
        win.add(b10);
        win.add(b11);
        win.add(b12);
        win.add(b20);
        win.add(b21);
        win.add(b22);

    }

    public void Wincheck(int wincheck[][]) {
        if (time >= 4) {
            for (int i1 = 0; i1 <= 2; i1++) {
                if ((wincheck[i1][0] == wincheck[i1][1] && wincheck[i1][0] == wincheck[i1][2])
                        || (wincheck[0][i1] == wincheck[1][i1] && wincheck[0][i1] == wincheck[2][i1])) {
                    if (wincheck[i1][0] == 1 || wincheck[0][i1] == 1) {
                        JOptionPane.showMessageDialog(Main1.this, "Player 1 Win");
                    } else if (wincheck[i1][0] == 2 || wincheck[0][i1] == 2) {
                        JOptionPane.showMessageDialog(Main1.this, "Player 2 Win");
                    }
                }
            }
            if((wincheck[0][0] == wincheck[1][1] && wincheck[0][0] == wincheck[2][2])||(wincheck[2][0] == wincheck[1][1] && wincheck[2][0] == wincheck[0][2])){
                if (wincheck[1][1] == 1 ) {
                    JOptionPane.showMessageDialog(Main1.this, "Player 1 Win");
                } else if (wincheck[1][1] == 2 ) {
                    JOptionPane.showMessageDialog(Main1.this, "Player 2 Win");
                }
            }
        }
    }
}