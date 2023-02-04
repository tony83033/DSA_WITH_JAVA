import java.util.*;
public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Sumit";
        s1.age = 20;
        s1.password = "qwert";
        s1.marks[0] = 100;
        s1.marks[1] = 343;
        s1.marks[2] = 24;

        Student s2 = new Student(s1);
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int age;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }

    Student(){

    }

    String getName(){
         System.out.println("It's works");
         return name;
       
    }
}