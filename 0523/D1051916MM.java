import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class D1051916MM extends JFrame {
    public D1051916MM() {
        init();
    }

    int n = 0;

    private JLabel jlbK = new JLabel("Key");
    private JTextField nT = new JTextField("0");
    private JButton encrypt = new JButton("Encrypt");
    private JButton decrypt = new JButton("Decrypt");
    private JButton reset = new JButton("Reset");
    private JButton exit = new JButton("Exit");

    private JLabel lbLT = new JLabel("Plain Text");
    private JTextField tfLM = new JTextField();

    private JPanel jpnLC = new JPanel(new GridBagLayout());
    private JPanel jpnL = new JPanel(new BorderLayout(1, 1));
    // Right

    private JButton theme[] = new JButton[6];

    private JLabel lbRT = new JLabel("Ciper Text");
    private JLabel lbRM = new JLabel();

    private JPanel jpnRC = new JPanel(new GridBagLayout());
    private JPanel jpnR = new JPanel(new BorderLayout(1, 1));

    private void init() {
        Container cp = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new GridLayout(1, 2, 2, 2));
        lbRT.setOpaque(true);
        lbRT.setHorizontalAlignment(JLabel.RIGHT);
        lbLT.setOpaque(true);
        lbRM.setOpaque(true);

        cp.add(jpnL);
        cp.add(jpnR);
        jpnL.add(lbLT, BorderLayout.NORTH);
        jpnR.add(lbRT, BorderLayout.NORTH);
        jpnL.add(jpnLC, BorderLayout.CENTER);
        jpnR.add(jpnRC, BorderLayout.CENTER);

        GridBagConstraints c;

        // Left
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 6;
        c.weightx = 2;
        c.weighty = 6;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(tfLM, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(jlbK, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(nT, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(encrypt, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(decrypt, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(reset, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        jpnLC.add(exit, c);

        // Right
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 6;
        c.weightx = 2;
        c.weighty = 6;
        c.fill = GridBagConstraints.BOTH;
        jpnRC.add(lbRM, c);

        for (int i = 0; i < 6; i++) {
            theme[i] = new JButton("Theme" + (i + 1));
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = i;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.weightx = 1;
            c.weighty = 1;
            c.fill = GridBagConstraints.VERTICAL;
            c.anchor = GridBagConstraints.WEST;

            jpnRC.add(theme[i], c);

            int a = i;

            theme[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    switch (a) {
                        case 0:
                            lbRT.setBackground(new Color(185, 0, 0));
                            lbRM.setBackground(new Color(185, 0, 0));
                            break;
                        case 1:
                            lbRT.setBackground(new Color(185, 129, 153));
                            lbRM.setBackground(new Color(185, 129, 153));
                            break;
                        case 2:
                            lbRT.setBackground(new Color(180, 194, 106));
                            lbRM.setBackground(new Color(180, 194, 106));
                            break;
                        case 3:
                            lbRT.setBackground(new Color(140, 193, 153));
                            lbRM.setBackground(new Color(140, 193, 153));
                            break;
                        case 4:
                            lbRT.setBackground(new Color(87, 148, 148));
                            lbRM.setBackground(new Color(87, 148, 148));
                            break;
                        case 5:
                            lbRT.setBackground(new Color(228, 228, 228));
                            lbRM.setBackground(new Color(228, 228, 228));
                            break;
                        default:
                            break;
                    }
                }
            });

            switch (i) {
                case 0:
                    theme[i].setBackground(new Color(185, 0, 0));
                    break;
                case 1:
                    theme[i].setBackground(new Color(185, 129, 153));
                    break;
                case 2:
                    theme[i].setBackground(new Color(180, 194, 106));
                    break;
                case 3:
                    theme[i].setBackground(new Color(140, 193, 153));
                    break;
                case 4:
                    theme[i].setBackground(new Color(87, 148, 148));
                    break;
                case 5:
                    theme[i].setBackground(new Color(228, 228, 228));
                    break;
                default:
                    break;
            }
        }

        encrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String a = tfLM.getText();
                String string = "";
                Float b = Float.parseFloat(nT.getText());
                int b1= Math.round(b);
                for (int i = 0; i < a.length(); i++) {
                    char c = a.charAt(i);
                    c += b1;
                    string += c;
                }
                lbRM.setText(string);
            }
        });

        decrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String a = tfLM.getText();
                String string = "";
                Float b = Float.parseFloat(nT.getText());
                int b1= Math.round(b);
                for (int i = 0; i < a.length(); i++) {
                    char c = a.charAt(i);
                    c -= b1;
                    string += c;
                }
                lbRM.setText(string);
            }
        });


        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfLM.setText(" ");
                lbRM.setText(" ");
                nT.setText("0");
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    }
}