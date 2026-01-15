package interp;

import java.util.Optional;

public class EmptyEnv implements Env {
    @Override
    public Binding last() {
        return null;
    }

    @Override
    public Env previous() {
        return null;
    }

    @Override
    public Env add(String id, Value value) {
        return new NonEmptyEnv(new Binding(id, value), this);
    }

    @Override
    public Optional<Value> lookup(String id) {
        return Optional.empty();
    }
}
