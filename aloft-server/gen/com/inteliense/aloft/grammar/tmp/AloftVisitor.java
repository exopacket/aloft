// Generated from /home/ryan/aloft/aloft-server/src/main/java/com/inteliense/aloft/grammar/tmp/Aloft.g4 by ANTLR 4.12.0
package com.inteliense.aloft.grammar.tmp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AloftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AloftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AloftParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(AloftParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(AloftParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AloftParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AloftParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AloftParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(AloftParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(AloftParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(AloftParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#animation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimation(AloftParser.AnimationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(AloftParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(AloftParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(AloftParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#callable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallable(AloftParser.CallableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AloftParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#isset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsset(AloftParser.IssetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AloftParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(AloftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(AloftParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_variable(AloftParser.Declare_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AloftParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#variable_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_options(AloftParser.Variable_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_options(AloftParser.Var_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(AloftParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(AloftParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#condtional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondtional(AloftParser.CondtionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AloftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#enclosed_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclosed_var(AloftParser.Enclosed_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#named_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_switch(AloftParser.Named_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#enclosed_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclosed_vars(AloftParser.Enclosed_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(AloftParser.PathContext ctx);
}