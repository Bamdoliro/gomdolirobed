package student;

import application.Application;
import application.Certificate;
import school.School;

import java.util.List;

public class Student {

    private final String name;
    private final String phoneNumber;
    private final School school;

    private final List<Integer> gradeList;
    private final List<Integer> attendanceList;
    private final List<Certificate> certificateList;
    private Application application;
    private Application writtenApplication;

    public Student(String name, String phoneNumber, School school, List<Integer> gradeList, List<Integer> attendanceList, List<Certificate> certificateList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.school = school;
        this.gradeList = gradeList;
        this.attendanceList = attendanceList;
        this.certificateList = certificateList;
    }

    public void writeApplication(School targetSchool) {
        this.writtenApplication = new Application(
                this,
                targetSchool
        );
    }

    public void submitApplication() {
        writtenApplication.submit();
    }

    public List<Integer> getGradeList() {
        return gradeList;
    }

    public List<Integer> getAttendanceList() {
        return attendanceList;
    }

    public List<Certificate> getCertificateList() {
        return certificateList;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public School getSchool() {
        return school;
    }

    public void printApplicationState() {
        System.out.println(application.getState());
    }

    public void receiveApplication(Application application) {
        this.application = application;
    }
}
