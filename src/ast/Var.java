package ast;

import interp.Env;
import interp.IceCubeVal;
import interp.Value;

public class Var extends Term {
    String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env e) {
        Value value = e.lookup(name).orElseThrow(() -> new Error("Variable " + name + " is undefined"));
        if (value instanceof IceCubeVal(String varName, Term body, Env iceCubeEnv)) {
            Env recursiveEnv = iceCubeEnv.add(varName, value);
            return body.interp(recursiveEnv);
        }
        return value;
    }
}
