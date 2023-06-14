package student;

import java.util.ArrayList;

public class Student {
    private String name; // 이름
    private String tel; // 전화번호
    private String nativeSC; // 출신 중학교
    private int score; // 성적
    private int attendance; // 출결
    private int point; // 가산
    private boolean submit = false;
    private ArrayList<Student> studentData = new ArrayList<>();

    public Student() {}

    public Student(String name, String tel, String nativeSC, int score, int attendance, int point) {
        this.name = name;
        this.tel = tel;
        this.nativeSC = nativeSC;
        this.score = score;
        this.attendance = attendance;
        this.point = point;
    }

    public void setData(String name, String tel, String nativeSC, int score, int attendance, int point) {
        this.name = name;
        this.tel = tel;
        this.nativeSC = nativeSC;
        this.score = score;
        this.attendance = attendance;
        this.point = point;
        Student setStudentData = new Student(name, tel, nativeSC, score, attendance, point);
        studentData.add(setStudentData);
    }

    public ArrayList<Student> getData() {
        if (!submit) {
            submit = true;
            return studentData;
        }
        else {
            System.out.println(getName() + "님 이미 제출하였습니다.");
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNativeSC() {
        return nativeSC;
    }

    public void setNativeSC(String nativeSC) {
        this.nativeSC = nativeSC;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Tel: " + tel +
                ", NativeSC: " + nativeSC +
                ", Score: " + score +
                ", Attendance: " + attendance +
                ", Point: " + point;
    }
}
