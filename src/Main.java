import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // TODO-0 데이터 생성
        HighSchool highSchool = new HighSchool("부산소프트웨어마이스터고");

        MiddleSchoolStudent leeBamDol = new MiddleSchoolStudent("이밤돌", "010-1234-5678", "밤돌중학교", "B", "B", 2, "없음");
        MiddleSchoolStudent kimGeumDol = new MiddleSchoolStudent("금곰돌", "010-9876-5432", "곰돌중학교", "A", "A", 0, "컴퓨터 활용 능력");

        ApplicationForm leeBamDolApplication = new ApplicationForm(leeBamDol, highSchool);
        ApplicationForm kimGeumDolApplication = new ApplicationForm(kimGeumDol, highSchool);

        // TODO-1 이밤돌 학생 원서
        leeBamDolApplication.submit();

        // TODO-2 금곰돌 학생 원서
        kimGeumDolApplication.submit();

        // TODO-3 이밤돌 학생 원서 재제출
        leeBamDolApplication.submit();

        // TODO-4 원서 조회
        ApplicationForm[] applicationForms = {leeBamDolApplication, kimGeumDolApplication};
        applicationForms = sortApplicationFormsByGrade(applicationForms);

        // TODO-5 합불 여부 입력
        boolean leeBamDolAccepted = checkAcceptance(leeBamDol);
        boolean kimGeumDolAccepted = checkAcceptance(kimGeumDol);

        // TODO-6 자신의 원서 상태 조회
        System.out.println("************************");
        System.out.println("이밤돌의 원서 상태:");
        System.out.println(leeBamDolApplication.getStatus());

        System.out.println("금곰돌의 원서 상태:");
        System.out.println(kimGeumDolApplication.getStatus());
    }

    public static ApplicationForm[] sortApplicationFormsByGrade(ApplicationForm[] applicationForms) {
        int n = applicationForms.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (applicationForms[j].getStudent().getGrade().compareTo(applicationForms[j + 1].getStudent().getGrade()) > 0) {
                    ApplicationForm temp = applicationForms[j];
                    applicationForms[j] = applicationForms[j + 1];
                    applicationForms[j + 1] = temp;
                }
            }
        }

        List<ApplicationForm> uniqueForms = new ArrayList<>();
        for (ApplicationForm form : applicationForms) {
            if (!uniqueForms.contains(form)) {
                uniqueForms.add(form);
            }
        }

        System.out.println("************************");
        System.out.println("원서 조회 결과 (성적 순):");
        for (ApplicationForm applicationForm : uniqueForms) {
            System.out.println(applicationForm);
        }
        System.out.println("************************");

        return uniqueForms.toArray(new ApplicationForm[0]);
    }

    public static boolean checkAcceptance(MiddleSchoolStudent student) {
        if (student.getGrade().equals("A") && student.getUnexcusedAbsence() == 0) {
            System.out.println(student.getName() + " 학생은 합격입니다.");
            return true;
        } else {
            System.out.println(student.getName() + " 학생은 불합격입니다.");
            return false;
        }
    }
}

class HighSchool {
    private String name;

    public HighSchool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MiddleSchoolStudent {
    private String name;
    private String phone;
    private String previousSchool;
    private String grade;
    private String attendance;
    private int unexcusedAbsence;
    private String certification;

    public MiddleSchoolStudent(String name, String phone, String previousSchool, String grade, String attendance,
                               int unexcusedAbsence, String certification) {
        this.name = name;
        this.phone = phone;
        this.previousSchool = previousSchool;
        this.grade = grade;
        this.attendance = attendance;
        this.unexcusedAbsence = unexcusedAbsence;
        this.certification = certification;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public String getPreviousSchool() {
        return previousSchool;
    }

    public String getGrade() {
        return grade;
    }

    public String getAttendance() {
        return attendance;
    }

    public int getUnexcusedAbsence() {
        return unexcusedAbsence;
    }

    public String getCertification() {
        return certification;
    }
}

class ApplicationForm {
    private MiddleSchoolStudent student;
    private HighSchool highSchool;
    private boolean submitted;
    private String status;

    public ApplicationForm(MiddleSchoolStudent student, HighSchool highSchool) {
        this.student = student;
        this.highSchool = highSchool;
        this.submitted = false;
        this.status = "미제출";
    }

    public MiddleSchoolStudent getStudent() {
        return student;
    }

    public HighSchool getHighSchool() {
        return highSchool;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public String getStatus() {
        return status;
    }

    public void submit() {
        if (!submitted) {
            submitted = true;
            status = "제출 완료";
            System.out.println(student.getName() + " 학생의 원서가 제출되었습니다.");
        } else {
            System.out.println("이미 제출된 원서입니다. 원서는 한 번만 제출할 수 있습니다.");
        }
    }

    @Override
    public String toString() {
        return "이름: " + student.getName() +
                ", 전화번호: " + student.getPhoneNumber() +
                ", 출신 중학교: " + student.getPreviousSchool() +
                ", 성적: " + student.getGrade() +
                ", 출결: " + student.getAttendance() +
                ", 미인정 결석: " + student.getUnexcusedAbsence() +
                ", 자격증: " + student.getCertification();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationForm otherForm = (ApplicationForm) obj;
        return Objects.equals(student, otherForm.student) &&
                Objects.equals(highSchool, otherForm.highSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, highSchool);
    }
}
