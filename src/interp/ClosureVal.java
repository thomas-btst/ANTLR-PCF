package interp;

import ast.Term;

public record ClosureVal(String varName, Term body, Env e) implements Value {}
