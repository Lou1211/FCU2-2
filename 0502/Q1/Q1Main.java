import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Main extends JFrame {
    public Q1Main() {
        init();
    }

    int y = 0;

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setBackground(new Color(87, 148, 148));
        win.setLayout(null);

        JLabel l1 = new JLabel(Integer.toString(y));

        JButton bExit = new JButton("Exit");
        bExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        JButton bAdd = new JButton("Add");
        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y++;
                l1.setText(Integer.toString(y));
            }
        });

        JButton bSub = new JButton("Sub");
        bSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y--;
                l1.setText(Integer.toString(y));
            }
        });

        bExit.setBounds(150, 150, 90, 30);
        bAdd.setBounds(110, 100, 90, 30);
        bSub.setBounds(190, 100, 90, 30);
        l1.setBounds(150, 50, 90, 30);

        win.add(bExit);
        win.add(bAdd);
        win.add(bSub);
        win.add(l1);
    }
}
