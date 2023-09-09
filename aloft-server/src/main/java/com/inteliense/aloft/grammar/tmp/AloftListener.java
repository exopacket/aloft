// Generated from _Aloft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AloftParser}.
 */
public interface AloftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AloftParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(AloftParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(AloftParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(AloftParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(AloftParser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(AloftParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(AloftParser.Class_declarationContext ctx);
}