package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class Cond extends Term {
    public Term test, branchZero, branchNotZero ;

    public Cond(Term test, Term branchZero, Term branchNotZero) {
        this.test = test;
        this.branchZero = branchZero;
        this.branchNotZero = branchNotZero;
    }

    @Override
    public Value interp(Env e) {
        Value value = test.interp(e);
        return switch (value) {
            case IntVal val -> val.value() == 0
                ? branchZero.interp(e)
                : branchNotZero.interp(e);
            default -> throw new Error(
                "Condition error: expected IntVal, but got "
                    + value.getClass().getSimpleName()
            );
        };
    }
}
