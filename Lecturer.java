public class Lecturer extends Teacher{
//attributes
private String lecturer_department;
private int lecturer_years_of_experience;
private int lecturer_graded_score;
private boolean lecturer_has_graded;
//constructor
public Lecturer(int teacher_ID,String teacher_name,String teacher_address,String teacher_working_type, 
String teacher_employment_status,String lecturer_department,int lecturer_years_of_experience,
int teacher_working_hours){
//calling super class constructor and setter method
super(teacher_ID,teacher_name,teacher_address,teacher_working_type,teacher_employment_status);
super.setTeacher_working_hours(teacher_working_hours);
this.lecturer_graded_score=0;
this.lecturer_years_of_experience=lecturer_years_of_experience;
this.lecturer_department=lecturer_department;
this.lecturer_has_graded= false;
}
//accessor method
public String getLecturer_department(){
return this.lecturer_department;
}
public int getLecturer_years_of_experience(){
return this.lecturer_years_of_experience;
} 
public int getLecturer_graded_score(){
    return this.lecturer_graded_score;
}
public boolean getLecturer_has_graded(){
return this.lecturer_has_graded;
}
//mutator method
public void setLecturer_graded_score(int lecturer_graded_score){
this.lecturer_graded_score=lecturer_graded_score;
}
//new method
public void grade_assignment(int lecturer_graded_score,String lecturer_department,
int lecturer_years_of_experience)
{
    this.lecturer_department=lecturer_department;
    this.lecturer_graded_score=lecturer_graded_score;
    this.lecturer_years_of_experience=lecturer_years_of_experience;
if(lecturer_years_of_experience>=5 && getLecturer_department()==lecturer_department){
    if(lecturer_graded_score>=70){
        System.out.println("The assignment of the student is graded A");
    }else if(lecturer_graded_score>=60){
      System.out.println("The assignment of the student is graded B");
    }
    else if(lecturer_graded_score>=50){
    System.out.println("The assignment of the student is graded C");
    }
    else if(lecturer_graded_score>=40){
    System.out.println("The assignment of the student is graded D");
    }
    else if(lecturer_graded_score<40){
    System.out.println("The assignment of the student is graded E");
    }
    //attribute has graded is set true
       this.lecturer_has_graded=true;
    
    }
    else{
    System.out.println("The assignment is not graded yet");
    }

}
//display method having the same signature as display method in teacher
public void display(){
//calling super class display method
super.display();
System.out.println("Lecturer Department:"+" "+getLecturer_department());
System.out.println("Lecturer Years of experience:"+" "+getLecturer_years_of_experience());
if(this.lecturer_has_graded==true){
System.out.println("Graded Score:"+" "+getLecturer_graded_score());
}else{
System.out.println("The score is not yet Graded");
}
}


}





