package Study;
//array bag practice
import java.util.*;
public class Students{
    private String studentID;
    private String studentName;
    private String studentGender;
    private double studentCredit;

    public Students(String studentID, String studentName, String studentGender, double studentCredit){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentCredit = studentCredit;
    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentGender(){
        return studentGender;
    }
    public void setStudentGender(String studentGender){
        this.studentGender = studentGender;
    }
    public double getStudentCredit(){
        return studentCredit;
    }
    public void setStudentCredit(double studentCredit){
        this.studentCredit = studentCredit;
    }
    public void show(){
        System.out.println("student ID: " + getStudentID());
        System.out.println("student name: " + getStudentName());
        System.out.println("student gender: " + getStudentGender());
        System.out.println("student credit: " + getStudentCredit());
    }
    public static void main(String[] args){
        Students[] students = new Students[5];

        for(int i = 0; i < students.length; i++){
            students[i] = new Students("00" + i, "Minsung" + i, "man", (double)((int) (new Random().nextDouble()*4.5*100)) / 100);
        }
        for(int i = 0; i < students.length; i++){
            System.out.println("--------------------");
            students[i].show();
        }
    }
}