package ast;

import interp.Env;
import interp.Value;

public class Let extends Term {
    String name;
    Term value, term;

    public Let(String name, Term value, Term term) {
        this.name = name;
        this.value = value;
        this.term = term;
    }

    @Override
    public Value interp(Env e) {
        Env newEnv = e.add(name, value.interp(e));
        return term.interp(newEnv);
    }
}
