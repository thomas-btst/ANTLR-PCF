// Generated from /Users/clovis/ANTLR-PCF-1/src/parser/PCF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PCFParser}.
 */
public interface PCFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PCFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PCFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPar(PCFParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPar(PCFParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCond(PCFParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCond(PCFParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLit(PCFParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLit(PCFParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVar(PCFParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVar(PCFParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLet(PCFParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLet(PCFParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(PCFParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(PCFParser.BinOpContext ctx);
}