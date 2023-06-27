import application.Certificate;
import school.School;
import student.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO-0 데이터 생성
        // 부산소프트웨어마이스터고등학교를 생성합니다.
        School bssm = new School("부산소프트웨어마이스터고등학교");

        // 밤돌중학교를 다니고 있는 이밤돌 학생을 생성합니다.
        Student lee = new Student(
                "이밤돌",
                "010-1234-5678",
                new School("밤돌중학교"),
                List.of(70, 68, 91),
                List.of(0, 3, 0),
                List.of()
        );


        // 곰돌중학교를 다니고 있는 금곰돌 학생을 생성합니다.
        Student gold = new Student(
                "금곰돌",
                "010-1234-4231",
                new School("곰돌중학교"),
                List.of(100, 95, 100),
                List.of(0, 0, 0),
                List.of(Certificate.USEFUL_COMPUTER_SKILL_LEVEL_1)
        );


        // TODO-1 이밤돌 학생 원서
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        lee.writeApplication(bssm);

        // 이밤돌 학생이 원서를 제출합니다.
        lee.submitApplication();

        // TODO-2 금곰돌 학생 원서
        // 금곰돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        gold.writeApplication(bssm);

        // 금곰돌 학생이 원서를 제출합니다.
        gold.submitApplication();

        // TODO-3 이밤돌 학생 원서 재제출
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        lee.writeApplication(bssm);

        // 이밤돌 학생이 원서를 제출합니다.
        // 원서는 정상적으로 처리하지 않고, 한 번만 제출할 수 있다는 메시지를 출력합니다.
        lee.submitApplication();

        // TODO-4 원서 조회
        // 제출한 모든 원서를 점수 순을 조회합니다.
        bssm.printApplicationByScore();

        // TODO-5 합불 여부 입력
        // 자유롭게 기준을 세워서 그 기준에 따라 이밤돌 학생은 탈락으로, 금곰돌 학생은 합격으로 처리합니다.
        bssm.handleApplication();

        // TODO-6 자신의 원서 상태 조회
        // 이밤돌 학생이 본인의 원서 상태를 조회합니다.
        lee.printApplicationState();

        // 금곰돌 학생이 본인의 원서 상태를 조회합니다.
        gold.printApplicationState();

    }
}
