package ast;

import interp.Env;
import interp.IceCubeVal;
import interp.Value;

public class Fix extends Term {
    String varName;
    Term term;

    public Fix(String varName, Term term) {
        this.varName = varName;
        this.term = term;
    }

    @Override
    public Value interp(Env e) {
        IceCubeVal ice = new IceCubeVal(varName, term, e);
        Env newEnv = e.add(varName, ice);
        return term.interp(newEnv);
    }
}
