import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {
    public Q2() {
        init();
    }

    private JButton btn[] = new JButton[16];
    private String bs[] = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "Clear", "Exit" };
    private String bsrd[] = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0" };
    private JPanel jpnC = new JPanel(new GridLayout(4, 3, 2, 2));
    private JLabel lb = new JLabel("0");
    Boolean Flag = true;

    private void init() {
        Container win = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        lb.setBackground(new Color(87, 148, 148));
        lb.setOpaque(true);
        lb.setHorizontalAlignment(JLabel.RIGHT);
        win.add(lb, BorderLayout.NORTH);
        win.add(jpnC, BorderLayout.CENTER);

        for (int i = 0; i < 12; i++) {
            btn[i] = new JButton(bs[i]);
            btn[i].setFont(new Font(null, Font.BOLD, 20));
            jpnC.add(btn[i]);
            btn[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton tmpBt = (JButton) e.getSource();
                    switch (tmpBt.getText()) {
                        case "1":
                            if (Flag) {
                                lb.setText("1");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "1");
                            }
                            break;

                        case "2":
                            if (Flag) {
                                lb.setText("2");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "2");
                            }
                            break;
                        case "3":
                            if (Flag) {
                                lb.setText("3");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "3");
                            }
                            break;
                        case "4":
                            if (Flag) {
                                lb.setText("4");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "4");
                            }
                            break;
                        case "5":
                            if (Flag) {
                                lb.setText("5");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "5");
                            }
                            break;
                        case "6":
                            if (Flag) {
                                lb.setText("6");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "6");
                            }
                            break;
                        case "7":
                            if (Flag) {
                                lb.setText("7");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "7");
                            }
                            break;
                        case "8":
                            if (Flag) {
                                lb.setText("8");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "8");
                            }
                            break;
                        case "9":
                            if (Flag) {
                                lb.setText("9");
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "9");
                            }
                            break;
                        case "0":
                            if (Flag) {
                                Flag = false;
                            } else {
                                String tmpS = lb.getText();
                                lb.setText(tmpS + "0");
                            }
                            break;
                        case "Clear":
                            lb.setText("0");
                            Flag = true;
                            break;
                        case "Exit":
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                    int[] num = new int[10];
                    int[] arr = new int[10];
                    int n;
                    for (int i = 0; i < num.length; i++) {
                        num[i] = i;
                    }
                    for (int i = 0; i < arr.length; i++) {
                        n = (int) (Math.random() * (10 - i));
                        arr[i] = num[n];
                        for (int j = n; j < num.length - 1; j++) {
                            num[j] = num[j + 1];
                        }
                    }
                    for (int i = 0; i < 10; i++) {
                        btn[i].setText(Integer.toString(arr[i]));
                    }
                }
            });
        }
    }
    // JOptionPane.showMessageDialog(FPMain.this, "Player 1 Win");
}