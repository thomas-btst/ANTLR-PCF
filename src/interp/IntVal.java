package interp;

public record IntVal(int value) implements Value {

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
