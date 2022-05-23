import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {
    public Q2() {
        init();
    }

    private JButton btR = new JButton("Run");
    private JButton btE = new JButton("Exit");
    private JTextField tf = new JTextField();
    private JPanel jpnC = new JPanel(new GridLayout(1, 3, 2, 2));
    private JLabel lb = new JLabel("<html><body>" + "123456" + "<br>" + "123456789" + "<br>" + "qwerty" + "<br>"
            + "password" + "<br>" + "12345" + "<br>" + "qwerty123" + "<br>" + "1q2w3e" + "<br>" + "12345678" + "<br>"
            + "111111" + "<br>" + "1234567890" + "<body></html>");

    Boolean Flag = true;
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

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        lb.setOpaque(true);
        win.add(lb, BorderLayout.CENTER);
        win.add(jpnC, BorderLayout.NORTH);
        jpnC.add(tf);
        jpnC.add(btR);
        jpnC.add(btE);

        btE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        btR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String a = tf.getText();
                int c = -1;
                for (int i = 0; i < 10; i++) {
                    if (password[i].equals(a)) {
                        c = i;
                    }
                }
                switch (c) {
                    case 0:
                    JOptionPane.showMessageDialog(Q2.this, "Password:123456");
                        break;

                    case 1:
                    JOptionPane.showMessageDialog(Q2.this, "Password:123456789");
                        break;
                    case 2:
                    JOptionPane.showMessageDialog(Q2.this, "Password:qwerty");
                        break;
                    case 3:
                    JOptionPane.showMessageDialog(Q2.this, "Password:password");
                        break;
                    case 4:
                    JOptionPane.showMessageDialog(Q2.this, "Password:12345");
                        break;
                    case 5:
                    JOptionPane.showMessageDialog(Q2.this, "Password:qwerty123");
                        break;
                    case 6:
                    JOptionPane.showMessageDialog(Q2.this, "Password:1q2w3e");
                        break;
                    case 7:
                    JOptionPane.showMessageDialog(Q2.this, "Password:12345678");
                        break;
                    case 8:
                    JOptionPane.showMessageDialog(Q2.this, "Password:111111");
                        break;
                    case 9:
                    JOptionPane.showMessageDialog(Q2.this, "Password:1234567890");
                        break;
                    case -1:
                    JOptionPane.showMessageDialog(Q2.this, "No exsist in the password list");
                        break;
                    default:
                        break;
                }
            }
        });

    }
    // JOptionPane.showMessageDialog(FPMain.this, "Player 1 Win");
}