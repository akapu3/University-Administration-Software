import java.util.ArrayList;

public class Student {

    //attributes
    private int studentID;
    private String name;
    private String program;
    private ArrayList<Course> courses;


    //constructor
    Student(int studentID, String name, String program){
        this.name = name;
        this.studentID = studentID;
        this.program = program;
        this.courses = new ArrayList<Course>();
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }
    public String getProgram(){
        return this.program;
    }
    public int getStudentID(){
        return this.studentID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setProgram(String program){
        this.program = program;
    }

    //Methods
    public Course doesStudentHaveCourse(int courseID){
        for (int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseID() == courseID){
                return courses.get(i);
            }
        }
        return null;
    }

    public void addCourse(Course course){

        if(!courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
        }
    }

    void dropCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
            course.dropStudent(this);
        }
    }






}
