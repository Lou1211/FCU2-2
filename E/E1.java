import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E1 extends JFrame {

    private JDesktopPane jdp = new JDesktopPane();
    private JInternalFrame jitnf = new JInternalFrame("JI1",true,true,true,true);
    private JButton Exit = new JButton("Exit");
    private JMenuBar jmb = new JMenuBar();
    private JMenu jm = new JMenu("File");
    private JMenuItem jmiOP = new JMenuItem("Open");
    private JMenuItem jmiC = new JMenuItem("Close");

    public E1() {
        init();
    }

    private void init() {
        this.setContentPane(jdp);
        jdp.add(jitnf);
        this.setBounds(150, 150, 700, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jitnf.setBounds(10, 10, 300, 300);
        jitnf.setVisible(true);
        jitnf.setJMenuBar(jmb);
        jmb.add(jm);
        jm.add(jmiOP);

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        ;
    }
}