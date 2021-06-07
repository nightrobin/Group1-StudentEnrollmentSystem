
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Java Swing

        JFrame f=new JFrame();//creating instance of JFrame

        // labels
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
        l=new JLabel("Student Information");
        l.setBounds(35,40, 200,30);
        l1=new JLabel("Student Number:");
        l1.setBounds(60,90, 100,30);
        l2=new JLabel("First Name:");
        l2.setBounds(60,130, 100,30);
        l3=new JLabel("Middle Name:");
        l3.setBounds(60,170, 100,30);
        l4=new JLabel("Last Name:");
        l4.setBounds(60,210, 100,30);
        l5=new JLabel("Sex:");
        l5.setBounds(60,250, 100,30);
        l6=new JLabel("Age:");
        l6.setBounds(60,290, 100,30);
        l7=new JLabel("Address:");
        l7.setBounds(60,330, 100,30);
        l8=new JLabel("Birth Place:");
        l8.setBounds(60,370, 100,30);
        l9=new JLabel("Father's Name:");
        l9.setBounds(60,410, 100,30);
        l10=new JLabel("Mother's Name:");
        l10.setBounds(60,450, 100,30);
        l11=new JLabel("GWA:");
        l11.setBounds(60,490, 100,30);
        f.add(l); f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(l7); f.add(l8); f.add(l9); f.add(l10); f.add(l11);

        // text fields
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
        t1=new JTextField("Enter student number here...");
        t1.setBounds(180,90, 200,30);
        t2=new JTextField("Enter first name here...");
        t2.setBounds(180,130, 200,30);
        t3=new JTextField("Enter middle name here...");
        t3.setBounds(180,170, 200,30);
        t4=new JTextField("Enter last name here...");
        t4.setBounds(180,210, 200,30);
        t5=new JTextField("Enter sex here...");
        t5.setBounds(180,250, 200,30);
        t6=new JTextField("Enter age here...");
        t6.setBounds(180,290, 200,30);
        t7=new JTextField("Enter address here...");
        t7.setBounds(180,330, 200,30);
        t8=new JTextField("Enter birth place here...");
        t8.setBounds(180,370, 200,30);
        t9=new JTextField("Enter father's name here...");
        t9.setBounds(180,410, 200,30);
        t10=new JTextField("Enter mother's name here...");
        t10.setBounds(180,450, 200,30);
        t11=new JTextField("Enter GWA here...");
        t11.setBounds(180,490, 200,30);
        f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5); f.add(t6); f.add(t7); f.add(t8); f.add(t9); f.add(t10); f.add(t11);

        // button
        JButton b=new JButton("Submit");//creating instance of JButton
        b.setBounds(280,430,100, 40);//x axis, y axis, width, height
        f.add(b);//adding button in JFrame

        f.setSize(440,580);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible


        // Main code

        String studentNo;
        Scanner sNo = new Scanner(System.in);
        System.out.println("Student number...");
        studentNo = sNo.nextLine();
        System.out.println("====================================");

        String firstName;
        Scanner fName =  new Scanner(System.in);
        System.out.println("Enter First Name here...");
        firstName = fName.nextLine();
        System.out.println("====================================");

        String middleName;
        Scanner mName =  new Scanner(System.in);
        System.out.println("Enter Middle Name here...");
        middleName = mName.nextLine();
        System.out.println("====================================");

        String lastName;
        Scanner lName =  new Scanner(System.in);
        System.out.println("Enter Last Name here...");
        lastName = lName.nextLine();
        System.out.println("====================================");

        String sex;
        Scanner sx = new Scanner(System.in);
        System.out.println("Sex...");
        sex = sx.nextLine();
        System.out.println("====================================");

        int age;
        Scanner ag = new Scanner(System.in);
        System.out.println("Age...");
        age = ag.nextInt();
        System.out.println("====================================");

        String address;
        Scanner add = new Scanner(System.in);
        System.out.println("Enter Address here...");
        address = add.nextLine();
        System.out.println("====================================");

        String placeOfBirth;
        Scanner pOB = new Scanner(System.in);
        System.out.println("Enter Birth Place here...");
        placeOfBirth = pOB.nextLine();
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

        int grade;
        Scanner gr = new Scanner(System.in);
        System.out.println("Your GWA last S.Y.");
        grade = Integer.parseInt(gr.nextLine());
        System.out.println("====================================");
    }
}
