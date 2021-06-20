package Main;

import javax.swing.*;

public class StudentInfo {
    public void enroll() {
        StudentInfoFrame frame = new StudentInfoFrame();
        frame.setTitle("STUDENT APPLICATION");
        frame.setVisible(true);
        frame.setBounds(10, 10, 430, 650);
        frame.setResizable(true);
    }
}
