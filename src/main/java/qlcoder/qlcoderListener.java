package qlcoder;

// Generated from qlcoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link qlcoderParser}.
 */
public interface qlcoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link qlcoderParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(qlcoderParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlcoderParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(qlcoderParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rtype}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterRtype(qlcoderParser.RtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rtype}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitRtype(qlcoderParser.RtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rnew}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterRnew(qlcoderParser.RnewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rnew}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitRnew(qlcoderParser.RnewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rassign}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterRassign(qlcoderParser.RassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rassign}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitRassign(qlcoderParser.RassignContext ctx);
}