package interp;

import ast.Term;

public record IceCubeVal(String varName, Term body, Env e) implements Value {}