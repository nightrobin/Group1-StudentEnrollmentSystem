package Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Home extends Login{
    JPanel homepage;
    public Home () {
        setTitle("STUDENT ENROLLMENT SYSTEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 1100, 700);
        setResizable(false);
        homepage = new JPanel();
        homepage.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(homepage);
        homepage.setLayout(null);
        setBackground(Color.PINK);
        //ayaw gumana ng bg color sa'kin, try mo ikaw mag palit kenyon.
    }
}
