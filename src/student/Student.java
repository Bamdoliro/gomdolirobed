package student;

public class Student {
    private String name; // 이름
    private String tel; // 전화번호
    private String nativeSC; // 출신 중학교
    private int score; // 성적
    private int attendance; // 출결
    private int point; // 가산점

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
}
