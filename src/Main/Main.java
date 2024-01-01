package Main;

public class Main {
    public static void main(String[] args) {

        // TODO-0 데이터 생성
        // 부산소프트웨어마이스터고등학교를 생성합니다.
        School bssm = new School("부산소프트웨어마이스터고등학교");
        // 밤돌중학교를 다니고 있는 이밤돌 학생을 생성합니다.
        Student leebamdol = new Student("이밤돌", "밤돌중학교", "010-1357-2468");
        // 곰돌중학교를 다니고 있는 금곰돌 학생을 생성합니다.
        Student geumgomdol = new Student("금곰돌", "곰돌중학교", "010-2468-1357");

        // TODO-1 이밤돌 학생 원서
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        leebamdol.setApplicationForm('C', 80, 0);
        // 이밤돌 학생이 원서를 제출합니다.
        leebamdol.submitApplicationForm(bssm);

        // TODO-2 금곰돌 학생 원서
        // 금곰돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        geumgomdol.setApplicationForm('B', 100, 1);
        // 금곰돌 학생이 원서를 제출합니다.
        geumgomdol.submitApplicationForm(bssm);

        // TODO-3 이밤돌 학생 원서 재제출
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        leebamdol.setApplicationForm('A', 100, 1);
        // 이밤돌 학생이 원서를 제출합니다.
        leebamdol.submitApplicationForm(bssm);
        // 원서는 정상적으로 처리하지 않고, 한 번만 제출할 수 있다는 메시지를 출력합니다.

        // TODO-4 원서 조회
        // 제출한 모든 원서를 점수 순을 조회합니다.
        bssm.viewApplicationForm();

        // TODO-5 합불 여부 입력
        // 자유롭게 기준을 세워서 그 기준에 따라 이밤돌 학생은 탈락으로, 금곰돌 학생은 합격으로 처리합니다.
        bssm.passStudent();

        // TODO-6 자신의 원서 상태 조회
        // 이밤돌 학생이 본인의 원서 상태를 조회합니다.
        leebamdol.checkPass();
        // 금곰돌 학생이 본인의 원서 상태를 조회합니다.
        geumgomdol.checkPass();
    }
}