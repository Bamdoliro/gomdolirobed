package student;

import java.util.ArrayList;

public class Student {
    private String name; // 이름
    private String tel; // 전화번호
    private String nativeSC; // 출신 중학교
    private int score; // 성적
    private int attendance; // 출결
    private int point; // 가산
    private boolean submit = false; // 제출 여부
    private boolean pass = false; // 합불 여부
    private ArrayList<Student> studentData = new ArrayList<>();

    public Student() {}

    public Student(String name, String tel, String nativeSC, int score, int attendance, int point, boolean pass) {
        this.name = name;
        this.tel = tel;
        this.nativeSC = nativeSC;
        this.score = score;
        this.attendance = attendance;
        this.point = point;
    }

    // 학생의 원서 저장
    public void setData(String name, String tel, String nativeSC, int score, int attendance, int point) {
        this.name = name;
        this.tel = tel;
        this.nativeSC = nativeSC;
        this.score = score;
        this.attendance = attendance;
        this.point = point;
        Student setStudentData = new Student(name, tel, nativeSC, score, attendance, point, pass);
        studentData.add(setStudentData); // studentData에 받은 데이터 저장
    }

    // 학생 데이터 반환
    public ArrayList<Student> getData() {
        if (!submit) { // 제출을 한번도 하지 않았을 경우
            submit = true;
            return studentData;
        }
        else { // 제출을 한번이라도 한 경우 null return
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

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
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

    // 합격 여부 포함하여 출력
    public String toStringPass() {
        return "Name: " + name +
                ", Tel: " + tel +
                ", NativeSC: " + nativeSC +
                ", Score: " + score +
                ", Attendance: " + attendance +
                ", Point: " + point +
                ", Pass: " + pass;
    }
}
