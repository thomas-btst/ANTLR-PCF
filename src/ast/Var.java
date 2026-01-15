package ast;

import interp.Env;
import interp.Value;

public class Var extends Term {
    String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env e) {
        return e.lookup(name).orElseThrow();
    }
}
