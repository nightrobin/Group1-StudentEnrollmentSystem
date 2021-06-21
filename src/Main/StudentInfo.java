package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentInfo extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel studentInfo = new JLabel("STUDENT INFORMATION");
    JLabel studentNum = new JLabel("Student Number:");
    JTextField studentNumTextField = new JTextField();
    JLabel studentFN = new JLabel("First Name:");
    JTextField studentFNTextField = new JTextField();
    JLabel studentMN = new JLabel("Middle Name:");
    JTextField studentMNTextField = new JTextField();
    JLabel studentLN = new JLabel("Last Name:");
    JTextField studentLNTextField = new JTextField();
    JLabel studentS = new JLabel("Sex:");
    JTextField studentSTextField = new JTextField();
    JLabel studentA = new JLabel("Age:");
    JTextField studentATextField = new JTextField();
    JLabel studentAdd = new JLabel("Address:");
    JTextField studentAddTextField = new JTextField();
    JLabel studentBP = new JLabel("Birth Place:");
    JTextField studentBPTextField = new JTextField();
    JLabel studentFaN = new JLabel("Father's Name");
    JTextField studentFaNTextField = new JTextField();
    JLabel studentMoN = new JLabel("Mother's Name:");
    JTextField studentMoNTextField = new JTextField();
    JLabel studentGWA = new JLabel("GWA:");
    JTextField studentGWATextField = new JTextField();
    JLabel studentEM = new JLabel("Email:");
    JTextField studentEMTextField = new JTextField();
    JLabel studentPW = new JLabel("Password:");
    JTextField studentPWTextField = new JTextField();
    JButton submitButton = new JButton("SUBMIT");
    JButton resetButton = new JButton("RESET");

    public StudentInfo() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        studentInfo.setBounds(145, 40, 200, 30);
        studentNum.setBounds(60, 90, 100, 30);
        studentNumTextField.setBounds(180, 90, 200, 30);
        studentFN.setBounds(60, 130, 100, 30);
        studentFNTextField.setBounds(180, 130, 200, 30);
        studentMN.setBounds(60, 170, 100, 30);
        studentMNTextField.setBounds(180, 170, 200, 30);
        studentLN.setBounds(60, 210, 100, 30);
        studentLNTextField.setBounds(180, 210, 200, 30);
        studentS.setBounds(60, 250, 100, 30);
        studentSTextField.setBounds(180, 250, 200, 30);
        studentA.setBounds(60, 290, 100, 30);
        studentATextField.setBounds(180, 290, 200, 30);
        studentAdd.setBounds(60, 330, 100, 30);
        studentAddTextField.setBounds(180, 330, 200, 30);
        studentBP.setBounds(60, 370, 100, 30);
        studentBPTextField.setBounds(180, 370, 200, 30);
        studentFaN.setBounds(60, 410, 100, 30);
        studentFaNTextField.setBounds(180, 410, 200, 30);
        studentMoN.setBounds(60, 450, 100, 30);
        studentMoNTextField.setBounds(180, 450, 200, 30);
        studentGWA.setBounds(60, 490, 100, 30);
        studentGWATextField.setBounds(180, 490, 200, 30);
        studentEM.setBounds(60, 530, 100, 30);
        studentEMTextField.setBounds(180, 530, 200, 30);
        studentPW.setBounds(60, 570, 100, 30);
        studentPWTextField.setBounds(180, 570, 200, 30);
        submitButton.setBounds(100, 620, 100, 40);
        resetButton.setBounds(230, 620, 100, 40);
    }

    public void addComponentsToContainer() {
        container.add(studentInfo);
        container.add(studentNum);
        container.add(studentNumTextField);
        container.add(studentFN);
        container.add(studentFNTextField);
        container.add(studentMN);
        container.add(studentMNTextField);
        container.add(studentLN);
        container.add(studentLNTextField);
        container.add(studentS);
        container.add(studentSTextField);
        container.add(studentA);
        container.add(studentATextField);
        container.add(studentAdd);
        container.add(studentAddTextField);
        container.add(studentBP);
        container.add(studentBPTextField);
        container.add(studentFaN);
        container.add(studentFaNTextField);
        container.add(studentMoN);
        container.add(studentMoNTextField);
        container.add(studentGWA);
        container.add(studentGWATextField);
        container.add(studentEM);
        container.add(studentEMTextField);
        container.add(studentPW);
        container.add(studentPWTextField);
        container.add(submitButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        resetButton.addActionListener(this);
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String email = studentEMTextField.getText();
            String password = studentPWTextField.getText();

            if (studentNumTextField.getText().trim().isEmpty() || studentFNTextField.getText().trim().isEmpty() ||
                    studentMNTextField.getText().trim().isEmpty() || studentLNTextField.getText().trim().isEmpty() ||
                    studentSTextField.getText().trim().isEmpty() || studentATextField.getText().trim().isEmpty() ||
                    studentAddTextField.getText().trim().isEmpty() || studentBPTextField.getText().trim().isEmpty() ||
                    studentFaNTextField.getText().trim().isEmpty() || studentMoNTextField.getText().trim().isEmpty() ||
                    studentGWATextField.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "All fields should not be empty");
                return;
            }
            else
            {
                try
                {
                    Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentenrollment", "root", "PLMpurposes1234");
                    String SelectQ = "select * from enrollee where email = '" + email + "' and password = '" + password + "'";
                    Statement statement = Connect.createStatement();
                    ResultSet resultSet = statement.executeQuery(SelectQ);
                    if (resultSet.next())
                    {
                        JOptionPane.showMessageDialog(null,"Student is already enrolled");
                    }
                    else
                    {
                        String InsertQ = "insert into enrollee(email, password) values('"+email+"','"+password+"')";
                        statement.executeUpdate(InsertQ);

                        JOptionPane.showMessageDialog(null, "Student Enrolled");
                    }
                    Connect.close();
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
        }

        if (e.getSource() == resetButton) {
            studentNumTextField.setText("");
            studentFNTextField.setText("");
            studentMNTextField.setText("");
            studentLNTextField.setText("");
            studentSTextField.setText("");
            studentATextField.setText("");
            studentAddTextField.setText("");
            studentBPTextField.setText("");
            studentFaNTextField.setText("");
            studentMoNTextField.setText("");
            studentGWATextField.setText("");
            studentEMTextField.setText("");
            studentPWTextField.setText("");
            return;
        }
    }
}
