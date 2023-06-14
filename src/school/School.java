package school;

import student.Student;

import java.util.ArrayList;

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

    public static void pass() {
        for (Student student : studentsData) {
            // 합격 기준 : / 성적 80% / 출결 10% / 가산점 10% /
            if (student.getScore() * 0.8 + student.getAttendance() + student.getPoint() >= 70)
                student.setPass(true);
            System.out.println(student.toStringPass());
        }
    }
}
