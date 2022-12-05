import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class database {
    static ArrayList<student> studentArrayList = new ArrayList<>();
    static File file_obj = new File("student.txt");
    static ObjectOutputStream oos = null;
    static ObjectInputStream ois = null;

    public void CreateDatabase() throws Exception {
        student obj = new student();
        studentArrayList.add(obj);
        WriteInFile();
    }

    public void WriteInFile() throws Exception {
        oos = new ObjectOutputStream(new FileOutputStream(file_obj));
        oos.writeObject(studentArrayList);
        oos.close();
    }

    public void readFile() throws Exception {
        ois = new ObjectInputStream(new FileInputStream(file_obj));
        studentArrayList = (ArrayList<student>) ois.readObject();
        ois.close();
    }

    public void display() throws Exception {
        if (file_obj.isFile()) {
            this.readFile();
            System.out.print("-------------------------------------------------------------------------------------------");

            for (int i = 0; i < studentArrayList.size(); ++i) {
                System.out.println((studentArrayList.get(i)).toString());
                System.out.print("-------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("File does not Exists!");
        }

    }

    public void delete() throws Exception {
        readFile();
        String ID;
        int flag = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student id :-  ");
        ID = input.next();
        if (file_obj.isFile()) {
            for (int i = 0; i < studentArrayList.size(); i++) {
                if (studentArrayList.get(i).getStudent_ID().equals(ID)) {
                    studentArrayList.remove(i);
                    WriteInFile();
                    System.out.println("Deleted successfully");
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("Record not found");
            }
        }
    }

    public void search() throws Exception {
        String ID;
        int flag = 1;
        readFile();
        Scanner input = new Scanner(System.in);
        if (file_obj.isFile()) {
            System.out.print("Enter student i'd :-  ");
            ID = input.next();
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < studentArrayList.size(); i++) {
                if (studentArrayList.get(i).getStudent_ID().equals(ID)) {
                    System.out.println(studentArrayList.get(i).toString());
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            if (flag == 0) {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("File doesn't exit ");
        }
    }

    public void modify() throws Exception {
        readFile();
        String ID;
        int flag = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID :-  ");
        ID = input.next();
        if (file_obj.isFile()) {
            for (int i = 0; i < studentArrayList.size(); i++) {
                if (studentArrayList.get(i).getStudent_ID().equals(ID)) {
                    System.out.println(studentArrayList.get(i).toString());
                    Update_Record(studentArrayList.get(i));
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            if (flag==0) {
                WriteInFile();
                System.out.println("Record Updated Successfully!");
                System.out.println("-------------------------------------------------------------------------------------------");
            } else {
                System.out.println("Record not Found!");
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("File not found");
        }
    }

    public void Update_Record(student obj) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Which data you want to change");
            System.out.println("1.Name");
            System.out.println("2.Student I'D");
            System.out.println("3.Roll number");
            System.out.println("4.Class");
            System.out.println("5.Address");
            System.out.println("6.Mark");
            System.out.println("0.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter new Name: ");
                    String name = input.next();
                    obj.setName(name);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.print("Enter new Student I'D: ");
                    String id = input.next();
                    obj.setStudent_ID(id);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                     break;
                case 3:
                    System.out.print("Enter new Roll number: ");
                    int roll_no = input.nextInt();
                    obj.setRoll_no(roll_no);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.print("Enter new class: ");
                    String std= input.next();
                    obj.setStd(std);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.print("Enter new Address: ");
                    String address = input.next();
                    obj.setAddress(address);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.print("Enter new Mark: ");
                    int mark = input.nextInt();
                    obj.setMark(mark);
                    studentArrayList.set(studentArrayList.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
            }
        } while (choice != 0);

    }

    public void table() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Delete Records");
            System.out.println("4. Update Record");
            System.out.println("5. Search Record");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                        this.CreateDatabase();
                    } catch (Exception e1) {
                        System.out.println("Error Resolved!");
                        table();
                    }
                    break;
                case 2:
                    try {
                        display();
                    } catch (Exception e2) {
                        System.out.println("Error Resolved!");
                        table();
                    }
                    break;
                case 3:
                    try {
                        delete();
                    } catch (Exception e3) {
                        System.out.println("Error Resolved!");
                        table();
                    }
                    break;
                case 4:try {
                    modify();
                } catch (Exception e4) {
                    System.out.println("Error Resolved!");
                    table();
                }
                    break;
                case 5:
                    try {
                        search();
                    } catch (Exception e5) {
                        System.out.println("Error Resolved!");
                        table();
                    }
                    break;
            }
        } while (choice != 0);
    }
}
