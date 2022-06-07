import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FP1 extends JFrame {

    // Main
    private JDesktopPane fp = new JDesktopPane();
    private JInternalFrame jitnf1 = new JInternalFrame("Game", true, true, true, true);
    private JInternalFrame jitnf2 = new JInternalFrame("Color", true, true, true, true);
    private JInternalFrame jitnf3 = new JInternalFrame("Setting", true, true, true, true);

    // Game
    protected JButton mou[] = new JButton[25];
    protected JButton start = new JButton("Start");
    protected JButton pause = new JButton("Pause");
    protected JButton reset = new JButton("Reset");
    protected JLabel lbq = new JLabel("Count : ");
    protected JLabel jls = new JLabel("0");
    protected JPanel jpnS = new JPanel(new GridLayout(1, 5, 2, 2));
    protected JPanel jpnC = new JPanel(new GridLayout(5, 5, 2, 2));
    protected Timer t1, t2;
    int time = 0;
    int at = 0;
    int next = 1;
    int a = 0;

    // Color
    protected JTextField tfr = new JTextField("255");
    protected JTextField tfg = new JTextField("255");
    protected JTextField tfb = new JTextField("255");
    protected JLabel lbr = new JLabel("Red:");
    protected JLabel lbg = new JLabel("Green:");
    protected JLabel lbb = new JLabel("Blue:");
    protected JLabel lbC = new JLabel();
    protected JButton setcl = new JButton("Set Mouse");
    protected JButton ccl = new JButton("Check Color");

    protected JPanel jpncS = new JPanel(new GridLayout(1, 8, 2, 2));
    int r = 255;
    int g = 255;
    int b = 255;

    // Set
    float x = 1;
    float y = 1;
    protected JLabel lbx = new JLabel("Next Mouse will show in:(sec)");
    protected JLabel lby = new JLabel("Game time:(min)");
    protected JTextField tfx = new JTextField("1");
    protected JTextField tfy = new JTextField("1");
    protected JButton setime = new JButton("Set");

    public FP1() {
        init();
    }

    private void init() {
        lbq.setOpaque(true);
        jls.setOpaque(true);
        lbr.setOpaque(true);
        lbg.setOpaque(true);
        lbb.setOpaque(true);
        lbC.setOpaque(true);
        lbx.setOpaque(true);
        lby.setOpaque(true);

        this.setContentPane(fp);
        fp.add(jitnf1);
        fp.add(jitnf2);
        fp.add(jitnf3);

        this.setBounds(150, 150, 700, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jitnf1.setBounds(30, 30, 300, 300);
        jitnf2.setBounds(20, 20, 300, 300);
        jitnf3.setBounds(10, 10, 300, 300);

        jitnf3.setVisible(true);
        jitnf2.setVisible(true);
        jitnf1.setVisible(true);

        // Game
        jitnf1.setLayout(new BorderLayout(1, 1));
        jitnf1.add(jpnC, BorderLayout.CENTER);
        jitnf1.add(jpnS, BorderLayout.SOUTH);

        jpnS.add(start);
        jpnS.add(pause);
        jpnS.add(lbq);
        jpnS.add(jls);
        jpnS.add(reset);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.restart();
                t2.restart();
                time = 0;
                jls.setText(Integer.toString(time));
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.start();
                t2.start();
                at = (int) (Math.random() * 25);
                mou[at].setText("(@£»w£»@)");
            }
        });

        pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
            }
        });

        t1 = new Timer((int) x * 1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                next = (int) (Math.random() * 25);
                mou[at].setText(" ");
                mou[next].setText("(@£»w£»@)");
                at = next;
            }
        });

        t2 = new Timer((int) y * 60000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.stop();
                for (int i = 0; i < 25; i++) {
                    mou[i].setText(" ");
                }
                JOptionPane.showMessageDialog(FP1.this, "Finish!!!");
            }
        });

        for (int i = 0; i < 25; i++) {
            mou[i] = new JButton();
            mou[i].setBackground(new Color(r, g, b));
            jpnC.add(mou[i]);
            mou[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton tmp = (JButton) e.getSource();
                    if (tmp.getText().equals("(@£»w£»@)")) {
                        time++;
                        jls.setText(Integer.toString(time));
                        tmp.setText(" ");
                    }
                }
            });
        }

        // Color
        jitnf2.setLayout(new BorderLayout(1, 1));
        jitnf2.add(jpncS, BorderLayout.SOUTH);
        jitnf2.add(lbC, BorderLayout.CENTER);
        lbC.setBackground(new Color(r, g, b));

        jpncS.add(lbr);
        jpncS.add(tfr);
        jpncS.add(lbg);
        jpncS.add(tfg);
        jpncS.add(lbb);
        jpncS.add(tfb);
        jpncS.add(ccl);
        jpncS.add(setcl);

        setcl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (r <= 127 && g <= 127 && b <= 127) {
                    for (int i = 0; i < 25; i++) {
                        mou[i].setBackground(new Color(r, g, b));
                        mou[i].setForeground(Color.white);
                    }
                } else {
                    for (int i = 0; i < 25; i++) {
                        mou[i].setBackground(new Color(r, g, b));
                        mou[i].setForeground(Color.black);
                    }
                }
            }
        });

        ccl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                float tmp = Float.parseFloat(tfr.getText());
                r = (int) tmp;
                tmp = Float.parseFloat(tfg.getText());
                g = (int) tmp;
                tmp = Float.parseFloat(tfb.getText());
                b = (int) tmp;
                lbC.setBackground(new Color(r, g, b));
            }
        });

        // Set
        jitnf3.setLayout(new GridLayout(5, 1, 2, 2));
        jitnf3.add(lbx);
        jitnf3.add(tfx);
        jitnf3.add(lby);
        jitnf3.add(tfy);
        jitnf3.add(setime);

        setime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                float tmp = Float.parseFloat(tfx.getText());
                x = tmp;
                tmp = Float.parseFloat(tfy.getText());
                y = tmp;
            }
        });

    }
};
