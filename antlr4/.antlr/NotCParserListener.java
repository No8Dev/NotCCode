// Generated from /Users/brian/dev/NotCCode/antlr4/NotCParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotCParser}.
 */
public interface NotCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotCParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(NotCParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(NotCParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(NotCParser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(NotCParser.Namespace_or_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(NotCParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(NotCParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(NotCParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(NotCParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(NotCParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(NotCParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element(NotCParser.Tuple_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element(NotCParser.Tuple_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(NotCParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(NotCParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(NotCParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(NotCParser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(NotCParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(NotCParser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(NotCParser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(NotCParser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(NotCParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(NotCParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(NotCParser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(NotCParser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(NotCParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(NotCParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(NotCParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(NotCParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NotCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NotCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_assignment_expression(NotCParser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_assignment_expression(NotCParser.Non_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(NotCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(NotCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(NotCParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(NotCParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(NotCParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(NotCParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(NotCParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(NotCParser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(NotCParser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(NotCParser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(NotCParser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(NotCParser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(NotCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(NotCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(NotCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(NotCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(NotCParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(NotCParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(NotCParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(NotCParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(NotCParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(NotCParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(NotCParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(NotCParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(NotCParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(NotCParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(NotCParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(NotCParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression(NotCParser.Switch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression(NotCParser.Switch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#switch_expression_arms}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression_arms(NotCParser.Switch_expression_armsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#switch_expression_arms}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression_arms(NotCParser.Switch_expression_armsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#switch_expression_arm}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression_arm(NotCParser.Switch_expression_armContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#switch_expression_arm}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression_arm(NotCParser.Switch_expression_armContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(NotCParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(NotCParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(NotCParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(NotCParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(NotCParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(NotCParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(NotCParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(NotCParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(NotCParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(NotCParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleNameExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNameExpression(NotCParser.SimpleNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleNameExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNameExpression(NotCParser.SimpleNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpressions}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpressions(NotCParser.ParenthesisExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpressions}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpressions(NotCParser.ParenthesisExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(NotCParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(NotCParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterLiteralAccessExpression(NotCParser.LiteralAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitLiteralAccessExpression(NotCParser.LiteralAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterBaseAccessExpression(NotCParser.BaseAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseAccessExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitBaseAccessExpression(NotCParser.BaseAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectCreationExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreationExpression(NotCParser.ObjectCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectCreationExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreationExpression(NotCParser.ObjectCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(NotCParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(NotCParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(NotCParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(NotCParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkedExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterCheckedExpression(NotCParser.CheckedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkedExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitCheckedExpression(NotCParser.CheckedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncheckedExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterUncheckedExpression(NotCParser.UncheckedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncheckedExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitUncheckedExpression(NotCParser.UncheckedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueExpression(NotCParser.DefaultValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueExpression(NotCParser.DefaultValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousMethodExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousMethodExpression(NotCParser.AnonymousMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousMethodExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousMethodExpression(NotCParser.AnonymousMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterSizeofExpression(NotCParser.SizeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitSizeofExpression(NotCParser.SizeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterNameofExpression(NotCParser.NameofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameofExpression}
	 * labeled alternative in {@link NotCParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitNameofExpression(NotCParser.NameofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#throwable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThrowable_expression(NotCParser.Throwable_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#throwable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThrowable_expression(NotCParser.Throwable_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#throw_expression}.
	 * @param ctx the parse tree
	 */
	void enterThrow_expression(NotCParser.Throw_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#throw_expression}.
	 * @param ctx the parse tree
	 */
	void exitThrow_expression(NotCParser.Throw_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(NotCParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(NotCParser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(NotCParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(NotCParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#indexer_argument}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_argument(NotCParser.Indexer_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#indexer_argument}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_argument(NotCParser.Indexer_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(NotCParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(NotCParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(NotCParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(NotCParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_or_collection_initializer(NotCParser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_or_collection_initializer(NotCParser.Object_or_collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(NotCParser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(NotCParser.Object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(NotCParser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(NotCParser.Member_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(NotCParser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(NotCParser.Member_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(NotCParser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(NotCParser.Initializer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCollection_initializer(NotCParser.Collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCollection_initializer(NotCParser.Collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer(NotCParser.Element_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer(NotCParser.Element_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_initializer(NotCParser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_initializer(NotCParser.Anonymous_object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(NotCParser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(NotCParser.Member_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(NotCParser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(NotCParser.Member_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void enterUnbound_type_name(NotCParser.Unbound_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void exitUnbound_type_name(NotCParser.Unbound_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_dimension_specifier(NotCParser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_dimension_specifier(NotCParser.Generic_dimension_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#isType}.
	 * @param ctx the parse tree
	 */
	void enterIsType(NotCParser.IsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#isType}.
	 * @param ctx the parse tree
	 */
	void exitIsType(NotCParser.IsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#isTypePatternArms}.
	 * @param ctx the parse tree
	 */
	void enterIsTypePatternArms(NotCParser.IsTypePatternArmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#isTypePatternArms}.
	 * @param ctx the parse tree
	 */
	void exitIsTypePatternArms(NotCParser.IsTypePatternArmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#isTypePatternArm}.
	 * @param ctx the parse tree
	 */
	void enterIsTypePatternArm(NotCParser.IsTypePatternArmContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#isTypePatternArm}.
	 * @param ctx the parse tree
	 */
	void exitIsTypePatternArm(NotCParser.IsTypePatternArmContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(NotCParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(NotCParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_signature(NotCParser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_signature(NotCParser.Anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(NotCParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(NotCParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter(NotCParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter(NotCParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(NotCParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(NotCParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_body(NotCParser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_body(NotCParser.Anonymous_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(NotCParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(NotCParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(NotCParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(NotCParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(NotCParser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(NotCParser.Query_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(NotCParser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(NotCParser.Query_body_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(NotCParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(NotCParser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(NotCParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(NotCParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(NotCParser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(NotCParser.Combined_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(NotCParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(NotCParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(NotCParser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(NotCParser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(NotCParser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(NotCParser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(NotCParser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(NotCParser.Query_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NotCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NotCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(NotCParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(NotCParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_function_declaration(NotCParser.Local_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_function_declaration(NotCParser.Local_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_function_header}.
	 * @param ctx the parse tree
	 */
	void enterLocal_function_header(NotCParser.Local_function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_function_header}.
	 * @param ctx the parse tree
	 */
	void exitLocal_function_header(NotCParser.Local_function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_function_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterLocal_function_modifiers(NotCParser.Local_function_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_function_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitLocal_function_modifiers(NotCParser.Local_function_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_function_body}.
	 * @param ctx the parse tree
	 */
	void enterLocal_function_body(NotCParser.Local_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_function_body}.
	 * @param ctx the parse tree
	 */
	void exitLocal_function_body(NotCParser.Local_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#labeled_Statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_Statement(NotCParser.Labeled_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#labeled_Statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_Statement(NotCParser.Labeled_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(NotCParser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(NotCParser.Embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code theEmptyStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterTheEmptyStatement(NotCParser.TheEmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code theEmptyStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitTheEmptyStatement(NotCParser.TheEmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(NotCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(NotCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(NotCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(NotCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(NotCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(NotCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(NotCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(NotCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(NotCParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(NotCParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(NotCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(NotCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreachStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(NotCParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreachStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(NotCParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(NotCParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(NotCParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(NotCParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(NotCParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(NotCParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(NotCParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(NotCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(NotCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(NotCParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(NotCParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(NotCParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(NotCParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterCheckedStatement(NotCParser.CheckedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitCheckedStatement(NotCParser.CheckedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncheckedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterUncheckedStatement(NotCParser.UncheckedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncheckedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitUncheckedStatement(NotCParser.UncheckedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lockStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(NotCParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lockStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(NotCParser.LockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(NotCParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(NotCParser.UsingStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yieldStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(NotCParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yieldStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(NotCParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsafeStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsafeStatement(NotCParser.UnsafeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsafeStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsafeStatement(NotCParser.UnsafeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterFixedStatement(NotCParser.FixedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixedStatement}
	 * labeled alternative in {@link NotCParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitFixedStatement(NotCParser.FixedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NotCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NotCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(NotCParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(NotCParser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_type(NotCParser.Local_variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_type(NotCParser.Local_variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(NotCParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(NotCParser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(NotCParser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(NotCParser.Local_variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_constant_declaration(NotCParser.Local_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_constant_declaration(NotCParser.Local_constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(NotCParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(NotCParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(NotCParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(NotCParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(NotCParser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(NotCParser.Switch_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#case_guard}.
	 * @param ctx the parse tree
	 */
	void enterCase_guard(NotCParser.Case_guardContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#case_guard}.
	 * @param ctx the parse tree
	 */
	void exitCase_guard(NotCParser.Case_guardContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(NotCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(NotCParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(NotCParser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(NotCParser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(NotCParser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(NotCParser.For_iteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(NotCParser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(NotCParser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clause(NotCParser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clause(NotCParser.Specific_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_catch_clause(NotCParser.General_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_catch_clause(NotCParser.General_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void enterException_filter(NotCParser.Exception_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void exitException_filter(NotCParser.Exception_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(NotCParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(NotCParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void enterResource_acquisition(NotCParser.Resource_acquisitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void exitResource_acquisition(NotCParser.Resource_acquisitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(NotCParser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(NotCParser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(NotCParser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(NotCParser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(NotCParser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(NotCParser.Namespace_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directives(NotCParser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directives(NotCParser.Extern_alias_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directive(NotCParser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directive(NotCParser.Extern_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(NotCParser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(NotCParser.Using_directivesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingAliasDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsingAliasDirective(NotCParser.UsingAliasDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingAliasDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsingAliasDirective(NotCParser.UsingAliasDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingNamespaceDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsingNamespaceDirective(NotCParser.UsingNamespaceDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingNamespaceDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsingNamespaceDirective(NotCParser.UsingNamespaceDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingStaticDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsingStaticDirective(NotCParser.UsingStaticDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingStaticDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsingStaticDirective(NotCParser.UsingStaticDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingModuleDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsingModuleDirective(NotCParser.UsingModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingModuleDirective}
	 * labeled alternative in {@link NotCParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsingModuleDirective(NotCParser.UsingModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(NotCParser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(NotCParser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(NotCParser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(NotCParser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(NotCParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(NotCParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void enterQualified_alias_member(NotCParser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void exitQualified_alias_member(NotCParser.Qualified_alias_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(NotCParser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(NotCParser.Type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(NotCParser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(NotCParser.Type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(NotCParser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(NotCParser.Class_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_list(NotCParser.Interface_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_list(NotCParser.Interface_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clauses(NotCParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clauses(NotCParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clause(NotCParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clause(NotCParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints(NotCParser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints(NotCParser.Type_parameter_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_constraint(NotCParser.Primary_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_constraint(NotCParser.Primary_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_constraints(NotCParser.Secondary_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_constraints(NotCParser.Secondary_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_constraint(NotCParser.Constructor_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_constraint(NotCParser.Constructor_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(NotCParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(NotCParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(NotCParser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(NotCParser.Class_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(NotCParser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(NotCParser.Class_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(NotCParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(NotCParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(NotCParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(NotCParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(NotCParser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(NotCParser.All_member_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(NotCParser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(NotCParser.All_member_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(NotCParser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(NotCParser.Common_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_member_declaration(NotCParser.Typed_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_member_declaration(NotCParser.Typed_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarators(NotCParser.Constant_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarators(NotCParser.Constant_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarator(NotCParser.Constant_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarator(NotCParser.Constant_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(NotCParser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(NotCParser.Variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(NotCParser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(NotCParser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(NotCParser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(NotCParser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(NotCParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(NotCParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(NotCParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(NotCParser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(NotCParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(NotCParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(NotCParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(NotCParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(NotCParser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(NotCParser.Fixed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(NotCParser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(NotCParser.Fixed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_modifier(NotCParser.Parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_modifier(NotCParser.Parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void enterParameter_array(NotCParser.Parameter_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void exitParameter_array(NotCParser.Parameter_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_declarations(NotCParser.Accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_declarations(NotCParser.Accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGet_accessor_declaration(NotCParser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGet_accessor_declaration(NotCParser.Get_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSet_accessor_declaration(NotCParser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSet_accessor_declaration(NotCParser.Set_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_modifier(NotCParser.Accessor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_modifier(NotCParser.Accessor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_body(NotCParser.Accessor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_body(NotCParser.Accessor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEvent_accessor_declarations(NotCParser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEvent_accessor_declarations(NotCParser.Event_accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAdd_accessor_declaration(NotCParser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAdd_accessor_declaration(NotCParser.Add_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRemove_accessor_declaration(NotCParser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRemove_accessor_declaration(NotCParser.Remove_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(NotCParser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(NotCParser.Overloadable_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declarator(NotCParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declarator(NotCParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(NotCParser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(NotCParser.Constructor_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(NotCParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(NotCParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void enterStruct_interfaces(NotCParser.Struct_interfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void exitStruct_interfaces(NotCParser.Struct_interfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(NotCParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(NotCParser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(NotCParser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(NotCParser.Struct_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(NotCParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(NotCParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(NotCParser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(NotCParser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(NotCParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(NotCParser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter_list(NotCParser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter_list(NotCParser.Variant_type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variant_type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter(NotCParser.Variant_type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variant_type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter(NotCParser.Variant_type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVariance_annotation(NotCParser.Variance_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVariance_annotation(NotCParser.Variance_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void enterInterface_base(NotCParser.Interface_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void exitInterface_base(NotCParser.Interface_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(NotCParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(NotCParser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declaration(NotCParser.Interface_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declaration(NotCParser.Interface_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void enterInterface_accessors(NotCParser.Interface_accessorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void exitInterface_accessors(NotCParser.Interface_accessorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(NotCParser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(NotCParser.Enum_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(NotCParser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(NotCParser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declaration(NotCParser.Enum_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declaration(NotCParser.Enum_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_section(NotCParser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_section(NotCParser.Global_attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target(NotCParser.Global_attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target(NotCParser.Global_attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(NotCParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(NotCParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(NotCParser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(NotCParser.Attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(NotCParser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(NotCParser.Attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(NotCParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(NotCParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(NotCParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(NotCParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#attribute_argument}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument(NotCParser.Attribute_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#attribute_argument}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument(NotCParser.Attribute_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(NotCParser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(NotCParser.Pointer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarators(NotCParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarators(NotCParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarator(NotCParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarator(NotCParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_initializer(NotCParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_initializer(NotCParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarator(NotCParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarator(NotCParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void enterStackalloc_initializer(NotCParser.Stackalloc_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void exitStackalloc_initializer(NotCParser.Stackalloc_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void enterRight_arrow(NotCParser.Right_arrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void exitRight_arrow(NotCParser.Right_arrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(NotCParser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(NotCParser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift_assignment(NotCParser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift_assignment(NotCParser.Right_shift_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NotCParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NotCParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(NotCParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(NotCParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(NotCParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(NotCParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string(NotCParser.Interpolated_regular_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string(NotCParser.Interpolated_regular_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interpolated_verbatium_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_verbatium_string(NotCParser.Interpolated_verbatium_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interpolated_verbatium_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_verbatium_string(NotCParser.Interpolated_verbatium_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string_part(NotCParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string_part(NotCParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interpolated_verbatium_string_part}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_verbatium_string_part(NotCParser.Interpolated_verbatium_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interpolated_verbatium_string_part}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_verbatium_string_part(NotCParser.Interpolated_verbatium_string_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string_expression(NotCParser.Interpolated_string_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string_expression(NotCParser.Interpolated_string_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(NotCParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(NotCParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(NotCParser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(NotCParser.Struct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(NotCParser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(NotCParser.Interface_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(NotCParser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(NotCParser.Enum_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_definition(NotCParser.Delegate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_definition(NotCParser.Delegate_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(NotCParser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(NotCParser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(NotCParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(NotCParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(NotCParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(NotCParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(NotCParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(NotCParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_definition(NotCParser.Destructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_definition(NotCParser.Destructor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(NotCParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(NotCParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(NotCParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(NotCParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(NotCParser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(NotCParser.Method_member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(NotCParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(NotCParser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#arg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArg_declaration(NotCParser.Arg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#arg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArg_declaration(NotCParser.Arg_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation(NotCParser.Method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation(NotCParser.Method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression(NotCParser.Object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression(NotCParser.Object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(NotCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(NotCParser.IdentifierContext ctx);
}