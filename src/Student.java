public class Student {
    private String name;
    private String middleSchool;
    private int score;
    private int plusScore;
    private boolean applicationSubmitted; // 원서 제출 여부를 나타내는 변수
    private boolean accepted; // 합격 여부를 나타내는 변수

    public Student(String name, String middleSchool, int score, int plusScore) {
        this.name = name;
        this.middleSchool = middleSchool;
        this.score = score;
        this.plusScore = plusScore;
        this.applicationSubmitted = false; // 원서 미제출 상태로 초기화
        this.accepted = false; // 합격 여부 초기화
    }

    public String getName() {
        return name;
    }

    public String getMiddleSchool() {
        return middleSchool;
    }

    public int getScore() {
        return score;
    }

    public int getPlusScore() {
        return plusScore;
    }

    public boolean isApplicationSubmitted() {
        return applicationSubmitted;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void submitApplication() {
        if (applicationSubmitted) {
            System.out.println(name + " 학생은 이미 원서를 제출했습니다. 원서는 한 번만 제출할 수 있습니다.");
        } else {
            applicationSubmitted = true;
            System.out.println(name + " 학생의 원서가 제출되었습니다.");
        }
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public void checkApplicationStatus() {
        System.out.print(name + " 학생의 원서 상태: " + (applicationSubmitted ? "제출됨" : "미제출"));
        System.out.println();
        if (applicationSubmitted) {
            System.out.println("합격 여부: " + (accepted ? "합격" : "불합격"));
        } else {
            System.out.println();
        }
    }
}
