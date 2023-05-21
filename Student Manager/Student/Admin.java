import java.util.ArrayList;

public class Admin {
    private static ArrayList<Student> students;
    private static ArrayList<Course> courses;

    Admin(){
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    public static void addStudent(Student s){
        students.add(s);
    }

    public static void removeStudent(Student s){
        students.remove(s);
    }

    public static void addCourse(Course c){
        courses.add(c);
    }

    public static void removeCourse(Course c){
        courses.remove(c);
    }


}
