package interp;

import java.util.Optional;

public interface Env {
    Binding last();
    Env previous();
    Env add(String id, Value value);
    Optional<Value> lookup(String id);
}
