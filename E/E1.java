import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class E1 extends JFrame {

    private Container cp;
    private JPanel Panel1 = new JPanel(new BorderLayout(3, 3));
    private JPanel Panel2 = new JPanel(new BorderLayout(3, 3));
    private JTextField KeyIn = new JTextField("");
    private JButton Run = new JButton("Run");
    private JButton Exit = new JButton("Exit");
    private JTextArea KeyPassword = new JTextArea("");
    private boolean flag = true;

    public E1() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2, 2));
        this.setTitle("Window Exercise 2022-05-16 Q2");
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp.add(Panel1, BorderLayout.NORTH);
        cp.add(KeyPassword, BorderLayout.CENTER);
        KeyPassword.setFont(new Font(null, Font.BOLD, 15));

        Panel1.add(KeyIn, BorderLayout.CENTER);
        KeyIn.setFont(new Font(null, Font.BOLD, 12));
        Panel1.add(Panel2, BorderLayout.EAST);

        Panel2.add(Run, BorderLayout.WEST);
        Run.setFont(new Font(null, Font.BOLD, 15));
        Run.setBackground(new Color(255, 255, 255));
        Run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String tmptext = KeyIn.getText();
                String strArr[] = KeyPassword.getText().split("\\n");
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        MessageDigest md = MessageDigest.getInstance("SHA-256");
                        byte[] hash = md.digest(strArr[i].getBytes("UTF-8"));
                        String CipherText = "";
                        for (int j = 0; j < hash.length; j++) {
                            CipherText += Integer.toString((hash[j] & 0xff) + 0x100, 16).substring(1);
                        }
                        if (CipherText.equals(tmptext)) {
                            JOptionPane.showMessageDialog(E1.this, "PW : " + strArr[i]);
                            flag = false;
                        }
                        else
                        {
                            flag = true;
                        }
                        System.out.println(tmptext);
                        System.out.println(CipherText);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e1) {
                        e1.printStackTrace();
                    }
                }
                if (flag == true) {
                    JOptionPane.showMessageDialog(E1.this, "Not Exist In The Password List");
                }
            }
        });

        Panel2.add(Exit, BorderLayout.EAST);
        Exit.setFont(new Font(null, Font.BOLD, 15));
        Exit.setBackground(new Color(255, 255, 255));
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        ;
    }
}