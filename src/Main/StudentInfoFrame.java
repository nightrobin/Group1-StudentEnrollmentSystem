package Main;

import java.awt.*;

public class StudentInfoFrame {
    public void enroll() {
        StudentInfo frame = new StudentInfo();
        frame.setTitle("STUDENT APPLICATION");
        frame.setVisible(true);
        frame.setBounds(10, 10, 430, 700);
        frame.setResizable(false);
        frame.setBackground(Color.pink);

    }
}
