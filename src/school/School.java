package school;

import student.Student;

import java.util.ArrayList;

public class School {
    static ArrayList<Student> studentsData = new ArrayList<>();

    public static void submit(ArrayList<Student> obj) {
        if (obj != null) studentsData.addAll(obj);
    }
}
