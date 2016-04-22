package qlcoder;

// Generated from qlcoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link qlcoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface qlcoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link qlcoderParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(qlcoderParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rtype}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtype(qlcoderParser.RtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rnew}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRnew(qlcoderParser.RnewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rassign}
	 * labeled alternative in {@link qlcoderParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRassign(qlcoderParser.RassignContext ctx);
}