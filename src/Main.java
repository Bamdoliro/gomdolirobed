public class Main {

    static class BSSM {
        static class Applicant {
            private String name;
            private String phoneNumber;
            private String middleSchool;
            private int grade;
            private int attendance;
            private int addition;

            //          S: API
            public void setName(String name) {this.name = name;}

            public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

            public void setMiddleSchool(String middleSchool) {this.middleSchool = middleSchool;}

            public void setGrade(int grade) {this.grade = grade;}

            public void setAttendance(int attendance) {this.attendance = attendance;}

            public void setAddition(int addition) {this.addition = addition;}

            public void setIntegrated // 통합본
            (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.middleSchool = middleSchool;
                this.grade = grade;
                this.attendance = attendance;
                this.addition = addition;
            }

            public String getName() {return name;}

            public String getPhoneNumber() {return phoneNumber;}

            public String getMiddleSchool() {return middleSchool;}

            public int getGrade() {return grade;}

            public int getAttendance() {return attendance;}

            public int getAddition() {return addition;}
//          E: API

        }
    }

    public static void main(String[] args) {

        // TODO-0 데이터 생성
        // 부산소프트웨어마이스터고등학교를 생성합니다.

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
