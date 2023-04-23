package carracing;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MINIMUM_SPEED = 4;
    private final String name;
    private int position;

    public Car() {
        this.name = "temp";
    }

    public Car(final String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("5글자를 초과하였습니다.");
        }
        this.name = name;
    }

    public int move(int speed) {
        if (speed >= MINIMUM_SPEED) {
            this.position++;
        }
        return this.position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
