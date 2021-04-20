package app;

/**
 * State
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum State {

    /**
     *
     */
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3)
    ;

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}