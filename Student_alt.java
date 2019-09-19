public class Student_alt{
    String name;
    String studentId;
    double GPA;
    
    //constructor
    public Student_alt(String name, String id, double gpa) 
    { 
        this.name = name;
        this.studentId = id;
        this.GPA = gpa;
    }
    
    //getters
    public String getName() 
    { 
        return name; 
    }
    
    public String getStudentId()
    {
        return studentId;
    }
    
    public double getGPA()
    {
        return GPA;
    }
    
    //setters
    private void setName(String input)
    {
        name = input;
    }
    
    private void setStudentId(String input)
    {
        studentId = input;
    }
    
    private void setGPA(double input)
    {
        GPA = input;
    }
    
    //main method
    public static void main(String []args){
        
        //make an array of student objects
        Student_alt[] classlist = new Student_alt[5];
        //Construct the 5 students
        classlist[0] = new Student_alt("Joe Smith", "123456", 2.7);
        classlist[1] = new Student_alt("Jane Doe", "98765f", 3.8);
        classlist[2] = new Student_alt("Jenny Brown", "4448ws", 4.0);
        classlist[3] = new Student_alt("Johnny Burns", "lo9094", 3.9);
        classlist[4] = new Student_alt("Joseph Evans", "43g52f", 3.0);
        
        //print out each students name
        for(int i = 0; i < classlist.length; i++)
        {
            System.out.println("Student: "+ classlist[i].getName());
        }
        
    }
}