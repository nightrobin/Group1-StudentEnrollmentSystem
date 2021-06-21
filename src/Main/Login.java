package Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Login extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JPanel pnl_LogIn;
    public JTextField txt_LogInEmail;
    public JPasswordField pf_LogInPassword;
    private final JButton btn_LogIn;
    private final JRadioButton rb_SeePassword;
    private final JButton btn_gotoEnroll;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Login() {
        setTitle("STUDENT ENROLLMENT SYSTEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 1100, 700);
        setResizable(false);
        pnl_LogIn = new JPanel();
        pnl_LogIn.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(pnl_LogIn);
        pnl_LogIn.setLayout(null);

        JLabel lblfName = new JLabel("Email:");
        lblfName.setFont(new Font("Dialog", Font.BOLD, 15));
        lblfName.setForeground(Color.BLACK);
        lblfName.setBounds(400, 150, 350, 50);
        setVisible(true);
        add(lblfName);

        txt_LogInEmail = new JTextField();
        txt_LogInEmail.setFont(new Font("Arial", Font.PLAIN, 25));
        txt_LogInEmail.setBounds(400, 200, 300, 35);
        setVisible(true);
        add(txt_LogInEmail);

        JLabel lblmName = new JLabel("Password:");
        lblmName.setFont(new Font("Dialog", Font.BOLD, 15));
        lblmName.setForeground(Color.BLACK);
        lblmName.setBounds(400, 250, 350, 50);
        setVisible(true);
        add(lblmName);

        pf_LogInPassword = new JPasswordField();
        pf_LogInPassword.setFont(new Font("Arial", Font.PLAIN, 25));
        pf_LogInPassword.setBounds(400, 300, 300, 35);
        setVisible(true);
        add(pf_LogInPassword);

        rb_SeePassword = new JRadioButton("Show Password");
        rb_SeePassword.setBounds(400, 350, 360, 15);
        rb_SeePassword.setOpaque(false);
        rb_SeePassword.setBackground(new Color(0, 0, 0, 0));
        rb_SeePassword.setForeground(Color.BLACK);
        setVisible(true);
        add(rb_SeePassword);
        rb_SeePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb_SeePassword.isSelected()) {
                    pf_LogInPassword.setEchoChar((char) 0);
                } else {
                    pf_LogInPassword.setEchoChar('•');
                }
            }
        });

        btn_LogIn = new JButton("LOG IN");
        btn_LogIn.setBounds(400, 400, 300, 35);
        setVisible(true);
        add(btn_LogIn);
        getRootPane().setDefaultButton(btn_LogIn);
        btn_LogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = txt_LogInEmail.getText();
                String password = pf_LogInPassword.getText();
                if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email is required");
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password is required");
                } else {
                    try {
                        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentenrollment", "root", "PLMpurposes1234");
                        String SelectQ = "select * from enrollee where email = '" + email + "' and password = '" + password + "'";
                        Statement statement = Connect.createStatement();
                        ResultSet resultSet = statement.executeQuery(SelectQ);
                        if (resultSet.next()) {
                            Main.FeeFrame obj = new Main.FeeFrame();
                            obj.fee();
                            setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "No Account is registered with these credentials");
                        }
                        Connect.close();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });

        btn_gotoEnroll = new JButton("ENROLL");
        btn_gotoEnroll.setBounds(400, 440, 300, 35);
        setVisible(true);
        add(btn_gotoEnroll);
        btn_gotoEnroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btn_gotoEnroll) {
                    Main.StudentInfoFrame obj = new Main.StudentInfoFrame();
                    obj.enroll();
                    setVisible(true);
                    setBackground(Color.PINK);
                }
            }
        });
    }
}