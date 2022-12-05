import java.io.Serializable;
import java.util.Scanner;
public class student implements Serializable {
    static Scanner input_S = new Scanner(System.in);
    static Scanner input_I = new Scanner(System.in);
    private String name;
    private String student_ID;
    private int roll_no;
    private String std;
    private int mark;
    private String address;


    //    generate getter and setter method
    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public student() {
        System.out.print("Enter Student name:-  ");
        name = input_S.nextLine();
        System.out.print("Enter Student ID:-  ");
        student_ID = input_S.next();
        System.out.print("Enter Student roll number:-  ");
        roll_no = input_I.nextInt();
        System.out.print("Enter student class :-  ");
        std = input_S.next();
        System.out.print("Enter student mark:-  ");
        mark = input_I.nextInt();
        System.out.print("Enter Address of Student :-  ");
        address = input_S.next();
    }

    //    toString method is used to print object
    public String toString() {
        return "\nName :-  " + this.name + "\nI'D :-  " + this.student_ID + "\nRoll number :-  " + roll_no + "\nClass :-  " + this.std + "\nMark :-  " + this.mark + "\nAddress :-  " + address;
    }

}
