package school;

import student.Student;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    static ArrayList<Student> studentsData = new ArrayList<>();

    public static void submit(ArrayList<Student> obj) {
        if (obj != null) studentsData.addAll(obj);
    }

    public static void search() {
        studentsData.sort((student1, student2) -> Integer.compare(student2.getScore(), student1.getScore()));
        for(Student student : studentsData) {
            System.out.println(student);
        }
    }
}
