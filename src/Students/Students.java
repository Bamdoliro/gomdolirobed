package Students;

import School.BSSM;

import java.util.ArrayList;


public class Students extends BSSM {
    private String studentName; // 학생 이름
    private String studentPhone; // 학생 전화번호
    private String studentMiddle; // 학생 출신 중학교
    private int studentGrade; // 학생 성적
    private int studentAttend; // 학생 출결
    private int studentPoint; // 학생 가산점

    private boolean submit = false; // 제출 여부

    private boolean pass = false; // 합불

    public static ArrayList<Students> studentsArrayList = new ArrayList<>();

    public Students() {
    }


    public Students(String studentName, String studentPhone, String studentMiddle, int studentGrade, int studentAttend, int studentPoint, boolean studentSubmit) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentMiddle = studentMiddle;
        this.studentGrade = studentGrade;
        this.studentAttend = studentAttend;
        this.studentPoint = studentPoint;
    }

    public void setData(String studentName, String studentPhone, String studentMiddle, int studentGrade, int studentAttend, int studentPoint, boolean studentSubmit) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentMiddle = studentMiddle;
        this.studentGrade = studentGrade;
        this.studentAttend = studentAttend;
        this.studentPoint = studentPoint;

        Students setDatas = new Students(studentName, studentPhone, studentMiddle, studentGrade, studentAttend, studentPoint, studentSubmit);
        studentsArrayList.add(setDatas);
    }

    // Getter & Setter로 Arraylist에 값 전달
    public static ArrayList<Students> getStudents() {
        return studentsArrayList;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentMiddle() {
        return studentMiddle;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public int getStudentAttend() {
        return studentAttend;
    }

    public int getStudentPoint() {
        return studentPoint;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
}