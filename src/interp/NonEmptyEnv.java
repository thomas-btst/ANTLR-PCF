package interp;

import java.util.Optional;

public record NonEmptyEnv(Binding last, Env previous) implements Env {
    @Override
    public Binding last() {
        return last;
    }

    @Override
    public Env previous() {
        return previous;
    }

    @Override
    public Env add(String id, Value value) {
        return new NonEmptyEnv(new Binding(id, value), this);
    }

    @Override
    public Optional<Value> lookup(String id) {
        if (last.name().equals(id))
            return Optional.of(last.value());
        return previous.lookup(id);
    }
}
