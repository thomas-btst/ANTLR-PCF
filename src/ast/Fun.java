package ast;

import interp.Env;
import interp.ClosureVal;
import interp.Value;

public class Fun extends Term {
    String varName;
    Term body;

    public Fun(String varName, Term body) {
        this.varName = varName;
        this.body = body;
    }

    @Override
    public Value interp(Env e) {
        return new ClosureVal(varName, body, e);
    }
}
