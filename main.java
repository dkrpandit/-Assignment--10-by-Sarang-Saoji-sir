public class main {
    main() {

    }
    public static void main(String[] args) throws Exception {
        database obj = new database();
        try {
            obj.table();
        } catch (Exception e) {
            System.out.println("Error");
            obj.table();
        }
    }
}
/*
Output:-
"C:\Program Files\Java\jdk-18.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=51064:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dharmendra Kumar\OOP Assignment\assignment_10\out\production\assignment_10" main

1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
2
-------------------------------------------------------------------------------------------
Name :-  Balram
I'D :-  T21145
Roll number :-  45
Class :-  12th
Mark :-  89
Address :-  BIHAR
-------------------------------------------------------------------------------------------
Name :-  Dharmendra
I'D :-  T21139
Roll number :-  21
Class :-  12th
Mark :-  88
Address :-  MADHUBANI
-------------------------------------------------------------------------------------------
1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
1
Enter Student name:-  Vijay
Enter Student ID:-  T21190
Enter Student roll number:-  56
Enter student class :-  12th
Enter student mark:-  99
Enter Address of Student :-  Thadhi

1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
2
-------------------------------------------------------------------------------------------
Name :-  Balram
I'D :-  T21145
Roll number :-  45
Class :-  12th
Mark :-  89
Address :-  BIHAR
-------------------------------------------------------------------------------------------
Name :-  Dharmendra
I'D :-  T21139
Roll number :-  21
Class :-  12th
Mark :-  88
Address :-  MADHUBANI
-------------------------------------------------------------------------------------------
Name :-  Vijay
I'D :-  T21190
Roll number :-  56
Class :-  12th
Mark :-  99
Address :-  Thadhi
-------------------------------------------------------------------------------------------
1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
4
Enter student ID :-  T21190

Name :-  Vijay
I'D :-  T21190
Roll number :-  56
Class :-  12th
Mark :-  99
Address :-  Thadhi
Which data you want to change
1.Name
2.Student I'D
3.Roll number
4.Class
5.Address
6.Mark
0.Exit
6
Enter new Mark: 96
Record Updated Successfully!
-------------------------------------------------------------------------------------------
Which data you want to change
1.Name
2.Student I'D
3.Roll number
4.Class
5.Address
6.Mark
0.Exit
0
Record Updated Successfully!
-------------------------------------------------------------------------------------------

1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
2
-------------------------------------------------------------------------------------------
Name :-  Balram
I'D :-  T21145
Roll number :-  45
Class :-  12th
Mark :-  89
Address :-  BIHAR
-------------------------------------------------------------------------------------------
Name :-  Dharmendra
I'D :-  T21139
Roll number :-  21
Class :-  12th
Mark :-  88
Address :-  MADHUBANI
-------------------------------------------------------------------------------------------
Name :-  Vijay
I'D :-  T21190
Roll number :-  56
Class :-  12th
Mark :-  96
Address :-  Thadhi
-------------------------------------------------------------------------------------------
1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
0. Exit
0

Process finished with exit code 0
 */
