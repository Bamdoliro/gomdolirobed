import java.util.ArrayList;

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

            public Applicant(String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
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

        private final ArrayList<Applicant> applicantList;

        public BSSM() {
            applicantList = new ArrayList<>();
        }

        public void addApplicant
                (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
            Applicant applicant = new Applicant(name, phoneNumber, middleSchool, grade, attendance, addition);
            applicantList.add(applicant);
        }

        public void viewApplicant(String name) {
            for (Applicant applicant : applicantList) {
                if (applicant.getName().equals(name)) {
                    System.out.println("이름: " + applicant.getName());
                    System.out.println("전화번호: " + applicant.getPhoneNumber());
                    System.out.println("중학교: " + applicant.getMiddleSchool());
                    System.out.println("성적: " + applicant.getGrade());
                    System.out.println("출결: " + applicant.getAttendance());
                    System.out.println("가산점: " + applicant.getAddition());
                    System.out.println("합격여부: " + applicant.getStatus());
                    return;
                }
            }
            System.out.println("해당 이름의 지원자를 찾을 수 없습니다.");
        }

        public void setApplicationStatus(String name, String status) {
            for (Applicant applicant : applicantList) {
                if (applicant.getName().equals(name)) {
                    applicant.setStatus(status);
                    return;
                }
            }
            System.out.println("해당 이름의 지원자를 찾을 수 없습니다.");
        }
    }
    public static void main(String[] args) {

        // TODO-0 데이터 생성
        // 부산소프트웨어마이스터고등학교를 생성합니다.
        BSSM bssm = new BSSM();

        // 밤돌중학교를 다니고 있는 이밤돌 학생을 생성합니다.

        // 곰돌중학교를 다니고 있는 금곰돌 학생을 생성합니다.


        // TODO-1 이밤돌 학생 원서
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.

        // 이밤돌 학생이 원서를 제출합니다.


        // TODO-2 금곰돌 학생 원서
        // 금곰돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.

        // 금곰돌 학생이 원서를 제출합니다.
        
        
        // TODO-3 이밤돌 학생 원서 재제출
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        
        // 이밤돌 학생이 원서를 제출합니다.
        // 원서는 정상적으로 처리하지 않고, 한 번만 제출할 수 있다는 메시지를 출력합니다.


        // TODO-4 원서 조회
        // 제출한 모든 원서를 점수 순을 조회합니다.


        // TODO-5 합불 여부 입력
        // 자유롭게 기준을 세워서 그 기준에 따라 이밤돌 학생은 탈락으로, 금곰돌 학생은 합격으로 처리합니다.


        // TODO-6 자신의 원서 상태 조회
        // 이밤돌 학생이 본인의 원서 상태를 조회합니다.

        // 금곰돌 학생이 본인의 원서 상태를 조회합니다.

    }
}
