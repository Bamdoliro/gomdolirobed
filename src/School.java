import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void submitApplication(Student student) {
        if (student.isApplicationSubmitted()) {
            System.out.println(student.getName() + " 학생은 이미 원서를 제출했습니다. 원서는 한 번만 제출할 수 있습니다.");
        } else {
            student.submitApplication();
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printApplicationsByScore() {
        Collections.sort(students, Comparator.comparingInt(Student::getScore).reversed());
        for (Student student : students) {
            System.out.println("이름: " + student.getName());
            System.out.println("중학교: " + student.getMiddleSchool());
            System.out.println("성적: " + student.getScore());
            System.out.println("가산점: " + student.getPlusScore());
            System.out.println();
        }
    }
}
