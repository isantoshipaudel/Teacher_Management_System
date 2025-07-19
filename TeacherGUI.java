//importing libraries necessary for creating TeacherGUI
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class TeacherGUI{
    
  static ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    
    
    public static void main(String[]Args){
        TeacherGUI teacherGUI = new TeacherGUI();
                //Creating the JFrame,SettingSize and setting visibility to true
                 JFrame home = new JFrame("Teacher GUI");
                 home.setSize(1600, 1600);
                 home.getContentPane().setBackground(new Color(3,37,76));
                 home.setLayout(null);
                 
            
        
                 ImageIcon imageicon = new ImageIcon("Java.jpeg");
                 // Create a JLabel with the image
                 JLabel background = new JLabel(imageicon);
                 // Set size and position of the JLabel to cover the whole frame
                 background.setBounds(0, 0, 650, 1000);
                 // Add the JLabel to the background of the frame
                 home.add(background);
                 background.setVisible(true);
                 // Make the frame visible
                 home.setVisible(true);
                 
                 JLabel home1= new JLabel("WELCOME!");
                 Font Home1= new Font("Dialog", Font.BOLD, 30);//Creating the Font for JLabel 
                 home1.setFont(Home1);//Setting the font of the heading
                 home1.setBounds(950,100,200,200);//Managing size and loction of the heading
                 home1.setForeground(new Color(255,255,255));
                 home.add(home1);
                 
                 JLabel wel= new JLabel("!!Here is the Teacher GUI!! ");
                 Font Wel= new Font("Dialog", Font.BOLD, 22);//Creating the Font for JLabel 
                 wel.setFont(Wel);//Setting the font of the heading
                 wel.setBounds(880,160,330,150);//Managing size and loction of the heading
                 wel.setForeground(new Color(255,255,255));
                 home.add(wel);
                 
                 JLabel enter= new JLabel("Click button of your choice to direct either to the Lecturer Or Tutor GUI");
                 Font Enter= new Font("Dialog", Font.BOLD, 18);//Creating the Font for JLabel 
                 enter.setFont(Enter);//Setting the font of the heading
                 Color ENTER= new Color(0,200,200);//Creating the color for JLabel
                 enter.setForeground(ENTER);// Setting the color of the heading to blue
                 enter.setBounds(730,230,800,100);//Managing size and loction of the heading
                 home.add(enter);
                 
                 JButton GUI1 = new JButton("LECTURER");
                 GUI1.setBounds(950, 340, 250,55);
                 Font GuI1= new Font("Arial", Font.BOLD, 19);
                 GUI1.setFont(GuI1);
                 GUI1.setForeground(new Color(0,0,0));
                 home.add(GUI1);
                 
                 JButton GUI2 = new JButton("TUTOR");
                 GUI2.setBounds(950, 410, 250,55);
                 Font GuI2= new Font("Arial", Font.BOLD, 19);
                 GUI2.setFont(GuI2);
                 GUI2.setForeground(new Color(0,0,0));//Creating the color for JLabel
                 home.add(GUI2);
                 
                 
                 
                            
                 JFrame frame= new JFrame("Lecturer GUI");
                 frame.setSize(1600,1600);
                 frame.getContentPane().setBackground(new Color(3,37,76));
                 frame.setLayout(null);
                         
                    
                 
                 JFrame frame1= new JFrame("Tutor GUI");
                 frame1.setSize(1600,1600);
                 frame1.getContentPane().setBackground(new Color(3,37,76));
                 frame1.setLayout(null);
        
                 
                 JButton Back = new JButton("BACK");
                 Back.setBounds(30, 700, 150, 55);
                 Font back= new Font("Arial", Font.BOLD, 19);
                 Back.setFont(back);
                 Back.setForeground(new Color(0,0,0));
                 
                 JButton Back1 = new JButton("BACK");
                 Back1.setBounds(30, 720, 150, 55);
                 Font back1= new Font("Arial", Font.BOLD, 19);
                 Back1.setFont(back1);
                 Back1.setForeground(new Color(0,0,0));
                 
                 
                 GUI1.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                     
                     home.setVisible(!home.isVisible()); // Toggle visibility of the first frame
                     frame.setVisible(!frame.isVisible());
                     
                }
            });
                frame.add(Back);
                frame1.add(Back1);
                
                GUI2.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                     
                     home.setVisible(!home.isVisible()); // Toggle visibility of the first frame
                     frame1.setVisible(!frame1.isVisible());
                     
                }
            });
                
                Back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     
                     home.setVisible(!home.isVisible()); // Toggle visibility of the first frame
                     frame.setVisible(!frame.isVisible()); 
                     
                }
            });
            
            Back1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     
                     home.setVisible(!home.isVisible()); // Toggle visibility of the first frame
                     frame1.setVisible(!frame1.isVisible()); 
                     
                }
            });
                 
                 
                 JLabel add_lecturer= new JLabel("LECTURER");
                 Font add_Lecturer= new Font("Arial", Font.BOLD, 30);//Creating the Font for JLabel 
                 Color Add_lecturer= new Color(255,255,255);//Creating the color for JLabel
                 add_lecturer.setForeground(Add_lecturer);// Setting the color of the heading to blue
                 add_lecturer.setFont(add_Lecturer);//Setting the font of the heading
                 add_lecturer.setBounds(610,0,200,100);//Managing size and loction of the heading
                 frame.add(add_lecturer);
                 
                 
                 JLabel add_tutor= new JLabel("TUTOR");
                 Font add_Tutor= new Font("Arial", Font.BOLD, 30);//Creating the Font for JLabel 
                 Color Add_tutor= new Color(255,255,255);//Creating the color for JLabel
                 add_tutor.setForeground(Add_lecturer);// Setting the color of the heading to blue
                 add_tutor.setFont(add_Lecturer);//Setting the font of the heading
                 add_tutor.setBounds(610,0,200,100);//Managing size and loction of the heading
                 frame1.add(add_tutor);
                 
                 //Creating JLabel named Teacher ID 
                 JLabel ID= new JLabel("Teacher ID:");
                 Font id= new Font("Arial", Font.BOLD, 25);//Creating the Font for ID 
                 ID.setFont(id);//Setting the font of the Teacher ID
                 ID.setBounds(350,110,200,55);//Managing size and loction of the ID
                 ID.setForeground(new Color(255,215,0));
                 frame.add(ID);
                 
                 //Creating TextField For inserting TeacherID
                 JTextField IDs= new JTextField();
                 IDs.setBounds(700,110,450,40);
                 frame.add(IDs);
                    
                 
                 
                 JLabel NAME= new JLabel("Teacher Name:");
                 Font name= new Font("Arial", Font.BOLD, 25);//Creating the Font for teacher name 
                 NAME.setFont(name);//Setting the font of the Teacher name
                 NAME.setBounds(350,170,200,55);//Managing size and loction of the name
                 NAME.setForeground(new Color(255,215,0));
                 frame.add(NAME);
                 
                 //Creating TextField For inserting Teachername
                 JTextField Name= new JTextField();
                 Name.setBounds(700,170,450,40);
                 frame.add(Name);
                 
                 
                 
                 JLabel ADDRESS= new JLabel("Teacher Address:");
                 Font address= new Font("Arial", Font.BOLD, 25);//Creating the Font for Teacher Address 
                 ADDRESS.setFont(address);//Setting the font of the Teacher Address
                 ADDRESS.setBounds(350,220,450,55);//Managing size and loction of the Address
                 ADDRESS.setForeground(new Color(255,215,0));
                 frame.add(ADDRESS);
                 
                 //Creating TextField For inserting TeacherAddress
                 JTextField Address= new JTextField();
                 Address.setBounds(700,220,450,40);
                 frame.add(Address);
                 
                 
                 
                 JLabel WORKING_TYPE= new JLabel("Working Type:");
                 Font working_type= new Font("Arial", Font.BOLD, 25);
                 WORKING_TYPE.setFont(working_type);
                 WORKING_TYPE.setBounds(350,280,200,55);
                 WORKING_TYPE.setForeground(new Color(255,215,0));
                 frame.add(WORKING_TYPE);
                 
                 //Creating TextField For inserting Teacher working type
                 JTextField Working_Type= new JTextField();
                 Working_Type.setBounds(700,280,450,40);
                 frame.add(Working_Type);
                 
                 
                 
                 JLabel EMPLOYMENT_STATUS= new JLabel("Employment Status:");
                 Font employment_status= new Font("Arial", Font.BOLD, 25);
                 EMPLOYMENT_STATUS.setFont(employment_status);
                 EMPLOYMENT_STATUS.setBounds(350,340,450,55);
                 EMPLOYMENT_STATUS.setForeground(new Color(255,215,0));
                 frame.add(EMPLOYMENT_STATUS);
                 
                 //Creating TextField For inserting Teacher employment status
                 JTextField Employment_status= new JTextField();
                 Employment_status.setBounds(700,340,450,40);
                 frame.add(Employment_status);
                 
                 
                 
                 JLabel GRADED_SCORE= new JLabel("Graded Score:");
                 Font graded_score= new Font("Arial", Font.BOLD, 25);
                 GRADED_SCORE.setFont(graded_score);
                 GRADED_SCORE.setBounds(350,400,200,55);
                 GRADED_SCORE.setForeground(new Color(255,215,0));
                 frame.add(GRADED_SCORE);
                 
                 //Creating TextField For inserting graded_score
                 JTextField Graded_score= new JTextField();
                 Graded_score.setBounds(700,400,450,40);
                 frame.add(Graded_score);
                 
                 
                 
                 JLabel YEARS_OF_EXPERIENCE= new JLabel("YearsOf Experience:");
                 Font years_of_experience= new Font("Arial", Font.BOLD, 23); 
                 YEARS_OF_EXPERIENCE.setFont(years_of_experience);
                 YEARS_OF_EXPERIENCE.setBounds(350,460,500,55);
                 YEARS_OF_EXPERIENCE.setForeground(new Color(255,215,0));
                 frame.add(YEARS_OF_EXPERIENCE);
                 
                 //Creating TextField For inserting YearsOf Experience
                 JTextField Years_of_experience= new JTextField();
                 Years_of_experience.setBounds(700,460,450,40);
                 frame.add(Years_of_experience);
                 
                 
                 
                 JLabel DEPARTMENT= new JLabel("Department:");
                 Font department= new Font("Arial", Font.BOLD, 25); 
                 DEPARTMENT.setFont(years_of_experience);
                 DEPARTMENT.setBounds(350,510,200,55);
                 DEPARTMENT.setForeground(new Color(255,215,0));
                 frame.add(DEPARTMENT);
                 
                 //Creating TextField For inserting Department
                 JTextField Department= new JTextField();
                 Department.setBounds(700,520,450,40);
                 frame.add(Department);
                 
                 JButton addLecturer = new JButton("ADD LECTURER");
                 addLecturer.setBounds(400, 600, 200,60);
                 Font AddLecturer= new Font("Arial", Font.BOLD, 19);
                 addLecturer.setFont(AddLecturer);
                 addLecturer.setForeground(new Color(0,0,0));
                 frame.add(addLecturer);
                 
        
                 JButton GRADE_ASSIGNMENT1 = new JButton("GRADE ASSIGNMENT");
                 GRADE_ASSIGNMENT1.setBounds(630, 600, 230,60);
                 Font grade_assignment1= new Font("Arial", Font.BOLD, 19);
                 GRADE_ASSIGNMENT1.setFont(grade_assignment1);
                 GRADE_ASSIGNMENT1.setForeground(new Color(0,0,0));
                 frame.add(GRADE_ASSIGNMENT1);
                 
        
                // Create a JPanel
                JPanel panel1 = new JPanel(); // Set background color of JPanel
                panel1.setBackground(new Color(0,0,51));
                panel1.setBounds(300, 100, 1000, 500);
                panel1.setVisible(false);
                panel1.setLayout(null);

                
                
                 JButton Back2 = new JButton("BACK");
                 Back2.setBounds(10, 420, 150, 55);
                 Font back2= new Font("Arial", Font.BOLD, 19);
                 Back2.setFont(back2);
                 Back2.setForeground(new Color(3,37,76));
                 panel1.add(Back2);
                 
                 JButton Clear = new JButton("CLEAR");
                 Clear.setBounds(1060, 600, 150,60);
                 Font clear= new Font("Arial", Font.BOLD, 19);
                 Clear.setFont(clear);
                 Clear.setForeground(new Color(0,0,0));
                 frame.add(Clear);
                 
                 //Creating JButton Display
                 JButton Display = new JButton("DISPLAY");
                 Display.setBounds(885, 600, 150,60);
                 Font display= new Font("Arial", Font.BOLD, 19);
                 Display.setFont(display);
                 Display.setForeground(new Color(0,0,0));
                 frame.add(Display);
                 

                   
                 //Creating JLabel named Teacher ID 
                 JLabel ID1= new JLabel("Teacher ID:");
                 Font id1= new Font("Arial", Font.BOLD, 25);//Creating the Font for ID 
                 ID1.setFont(id1);//Setting the font of the Teacher ID
                 ID1.setBounds(150,60,200,55);//Managing size and loction of the ID
                 Color panels1= new Color(255,215,0);//Creating the color for JLabel
                 ID1.setForeground(panels1);
                 panel1.add(ID1);
                 
                 //Creating TextField For inserting TeacherID
                 JTextField IDs1= new JTextField();
                 IDs1.setBounds(400,70,450,40);
                 panel1.add(IDs1);
                 
                GRADE_ASSIGNMENT1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Toggle visibility of panel1 and Back2
                    panel1.setVisible(!panel1.isVisible());
                    Back2.setVisible(!Back2.isVisible());
                    
                    // Hide other components
                    ID.setVisible(false);
                    IDs.setVisible(false);
                    Name.setVisible(false);
                    NAME.setVisible(false);
                    ADDRESS.setVisible(false);
                    Address.setVisible(false);
                    WORKING_TYPE.setVisible(false);
                    Working_Type.setVisible(false);
                    GRADED_SCORE.setVisible(false);
                    Graded_score.setVisible(false);
                    YEARS_OF_EXPERIENCE.setVisible(false);
                    Years_of_experience.setVisible(false);
                    DEPARTMENT.setVisible(false);
                    Department.setVisible(false);
                    addLecturer.setVisible(false);
                    GRADE_ASSIGNMENT1.setVisible(false);
                    Clear.setVisible(false);
                    Display.setVisible(false);
                    EMPLOYMENT_STATUS.setVisible(false);
                    Employment_status.setVisible(false);
                    
                    Back2.setVisible(true);
                    ID1.setVisible(true);
                    IDs1.setVisible(true);
                }
            });
            
            panel1.add(Back2); // Add Back2 button to panel1
            
            frame.add(panel1);

                
                Back2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Toggle visibility of panel1 and Back2
                        panel1.setVisible(!panel1.isVisible());
                        Back2.setVisible(!Back2.isVisible());
                        
                    ID.setVisible(true);
                    IDs.setVisible(true);
                    Name.setVisible(true);
                    NAME.setVisible(true);
                    ADDRESS.setVisible(true);
                    Address.setVisible(true);
                    WORKING_TYPE.setVisible(true);
                    Working_Type.setVisible(true);
                    GRADED_SCORE.setVisible(true);
                    Graded_score.setVisible(true);
                    YEARS_OF_EXPERIENCE.setVisible(true);
                    Years_of_experience.setVisible(true);
                    DEPARTMENT.setVisible(true);
                    Department.setVisible(true);
                    addLecturer.setVisible(true);
                    GRADE_ASSIGNMENT1.setVisible(true);
                    Clear.setVisible(true);
                    Display.setVisible(true);
                    EMPLOYMENT_STATUS.setVisible(true);
                    Employment_status.setVisible(true);
                    
                    panel1.setVisible(false);
                        
                        
                    }
                });
                
        
                 JLabel assignment= new JLabel("Please Fill the Text Fields Given Below ");
                 Font Assignment= new Font("Arial", Font.BOLD, 25);//Creating the Font for JLabel 
                 Color Assignments= new Color(0,200,200);//Creating the color for JLabel
                 assignment.setForeground(Assignments);// Setting the color of the heading to blue
                 assignment.setFont(Assignment);//Setting the font of the heading
                 assignment.setBounds(250,10,500,50);//Managing size and loction of the heading
                 panel1.add(assignment);
                 
                 
                  
                 JLabel GRADED_SCORE1= new JLabel("Graded Score:");
                 Font graded_score1= new Font("Arial", Font.BOLD, 25);
                 GRADED_SCORE1.setFont(graded_score1);
                 GRADED_SCORE1.setBounds(150,110,200,55);
                 GRADED_SCORE1.setForeground( new Color(255,215,0));
                 panel1.add(GRADED_SCORE1);
                 
                 
                 JTextField Graded_score1= new JTextField();
                 Graded_score1.setBounds(400,110,450,40);
                 panel1.add(Graded_score1);
                 
                 JLabel DEPARTMENT1= new JLabel("Department:");
                 Font department1= new Font("Arial", Font.BOLD, 25);
                 DEPARTMENT1.setFont(department1);
                 DEPARTMENT1.setBounds(150,160,200,55);
                 DEPARTMENT1.setForeground( new Color(255,215,0));
                 panel1.add(DEPARTMENT1);
                 
                 
                 JTextField Department1= new JTextField();
                 Department1.setBounds(400,160,450,40);
                 panel1.add(Department1);
                 
                 
                 JLabel YEARS_OF_EXPERIENCE1= new JLabel("YearsOf Experience:");
                 Font years_of_experience1= new Font("Arial", Font.BOLD, 25);
                 YEARS_OF_EXPERIENCE1.setFont(years_of_experience1);
                 YEARS_OF_EXPERIENCE1.setBounds(150,210,400,55);
                 YEARS_OF_EXPERIENCE1.setForeground( new Color(255,215,0));
                 panel1.add(YEARS_OF_EXPERIENCE1);
                 
                 
                 JTextField Years_of_experience1= new JTextField();
                 Years_of_experience1.setBounds(400,210,450,40);
                 panel1.add(Years_of_experience1);
                 
                 
                 
                 JButton GRADE_ASSIGNMENT = new JButton("GRADE ASSIGNMENT");
                 GRADE_ASSIGNMENT.setBounds(290, 270, 230,60);
                 Font grade_assignment= new Font("Arial", Font.BOLD, 19);
                 GRADE_ASSIGNMENT.setFont(grade_assignment);
                 GRADE_ASSIGNMENT.setForeground(new Color(3,37,76));
                 panel1.add(GRADE_ASSIGNMENT);
                 
                 
                 JButton Clear1 = new JButton("CLEAR");
                 Clear1.setBounds(550, 270, 150,60);
                 Font clear1= new Font("Arial", Font.BOLD, 19);
                 Clear1.setFont(clear1);
                 Clear1.setForeground(new Color(3,37,76));
                 panel1.add(Clear1);
                 
                 
                  //Creating JLabel named Teacher ID 
                 JLabel ID2= new JLabel("Teacher ID:");
                 Font id2= new Font("Arial", Font.BOLD, 25);//Creating the Font for ID 
                 ID2.setFont(id2);//Setting the font of the Teacher ID
                 ID2.setBounds(350,110,200,55);//Managing size and loction of the ID
                 ID2.setForeground(new Color(255,215,0));
                 frame1.add(ID2);
                 
                 //Creating TextField For inserting TeacherID
                 JTextField IDs2= new JTextField();
                 IDs2.setBounds(700,110,450,40);
                 frame1.add(IDs2);
                    
                 
                 
                 JLabel NAME1= new JLabel("Teacher Name:");
                 Font name1= new Font("Arial", Font.BOLD, 25);//Creating the Font for teacher name 
                 NAME1.setFont(name);//Setting the font of the Teacher name
                 NAME1.setBounds(350,170,200,55);//Managing size and loction of the name
                 NAME1.setForeground(new Color(255,215,0));
                 frame1.add(NAME1);
                 
                 //Creating TextField For inserting Teachername
                 JTextField Name1= new JTextField();
                 Name1.setBounds(700,170,450,40);
                 frame1.add(Name1);
                 
                 
                 
                 JLabel ADDRESS1= new JLabel("Teacher Address:");
                 Font address1= new Font("Arial", Font.BOLD, 25);//Creating the Font for Teacher Address 
                 ADDRESS1.setFont(address1);//Setting the font of the Teacher Address
                 ADDRESS1.setBounds(350,220,450,55);//Managing size and loction of the Address
                 ADDRESS1.setForeground(new Color(255,215,0));
                 frame1.add(ADDRESS1);
                 
                 //Creating TextField For inserting TeacherAddress
                 JTextField Address1= new JTextField();
                 Address1.setBounds(700,220,450,40);
                 frame1.add(Address1);
                 
                 
                 
                 JLabel WORKING_TYPE1= new JLabel("Working Type:");
                 Font working_type1= new Font("Arial", Font.BOLD, 25);
                 WORKING_TYPE1.setFont(working_type1);
                 WORKING_TYPE1.setBounds(350,280,200,55);
                 WORKING_TYPE1.setForeground(new Color(255,215,0));
                 frame1.add(WORKING_TYPE1);
                 
                 //Creating TextField For inserting Teacher working type
                 JTextField Working_Type1= new JTextField();
                 Working_Type1.setBounds(700,280,450,40);
                 frame1.add(Working_Type1);
                 
                 
                 
                 JLabel EMPLOYMENT_STATUS1= new JLabel("Employment Status:");
                 Font employment_status1= new Font("Arial", Font.BOLD, 25);
                 EMPLOYMENT_STATUS1.setFont(employment_status1);
                 EMPLOYMENT_STATUS1.setBounds(350,340,450,55);
                 EMPLOYMENT_STATUS1.setForeground(new Color(255,215,0));
                 frame1.add(EMPLOYMENT_STATUS1);
                 
                 //Creating TextField For inserting Teacher employment status
                 JTextField Employment_status1= new JTextField();
                 Employment_status1.setBounds(700,340,450,40);
                 frame1.add(Employment_status1);
                 
                 
                 
                 JLabel WORKING_HOUR= new JLabel("Working Hours:");
                 Font working_hour= new Font("Arial", Font.BOLD, 25);
                 WORKING_HOUR.setFont(working_hour);
                 WORKING_HOUR.setBounds(350,400,200,55);
                 WORKING_HOUR.setForeground(new Color(255,215,0));
                 frame1.add(WORKING_HOUR);
                 
                 //Creating TextField For inserting Working Hours
                 JTextField Working_hour= new JTextField();
                 Working_hour.setBounds(700,400,450,40);
                 frame1.add(Working_hour);
                 
                 
                 
                 JLabel SALARY= new JLabel("Salary:");
                 Font salary= new Font("Arial", Font.BOLD, 23); 
                 SALARY.setFont(salary);
                 SALARY.setBounds(350,460,500,55);
                 SALARY.setForeground(new Color(255,215,0));
                 frame1.add(SALARY);
                 
                 //Creating TextField For inserting Salary 
                 JTextField Salary= new JTextField();
                 Salary.setBounds(700,460,450,40);
                 frame1.add(Salary);
                 
                 
                 
                 JLabel SPECIALIZATION= new JLabel("Specialization:");
                 Font specialization= new Font("Arial", Font.BOLD, 25); 
                 SPECIALIZATION.setFont(specialization);
                 SPECIALIZATION.setBounds(350,510,200,55);
                 SPECIALIZATION.setForeground(new Color(255,215,0));
                 frame1.add(SPECIALIZATION);
                 
                 //Creating TextField For inserting Specialization
                 JTextField Specialization= new JTextField();
                 Specialization.setBounds(700,520,450,40);
                 frame1.add(Specialization);
                 
                 
                 JLabel QUALIFICATIONS= new JLabel("Qualifications:");
                 Font qualifications= new Font("Arial", Font.BOLD, 25); 
                 QUALIFICATIONS.setFont(qualifications);
                 QUALIFICATIONS.setBounds(350,570,200,55);
                 QUALIFICATIONS.setForeground(new Color(255,215,0));
                 frame1.add(QUALIFICATIONS);
                 
                 //Creating TextField For inserting qualifications
                 JTextField Qualifications= new JTextField();
                 Qualifications.setBounds(700,580,450,40);
                 frame1.add(Qualifications);
                 
                 JLabel INDEX= new JLabel("Performance Index:");
                 Font index= new Font("Arial", Font.BOLD, 25); 
                 INDEX.setFont(index);
                 INDEX.setBounds(350,630,500,55);
                 INDEX.setForeground(new Color(255,215,0));
                 frame1.add(INDEX);
                 
                 //Creating TextField For inserting index
                 JTextField Index= new JTextField();
                 Index.setBounds(700,630,450,40);
                 frame1.add(Index);
                 
                 
                
                 JButton addTutor = new JButton("ADD TUTOR");
                 addTutor.setBounds(400, 700, 200,60);
                 Font AddTutor= new Font("Arial", Font.BOLD, 19);
                 addTutor.setFont(AddTutor);
                 addTutor.setForeground(new Color(0,0,0));
                 frame1.add(addTutor);
                 
                 JButton SET = new JButton("SET SALARY");
                 SET.setBounds(620, 700, 200,60);
                 Font set= new Font("Arial", Font.BOLD, 19);
                 SET.setFont(set);
                 SET.setForeground(new Color(0,0,0));
                 frame1.add(SET);
                 
                 JButton REMOVE = new JButton("REMOVE TUTOR");
                 REMOVE.setBounds(833, 700, 200,60);
                 Font remove= new Font("Arial", Font.BOLD, 19);
                 REMOVE.setFont(remove);
                 REMOVE.setForeground(new Color(0,0,0));
                 frame1.add(REMOVE);
                 
                 JButton DISPLAY1 = new JButton("DISPLAY");
                 DISPLAY1.setBounds(1050, 700, 150,60);
                 Font display1= new Font("Arial", Font.BOLD, 19);
                 DISPLAY1.setFont(display1);
                 DISPLAY1.setForeground(new Color(0,0,0));
                 frame1.add(DISPLAY1);
                 
                 JButton CLEAR2 = new JButton("CLEAR");
                 CLEAR2.setBounds(1220, 700, 150,60);
                 Font clear2= new Font("Arial", Font.BOLD, 19);
                 CLEAR2.setFont(clear2);
                 CLEAR2.setForeground(new Color(0,0,0));
                 frame1.add(CLEAR2);
                 
                 
                 // Create a JPanel
                JPanel panel2 = new JPanel(); // Set background color of JPanel
                panel2.setBackground(new Color(0, 0, 51));
                panel2.setBounds(300, 100, 1000, 500);
                panel2.setVisible(false);
                panel2.setLayout(null);

                
                
                 JButton Back3 = new JButton("BACK");
                 Back3.setBounds(10, 430, 150, 55);
                 Font back3= new Font("Arial", Font.BOLD, 19);
                 Back3.setFont(back3);
                 Back3.setForeground(new Color(3,37,76));
                 panel2.add(Back3);
                 
                 
                JPanel panel3 = new JPanel(); // Set background color of JPanel
                panel3.setBackground(new Color(0, 0, 51));
                panel3.setBounds(400, 100, 500, 300);
                panel3.setVisible(false);
                panel3.setLayout(null);

                
                
                 JButton Back4 = new JButton("BACK");
                 Back4.setBounds(10, 220, 150, 55);
                 Font back4= new Font("Arial", Font.BOLD, 19);
                 Back4.setFont(back4);
                 Back4.setForeground(new Color(3,37,76));
                 panel3.add(Back4);
                 
                 
                 JLabel set1= new JLabel("Please Fill the Text Fields Given Below ");
                 Font Sets1= new Font("Arial", Font.BOLD, 25);//Creating the Font for JLabel 
                 Color Set1= new Color(0,200,200);//Creating the color for JLabel
                 set1.setForeground(Set1);// Setting the color of the heading to blue
                 set1.setFont(Sets1);//Setting the font of the heading
                 set1.setBounds(250,10,500,50);//Managing size and loction of the heading
                 panel2.add(set1);
                 
                 JLabel set2= new JLabel("Please Fill Teacher ID ");
                 Font Sets2= new Font("Arial", Font.BOLD, 25);//Creating the Font for JLabel 
                 Color Set2= new Color(0,200,200);//Creating the color for JLabel
                 set2.setForeground(Set1);// Setting the color of the heading to blue
                 set2.setFont(Sets1);//Setting the font of the heading
                 set2.setBounds(75,10,500,50);//Managing size and loction of the heading
                 panel3.add(set2);
                 
                  //Creating JLabel named Teacher ID 
                 JLabel ID3= new JLabel("Teacher ID:");
                 Font id3= new Font("Arial", Font.BOLD, 25);//Creating the Font for ID 
                 ID3.setFont(id1);//Setting the font of the Teacher ID
                 ID3.setBounds(150,60,200,55);//Managing size and loction of the ID
                 Color panels3= new Color(255,215,0);//Creating the color for JLabel
                 ID3.setForeground(panels3);
                 panel2.add(ID3);
                 
                 //Creating TextField For inserting TeacherID
                 JTextField IDs3= new JTextField();
                 IDs3.setBounds(400,70,450,40);
                 panel2.add(IDs3);
                 
                  //Creating JLabel named Teacher ID 
                 JLabel ID4= new JLabel("Teacher ID:");
                 Font id4= new Font("Arial", Font.BOLD, 25);//Creating the Font for ID 
                 ID4.setFont(id4);//Setting the font of the Teacher ID
                 ID4.setBounds(30,60,200,55);//Managing size and loction of the ID
                 Color panels4= new Color(255,215,0);//Creating the color for JLabel
                 ID4.setForeground(panels4);
                 panel3.add(ID4);
                 
                 //Creating TextField For inserting TeacherID
                 JTextField IDs4= new JTextField();
                 IDs4.setBounds(200,70,200,40);
                 panel3.add(IDs4);
                 
                 JLabel SALARY1= new JLabel("Salary:");
                 Font salary1= new Font("Arial", Font.BOLD, 25);
                 SALARY1.setFont(salary1);
                 SALARY1.setBounds(150,110,200,55);
                 SALARY1.setForeground( new Color(255,215,0));
                 panel2.add(SALARY1);
                 
                 
                 JTextField Salary1= new JTextField();
                 Salary1.setBounds(400,110,450,40);
                 panel2.add(Salary1);
                 
                 JLabel INDEX1= new JLabel("Performance Index:");
                 Font index1= new Font("Arial", Font.BOLD, 25);
                 INDEX1.setFont(index1);
                 INDEX1.setBounds(150,160,400,55);
                 INDEX1.setForeground( new Color(255,215,0));
                 panel2.add(INDEX1);
                 
                 
                 JTextField Index1= new JTextField();
                 Index1.setBounds(400,160,450,40);
                 panel2.add(Index1);
                 
                 
                  SET.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Toggle visibility of panel2 and Back3
                    panel2.setVisible(!panel2.isVisible());
                    Back3.setVisible(!Back3.isVisible());
                    
                    // Hide other components
                    ID2.setVisible(false);
                    IDs2.setVisible(false);
                    Name1.setVisible(false);
                    NAME1.setVisible(false);
                    ADDRESS1.setVisible(false);
                    Address1.setVisible(false);
                    WORKING_TYPE1.setVisible(false);
                    Working_Type1.setVisible(false);
                    WORKING_HOUR.setVisible(false);
                    Working_hour.setVisible(false);
                    SALARY.setVisible(false);
                    Salary.setVisible(false);
                    SPECIALIZATION.setVisible(false);
                    Specialization.setVisible(false);
                    QUALIFICATIONS.setVisible(false);
                    Qualifications.setVisible(false);
                    INDEX.setVisible(false);
                    Index.setVisible(false);
                    addTutor.setVisible(false);
                    GRADE_ASSIGNMENT1.setVisible(false);
                    CLEAR2.setVisible(false);
                    DISPLAY1.setVisible(false);
                    SET.setVisible(false);
                    REMOVE.setVisible(false);
                    EMPLOYMENT_STATUS1.setVisible(false);
                    Employment_status1.setVisible(false);
                    
                    panel2.setVisible(true);
                    Back3.setVisible(true);
                    
                }
            });
            
            panel2.add(Back3); // Add Back3 button to panel1
            
            frame1.add(panel2);

                
                Back3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    panel2.setVisible(!panel2.isVisible());
                    Back3.setVisible(!Back3.isVisible());
                    
                    // Hide other components
                    ID2.setVisible(true);
                    IDs2.setVisible(true);
                    Name1.setVisible(true);
                    NAME1.setVisible(true);
                    ADDRESS1.setVisible(true);
                    Address1.setVisible(true);
                    WORKING_TYPE1.setVisible(true);
                    Working_Type1.setVisible(true);
                    WORKING_HOUR.setVisible(true);
                    Working_hour.setVisible(true);
                    SALARY.setVisible(true);
                    Salary.setVisible(true);
                    SPECIALIZATION.setVisible(true);
                    Specialization.setVisible(true);
                    QUALIFICATIONS.setVisible(true);
                    Qualifications.setVisible(true);
                    addTutor.setVisible(true);
                    GRADE_ASSIGNMENT1.setVisible(true);
                    CLEAR2.setVisible(true);
                    DISPLAY1.setVisible(true);
                    SET.setVisible(true);
                    REMOVE.setVisible(true);
                    EMPLOYMENT_STATUS1.setVisible(true);
                    Employment_status1.setVisible(true);
                    INDEX.setVisible(false);
                    Index.setVisible(false);
                    
                    panel2.setVisible(false);
                    
                        
                        
                    }
                });

                 
                 JButton SET1 = new JButton("SET SALARY");
                 SET1.setBounds(290, 230, 230,60);
                 Font s1= new Font("Arial", Font.BOLD, 19);
                 SET1.setFont(s1);
                 SET1.setForeground(new Color(3,37,76));
                 panel2.add(SET1);
                 
                 
                 JButton Clear3 = new JButton("CLEAR");
                 Clear3.setBounds(550, 230, 150,60);
                 Font clear3= new Font("Arial", Font.BOLD, 19);
                 Clear3.setFont(clear3);
                 Clear3.setForeground(new Color(3,37,76));
                 panel2.add(Clear3); 
                 
                 
                  REMOVE.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Toggle visibility of panel2 and Back3
                    panel3.setVisible(!panel3.isVisible());
                    Back4.setVisible(!Back4.isVisible());
                    
                    // Hide other components
                    ID2.setVisible(false);
                    IDs2.setVisible(false);
                    Name1.setVisible(false);
                    NAME1.setVisible(false);
                    ADDRESS1.setVisible(false);
                    Address1.setVisible(false);
                    WORKING_TYPE1.setVisible(false);
                    Working_Type1.setVisible(false);
                    WORKING_HOUR.setVisible(false);
                    Working_hour.setVisible(false);
                    SALARY.setVisible(false);
                    Salary.setVisible(false);
                    SPECIALIZATION.setVisible(false);
                    Specialization.setVisible(false);
                    QUALIFICATIONS.setVisible(false);
                    Qualifications.setVisible(false);
                    INDEX.setVisible(false);
                    Index.setVisible(false);
                    addTutor.setVisible(false);
                    GRADE_ASSIGNMENT1.setVisible(false);
                    CLEAR2.setVisible(false);
                    DISPLAY1.setVisible(false);
                    SET.setVisible(false);
                    REMOVE.setVisible(false);
                    EMPLOYMENT_STATUS1.setVisible(false);
                    Employment_status1.setVisible(false);
                    
                    panel3.setVisible(true);
                    Back4.setVisible(true);
                    
                }
            });
            
            panel3.add(Back4); // Add Back3 button to panel1
            
            frame1.add(panel3);

                
                Back4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    panel3.setVisible(!panel3.isVisible());
                    Back4.setVisible(!Back4.isVisible());
                    
                    // show other components
                    ID2.setVisible(true);
                    IDs2.setVisible(true);
                    Name1.setVisible(true);
                    NAME1.setVisible(true);
                    ADDRESS1.setVisible(true);
                    Address1.setVisible(true);
                    WORKING_TYPE1.setVisible(true);
                    Working_Type1.setVisible(true);
                    WORKING_HOUR.setVisible(true);
                    Working_hour.setVisible(true);
                    SALARY.setVisible(true);
                    Salary.setVisible(true);
                    SPECIALIZATION.setVisible(true);
                    Specialization.setVisible(true);
                    QUALIFICATIONS.setVisible(true);
                    Qualifications.setVisible(true);
                    addTutor.setVisible(true);
                    GRADE_ASSIGNMENT1.setVisible(true);
                    CLEAR2.setVisible(true);
                    DISPLAY1.setVisible(true);
                    SET.setVisible(true);
                    REMOVE.setVisible(true);
                    EMPLOYMENT_STATUS1.setVisible(true);
                    Employment_status1.setVisible(true);
                    INDEX.setVisible(false);
                    Index.setVisible(false);
                    
                    panel3.setVisible(false);
                    
                        
                        
                    }
                });
                 
                 JButton REMOVE1 = new JButton("REMOVE");
                 REMOVE1.setBounds(120, 140, 230,60);
                 Font R1= new Font("Arial", Font.BOLD, 19);
                 REMOVE1.setFont(R1);
                 REMOVE1.setForeground(new Color(3,37,76));
                 panel3.add(REMOVE1);
                 
                 
                 JButton Clear5 = new JButton("CLEAR");
                 Clear5.setBounds(300, 220, 150,60);
                 Font clear5= new Font("Arial", Font.BOLD, 19);
                 Clear5.setFont(clear3);
                 Clear5.setForeground(new Color(3,37,76));
                 panel3.add(Clear5); 
                 
                 
                 
                 
                   addLecturer.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //Getting all the input values from text fields
                        String id= IDs.getText();
                        String name= Name.getText();
                        String address= Address.getText();
                        String working_type=Working_Type.getText();
                        String employment_status=Employment_status.getText();
                        String graded_score=Graded_score.getText();
                        String years_of_experience=Years_of_experience.getText();
                        String LEcturer_department=Department.getText();
                        //Checking if the text fields are empty
                        if(IDs.getText().isEmpty() || Name.getText().isEmpty() || Address.getText().isEmpty() ||Working_Type.getText().isEmpty()
                        || Employment_status.getText().isEmpty() ||Graded_score.getText().isEmpty() || Years_of_experience.getText().isEmpty() || 
                        Department.getText().isEmpty())
                            {
                                    JOptionPane.showMessageDialog(frame, "Make sure all text fields are filled.If empty please input Something!!", "Alert",
                                    JOptionPane.WARNING_MESSAGE);
                            
                            }else{
                            try{ //converting the string values to integer for teacher ID, graded score and years of experience
                                        int teacher_ID = Integer.parseInt(IDs.getText());
                                        int lecturer_graded_score = Integer.parseInt(Graded_score.getText());
                                        int lecturer_years_of_experience = Integer.parseInt(Years_of_experience.getText());
                                        
                                        if(lecturer_graded_score>=101 || lecturer_years_of_experience>=100){
                                        JOptionPane.showMessageDialog(frame, "Please check the Graded score and Years of Experience."+"\n"+
                                        "Graded score and Years of Experience cannot be more than 100" ,"Alert",JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                        }
                                        String teacher_working_type = Working_Type.getText();
                                        String teacher_name = Name.getText();
                                        String teacher_address = Address.getText();
                                        String teacher_employment_status = Employment_status.getText();
                                        String lecturer_department=Department.getText();
                                        int teacher_working_hours=0;
                                        boolean isAdded=false;
                                        Lecturer lecturer;
                                        if (teacherArrayList.isEmpty()) {
                                        //if arraylist is empty then creating an object for lecturer and adding it in a teacher arraylist
                                        lecturer= new Lecturer(teacher_ID, teacher_name, teacher_address, teacher_working_type,
                                                                     teacher_employment_status, lecturer_department, lecturer_years_of_experience,
                                                                     teacher_working_hours);          
                                        teacherArrayList.add(lecturer);
                                        
                                        JOptionPane.showMessageDialog(frame, "Lecturer Successfully Added", "No Error Found", 
                                        JOptionPane.INFORMATION_MESSAGE);
                                    
                                    }
                                        else{
                                        
                                        //Iterating over each teacher 
                                        for(Teacher teacher: teacherArrayList){
                                            //checking if the teacher is a lecturer
                                            if(teacher instanceof Lecturer){
                                                //downcasting
                                                lecturer=(Lecturer) teacher;
                                                if(lecturer.getTeacher_ID()==teacher_ID){
                                                    JOptionPane.showMessageDialog(frame, "Id already Exist", "Warning!",
                                                    JOptionPane.WARNING_MESSAGE);
                                                    isAdded=true;
                                                    break;
                                                }
                                            }
                                        }
                                        
                                        if(!isAdded){
                                        lecturer= new Lecturer(teacher_ID, teacher_name, teacher_address, teacher_working_type,
                                                                     teacher_employment_status, lecturer_department, lecturer_years_of_experience,
                                                                     teacher_working_hours); 
                                        teacherArrayList.add(lecturer);
                                        JOptionPane.showMessageDialog(frame, "Lecturer Successfully Added ", "Lecturer Addition,",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                        
                                        
                                        
                                }catch(NumberFormatException ex){
                                        //for popup message
                                        JOptionPane.showMessageDialog(frame, "Invalid Alphabetical Input, Please Check and Try Again!" +" \n"+
                                        "Check: TeacherID, Graded Score & Years Of Experience " , " Error Found,",JOptionPane.WARNING_MESSAGE);
                                    }
                            
                            
                            }
                        
                            
                            }   
            });
            
            
            //Making grade assignment button functional
            GRADE_ASSIGNMENT.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String graded_score = Graded_score1.getText();
        String years_of_experience = Years_of_experience1.getText();
        String lecturer_department = Department1.getText();
        String id = IDs1.getText();

        if (Graded_score1.getText().isEmpty() || Years_of_experience1.getText().isEmpty() || Department1.getText().isEmpty() ||
            IDs1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "All fields must be filled.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int teacher_ID = Integer.parseInt(IDs1.getText());
                int lecturer_graded_score = Integer.parseInt(Graded_score1.getText());
                int lecturer_years_of_experience = Integer.parseInt(Years_of_experience1.getText());

                // Check if graded score or years of experience are invalid
                if (lecturer_graded_score >= 101 || lecturer_years_of_experience >= 100) {
                    JOptionPane.showMessageDialog(frame, "Graded score and years of experience cannot be more than 100.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                boolean gradeAssignment = false;
                boolean validAssignment = false;

                // Iterate over each teacher
                for (Teacher teacher : teacherArrayList) {
                    // Check if the teacher is a Lecturer
                    if (teacher instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) teacher;
                        // Check if the teacher ID matches
                        if (lecturer.getTeacher_ID() == teacher_ID) {
                            gradeAssignment = true;
                            // Check if the lecturer's department and experience meet the criteria
                            if (lecturer.getLecturer_department().equals(lecturer_department) && lecturer.getLecturer_years_of_experience() >= 5) {
                                validAssignment = true;
                                lecturer.grade_assignment(lecturer_graded_score, lecturer_department, lecturer_years_of_experience);
                                JOptionPane.showMessageDialog(frame, "Assignment graded successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(frame, "Teacher ID: " + IDs1.getText() + "\nGraded Score: " + lecturer.getLecturer_graded_score() +
                                        "\nYears Of Experience: " + Years_of_experience1.getText() + "\nDepartment: " + Department1.getText());
                            } else {
                                JOptionPane.showMessageDialog(frame, "Check either years of experience is less than 5 or department does not match the department lecturer added!", "Message", JOptionPane.WARNING_MESSAGE);
                            }
                            break; // Exit loop after finding the teacher
                        }
                    }
                }
                // Show message if teacher ID is invalid
                if (!gradeAssignment) {
                    JOptionPane.showMessageDialog(frame, "Invalid ID! ID does not match. Assignment cannot be graded!", "Please check", JOptionPane.WARNING_MESSAGE);
                } else if (!validAssignment) {
                    JOptionPane.showMessageDialog(frame, "Assignment cannot be graded. Department or years of experience do not meet the criteria.", "Message", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid numerical input. Please check and try again.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
});

            
            //Button to display the values of the lecturer
            Display.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            boolean display=false;
            if(teacherArrayList.isEmpty()){
            JOptionPane.showMessageDialog(frame," Your details are not filled yet. Please check and add The Lecturer first.", " Error Found", JOptionPane.WARNING_MESSAGE);
            
            } else{
            String message ="Teacher ID:" +IDs.getText() +"\n" + "Teacher Name:"+ Name.getText() + "\n"+ "Address:"+ Address.getText()+
            "\n" + "Working Type:" +Working_Type.getText()+ "\n" + "Employement Status:"+ Employment_status.getText()+ "\n" +
            "Graded Score:" + Graded_score.getText() +"\n" +" Years Of Experience:" + Years_of_experience.getText() + "\n"+
            "Department:"+ Department.getText();
            
            for (Teacher teacher : teacherArrayList){
                if (teacher instanceof Lecturer){
                   Lecturer lecturer = (Lecturer) teacher;
                    display=true;
                    //calling Display method from Lecturer class
                    lecturer.display();
                    JOptionPane.showMessageDialog(frame,message, "Display Details", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                }
                
                
                }
                if(!display){
                    JOptionPane.showMessageDialog(frame,message, "Display Details not found. Please Check Your Input..", JOptionPane.INFORMATION_MESSAGE);
                }
            
            }
            
            
            }
        
        
        
        });
            
            
            
            //Button to clear all the input values of Lecturer
            Clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              
              int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to clear?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Clear the text fields or perform any other action
               IDs.setText("");
               Name.setText("");
               Address.setText("");
               Working_Type.setText("");
               Employment_status.setText("");
               Graded_score.setText("");
               Years_of_experience.setText("");
               Department.setText("");
                } else {
                    // Do nothing
                }
                            }
                        
            });
            
            //Button to clear all the input values of Lecturer
            Clear1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           
               int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to clear?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Clear the text fields or perform any other action
               IDs1.setText("");
               Graded_score1.setText("");
               Years_of_experience1.setText("");
               Department1.setText("");
                } else {
                    // Do nothing or handle the cancellation
                }
            
            }    
             
    });
    
            addTutor.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //Getting all the input values from text fields
                        String id= IDs2.getText();
                        String name= Name1.getText();
                        String address= Address1.getText();
                        String working_type=Working_Type1.getText();
                        String employment_status=Employment_status1.getText();
                        String working_hours= Working_hour.getText();
                        String salary= Salary.getText();
                        String specialization= Specialization.getText();
                        String qualifications= Qualifications.getText();
                        String index= Index.getText();
                        //Checking if the text fields are empty
                        if(IDs2.getText().isEmpty() || Name1.getText().isEmpty() || Address1.getText().isEmpty() ||Working_Type1.getText().isEmpty()
                        || Employment_status1.getText().isEmpty() ||Working_hour.getText().isEmpty() || Salary.getText().isEmpty() || 
                        Specialization.getText().isEmpty() || Qualifications.getText().isEmpty() ||  Index.getText().isEmpty() )
                            {
                                    JOptionPane.showMessageDialog(frame1, "Make sure all text fields are filled.If empty please input Something!!", "Alert",
                                    JOptionPane.WARNING_MESSAGE);
                            
                            }else{
                            try{ //converting the string values to integer 
                                        int teacher_ID = Integer.parseInt(IDs2.getText());
                                        int tutor_performance_index = Integer.parseInt(Index.getText());
                                        int teacher_working_hours = Integer.parseInt(Working_hour.getText());
                                        
                                        if(tutor_performance_index>=100){
                                        JOptionPane.showMessageDialog(frame, "Please check the working hour and tutor performanceindex."+"\n"+
                                        "Performanceindex cannot be more than 100 ." ,"Alert",JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                        }
                                        double tutor_salary = Double.parseDouble(Salary.getText());
                                        String teacher_working_type = Working_Type1.getText();
                                        String teacher_name = Name1.getText();
                                        String teacher_address = Address1.getText();
                                        String tutor_specialization = Specialization.getText();
                                        String tutor_academic_qualifications=Qualifications.getText();
                                        String teacher_employment_status=Employment_status1.getText();
                                        boolean isAdded=false;
                                        Tutor tutor;
                                        if (teacherArrayList.isEmpty()) {
                                        //if arraylist is empty then creating an object for tutor and adding it in a teacher arraylist
                                        tutor= new Tutor(teacher_ID, teacher_name, teacher_address, teacher_working_type,
                                                                     teacher_employment_status, teacher_working_hours, tutor_salary,
                                                                     tutor_specialization,tutor_academic_qualifications,tutor_performance_index);          
                                        teacherArrayList.add(tutor);
                                        
                                        JOptionPane.showMessageDialog(frame1, "Tutor Successfully Added", "No Error Found", 
                                        JOptionPane.INFORMATION_MESSAGE);
                                    
                                    }
                                        else{
                                        
                                        //Iterating over each teacher 
                                        for(Teacher teacher: teacherArrayList){
                                            //checking if the teacher is a tutor
                                            if(teacher instanceof Tutor){
                                                //downcasting
                                                tutor=(Tutor) teacher;
                                                if(tutor.getTeacher_ID()==teacher_ID){
                                                    JOptionPane.showMessageDialog(frame1, "Id already Exist", "Warning!",
                                                    JOptionPane.WARNING_MESSAGE);
                                                    isAdded=true;
                                                    break;
                                                }
                                            }
                                        }
                                        
                                        if(!isAdded){
                                           tutor= new Tutor(teacher_ID, teacher_name, teacher_address, teacher_working_type,
                                                                     teacher_employment_status, teacher_working_hours, tutor_salary,
                                                                     tutor_specialization,tutor_academic_qualifications,tutor_performance_index);
                                        teacherArrayList.add(tutor);
                                        JOptionPane.showMessageDialog(frame1, "Tutor Successfully Added ", "Tutor Addition,",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                        
                                        
                                        
                                }catch(NumberFormatException ex){
                                        //for popup message
                                        JOptionPane.showMessageDialog(frame1, "Invalid Alphabetical Input, Please Check and Try Again!" +" \n"+
                                        "Check: TeacherID, Salary, Working hour, Performance Index. " , " Error Found,",JOptionPane.WARNING_MESSAGE);
                                    }
                            
                            
                            }
                        
                            
                            }   
            });
            
            
        SET1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Getting all the input values from text fields
        String id = IDs3.getText();
        String index = Index1.getText();
        String salary = Salary1.getText();

        if (id.isEmpty() || index.isEmpty() || salary.isEmpty()) {
            JOptionPane.showMessageDialog(panel2, "The Text Field must be Filled.", "Error Found", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int teacher_ID = Integer.parseInt(id);
                int tutor_performance_index = Integer.parseInt(index);
                double tutor_salary = Double.parseDouble(salary);
                boolean setSalary = false;
                Tutor tutor;
                if (teacherArrayList.isEmpty()) {
                    JOptionPane.showMessageDialog(frame1, "Tutor has not been added. Please Check Again", "Error Found", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Iterating over each teacher
                    for (Teacher teacher : teacherArrayList) {
                        // Checking if the teacher is a Tutor
                        if (teacher instanceof Tutor) {
                            // Downcasting
                            tutor = (Tutor) teacher;
                            if (tutor.getTeacher_ID() == teacher_ID) {
                                setSalary = true;
                                if (tutor_performance_index > 5 && tutor.getTeacher_working_hours() > 20) {
                                    // Set salary only if the performance index is > 5 and working hours > 20
                                    tutor.setTutor_salary(tutor_salary, tutor_performance_index);
                                    JOptionPane.showMessageDialog(frame1, "Tutor Salary Set Successfully.", "No Error Found", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(frame1, "Salary:" + salary + "\n" + "Performance Index:" + index);
                                } else {
                                    JOptionPane.showMessageDialog(frame1, "Tutor performance index must be greater than 5 and Working hour must be greater than 20."
                                            , "Alert", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break; // Exit the loop after setting salary
                            }
                        }
                    }
                    if (!setSalary) {
                        JOptionPane.showMessageDialog(frame1, "Teacher ID Does Not Match With The Given Id.", "Error Found", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame1, "No Alphabetical values allowed. Input Numbers Only.", "Error Found", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
});


  REMOVE1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Getting the input value from the text field
        String id = IDs4.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(panel3, "The Text Field must be Filled.", "Error Found", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int teacher_ID = Integer.parseInt(id);
                boolean removetutor = false;
                Tutor tutorRemove = null; // Initialize a Tutor variable to hold the tutor to remove
                // Check if the teacherArrayList is empty
                if (teacherArrayList.isEmpty()) {
                    JOptionPane.showMessageDialog(frame1, "No tutor has been added yet. Please Check Again.", "Error Found", JOptionPane.WARNING_MESSAGE);
                } else {
                    for (Teacher teacher : teacherArrayList) {
                        // Check if the teacher is a Tutor
                        if (teacher instanceof Tutor) {
                            Tutor tutor = (Tutor) teacher;
                            // Check if the tutor ID matches the input ID
                            if (tutor.getTeacher_ID() == teacher_ID) {
                                // If a tutor with the specified ID is found, remove it from the list
                                tutorRemove = tutor;
                                removetutor = true;
                                tutor.removeTutor();
                                break;
                            }
                        }
                    }
                    // Remove the tutor from the list if found
                    if (removetutor) {
                        teacherArrayList.remove(tutorRemove);
                        IDs4.setText(""); // Clear the text field
                        IDs2.setText(""); // Clear any other relevant fields
                        JOptionPane.showMessageDialog(frame1, "Tutor Removed Successfully.", "No Error Found", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame1, "Teacher ID does not match any added ID.", "Error Found", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame1, "Invalid Input. Please Enter a Valid Number.", "Error Found", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
});

               
Clear5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           
               int choice = JOptionPane.showConfirmDialog(frame1, "Are you sure you want to clear?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Clear the text fields or perform any other action
               IDs4.setText("");
               
                } else {
                    // Do nothing or handle the cancellation
                }
            
            }    
             
            });
Clear3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           
               int choice = JOptionPane.showConfirmDialog(frame1, "Are you sure you want to clear?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Clear the text fields or perform any other action
               IDs3.setText("");
               Index1.setText("");
               Salary1.setText("");
                } else {
                    // Do nothing or handle the cancellation
                }
            
            }    
             
            });
            
CLEAR2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           
               int choice = JOptionPane.showConfirmDialog(frame1, "Are you sure you want to clear?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Clear the text fields or perform any other action
               IDs2.setText("");
               Index.setText("");
               Salary.setText("");
               Specialization.setText("");
               Qualifications.setText("");
               Working_hour.setText("");
               Employment_status1.setText("");
               Working_Type1.setText("");
               Address1.setText("");
               Name1.setText("");
               
                } else {
                    // Do nothing or handle the cancellation
                }
            
            }    
             
            });
            
    
DISPLAY1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            boolean display=false;
            if(teacherArrayList.isEmpty()){
            JOptionPane.showMessageDialog(frame1," Your details are not filled yet. Please check and add The Tutor first.", " Error Found", JOptionPane.WARNING_MESSAGE);
            
            } else{
            String message ="Teacher ID:" +IDs2.getText() +"\n" + "Teacher Name:"+ Name1.getText() + "\n"+ "Address:"+ Address1.getText()+
            "\n" + "Working Type:" +Working_Type1.getText()+ "\n" + "Employement Status:"+ Employment_status1.getText()+ "\n" +
            "Working Hours:" + Working_hour.getText() +"\n" +" Salary:" + Salary.getText() + "\n"+
            "Specialization:"+ Specialization.getText() + "\n"+ "Qualification:" + Qualifications.getText() + "\n"+ 
            "Performance Index:"+ Index.getText();
            
            for (Teacher teacher : teacherArrayList){
                if (teacher instanceof Tutor){
                   Tutor tutor = (Tutor) teacher;
                    display=true;
                    //calling Display method from tutor class
                    tutor.display();
                    JOptionPane.showMessageDialog(frame1,message, "Display Details", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                }
                
                
                }
                if(!display){
                    JOptionPane.showMessageDialog(frame1,message, "Display Details not found. Please Check Your Input..", JOptionPane.INFORMATION_MESSAGE);
                }
            
            }
            
            
            }
        
        
        
        });    
        
            
}
}
