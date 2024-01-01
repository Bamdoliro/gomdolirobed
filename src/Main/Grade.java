package Main;

public enum Grade {
    A(90), B(80), C(70), D(60), E(50);

    private final int value;
    Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
