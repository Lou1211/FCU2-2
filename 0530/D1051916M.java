//I tried my best to do this, still fail...
//But I'll keep trying!

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1051916M extends JFrame {

    private JDesktopPane jdp = new JDesktopPane();
    private JInternalFrame jitnf1 = new JInternalFrame("Note",true,true,true,true);
    private JInternalFrame jitnf2 = new JInternalFrame("Password",true,true,true,true);
    private JInternalFrame jitnf3 = new JInternalFrame("Photo",true,true,true,true);
    private JInternalFrame jitnf4 = new JInternalFrame("Titatoe",true,true,true,true);
    /*private JMenuBar jmb = new JMenuBar();
    private JMenu jm = new JMenu("File");
    private JMenuItem jmi1 = new JMenuItem("Note");
    private JMenuItem jmi2 = new JMenuItem("Titatoe");
    private JMenuItem jmi3 = new JMenuItem("Photo");
    private JMenuItem jmi4 = new JMenuItem("Password");*/

    //Password
    private JButton btTR = new JButton("Run");
    private JTextField tfT = new JTextField();
    private JPanel jpnTC = new JPanel(new GridLayout(1, 3, 2, 2));
    private JLabel lbT = new JLabel("<html><body>" + "123456" + "<br>" + "123456789" + "<br>" + "qwerty" + "<br>"
            + "password" + "<br>" + "12345" + "<br>" + "qwerty123" + "<br>" + "1q2w3e" + "<br>" + "12345678" + "<br>"
            + "111111" + "<br>" + "1234567890" + "<body></html>");

    Boolean FlagT = true;
    String password[] = { "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
            "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
            "65e84be33532fb784c48129675f9eff3a682b27168c0ea744b2cf58ee02337c5",
            "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8",
            "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5",
            "daaad6e5604e8e17bd9f108d91e26afe6281dac8fda0091040a7a6d7bd9b43b5",
            "c0c4a69b17a7955ac230bfc8db4a123eaa956ccf3c0022e68b8d4e2f5b699d1f",
            "ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f",
            "bcb15f821479b4d5772bd0ca866c00ad5f926e3580720659cc80d39c9d09802a",
            "c775e7b757ede630cd0aa1113bd102661ab38829ca52a6422ab782862f268646" };
    //Fin

    //Titatoe
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
    //Fin

    public D1051916M() {
        init();
    }

    private void init() {
        this.setContentPane(jdp);
        jdp.add(jitnf1);
        jdp.add(jitnf2);
        jdp.add(jitnf3);
        jdp.add(jitnf4);
        this.setBounds(150, 150, 700, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jitnf1.setBounds(10, 10, 300, 300);
        jitnf2.setBounds(10, 10, 300, 300);
        jitnf3.setBounds(10, 10, 300, 300);
        jitnf4.setBounds(10, 10, 300, 300);
        
        jitnf1.setVisible(true);
        jitnf2.setVisible(true);
        jitnf3.setVisible(true);
        jitnf4.setVisible(true);

        //Titatoe
        jitnf4.setLayout(new GridLayout(3, 3, 2, 2));

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

        jitnf4.add(b00);
        jitnf4.add(b01);
        jitnf4.add(b02);
        jitnf4.add(b10);
        jitnf4.add(b11);
        jitnf4.add(b12);
        jitnf4.add(b20);
        jitnf4.add(b21);
        jitnf4.add(b22);

        //Password
        lbT.setOpaque(true);
        jitnf2.add(lbT, BorderLayout.CENTER);
        jitnf2.add(jpnTC, BorderLayout.NORTH);
        jpnTC.add(tfT);
        jpnTC.add(btTR);

        btTR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String a = tfT.getText();
                int c = -1;
                for (int i = 0; i < 10; i++) {
                    if (password[i].equals(a)) {
                        c = i;
                    }
                }
                switch (c) {
                    case 0:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:123456");
                        break;

                    case 1:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:123456789");
                        break;
                    case 2:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:qwerty");
                        break;
                    case 3:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:password");
                        break;
                    case 4:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:12345");
                        break;
                    case 5:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:qwerty123");
                        break;
                    case 6:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:1q2w3e");
                        break;
                    case 7:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:12345678");
                        break;
                    case 8:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:111111");
                        break;
                    case 9:
                    JOptionPane.showMessageDialog(D1051916M.this, "Password:1234567890");
                        break;
                    case -1:
                    JOptionPane.showMessageDialog(D1051916M.this, "No exsist in the password list");
                        break;
                    default:
                        break;
                }
            }
        });
        //Fin

        /*jmb.add(jm);
        jm.add(jmi1);*/

        /*Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });*/
        
    };



public void Wincheck(int wincheck[][]) {
    if (time >= 4) {
        for (int i1 = 0; i1 <= 2; i1++) {
            if ((wincheck[i1][0] == wincheck[i1][1] && wincheck[i1][0] == wincheck[i1][2])
                    || (wincheck[0][i1] == wincheck[1][i1] && wincheck[0][i1] == wincheck[2][i1])) {
                if (wincheck[i1][0] == 1 || wincheck[0][i1] == 1) {
                    JOptionPane.showMessageDialog(D1051916M.this, "Player Win");
                } else if (wincheck[i1][0] == 2 || wincheck[0][i1] == 2) {
                    JOptionPane.showMessageDialog(D1051916M.this, "Computer Win");
                }
            }
        }
        if((wincheck[0][0] == wincheck[1][1] && wincheck[0][0] == wincheck[2][2])||(wincheck[2][0] == wincheck[1][1] && wincheck[2][0] == wincheck[0][2])){
            if (wincheck[1][1] == 1 ) {
                JOptionPane.showMessageDialog(D1051916M.this, "Player Win");
            } else if (wincheck[1][1] == 2 ) {
                JOptionPane.showMessageDialog(D1051916M.this, "Computer Win");
            }
        }
    }
}}