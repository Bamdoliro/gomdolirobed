package application;

import school.School;
import student.Student;

import java.util.List;

public class Application {

    private int gradeScore;
    private int attendanceScore;
    private int bonusScore;
    private State state;
    private Student applicant;
    private School targetSchool;

    public void submit() {
        targetSchool.receiveApplication(this);
    }

    public Application(Student writer, School targetSchool) {
        this.gradeScore = calculateGradeScore(writer.getGradeList());
        this.attendanceScore = calculateAttendanceScore(writer.getAttendanceList());
        this.bonusScore = calculateBonusScore(writer.getCertificateList());
        this.applicant = writer;
        this.targetSchool = targetSchool;
        this.state = State.DRAFT;
    }

    private int calculateGradeScore(List<Integer> gradeList) {
        return gradeList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private int calculateAttendanceScore(List<Integer> attendanceList) {
        return 30 - attendanceList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private int calculateBonusScore(List<Certificate> certificateList) {
        return certificateList.stream()
                .mapToInt(Certificate::getScore)
                .sum();
    }

    public void submitted() {
        this.state = State.SUBMITTED;
    }

    public void pass() {
        this.state = State.PASSED;
    }

    public void fail() {
        this.state = State.FAILED;
    }

    public Student getApplicant() {
        return applicant;
    }

    public int getTotalScore() {
        return gradeScore + attendanceScore + bonusScore;
    }

    public String getState() {
        return state.getDescription() + "되었습니다.";
    }

    @Override
    public String toString() {
        return String.format("|  %s  | %s | %s | %d |",
                applicant.getName(),
                applicant.getPhoneNumber(),
                applicant.getSchool().getName(),
                getTotalScore());
    }
}
