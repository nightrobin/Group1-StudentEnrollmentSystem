
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        JFrame f=new JFrame();//creating instance of JFrame

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        tf.setText("Welcome to Javatpoint.");

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

        String firstName;
        Scanner fName =  new Scanner(System.in);
        System.out.println("Enter First Name here...");
        firstName = fName.nextLine();
        System.out.println("====================================");


        String lastName;
        Scanner lName =  new Scanner(System.in);
        System.out.println("Enter Last Name here...");
        lastName = lName.nextLine();
        System.out.println("====================================");


        String middleName;
        Scanner mName =  new Scanner(System.in);
        System.out.println("Enter Middle Name here...");
        middleName = mName.nextLine();
        System.out.println("====================================");

        String address;
        Scanner add = new Scanner(System.in);
        System.out.println("Enter Address here...");
        address = add.nextLine();
        System.out.println("====================================");

        String nameOfFather;
        Scanner nOF = new Scanner(System.in);
        System.out.println("Enter your Father's name here...");
        nameOfFather = nOF.nextLine();
        System.out.println("====================================");

        String nameOfMother;
        Scanner nOM = new Scanner(System.in);
        System.out.println("Enter your Mother's name here...");
        nameOfMother = nOM.nextLine();
        System.out.println("====================================");

        String studentNo;
        Scanner sNo = new Scanner(System.in);
        System.out.println("Student number...");
        studentNo = sNo.nextLine();
        System.out.println("====================================");

        int grade;
        Scanner gr = new Scanner(System.in);
        System.out.println("Your GWA last S.Y.");
        grade = Integer.parseInt(gr.nextLine());
        System.out.println("====================================");
    }
}
