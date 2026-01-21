package ast;

import interp.*;

public class Apply extends Term {
    Term fun, param;

    public Apply(Term fun, Term param) {
        this.fun = fun;
        this.param = param;
    }

    @Override
    public Value interp(Env e) {
        Value value = fun.interp(e);
        if (!(value instanceof ClosureVal(String varName, Term body, Env funEnv)))
            throw new Error("Expected a function, but got " + value.getClass().getSimpleName());
        Value paramVal = param.interp(e);
        return body.interp(funEnv.add(varName, paramVal));
    }
}
