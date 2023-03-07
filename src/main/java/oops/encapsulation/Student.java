package oops.encapsulation;
public class Student {
    /*
    create a student class which
    create student object with ith following fields
        -- studentID
        -- student name
        -- student email
    print the details of each student
     */

    // non static variables
    int srudentID;
    String studentName;
    String studentEmail;

    // user defined constructor which will tak below parameters
        //-- studentID
        //-- student name
        //-- student email
    Student(int srudentID, String studentName, String studentEmail){
        this.srudentID = srudentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public void printDetails(){
        System.out.println( "Student ID : "+srudentID+"\nStudent Name : "+ studentName +"\nStudent Email : "+studentEmail);
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Vitthal", "vitthal@gmail.com");
        s1.printDetails();
        Student s2 = new Student(2, "Amruta", "amruta@gamil.com");
        s2.printDetails();
        Student s3 = new Student(3, "Vinay", "vinay@gamil.com");
        s3.printDetails();
    }
}
