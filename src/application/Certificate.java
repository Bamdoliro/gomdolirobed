package application;

public enum Certificate {
    USEFUL_COMPUTER_SKILL_LEVEL_1(3),
    USEFUL_COMPUTER_SKILL_LEVEL_2(2),
    USEFUL_COMPUTER_SKILL_LEVEL_3(1)
    ;

    private final int score;

    Certificate(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
