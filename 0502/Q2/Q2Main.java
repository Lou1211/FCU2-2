import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q2Main extends JFrame {
    private Container cp;
    private JTextField jtf = new JTextField("0");
    private JLabel jlb1 = new JLabel("n: ");
    private JLabel jlb2 = new JLabel("n!: ");
    private JButton jbtnExit = new JButton("EXIT");
    private JButton jbtnRUN = new JButton("=");

    public Q2Main() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.setLayout(null);
        this.setBounds(100, 100, 400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jlb1.setBounds(50, 50, 80, 35);
        cp.add(jlb1);
        jtf.setBounds(110, 50, 50, 35);
        cp.add(jtf);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jbtnRUN.setBounds(160, 50, 50, 35);
        jbtnRUN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float f = Float.parseFloat(jtf.getText());
                int f1 = (int) f;
                float f2 = 1;
                for (int i = 2; i <= f; i++) {
                    f2 = f2*i;
                }
                jlb2.setText(f1+"!: " + Integer.toString((int) f2));
            }
        });
        cp.add(jbtnRUN);
        jlb2.setBounds(215, 50, 120, 35);
        cp.add(jlb2);
        jbtnExit.setBounds(270, 120, 80, 35);
        jbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jbtnExit);
    }
}
