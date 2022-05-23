import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class D1051916M extends JFrame {
    public D1051916M() {
        init();
    }

    protected JButton btL = new JButton("Login");
    protected JButton btR = new JButton("Random KB");
    protected JTextField tfP = new JTextField();
    protected JTextField tfU = new JTextField();
    protected JLabel lbP = new JLabel("Password");
    protected JLabel lbU = new JLabel("Username");

    protected JPanel pKB = new JPanel();

    protected Container rkb;
    protected JButton btRkb[] = new JButton[36];
    protected JButton close = new JButton("Close");
    protected JButton shift = new JButton("Shift");
    protected JButton clear = new JButton("Clear");
    String chos[] = { "Username", "Password" };
    JComboBox cho = new JComboBox(chos);
    Boolean Flag1 = true;

    protected String bsrd[] = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "q", "w", "e", "r", "t", "y", "u", "i",
            "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m" };

    Boolean Flag2 = true;

    protected void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new GridLayout(3, 2, 2, 2));
        lbP.setOpaque(true);
        lbU.setOpaque(true);
        win.add(lbU);
        win.add(tfU);
        win.add(lbP);
        win.add(tfP);
        win.add(btL);
        win.add(btR);

        btL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String tmpU = tfU.getText();
                String tmpP = tfP.getText();
                if (tmpP.equals("iecs") && tmpU.equals("csie")) {
                    D1051916MM cp = new D1051916MM();
                    win.setVisible(false);
                    cp.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(D1051916M.this, "Wrong username or password");
                }

            }
        });

        pKB.setLayout(new GridLayout(5, 8, 2, 2));
        pKB.setPreferredSize (new Dimension (600, 300));

        btR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                D1051916kb win = new D1051916kb(D1051916M.this);
                win.setVisible(true);
            }
        });

    }
}