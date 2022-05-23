import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class D1051916kb extends JFrame {
    D1051916M win;

    public D1051916kb(D1051916M win1) {
        win = win1;
        init();
    }

    private Container rkb;
    private JButton btRkb[] = new JButton[36];
    private JButton close = new JButton("Close");
    private JButton shift = new JButton("Shift");
    private JButton clear = new JButton("Clear");
    String chos[] = { "Username", "Password" };
    JComboBox cho = new JComboBox(chos);
    Boolean Flag = true;

    private char bsrd[] = { '7', '8', '9', '4', '5', '6', '1', '2', '3', '0', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i',
            'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

    private void init() {
        rkb = this.getContentPane();
        rkb.setBounds(200, 100, 800, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rkb.setLayout(new GridLayout(5, 8, 2, 2));

        int[] num = new int[36];
        int[] arr = new int[36];
        int n;
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            n = (int) (Math.random() * (36 - i));
            arr[i] = num[n];
            for (int j = n; j < num.length - 1; j++) {
                num[j] = num[j + 1];
            }
        }
        for (int i = 0; i < 36; i++) {
            btRkb[i] = new JButton(Character.toString(bsrd[i]));
            rkb.add(btRkb[i]);
        }

        for (int i = 0; i < 36; i++) {
            int a = i;
            btRkb[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    if (Flag) {
                        String tmp = win.tfU.getText();
                        String tmpp = btRkb[a].getText();
                        win.tfU.setText(tmp + tmpp);
                    } else {
                        String tmp = win.tfP.getText();
                        String tmpp = btRkb[a].getText();
                        win.tfP.setText(tmp + tmpp);
                    }
                }
            });
        }

        rkb.add(shift);
        rkb.add(clear);
        rkb.add(close);
        rkb.add(cho);

        cho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = (String) cho.getSelectedItem();
                switch (a) {
                    case "Username":
                        Flag = true;
                        break;
                    case "Password":
                        Flag = false;
                        break;
                }
            }
        });

        shift.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < 36; i++){
                    if((int)(bsrd[i]) >= 'a' &&(int)(bsrd[i]) <= 'z'){
                        bsrd[i] = (char)((int)bsrd[i] - 'a' + 'A');
                        btRkb[i].setText(Character.toString(bsrd[i]));
                    }else if((int)(bsrd[i]) >= 'A' &&(int)(bsrd[i]) <= 'Z'){
                        bsrd[i] = (char)((int)bsrd[i] - 'A' + 'a');
                        btRkb[i].setText(Character.toString(bsrd[i]));
                    }
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Flag) {
                    win.tfU.setText("");
                } else {
                    win.tfP.setText("");
                }
            }
        });

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                rkb.setVisible(false);
            }
        });

    }
}