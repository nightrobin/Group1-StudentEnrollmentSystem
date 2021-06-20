package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfoFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel studentInfo = new JLabel ("STUDENT INFORMATION");
    JLabel studentNum = new JLabel ("Student Number:");
    JTextField studentNumTextField = new JTextField();
    JLabel studentFN = new JLabel ("First Name:");
    JTextField studentFNTextField = new JTextField();
    JLabel studentMN = new JLabel ("Middle Name:");
    JTextField studentMNTextField = new JTextField();
    JLabel studentLN = new JLabel ("Last Name:");
    JTextField studentLNTextField = new JTextField();
    JLabel studentS = new JLabel ("Sex:");
    JTextField studentSTextField = new JTextField();
    JLabel studentA = new JLabel ("Age:");
    JTextField studentATextField = new JTextField();
    JLabel studentAdd = new JLabel ("Address:");
    JTextField studentAddTextField = new JTextField();
    JLabel studentBP = new JLabel ("Birth Place:");
    JTextField studentBPTextField = new JTextField();
    JLabel studentFaN = new JLabel ("Father's Name");
    JTextField studentFaNTextField = new JTextField();
    JLabel studentMoN = new JLabel ("Mother's Name:");
    JTextField studentMoNTextField = new JTextField();
    JLabel studentGWA = new JLabel ("GWA:");
    JTextField studentGWATextField = new JTextField();
    JButton submitButton = new JButton ("SUBMIT");
    JButton resetButton = new JButton ("RESET");

    public StudentInfoFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        studentInfo.setBounds(600,40, 200,30);
        studentNum.setBounds(60,90, 100,30);
        studentNumTextField.setBounds(180,90, 200,30);
        studentFN.setBounds(60,130, 100,30);
        studentFNTextField.setBounds(180,130, 200,30);
        studentMN.setBounds(60,170, 100,30);
        studentMNTextField.setBounds(180,170, 200,30);
        studentLN.setBounds(60,210, 100,30);
        studentLNTextField.setBounds(180,210, 200,30);
        studentS.setBounds(60,250, 100,30);
        studentSTextField.setBounds(180,250, 200,30);
        studentA.setBounds(60,290, 100,30);
        studentATextField.setBounds(180,290, 200,30);
        studentAdd.setBounds(60,330, 100,30);
        studentAddTextField.setBounds(180,330, 200,30);
        studentBP.setBounds(60,370, 100,30);
        studentBPTextField.setBounds(180,370, 200,30);
        studentFaN.setBounds(60,410, 100,30);
        studentFaNTextField.setBounds(180,410, 200,30);
        studentMoN.setBounds(60,450, 100,30);
        studentMoNTextField.setBounds(180,450, 200,30);
        studentGWA.setBounds(60,490, 100,30);
        studentGWATextField.setBounds(180,490, 200,30);
        submitButton.setBounds(50,540,100, 40);
        resetButton.setBounds(200,540,100, 40);
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
        container.add(submitButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String studentNum;
            String studentFN;
            String studentMN;
            String studentLN;
            String studentS;
            String studentA;
            String studentAdd;
            String studentBP;
            String studentFaN;
            String studentMoN;
            String studentGWA;
            studentNum = studentNumTextField.getText();
            studentFN = studentFNTextField.getText();
            studentMN = studentMNTextField.getText();
            studentLN = studentLNTextField.getText();
            studentS = studentSTextField.getText();
            studentA = studentATextField.getText();
            studentAdd = studentAddTextField.getText();
            studentBP = studentBPTextField.getText();
            studentFaN = studentFaNTextField.getText();
            studentMoN = studentMoNTextField.getText();
            studentGWA = studentGWATextField.getText();
            if (studentNumTextField.getText().trim().isEmpty() || studentFNTextField.getText().trim().isEmpty() || studentMNTextField.getText().trim().isEmpty() ||
                    studentLNTextField.getText().trim().isEmpty() || studentSTextField.getText().trim().isEmpty() || studentATextField.getText().trim().isEmpty() ||
                    studentAddTextField.getText().trim().isEmpty() || studentBPTextField.getText().trim().isEmpty() || studentFaNTextField.getText().trim().isEmpty() ||
                    studentMoNTextField.getText().trim().isEmpty() || studentGWATextField.getText().trim().isEmpty()){

                JOptionPane.showMessageDialog(this, "All fields should not be empty");
                return;
            }
            else{
                JOptionPane.showMessageDialog(this, "You are officially enrolled!");
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
            return;
        }
    }
}

