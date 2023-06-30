package School;

import Students.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BSSM {

    public BSSM() {
    }


    // 원서를 제출하는 메소드
    public void setStudents(Students student) {
        boolean submitted = false;
        for (Students existingStudent : Students.getStudents()) {
            if (existingStudent.getStudentName().equals(student.getStudentName()) && existingStudent.getStudentPhone().equals(student.getStudentPhone())) {
                submitted = true;
                break;
            }
        }
        if (submitted) {
            System.out.println("원서는 한 번만 제출할 수 있습니다.");
        } else {
            student.setSubmit(true);
            Students.getStudents().add(student);
            System.out.println("정상적으로 제출되었습니다.");
        }
    }

    // 원서 조회 메소드
    public void checkApp() {
        ArrayList<Students> studentsArrayList = sort();
        for (Students students : studentsArrayList) {
            System.out.println("성명 : " + students.getStudentName());
            System.out.println("전화번호 : " + students.getStudentPhone());
            System.out.println("중학교 : " + students.getStudentMiddle());
            System.out.println("성적 : " + students.getStudentGrade());
            System.out.println("출결 : " + students.getStudentAttend());
            System.out.println("가산점 : " + students.getStudentPoint());
            System.out.println("==========================");
        }
    }

    // 원서를 점수 내림차순으로 정렬
    public ArrayList<Students> sort() {
        ArrayList<Students> studentsArrayList = new ArrayList<>(Students.getStudents());
        Collections.sort(studentsArrayList, Comparator.comparingInt(Students::getStudentGrade).reversed());
        return studentsArrayList;
    }

    // 합격, 불합격을 결정하는 메소드
    public void pass() {
        ArrayList<Students> studentsArrayList = sort();
        for (Students students : studentsArrayList) {
            if (students.getStudentGrade() * 0.8 + students.getStudentAttend() + students.getStudentPoint() >= 80) {
                {
                    students.setPass(true);
                }
            } else {
                students.setPass(false);
            }
        }
    }

    // 원서 합불 상태 조회 메소드
    public void searchApp(String studentName, String studentPhone) {
        boolean found = false;
        ArrayList<Students> studentsArrayList = new ArrayList<>(Students.getStudents());
        for (Students student : studentsArrayList) {
            if (studentName.equals(student.getStudentName()) && studentPhone.equals(student.getStudentPhone())) {
                found = true;
                if (student.isPass()) {
                    System.out.println(student.getStudentName() + " 학생은 합격입니다. 축하드립니다!!!");
                } else System.out.println(student.getStudentName() + " 학생은 불합격입니다.");
                break;
            }
        }
        if (!found) {
            System.out.println("존재하지 않는 정보입니다.");
        }
    }

}