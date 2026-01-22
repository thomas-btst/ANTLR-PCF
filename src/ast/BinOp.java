package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class BinOp extends Term {
    public OP op;
    public Term term1, term2;
    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        return switch (term1.interp(e)) {
            case IntVal intVal1 -> {
                int value1 = intVal1.value();
                yield switch (term2.interp(e)) {
                    case IntVal intVal2 -> {
                        int value2 = intVal2.value();
                        int res = switch (op) {
                            case PLUS -> value1 + value2;
                            case MINUS -> value1 - value2;
                            case TIMES -> value1 * value2;
                            case DIVIDE -> {
                                if (value2 == 0)
                                    throw new Error("Division by zero is not allowed");
                                yield value1 / value2;
                            }
                        };
                        yield new IntVal(res);
                    }

                    default -> throw new Error("Type Error: Operator " + op + " requires integers");
                };
            }

            default -> throw new Error("Type Error: Operator " + op + " requires integers");
        };
    }
}
