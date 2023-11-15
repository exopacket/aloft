// Generated from /home/ryan/aloft/aloft-server/src/main/java/org/extendedweb/aloft/server/grammar/antlr/Aloft.g4 by ANTLR 4.13.1
package org.extendedweb.aloft.server.grammar.antlr;
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
	 * Visit a parse tree produced by {@link AloftParser#routes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutes(AloftParser.RoutesContext ctx);
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
	 * Visit a parse tree produced by {@link AloftParser#path_with_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_with_var(AloftParser.Path_with_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#path_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_var(AloftParser.Path_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(AloftParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AloftParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AloftParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(AloftParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AloftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#function_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_types(AloftParser.Function_typesContext ctx);
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
	 * Visit a parse tree produced by {@link AloftParser#any_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_var(AloftParser.Any_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#any_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_function(AloftParser.Any_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#private_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_named(AloftParser.Private_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_name_with_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name_with_params(AloftParser.Var_name_with_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(AloftParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AloftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_expression(AloftParser.Var_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AloftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#isset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsset(AloftParser.IssetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#empty_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_function(AloftParser.Empty_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AloftParser.IfContext ctx);
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
	 * Visit a parse tree produced by {@link AloftParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(AloftParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#param_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_values(AloftParser.Param_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#var_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_args(AloftParser.Var_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AloftParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#comma_separated_var_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_separated_var_expression(AloftParser.Comma_separated_var_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(AloftParser.Property_valueContext ctx);
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
	 * Visit a parse tree produced by {@link AloftParser#curly_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_block(AloftParser.Curly_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#named_with_params_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_with_params_special(AloftParser.Named_with_params_specialContext ctx);
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
	 * Visit a parse tree produced by {@link AloftParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(AloftParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AloftParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(AloftParser.File_nameContext ctx);
}