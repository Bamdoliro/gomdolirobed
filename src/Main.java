import School.BSSM;
import Students.Students;

public class Main {
    public static void main(String[] args) {

        // TODO-0 데이터 생성
        // 부산소프트웨어마이스터고등학교를 생성합니다.
        BSSM bssm = new BSSM();
        // 밤돌중학교를 다니고 있는 이밤돌 학생을 생성합니다.
        Students lee = new Students();
        // 곰돌중학교를 다니고 있는 금곰돌 학생을 생성합니다.
        Students geum = new Students();

        // TODO-1 이밤돌 학생 원서
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        lee = new Students("이밤돌", "01012345678", "밤돌중학교", 78, 5, 7, false);
        // 이밤돌 학생이 원서를 제출합니다.
        bssm.setStudents(lee);

        // TODO-2 금곰돌 학생 원서
        // 금곰돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        geum = new Students("금곰돌", "01087654321", "곰돌중학교", 98, 4, 3, false);
        // 금곰돌 학생이 원서를 제출합니다.
        bssm.setStudents(geum);

        // TODO-3 이밤돌 학생 원서 재제출
        // 이밤돌 학생이 부산소프트웨어마이스터고등학교에 낼 원서를 작성합니다.
        lee = new Students("이밤돌", "01012345678", "밤돌중학교", 78, 5, 7, false);
        // 이밤돌 학생이 원서를 제출합니다.
        // 원서는 정상적으로 처리하지 않고, 한 번만 제출할 수 있다는 메시지를 출력합니다.
        bssm.setStudents(lee);

        System.out.println("==========================");

        // TODO-4 원서 조회
        // 제출한 모든 원서를 점수 순을 조회합니다.
        bssm.checkApp();
        // TODO-5 합불 여부 입력
        // 자유롭게 기준을 세워서 그 기준에 따라 이밤돌 학생은 탈락으로, 금곰돌 학생은 합격으로 처리합니다.
        bssm.pass();

        // TODO-6 자신의 원서 상태 조회
        // 이밤돌 학생이 본인의 원서 상태를 조회합니다.
        bssm.searchApp("이밤돌", "01012345678");
        // 금곰돌 학생이 본인의 원서 상태를 조회합니다.
        bssm.searchApp("금곰돌", "01087654321");
    }
}