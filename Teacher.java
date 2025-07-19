public class Teacher{
//Teacher class has six attributes
private int teacher_ID;
private String teacher_name;
private String teacher_address;
private String teacher_working_type;
private String teacher_employment_status;
private int teacher_working_hours;
//constructor accepts five parameters
public Teacher(int teacher_ID,String teacher_name,String teacher_address,String teacher_working_type,
String teacher_employment_status){
//intialize attributes with paramater values
this.teacher_ID=teacher_ID;
this.teacher_name= teacher_name;
this.teacher_address=teacher_address;
this.teacher_working_type=teacher_working_type;
this.teacher_employment_status=teacher_employment_status;
}
//Accesssor method for each attributes
public int getTeacher_ID(){
return this.teacher_ID;
}
public String getTeacher_name(){
return this.teacher_name;
}
public String getTeacher_address(){
return this.teacher_address;
}
public String getTeacher_working_type(){
return this.teacher_working_type;
}
public String getTeacher_employment_status(){
return this.teacher_employment_status;
}
public int getTeacher_working_hours(){
return this.teacher_working_hours;
}
//method to set the new working hour and assign the set value to the attribute  teacher_working_hour
public void setTeacher_working_hours(int teacher_working_hour){
this.teacher_working_hours=teacher_working_hour;
}
//a new method (display method)
public void display(){
System.out.println("Teacher ID:"+" "+getTeacher_ID());
System.out.println("Teacher Name:"+" "+getTeacher_name());
System.out.println("Teacher Address:"+" "+getTeacher_address());
System.out.println("Teacher Working Type:"+" "+getTeacher_working_type());
System.out.println("Teacher Employment Status:"+" "+getTeacher_employment_status());
//a suitable message to be displayed if working hour is not assigned
if(teacher_working_hours != 0){
System.out.println("Teacher working hours:"+" "+getTeacher_working_hours());
} else{
System.out.println("Teacher working hours: Not assigned");
}
}

}