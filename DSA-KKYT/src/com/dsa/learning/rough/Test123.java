package com.dsa.learning.rough;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Test123 {
private static void print(Student s){
    System.out.println(s.getId()+"  "+ s.getName());
}
    public static void main(String[] args) {
       // Student s= new Student(1,"Pratyush");
        Student s= new StudentClassMode(1,"Praty","online");
        print(s);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Student{
    private int id;
    private String name;
}

@Getter
@Setter
class StudentClassMode extends Student{
    private String onlineOffline;
    StudentClassMode(int id, String name, String onlineOffline){
        super(id,name);
        this.onlineOffline = onlineOffline;
    }


}
