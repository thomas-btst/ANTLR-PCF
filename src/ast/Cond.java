package ast;

public class Cond extends Term {
    public Term test, branchZero, branchNotZero ;

    public Cond(Term test, Term branchZero, Term branchNotZero) {
        this.test = test;
        this.branchZero = branchZero;
        this.branchNotZero = branchNotZero;
    }
}
