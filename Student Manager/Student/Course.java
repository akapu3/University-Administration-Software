import java.util.ArrayList;

public class Course {

    private int courseID;
    private String courseName;
    private ArrayList<Student> students;

    Course(String courseName, int courseID){
        this.courseID = courseID;
        this.courseName = courseName;
        students = new ArrayList<Student>();
    }

    //Getters and Setters
    public int getCourseID(){
        return this.courseID;
    }
    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }

    public void addStudent(Student s){
        if(!students.contains(s)){
            students.add(s);
            s.addCourse(this);
        }
    }

    public void dropStudent(Student s){
        if(students.contains(s)){
            students.remove(s);
            s.dropCourse(this);
        }
    }
}
