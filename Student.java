public class Student {

    java.util.ArrayList<Grade> grades = new java.util.ArrayList<>();// Here we create the array list to store all the students' grades.

    //Here we declared all the varibale that are needed for the object Students.
    public String Name;

    public String Department;

    public int Age;

    public String UserName;

    public boolean Fulltime;

    public int StudentNumber;

    public int programming;

    public int maths;

    public int webDev;

    public int algorithms;

    //Here we create the constructor function of the students to store all the needed information.
    public Student(String Name, String Department, int Age, int studentNumber, boolean Fulltime, int programming, int webDev, int maths, int algorithms){

        this.Name = Name;

        this.Department = Department;

        this.Age = Age;

        this.StudentNumber = studentNumber;

        this.Fulltime = Fulltime;

        this.programming = programming;

        this.webDev = webDev;

        this.maths = maths;

        this.algorithms = algorithms;

        String str_UserName = Integer.toString(studentNumber);
        String str1 = this.Name.substring(0, 1);
        int str_space = this.Name.indexOf(" ");
        String str2 = this.Name.substring(str_space+1, str_space+4);
        String str3 = str_UserName.substring(0,3);
        this.UserName = new StringBuffer().append(str1).append(str2).append(str3).toString();
        this.UserName = UserName.toLowerCase();
    }

    //Here we created all the setter and getter that is going to be needed for the object Student.
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getDepartment(){
        return Department;
    }

    public void setDepartment(String Department){
        this.Department = Department;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public String getuserName(){
        return UserName;
    }

    public void setuserName(String UserName){
        this.UserName = UserName;
    }

    public int getstudentNumber(){
        return StudentNumber;
    }

    public void setstudentNumber(int StudentNumber){
        this.StudentNumber = StudentNumber;
    }

    public boolean getFullTime(){
        return Fulltime;
    }

    public void setFullTime(boolean Fulltime){
        this.Fulltime = Fulltime;
    }

    @Override
    public String toString() {
        return "Student" +
                "Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", Age=" + Age +
                ", UserName='" + UserName + '\'' +
                ", Fulltime=" + Fulltime +
                ", StudentNumber=" + StudentNumber;
    }


    // private String name;
    // private String department;
    // private int age;
    // private String userName;
    // private int studentNumber;
    // private boolean fullTime;
    // public ArrayList<Grade> grades = new ArrayList<>();

    // public Student(String firstName, String lastName, int age, String department, int studentNumber, boolean fullTime) {
    //     this.name = firstName + " " + lastName;
    //     this.department = department;
    //     this.age = age;
    //     this.studentNumber = studentNumber;
    //     this.fullTime = fullTime;
    //     this.userName = firstName.toLowerCase().charAt(0) + lastName.toLowerCase().substring(0, 4) + String.valueOf(studentNumber).substring(0, 3);
    // }

    // // Getters and setters

    // // Add Grade to grades ArrayList
    // public void addGrade(Grade grade) {
    //     grades.add(grade);
    // }

    // // Getter for grades
    // public ArrayList<Grade> getGrades() {
    //     return grades;
    // }

    // // toString method for Student
    // @Override
    // public String toString() {
    //     return "Student [name=" + name + ", department=" + department + ", age=" + age + ", userName=" + userName
    //             + ", studentNumber=" + studentNumber + ", fullTime=" + fullTime + "]";
    // }










}
