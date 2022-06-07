import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3Main extends JFrame {
    public Q3Main() {
        init();
    }

    int x = 0;
    int y = 0;
    int e = 80;
    int r = 35;

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setBackground(new Color(87, 148, 148));
        win.setLayout(null);

        JLabel lb = new JLabel(Integer.toString(y));

        lb.setBounds(x, y, e, r);
        lb.setBackground(new Color(128, 228, 228));
        lb.setOpaque(true);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setFont(new Font(null, Font.BOLD, 20));
        lb.setText("Hi there!");

        JButton bExit = new JButton("X");
        bExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        JButton bUp = new JButton("¡ô");
        bUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y -= 10;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bDown = new JButton("¡õ");
        bDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y += 10;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bLeft = new JButton("¡ö");
        bLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x -= 10;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bRight = new JButton("¡÷");
        bRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x += 10;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bRD = new JButton("¡û");
        bRD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x += 5;
                y += 5;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bLD = new JButton("¡ú");
        bLD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x -= 5;
                y += 5;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bRU = new JButton("¡ù");
        bRU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x += 5;
                y -= 5;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bLU = new JButton("¡ø");
        bLU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x -= 5;
                y -= 5;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bZI = new JButton("Zoom in");
        bZI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                e += 5;
                r += 5;
                lb.setBounds(x, y, e, r);
            }
        });

        JButton bZO = new JButton("Zoom out");
        bZO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                e -= 5;
                r -= 5;
                lb.setBounds(x, y, e, r);
            }
        });

        bExit.setBounds(150, 150, 50, 30);

        bUp.setBounds(150, 100, 50, 30);
        bDown.setBounds(150, 200, 50, 30);
        bLeft.setBounds(100, 150, 50, 30);
        bRight.setBounds(200, 150, 50, 30);

        bLU.setBounds(100, 100, 50, 30);
        bRU.setBounds(200, 100, 50, 30);
        bLD.setBounds(100, 200, 50, 30);
        bRD.setBounds(200, 200, 50, 30);

        bZI.setBounds(320, 200, 100, 30);
        bZO.setBounds(320, 100, 100, 30);

        win.add(bExit);

        win.add(bUp);
        win.add(bDown);
        win.add(bLeft);
        win.add(bRight);

        win.add(bLU);
        win.add(bRU);
        win.add(bLD);
        win.add(bRD);

        win.add(bZI);
        win.add(bZO);

        win.add(lb);
    }
}
