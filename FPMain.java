import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class FPMain extends JFrame {
    public FPMain() {
        init();
    }

    private JButton bs[] = new JButton[25];

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setBackground(new Color(87, 148, 148));
        win.setLayout(new GridLayout(5, 5, 3, 3));
        this.setTitle("¥´¦a¹«");

        for (int i = 0; i < 25; i++) {
            bs[i] = new JButton();
            bs[i].setFont(new Font(null, Font.BOLD, 20));
            win.add(bs[i]);
            bs[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                
                }
                });
            }
    }
    //JOptionPane.showMessageDialog(FPMain.this, "Player 1 Win");
}