package application;

public enum State {
    DRAFT("작성"),
    SUBMITTED("제출"),
    PASSED("합격"),
    FAILED("탈락")
    ;

    private final String description;

    State(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
