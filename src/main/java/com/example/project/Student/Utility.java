package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        ArrayList<Student> student = new ArrayList<Student>();
        for(int i = 1; i <= list.size(); i++) {
            if(list.get(i - 1).getLastName().compareTo(list.get(i).getLastName()) > 1) {
                student.add(list.get(i - 1));
            }
        }
        return list;
    }

}
