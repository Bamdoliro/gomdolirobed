import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static class BSSM {
        static class Applicant {
            private final String name;
            private final String phoneNumber;
            private final String middleSchool;
            private final int grade;
            private final int attendance;
            private final int addition;
            private String status;

            public Applicant
                    (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.middleSchool = middleSchool;
                this.grade = grade;
                this.attendance = attendance;
                this.addition = addition;
                this.status = "미결정";
            }

            public String getName() {
                return name;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public String getMiddleSchool() {
                return middleSchool;
            }

            public int getGrade() {
                return grade;
            }

            public int getAttendance() {
                return attendance;
            }

            public int getAddition() {
                return addition;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }

        private final List<Applicant> applicantList;
        private int submitId;

        public BSSM() {
            applicantList = new ArrayList<>();
            submitId = 0;
        }

        public void addApplicant
                (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
            Applicant applicant = new Applicant(name, phoneNumber, middleSchool, grade, attendance, addition);
            applicantList.add(applicant);
        }

        public void viewApplicant(String name) {
            for (Applicant applicant : applicantList) {
                if (applicant.getName().equals(name)) {
                    System.out.println("====================");
                    System.out.println("이름: " + applicant.getName());
                    System.out.println("전화번호: " + applicant.getPhoneNumber());
                    System.out.println("중학교: " + applicant.getMiddleSchool());
                    System.out.println("성적: " + applicant.getGrade());
                    System.out.println("출결: " + applicant.getAttendance());
                    System.out.println("가산점: " + applicant.getAddition());
                    System.out.println("합격여부: " + applicant.getStatus());
                    System.out.println("====================");
                    return;
                }
            }
            System.out.println("해당 이름의 지원자를 찾을 수 없습니다.");
        }

        public void judgeApplicationStatus(String phoneNumber) {
            int totalScore = calculateTotalScores(phoneNumber);
            if (totalScore >= 140) {
                setApplicationStatus(phoneNumber, "합격");
            } else {
                setApplicationStatus(phoneNumber, "불합격");
            }
        }

        public void setApplicationStatus(String phoneNumber, String status) {
            for (Applicant applicant : applicantList) {
                if (applicant.getPhoneNumber().equals(phoneNumber)) {
                    applicant.setStatus(status);
                    return;
                }
            }
            System.out.println("해당 전화번호의 지원자를 찾을 수 없습니다.");
        }

        public int getNextSubmitId() {
            return ++submitId;
        }

        public void sortApplicantsByGradeDescending() {
            applicantList.sort(Comparator.comparingInt(Applicant::getGrade).reversed());
        }

        public void viewAllApplications() {
            for (Applicant applicant : applicantList) {
                System.out.println("이름: " + applicant.getName() + ", 성적: " + applicant.getGrade());
                System.out.println("====================");
            }
        }

        public int calculateTotalScores(String phoneNumber) {
            for (Applicant applicant : applicantList) {
                if (applicant.getPhoneNumber().equals(phoneNumber)) {
                    return applicant.getGrade() + applicant.getAttendance() + applicant.getAddition();
                }
            }
            return 0;
        }
    }

    static class Leebamdol {
        private String name;
        private String phoneNumber;
        private String middleSchool;
        private int grade;
        private int attendance;
        private int addition;
        private int submitId = -1;

        public void writeApplication
                (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.middleSchool = middleSchool;
            this.grade = grade;
            this.attendance = attendance;
            this.addition = addition;
        }

        public void submitApplication(BSSM bssm) {
            if (submitId == -1) {
                bssm.addApplicant
                        (this.name, this.phoneNumber, this.middleSchool, this.grade, this.attendance, this.addition);
                this.submitId = bssm.getNextSubmitId();
            } else {
                System.out.println("원서는 한 번만 제출할 수 있습니다.");
            }
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getName() {
            return name;
        }
    }

    static class Geumgomdol {
        private String name;
        private String phoneNumber;
        private String middleSchool;
        private int grade;
        private int attendance;
        private int addition;
        private int submitId = -1;

        public void writeApplication
                (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.middleSchool = middleSchool;
            this.grade = grade;
            this.attendance = attendance;
            this.addition = addition;
        }

        public void submitApplication(BSSM bssm) {
            if (submitId == -1) {
                bssm.addApplicant
                        (this.name, this.phoneNumber, this.middleSchool, this.grade, this.attendance, this.addition);
                this.submitId = bssm.getNextSubmitId();
            } else {
                System.out.println("원서는 한 번만 제출할 수 있습니다.");
            }
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        BSSM bssm = new BSSM();
        Leebamdol leebamdol = new Leebamdol();
        Geumgomdol geumgomdol = new Geumgomdol();

        leebamdol.writeApplication
            ("이밤돌", "010-1111-2222", "밤돌중학교", 110, 11, 0);
        leebamdol.submitApplication(bssm);

        geumgomdol.writeApplication
            ("금곰돌", "010-2222-1111", "금돌중학교", 140, 18, 4);
        geumgomdol.submitApplication(bssm);

        leebamdol.writeApplication
            ("이밤돌", "010-1111-2222", "밤돌중학교", 110, 11, 4);
        leebamdol.submitApplication(bssm);

        bssm.sortApplicantsByGradeDescending();
        bssm.viewAllApplications();

        bssm.judgeApplicationStatus(leebamdol.phoneNumber);
        bssm.judgeApplicationStatus(geumgomdol.phoneNumber);

        bssm.viewApplicant(leebamdol.getName());
        bssm.viewApplicant(geumgomdol.getName());
    }
}
