public class Main {
    public static void main(String[] args) {
        // TODO-0 데이터 생성
        School bssm = new School("부산소프트웨어마이스터고등학교");
        // 부산소프트웨어마이스터고등학교를 생성합니다.
        Student lbd;
        // 밤돌중학교를 다니고 있는 이밤돌 학생을 생성합니다.
        Student ggd;
        // 곰돌중학교를 다니고 있는 금곰돌 학생을 생성합니다.

        // TODO-1 이밤돌 학생 원서
        lbd = new Student("이밤돌", "밤돌중학교", 64, 8);
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        bssm.addStudent(lbd);
        bssm.submitApplication(lbd);
        // 이밤돌 학생이 원서를 제출합니다.

        // TODO-2 금곰돌 학생 원서
        ggd = new Student("금곰돌", "곰돌중학교", 82, 1);
        // 금곰돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        bssm.addStudent(ggd);
        bssm.submitApplication(ggd);
        // 금곰돌 학생이 원서를 제출합니다.

        // TODO-3 이밤돌 학생 원서 재제출
        lbd = new Student("이밤돌", "밤돌중학교", 64, 8);
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        bssm.addStudent(lbd);
        bssm.submitApplication(lbd);
        System.out.println();
        System.out.println("원서 조회");
        // 이밤돌 학생이 원서를 제출합니다.
        // 원서는 정상적으로 처리하지 않고, 한 번만 제출할 수 있다는 메시지를 출력합니다.
        // TODO-4 원서 조회
        bssm.printApplicationsByScore();
        // 제출한 모든 원서를 점수 순을 조회합니다.

        System.out.println();
        // TODO-5 합불 여부 입력
        for (Student student : bssm.getStudents()) {
            if (student == ggd) {
                student.setAccepted(true);
            } else {
                student.setAccepted(false);
            }
        }
        // 자유롭게 기준을 세워서 그 기준에 따라 이밤돌 학생은 탈락으로, 금곰돌 학생은 합격으로 처리합니다.

        // TODO-6 자신의 원서 상태 조회
        System.out.println("원서 상태 조회");
        lbd.checkApplicationStatus();
        // 이밤돌 학생이 본인의 원서 상태를 조회합니다.
        ggd.checkApplicationStatus();
        // 금곰돌 학생이 본인의 원서 상태를 조회합니다.
    }
}
