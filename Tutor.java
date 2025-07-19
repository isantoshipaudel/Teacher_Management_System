class Tutor extends Teacher {
    // Attributes
    private double tutor_salary;
    private String tutor_specialization;
    private String tutor_academic_qualifications;
    private int tutor_performance_index;
    private boolean tutor_is_certified;

    // Constructor
    public Tutor(int teacher_ID, String teacher_name, String teacher_address, String teacher_working_type,
                 String teacher_employment_status, int teacher_working_hours, double tutor_salary,
                 String tutor_specialization, String tutor_academic_qualifications,
                 int tutor_performance_index) {
         // calling super class constructor and setter method
        super(teacher_ID, teacher_name, teacher_address, teacher_working_type, teacher_employment_status);
        super.setTeacher_working_hours(teacher_working_hours);

        // Assigning attributes with the parameter values
        this.tutor_salary = tutor_salary;
        this.tutor_specialization = tutor_specialization;
        this.tutor_academic_qualifications = tutor_academic_qualifications;
        this.tutor_performance_index = tutor_performance_index;
        this.tutor_is_certified = false;
    }

    // Accessor methods for each tutor attribute
    public double getTutor_salary() {
        return this.tutor_salary;
    }

    public String getTutor_specialization() {
        return this.tutor_specialization;
    }

    public String getTutor_academic_qualifications() {
        return this.tutor_academic_qualifications;
    }

    public int getTutor_performance_index() {
        return this.tutor_performance_index;
    }

    public boolean getTutor_is_certified() {
        return this.tutor_is_certified;
    }

    // Setter method to set the salary
    public void setTutor_salary(double tutor_salary, int tutor_performance_index) {
        
        if (this.tutor_performance_index > 5 && getTeacher_working_hours() > 20) {
            double appraisalPercentage = 0.0;

            if (this.tutor_performance_index >= 5 && this.tutor_performance_index <= 7) {
                appraisalPercentage = 0.05;
            } else if (this.tutor_performance_index >= 8 && this.tutor_performance_index <= 9) {
                appraisalPercentage = 0.1;
            } else if (this.tutor_performance_index >= 10) {
                appraisalPercentage = 0.2;
            }

            this.tutor_salary = tutor_salary + tutor_salary * appraisalPercentage;
            this.tutor_is_certified = true;
            System.out.println("Salary Set Successfully");
        } else {
            System.out.println("Salary cannot be approved as either the performance Index is less than 5 or working hour is less than 20.");
        }
    }
    //new method removetutor
    public void removeTutor(){
    if(this.tutor_is_certified==false){
    System.out.println("The tutor is removed");
    this.tutor_salary=0;
    this.tutor_specialization="";
    this.tutor_academic_qualifications="";
    this.tutor_performance_index=0;
    this.tutor_is_certified=false;
    }else{
    System.out.println("Tutor Removed Successfully");
    }
    }
    public void display(){
    if(this.tutor_is_certified=false){
    super.display();
    }else{
    super.display();
    System.out.println("The salary of the tutor is:" +" "+getTutor_salary());
    System.out.println("The specialization of the tutor is:" +" "+getTutor_specialization()); 
    System.out.println("The academic qualification of the tutor is:" +" "+getTutor_academic_qualifications());
    System.out.println("The performance index of the tutor is:" +" "+getTutor_performance_index());
    }
    
    }
    
    }

