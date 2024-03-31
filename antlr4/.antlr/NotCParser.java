// Generated from /Users/brian/dev/NotCCode/antlr4/NotCParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NotCParser extends NotCParserBase {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, EMPTY_DELIMITED_DOC_COMMENT=3, 
		DELIMITED_DOC_COMMENT=4, SINGLE_LINE_COMMENT=5, DELIMITED_COMMENT=6, WHITESPACES=7, 
		SHARP=8, ADD=9, ALIAS=10, ARGLIST=11, AS=12, ASCENDING=13, ASYNC=14, AWAIT=15, 
		BASE=16, BOOL=17, BREAK=18, BY=19, BYTE=20, CASE=21, CATCH=22, CHAR=23, 
		CHECKED=24, CONST=25, CONTINUE=26, DECIMAL=27, DEFAULT=28, DELEGATE=29, 
		DESCENDING=30, DO=31, DOUBLE=32, DYNAMIC=33, ELSE=34, ENUM=35, EQUALS=36, 
		EVENT=37, EXPLICIT=38, EXTERN=39, FALSE=40, FINALLY=41, FIXED=42, FLOAT=43, 
		FOR=44, FOREACH=45, FROM=46, GET=47, GOTO=48, GROUP=49, IF=50, IMPLICIT=51, 
		IN=52, INT=53, INTERFACE=54, INTERNAL=55, INTO=56, IS=57, JOIN=58, LET=59, 
		LOCK=60, LONG=61, MODULE=62, NAMEOF=63, NAMESPACE=64, NEW=65, NULL_=66, 
		OBJECT=67, ON=68, OPERATOR=69, ORDERBY=70, OUT=71, PARAMS=72, PRIVATE=73, 
		PUBLIC=74, READONLY=75, REF=76, REMOVE=77, RETURN=78, SBYTE=79, SELECT=80, 
		SET=81, SHORT=82, SIZEOF=83, STACKALLOC=84, STATIC=85, STRING=86, STRUCT=87, 
		SWITCH=88, THROW=89, TRUE=90, TRY=91, TYPEOF=92, UINT=93, ULONG=94, UNCHECKED=95, 
		UNMANAGED=96, UNSAFE=97, USHORT=98, USING=99, VAR=100, VOID=101, VOLATILE=102, 
		WHEN=103, WHERE=104, WHILE=105, YIELD=106, IDENTIFIER=107, LITERAL_ACCESS=108, 
		INTEGER_LITERAL=109, HEX_INTEGER_LITERAL=110, BIN_INTEGER_LITERAL=111, 
		REAL_LITERAL=112, CHARACTER_LITERAL=113, REGULAR_STRING=114, VERBATIUM_STRING=115, 
		INTERPOLATED_REGULAR_STRING_START=116, INTERPOLATED_VERBATIUM_STRING_START=117, 
		OPEN_BRACE=118, CLOSE_BRACE=119, OPEN_BRACKET=120, CLOSE_BRACKET=121, 
		OPEN_PARENS=122, CLOSE_PARENS=123, DOT=124, COMMA=125, COLON=126, SEMICOLON=127, 
		PLUS=128, MINUS=129, STAR=130, DIV=131, PERCENT=132, AMP=133, BITWISE_OR=134, 
		CARET=135, BANG=136, TILDE=137, ASSIGNMENT=138, LT=139, GT=140, INTERR=141, 
		DOUBLE_COLON=142, OP_COALESCING=143, OP_INC=144, OP_DEC=145, OP_AND=146, 
		OP_OR=147, OP_PTR=148, OP_EQ=149, OP_NE=150, OP_LE=151, OP_GE=152, OP_ADD_ASSIGNMENT=153, 
		OP_SUB_ASSIGNMENT=154, OP_MULT_ASSIGNMENT=155, OP_DIV_ASSIGNMENT=156, 
		OP_MOD_ASSIGNMENT=157, OP_AND_ASSIGNMENT=158, OP_OR_ASSIGNMENT=159, OP_XOR_ASSIGNMENT=160, 
		OP_LEFT_SHIFT=161, OP_LEFT_SHIFT_ASSIGNMENT=162, OP_COALESCING_ASSIGNMENT=163, 
		OP_RANGE=164, DOUBLE_CURLY_INSIDE=165, OPEN_BRACE_INSIDE=166, REGULAR_CHAR_INSIDE=167, 
		VERBATIUM_DOUBLE_QUOTE_INSIDE=168, DOUBLE_QUOTE_INSIDE=169, REGULAR_STRING_INSIDE=170, 
		VERBATIUM_INSIDE_STRING=171, CLOSE_BRACE_INSIDE=172, FORMAT_STRING=173, 
		DIRECTIVE_WHITESPACES=174, DIGITS=175, DEFINE=176, UNDEF=177, ELIF=178, 
		ENDIF=179, LINE=180, ERROR=181, WARNING=182, REGION=183, ENDREGION=184, 
		PRAGMA=185, NULLABLE=186, DIRECTIVE_HIDDEN=187, CONDITIONAL_SYMBOL=188, 
		DIRECTIVE_NEW_LINE=189, TEXT=190, DOUBLE_CURLY_CLOSE_INSIDE=191;
	public static final int
		RULE_compilation_unit = 0, RULE_namespace_or_type_name = 1, RULE_type_ = 2, 
		RULE_base_type = 3, RULE_tuple_type = 4, RULE_tuple_element = 5, RULE_simple_type = 6, 
		RULE_numeric_type = 7, RULE_integral_type = 8, RULE_floating_point_type = 9, 
		RULE_class_type = 10, RULE_type_argument_list = 11, RULE_argument_list = 12, 
		RULE_argument = 13, RULE_expression = 14, RULE_non_assignment_expression = 15, 
		RULE_assignment = 16, RULE_assignment_operator = 17, RULE_conditional_expression = 18, 
		RULE_null_coalescing_expression = 19, RULE_conditional_or_expression = 20, 
		RULE_conditional_and_expression = 21, RULE_inclusive_or_expression = 22, 
		RULE_exclusive_or_expression = 23, RULE_and_expression = 24, RULE_equality_expression = 25, 
		RULE_relational_expression = 26, RULE_shift_expression = 27, RULE_additive_expression = 28, 
		RULE_multiplicative_expression = 29, RULE_switch_expression = 30, RULE_switch_expression_arms = 31, 
		RULE_switch_expression_arm = 32, RULE_range_expression = 33, RULE_unary_expression = 34, 
		RULE_cast_expression = 35, RULE_primary_expression = 36, RULE_primary_expression_start = 37, 
		RULE_throwable_expression = 38, RULE_throw_expression = 39, RULE_member_access = 40, 
		RULE_bracket_expression = 41, RULE_indexer_argument = 42, RULE_predefined_type = 43, 
		RULE_expression_list = 44, RULE_object_or_collection_initializer = 45, 
		RULE_object_initializer = 46, RULE_member_initializer_list = 47, RULE_member_initializer = 48, 
		RULE_initializer_value = 49, RULE_collection_initializer = 50, RULE_element_initializer = 51, 
		RULE_anonymous_object_initializer = 52, RULE_member_declarator_list = 53, 
		RULE_member_declarator = 54, RULE_unbound_type_name = 55, RULE_generic_dimension_specifier = 56, 
		RULE_isType = 57, RULE_isTypePatternArms = 58, RULE_isTypePatternArm = 59, 
		RULE_lambda_expression = 60, RULE_anonymous_function_signature = 61, RULE_explicit_anonymous_function_parameter_list = 62, 
		RULE_explicit_anonymous_function_parameter = 63, RULE_implicit_anonymous_function_parameter_list = 64, 
		RULE_anonymous_function_body = 65, RULE_query_expression = 66, RULE_from_clause = 67, 
		RULE_query_body = 68, RULE_query_body_clause = 69, RULE_let_clause = 70, 
		RULE_where_clause = 71, RULE_combined_join_clause = 72, RULE_orderby_clause = 73, 
		RULE_ordering = 74, RULE_select_or_group_clause = 75, RULE_query_continuation = 76, 
		RULE_statement = 77, RULE_declarationStatement = 78, RULE_local_function_declaration = 79, 
		RULE_local_function_header = 80, RULE_local_function_modifiers = 81, RULE_local_function_body = 82, 
		RULE_labeled_Statement = 83, RULE_embedded_statement = 84, RULE_simple_embedded_statement = 85, 
		RULE_block = 86, RULE_local_variable_declaration = 87, RULE_local_variable_type = 88, 
		RULE_local_variable_declarator = 89, RULE_local_variable_initializer = 90, 
		RULE_local_constant_declaration = 91, RULE_if_body = 92, RULE_switch_section = 93, 
		RULE_switch_label = 94, RULE_case_guard = 95, RULE_statement_list = 96, 
		RULE_for_initializer = 97, RULE_for_iterator = 98, RULE_catch_clauses = 99, 
		RULE_specific_catch_clause = 100, RULE_general_catch_clause = 101, RULE_exception_filter = 102, 
		RULE_finally_clause = 103, RULE_resource_acquisition = 104, RULE_namespace_declaration = 105, 
		RULE_qualified_identifier = 106, RULE_namespace_body = 107, RULE_extern_alias_directives = 108, 
		RULE_extern_alias_directive = 109, RULE_using_directives = 110, RULE_using_directive = 111, 
		RULE_namespace_member_declarations = 112, RULE_namespace_member_declaration = 113, 
		RULE_type_declaration = 114, RULE_qualified_alias_member = 115, RULE_type_parameter_list = 116, 
		RULE_type_parameter = 117, RULE_class_base = 118, RULE_interface_type_list = 119, 
		RULE_type_parameter_constraints_clauses = 120, RULE_type_parameter_constraints_clause = 121, 
		RULE_type_parameter_constraints = 122, RULE_primary_constraint = 123, 
		RULE_secondary_constraints = 124, RULE_constructor_constraint = 125, RULE_class_body = 126, 
		RULE_class_member_declarations = 127, RULE_class_member_declaration = 128, 
		RULE_comments = 129, RULE_comment = 130, RULE_all_member_modifiers = 131, 
		RULE_all_member_modifier = 132, RULE_common_member_declaration = 133, 
		RULE_typed_member_declaration = 134, RULE_constant_declarators = 135, 
		RULE_constant_declarator = 136, RULE_variable_declarators = 137, RULE_variable_declarator = 138, 
		RULE_variable_initializer = 139, RULE_return_type = 140, RULE_member_name = 141, 
		RULE_method_body = 142, RULE_formal_parameter_list = 143, RULE_fixed_parameters = 144, 
		RULE_fixed_parameter = 145, RULE_parameter_modifier = 146, RULE_parameter_array = 147, 
		RULE_accessor_declarations = 148, RULE_get_accessor_declaration = 149, 
		RULE_set_accessor_declaration = 150, RULE_accessor_modifier = 151, RULE_accessor_body = 152, 
		RULE_event_accessor_declarations = 153, RULE_add_accessor_declaration = 154, 
		RULE_remove_accessor_declaration = 155, RULE_overloadable_operator = 156, 
		RULE_conversion_operator_declarator = 157, RULE_constructor_initializer = 158, 
		RULE_body = 159, RULE_struct_interfaces = 160, RULE_struct_body = 161, 
		RULE_struct_member_declaration = 162, RULE_array_type = 163, RULE_rank_specifier = 164, 
		RULE_array_initializer = 165, RULE_variant_type_parameter_list = 166, 
		RULE_variant_type_parameter = 167, RULE_variance_annotation = 168, RULE_interface_base = 169, 
		RULE_interface_body = 170, RULE_interface_member_declaration = 171, RULE_interface_accessors = 172, 
		RULE_enum_base = 173, RULE_enum_body = 174, RULE_enum_member_declaration = 175, 
		RULE_global_attribute_section = 176, RULE_global_attribute_target = 177, 
		RULE_attributes = 178, RULE_attribute_section = 179, RULE_attribute_target = 180, 
		RULE_attribute_list = 181, RULE_attribute = 182, RULE_attribute_argument = 183, 
		RULE_pointer_type = 184, RULE_fixed_pointer_declarators = 185, RULE_fixed_pointer_declarator = 186, 
		RULE_fixed_pointer_initializer = 187, RULE_fixed_size_buffer_declarator = 188, 
		RULE_stackalloc_initializer = 189, RULE_right_arrow = 190, RULE_right_shift = 191, 
		RULE_right_shift_assignment = 192, RULE_literal = 193, RULE_boolean_literal = 194, 
		RULE_string_literal = 195, RULE_interpolated_regular_string = 196, RULE_interpolated_verbatium_string = 197, 
		RULE_interpolated_regular_string_part = 198, RULE_interpolated_verbatium_string_part = 199, 
		RULE_interpolated_string_expression = 200, RULE_keyword = 201, RULE_struct_definition = 202, 
		RULE_interface_definition = 203, RULE_enum_definition = 204, RULE_delegate_definition = 205, 
		RULE_event_declaration = 206, RULE_field_declaration = 207, RULE_property_declaration = 208, 
		RULE_constant_declaration = 209, RULE_destructor_definition = 210, RULE_constructor_declaration = 211, 
		RULE_method_declaration = 212, RULE_method_member_name = 213, RULE_operator_declaration = 214, 
		RULE_arg_declaration = 215, RULE_method_invocation = 216, RULE_object_creation_expression = 217, 
		RULE_identifier = 218;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "namespace_or_type_name", "type_", "base_type", "tuple_type", 
			"tuple_element", "simple_type", "numeric_type", "integral_type", "floating_point_type", 
			"class_type", "type_argument_list", "argument_list", "argument", "expression", 
			"non_assignment_expression", "assignment", "assignment_operator", "conditional_expression", 
			"null_coalescing_expression", "conditional_or_expression", "conditional_and_expression", 
			"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
			"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
			"multiplicative_expression", "switch_expression", "switch_expression_arms", 
			"switch_expression_arm", "range_expression", "unary_expression", "cast_expression", 
			"primary_expression", "primary_expression_start", "throwable_expression", 
			"throw_expression", "member_access", "bracket_expression", "indexer_argument", 
			"predefined_type", "expression_list", "object_or_collection_initializer", 
			"object_initializer", "member_initializer_list", "member_initializer", 
			"initializer_value", "collection_initializer", "element_initializer", 
			"anonymous_object_initializer", "member_declarator_list", "member_declarator", 
			"unbound_type_name", "generic_dimension_specifier", "isType", "isTypePatternArms", 
			"isTypePatternArm", "lambda_expression", "anonymous_function_signature", 
			"explicit_anonymous_function_parameter_list", "explicit_anonymous_function_parameter", 
			"implicit_anonymous_function_parameter_list", "anonymous_function_body", 
			"query_expression", "from_clause", "query_body", "query_body_clause", 
			"let_clause", "where_clause", "combined_join_clause", "orderby_clause", 
			"ordering", "select_or_group_clause", "query_continuation", "statement", 
			"declarationStatement", "local_function_declaration", "local_function_header", 
			"local_function_modifiers", "local_function_body", "labeled_Statement", 
			"embedded_statement", "simple_embedded_statement", "block", "local_variable_declaration", 
			"local_variable_type", "local_variable_declarator", "local_variable_initializer", 
			"local_constant_declaration", "if_body", "switch_section", "switch_label", 
			"case_guard", "statement_list", "for_initializer", "for_iterator", "catch_clauses", 
			"specific_catch_clause", "general_catch_clause", "exception_filter", 
			"finally_clause", "resource_acquisition", "namespace_declaration", "qualified_identifier", 
			"namespace_body", "extern_alias_directives", "extern_alias_directive", 
			"using_directives", "using_directive", "namespace_member_declarations", 
			"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
			"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
			"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
			"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
			"constructor_constraint", "class_body", "class_member_declarations", 
			"class_member_declaration", "comments", "comment", "all_member_modifiers", 
			"all_member_modifier", "common_member_declaration", "typed_member_declaration", 
			"constant_declarators", "constant_declarator", "variable_declarators", 
			"variable_declarator", "variable_initializer", "return_type", "member_name", 
			"method_body", "formal_parameter_list", "fixed_parameters", "fixed_parameter", 
			"parameter_modifier", "parameter_array", "accessor_declarations", "get_accessor_declaration", 
			"set_accessor_declaration", "accessor_modifier", "accessor_body", "event_accessor_declarations", 
			"add_accessor_declaration", "remove_accessor_declaration", "overloadable_operator", 
			"conversion_operator_declarator", "constructor_initializer", "body", 
			"struct_interfaces", "struct_body", "struct_member_declaration", "array_type", 
			"rank_specifier", "array_initializer", "variant_type_parameter_list", 
			"variant_type_parameter", "variance_annotation", "interface_base", "interface_body", 
			"interface_member_declaration", "interface_accessors", "enum_base", "enum_body", 
			"enum_member_declaration", "global_attribute_section", "global_attribute_target", 
			"attributes", "attribute_section", "attribute_target", "attribute_list", 
			"attribute", "attribute_argument", "pointer_type", "fixed_pointer_declarators", 
			"fixed_pointer_declarator", "fixed_pointer_initializer", "fixed_size_buffer_declarator", 
			"stackalloc_initializer", "right_arrow", "right_shift", "right_shift_assignment", 
			"literal", "boolean_literal", "string_literal", "interpolated_regular_string", 
			"interpolated_verbatium_string", "interpolated_regular_string_part", 
			"interpolated_verbatium_string_part", "interpolated_string_expression", 
			"keyword", "struct_definition", "interface_definition", "enum_definition", 
			"delegate_definition", "event_declaration", "field_declaration", "property_declaration", 
			"constant_declaration", "destructor_definition", "constructor_declaration", 
			"method_declaration", "method_member_name", "operator_declaration", "arg_declaration", 
			"method_invocation", "object_creation_expression", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u00EF\\u00BB\\u00BF'", null, "'/***/'", null, null, null, null, 
			"'#'", "'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", "'async'", 
			"'await'", "'base'", "'bool'", "'break'", "'by'", "'byte'", "'case'", 
			"'catch'", "'char'", "'checked'", "'const'", "'continue'", "'decimal'", 
			"'default'", "'delegate'", "'descending'", "'do'", "'double'", "'dynamic'", 
			"'else'", "'enum'", "'equals'", "'event'", "'explicit'", "'extern'", 
			"'false'", "'finally'", "'fixed'", "'float'", "'for'", "'foreach'", "'from'", 
			"'get'", "'goto'", "'group'", "'if'", "'implicit'", "'in'", "'int'", 
			"'interface'", "'internal'", "'into'", "'is'", "'join'", "'let'", "'lock'", 
			"'long'", "'module'", "'nameof'", "'namespace'", "'new'", "'null'", "'object'", 
			"'on'", "'operator'", "'orderby'", "'out'", "'params'", "'private'", 
			"'public'", "'readonly'", "'ref'", "'remove'", "'return'", "'sbyte'", 
			"'select'", "'set'", "'short'", "'sizeof'", "'stackalloc'", "'static'", 
			"'string'", "'struct'", "'switch'", "'throw'", "'true'", "'try'", "'typeof'", 
			"'uint'", "'ulong'", "'unchecked'", "'unmanaged'", "'unsafe'", "'ushort'", 
			"'using'", "'var'", "'void'", "'volatile'", "'when'", "'where'", "'while'", 
			"'yield'", null, null, null, null, null, null, null, null, null, null, 
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
			"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
			"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='", "'??='", "'..'", 
			"'{{'", null, null, null, null, null, null, null, null, null, null, "'define'", 
			"'undef'", "'elif'", "'endif'", "'line'", null, null, null, null, null, 
			null, "'hidden'", null, null, null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", 
			"DELIMITED_DOC_COMMENT", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", 
			"WHITESPACES", "SHARP", "ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", 
			"ASYNC", "AWAIT", "BASE", "BOOL", "BREAK", "BY", "BYTE", "CASE", "CATCH", 
			"CHAR", "CHECKED", "CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", 
			"DESCENDING", "DO", "DOUBLE", "DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", 
			"EXPLICIT", "EXTERN", "FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", 
			"FROM", "GET", "GOTO", "GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", 
			"INTERNAL", "INTO", "IS", "JOIN", "LET", "LOCK", "LONG", "MODULE", "NAMEOF", 
			"NAMESPACE", "NEW", "NULL_", "OBJECT", "ON", "OPERATOR", "ORDERBY", "OUT", 
			"PARAMS", "PRIVATE", "PUBLIC", "READONLY", "REF", "REMOVE", "RETURN", 
			"SBYTE", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", "STATIC", 
			"STRING", "STRUCT", "SWITCH", "THROW", "TRUE", "TRY", "TYPEOF", "UINT", 
			"ULONG", "UNCHECKED", "UNMANAGED", "UNSAFE", "USHORT", "USING", "VAR", 
			"VOID", "VOLATILE", "WHEN", "WHERE", "WHILE", "YIELD", "IDENTIFIER", 
			"LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "BIN_INTEGER_LITERAL", 
			"REAL_LITERAL", "CHARACTER_LITERAL", "REGULAR_STRING", "VERBATIUM_STRING", 
			"INTERPOLATED_REGULAR_STRING_START", "INTERPOLATED_VERBATIUM_STRING_START", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", 
			"CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", 
			"STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", 
			"ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", 
			"OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", 
			"OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
			"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
			"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "OP_COALESCING_ASSIGNMENT", 
			"OP_RANGE", "DOUBLE_CURLY_INSIDE", "OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", 
			"VERBATIUM_DOUBLE_QUOTE_INSIDE", "DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", 
			"VERBATIUM_INSIDE_STRING", "CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", 
			"DIGITS", "DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", 
			"REGION", "ENDREGION", "PRAGMA", "NULLABLE", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", 
			"DIRECTIVE_NEW_LINE", "TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NotCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NotCParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(NotCParser.BYTE_ORDER_MARK, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(438);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(441);
				extern_alias_directives();
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(444);
				using_directives();
				}
			}

			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					global_attribute_section();
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(453);
				namespace_member_declarations();
				}
				break;
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5914694178446840196L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 180151663161761581L) != 0) || _la==TILDE) {
				{
				setState(456);
				class_member_declarations();
				}
			}

			setState(459);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(NotCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NotCParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(461);
				identifier();
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(462);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(465);
				qualified_alias_member();
				}
				break;
			}
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					match(DOT);
					setState(469);
					identifier();
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(470);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<TerminalNode> INTERR() { return getTokens(NotCParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(NotCParser.INTERR, i);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(NotCParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NotCParser.STAR, i);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			base_type();
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(482);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTERR:
						{
						setState(479);
						match(INTERR);
						}
						break;
					case OPEN_BRACKET:
						{
						setState(480);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(481);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public TerminalNode STAR() { return getToken(NotCParser.STAR, 0); }
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				simple_type();
				}
				break;
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(VOID);
				setState(490);
				match(STAR);
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				tuple_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(OPEN_PARENS);
			setState(495);
			tuple_element();
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(496);
				match(COMMA);
				setState(497);
				tuple_element();
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(502);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_elementContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tuple_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			type_();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8285849179792019844L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 932276351493L) != 0)) {
				{
				setState(505);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(NotCParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_type);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(NotCParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_type);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(NotCParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(NotCParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(NotCParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(NotCParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(NotCParser.INT, 0); }
		public TerminalNode UINT() { return getToken(NotCParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(NotCParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(NotCParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(NotCParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2314850208477872128L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 573449L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(NotCParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(NotCParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(NotCParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(NotCParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(NotCParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_type);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_argument_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NotCParser.LT, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(LT);
			setState(528);
			type_();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				type_();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			argument();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(539);
				match(COMMA);
				setState(540);
				argument();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(NotCParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode OUT() { return getToken(NotCParser.OUT, 0); }
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(546);
				identifier();
				setState(547);
				match(COLON);
				}
				break;
			}
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(551);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 17301505L) != 0)) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(554);
				expression();
				}
				break;
			case 2:
				{
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(555);
					match(VAR);
					}
					break;
				case 2:
					{
					setState(556);
					type_();
					}
					break;
				}
				setState(559);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				non_assignment_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(REF);
				setState(565);
				non_assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_non_assignment_expression);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				lambda_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				query_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_COALESCING_ASSIGNMENT() { return getToken(NotCParser.OP_COALESCING_ASSIGNMENT, 0); }
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				unary_expression();
				setState(574);
				assignment_operator();
				setState(575);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				unary_expression();
				setState(578);
				match(OP_COALESCING_ASSIGNMENT);
				setState(579);
				throwable_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(NotCParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(NotCParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(NotCParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(NotCParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(NotCParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(NotCParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(NotCParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(NotCParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(NotCParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_operator);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(589);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(590);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(591);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(592);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(593);
				right_shift_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(NotCParser.INTERR, 0); }
		public List<Throwable_expressionContext> throwable_expression() {
			return getRuleContexts(Throwable_expressionContext.class);
		}
		public Throwable_expressionContext throwable_expression(int i) {
			return getRuleContext(Throwable_expressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			null_coalescing_expression();
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(597);
				match(INTERR);
				setState(598);
				throwable_expression();
				setState(599);
				match(COLON);
				setState(600);
				throwable_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(NotCParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_null_coalescing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			conditional_or_expression();
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(605);
				match(OP_COALESCING);
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_LINE_DOC_COMMENT:
				case EMPTY_DELIMITED_DOC_COMMENT:
				case DELIMITED_DOC_COMMENT:
				case SINGLE_LINE_COMMENT:
				case DELIMITED_COMMENT:
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BASE:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case CHECKED:
				case DECIMAL:
				case DEFAULT:
				case DELEGATE:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FALSE:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case NEW:
				case NULL_:
				case OBJECT:
				case ON:
				case ORDERBY:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case SIZEOF:
				case STRING:
				case TRUE:
				case TYPEOF:
				case UINT:
				case ULONG:
				case UNCHECKED:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case LITERAL_ACCESS:
				case INTEGER_LITERAL:
				case HEX_INTEGER_LITERAL:
				case BIN_INTEGER_LITERAL:
				case REAL_LITERAL:
				case CHARACTER_LITERAL:
				case REGULAR_STRING:
				case VERBATIUM_STRING:
				case INTERPOLATED_REGULAR_STRING_START:
				case INTERPOLATED_VERBATIUM_STRING_START:
				case OPEN_PARENS:
				case PLUS:
				case MINUS:
				case STAR:
				case AMP:
				case CARET:
				case BANG:
				case TILDE:
				case OP_INC:
				case OP_DEC:
				case OP_RANGE:
					{
					setState(606);
					null_coalescing_expression();
					}
					break;
				case THROW:
					{
					setState(607);
					throw_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(NotCParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(NotCParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			conditional_and_expression();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(OP_OR);
					setState(614);
					conditional_and_expression();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(NotCParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(NotCParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			inclusive_or_expression();
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(OP_AND);
					setState(622);
					inclusive_or_expression();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(NotCParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(NotCParser.BITWISE_OR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			exclusive_or_expression();
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(629);
					match(BITWISE_OR);
					setState(630);
					exclusive_or_expression();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(NotCParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(NotCParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			and_expression();
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					match(CARET);
					setState(638);
					and_expression();
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(NotCParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(NotCParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			equality_expression();
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(645);
					match(AMP);
					setState(646);
					equality_expression();
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(NotCParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(NotCParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(NotCParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(NotCParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			relational_expression();
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(653);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(654);
					relational_expression();
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> IS() { return getTokens(NotCParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(NotCParser.IS, i);
		}
		public List<IsTypeContext> isType() {
			return getRuleContexts(IsTypeContext.class);
		}
		public IsTypeContext isType(int i) {
			return getRuleContext(IsTypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(NotCParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(NotCParser.AS, i);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(NotCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(NotCParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(NotCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(NotCParser.GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(NotCParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(NotCParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(NotCParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(NotCParser.OP_GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			shift_expression();
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(667);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
					case GT:
					case OP_LE:
					case OP_GE:
						{
						setState(661);
						_la = _input.LA(1);
						if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 12291L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(662);
						shift_expression();
						}
						break;
					case IS:
						{
						setState(663);
						match(IS);
						setState(664);
						isType();
						}
						break;
					case AS:
						{
						setState(665);
						match(AS);
						setState(666);
						type_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> OP_LEFT_SHIFT() { return getTokens(NotCParser.OP_LEFT_SHIFT); }
		public TerminalNode OP_LEFT_SHIFT(int i) {
			return getToken(NotCParser.OP_LEFT_SHIFT, i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			additive_expression();
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						setState(673);
						match(OP_LEFT_SHIFT);
						}
						break;
					case GT:
						{
						setState(674);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(677);
					additive_expression();
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NotCParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NotCParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(NotCParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NotCParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			multiplicative_expression();
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					multiplicative_expression();
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Switch_expressionContext> switch_expression() {
			return getRuleContexts(Switch_expressionContext.class);
		}
		public Switch_expressionContext switch_expression(int i) {
			return getRuleContext(Switch_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(NotCParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NotCParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(NotCParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(NotCParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(NotCParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(NotCParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			switch_expression();
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					_la = _input.LA(1);
					if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(693);
					switch_expression();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_expressionContext extends ParserRuleContext {
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(NotCParser.SWITCH, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Switch_expression_armsContext switch_expression_arms() {
			return getRuleContext(Switch_expression_armsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Switch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression; }
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			range_expression();
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(700);
				match(SWITCH);
				setState(701);
				match(OPEN_BRACE);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(702);
					switch_expression_arms();
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(703);
						match(COMMA);
						}
					}

					}
				}

				setState(708);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_expression_armsContext extends ParserRuleContext {
		public List<Switch_expression_armContext> switch_expression_arm() {
			return getRuleContexts(Switch_expression_armContext.class);
		}
		public Switch_expression_armContext switch_expression_arm(int i) {
			return getRuleContext(Switch_expression_armContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Switch_expression_armsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arms; }
	}

	public final Switch_expression_armsContext switch_expression_arms() throws RecognitionException {
		Switch_expression_armsContext _localctx = new Switch_expression_armsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switch_expression_arms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			switch_expression_arm();
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					match(COMMA);
					setState(713);
					switch_expression_arm();
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_expression_armContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public Switch_expression_armContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arm; }
	}

	public final Switch_expression_armContext switch_expression_arm() throws RecognitionException {
		Switch_expression_armContext _localctx = new Switch_expression_armContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_expression_arm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			expression();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(720);
				case_guard();
				}
			}

			setState(723);
			right_arrow();
			setState(724);
			throwable_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public TerminalNode OP_RANGE() { return getToken(NotCParser.OP_RANGE, 0); }
		public Range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expression; }
	}

	public final Range_expressionContext range_expression() throws RecognitionException {
		Range_expressionContext _localctx = new Range_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_range_expression);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767127505L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 98771L) != 0)) {
					{
					setState(727);
					unary_expression();
					}
				}

				setState(730);
				match(OP_RANGE);
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(731);
					unary_expression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(NotCParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(NotCParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(NotCParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(NotCParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(NotCParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(NotCParser.OP_DEC, 0); }
		public TerminalNode AWAIT() { return getToken(NotCParser.AWAIT, 0); }
		public TerminalNode AMP() { return getToken(NotCParser.AMP, 0); }
		public TerminalNode STAR() { return getToken(NotCParser.STAR, 0); }
		public TerminalNode CARET() { return getToken(NotCParser.CARET, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unary_expression);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				primary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(PLUS);
				setState(739);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(740);
				match(MINUS);
				setState(741);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(742);
				match(BANG);
				setState(743);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(744);
				match(TILDE);
				setState(745);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(746);
				match(OP_INC);
				setState(747);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(748);
				match(OP_DEC);
				setState(749);
				unary_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				match(AWAIT);
				setState(751);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(752);
				match(AMP);
				setState(753);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(754);
				match(STAR);
				setState(755);
				unary_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(756);
				match(CARET);
				setState(757);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(OPEN_PARENS);
			setState(761);
			type_();
			setState(762);
			match(CLOSE_PARENS);
			setState(763);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<TerminalNode> BANG() { return getTokens(NotCParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(NotCParser.BANG, i);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<TerminalNode> OP_INC() { return getTokens(NotCParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(NotCParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(NotCParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(NotCParser.OP_DEC, i);
		}
		public List<TerminalNode> OP_PTR() { return getTokens(NotCParser.OP_PTR); }
		public TerminalNode OP_PTR(int i) {
			return getToken(NotCParser.OP_PTR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(766);
				match(BANG);
				}
				break;
			}
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					bracket_expression();
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(775);
				match(BANG);
				}
				break;
			}
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(784);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(778);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(779);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(780);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(781);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(782);
						match(OP_PTR);
						setState(783);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(787);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(786);
						match(BANG);
						}
						break;
					}
					setState(792);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(789);
							bracket_expression();
							}
							} 
						}
						setState(794);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					}
					setState(796);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(795);
						match(BANG);
						}
						break;
					}
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(NotCParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(NotCParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(NotCParser.BASE, 0); }
		public TerminalNode DOT() { return getToken(NotCParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(NotCParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(NotCParser.NEW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(NotCParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(NotCParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(NotCParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public TupleExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(NotCParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(NotCParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(NotCParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> DOT() { return getTokens(NotCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NotCParser.DOT, i);
		}
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				identifier();
				setState(806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(805);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(OPEN_PARENS);
				setState(809);
				expression();
				setState(810);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(812);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(813);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(814);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(815);
				match(BASE);
				setState(825);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(816);
					match(DOT);
					setState(817);
					identifier();
					setState(819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(818);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(821);
					match(OPEN_BRACKET);
					setState(822);
					expression_list();
					setState(823);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(827);
				match(NEW);
				setState(856);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_LINE_DOC_COMMENT:
				case EMPTY_DELIMITED_DOC_COMMENT:
				case DELIMITED_DOC_COMMENT:
				case SINGLE_LINE_COMMENT:
				case DELIMITED_COMMENT:
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(828);
					type_();
					setState(850);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(829);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(830);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(831);
						match(OPEN_BRACKET);
						setState(832);
						expression_list();
						setState(833);
						match(CLOSE_BRACKET);
						setState(837);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(834);
								rank_specifier();
								}
								} 
							}
							setState(839);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						}
						setState(841);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(840);
							array_initializer();
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(844); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(843);
							rank_specifier();
							}
							}
							setState(846); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(848);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(852);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(853);
					rank_specifier();
					setState(854);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new TupleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(858);
				match(OPEN_PARENS);
				setState(859);
				argument();
				setState(862); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(860);
					match(COMMA);
					setState(861);
					argument();
					}
					}
					setState(864); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(866);
				match(CLOSE_PARENS);
				}
				break;
			case 10:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(868);
				match(TYPEOF);
				setState(869);
				match(OPEN_PARENS);
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(870);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(871);
					type_();
					}
					break;
				case 3:
					{
					setState(872);
					match(VOID);
					}
					break;
				}
				setState(875);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(876);
				match(CHECKED);
				setState(877);
				match(OPEN_PARENS);
				setState(878);
				expression();
				setState(879);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(881);
				match(UNCHECKED);
				setState(882);
				match(OPEN_PARENS);
				setState(883);
				expression();
				setState(884);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(886);
				match(DEFAULT);
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(887);
					match(OPEN_PARENS);
					setState(888);
					type_();
					setState(889);
					match(CLOSE_PARENS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(893);
					match(ASYNC);
					}
				}

				setState(896);
				match(DELEGATE);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(897);
					match(OPEN_PARENS);
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 36030681100908059L) != 0)) {
						{
						setState(898);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(901);
					match(CLOSE_PARENS);
					}
				}

				setState(904);
				block();
				}
				break;
			case 15:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(905);
				match(SIZEOF);
				setState(906);
				match(OPEN_PARENS);
				setState(907);
				type_();
				setState(908);
				match(CLOSE_PARENS);
				}
				break;
			case 16:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(910);
				match(NAMEOF);
				setState(911);
				match(OPEN_PARENS);
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(912);
						identifier();
						setState(913);
						match(DOT);
						}
						} 
					}
					setState(919);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(920);
				identifier();
				setState(921);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Throwable_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Throwable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwable_expression; }
	}

	public final Throwable_expressionContext throwable_expression() throws RecognitionException {
		Throwable_expressionContext _localctx = new Throwable_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_throwable_expression);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				expression();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				throw_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Throw_expressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(NotCParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_expression; }
	}

	public final Throw_expressionContext throw_expression() throws RecognitionException {
		Throw_expressionContext _localctx = new Throw_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_throw_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(THROW);
			setState(930);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(NotCParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(NotCParser.INTERR, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(932);
				match(INTERR);
				}
			}

			setState(935);
			match(DOT);
			setState(936);
			identifier();
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(937);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public TerminalNode INTERR() { return getToken(NotCParser.INTERR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bracket_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(940);
				match(INTERR);
				}
			}

			setState(943);
			match(OPEN_BRACKET);
			setState(944);
			indexer_argument();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(945);
				match(COMMA);
				setState(946);
				indexer_argument();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(954);
				identifier();
				setState(955);
				match(COLON);
				}
				break;
			}
			setState(959);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(NotCParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(NotCParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(NotCParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(NotCParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(NotCParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(NotCParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(NotCParser.INT, 0); }
		public TerminalNode LONG() { return getToken(NotCParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(NotCParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(NotCParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(NotCParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(NotCParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(NotCParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(NotCParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(NotCParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2314859009000210432L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 2349371393L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			expression();
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(964);
				match(COMMA);
				setState(965);
				expression();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_object_or_collection_initializer);
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				collection_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(OPEN_BRACE);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8285849179792019844L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4504531903721989L) != 0)) {
				{
				setState(976);
				member_initializer_list();
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(977);
					match(COMMA);
					}
				}

				}
			}

			setState(982);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			member_initializer();
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(985);
					match(COMMA);
					setState(986);
					member_initializer();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_initializerContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case REMOVE:
			case SELECT:
			case SET:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(992);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(993);
				match(OPEN_BRACKET);
				setState(994);
				expression();
				setState(995);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(999);
			match(ASSIGNMENT);
			setState(1000);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_initializer_value);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				object_or_collection_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(OPEN_BRACE);
			setState(1007);
			element_initializer();
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1008);
					match(COMMA);
					setState(1009);
					element_initializer();
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1015);
				match(COMMA);
				}
			}

			setState(1018);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_element_initializer);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(OPEN_BRACE);
				setState(1022);
				expression_list();
				setState(1023);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(OPEN_BRACE);
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 153121060087648303L) != 0)) {
				{
				setState(1028);
				member_declarator_list();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1029);
					match(COMMA);
					}
				}

				}
			}

			setState(1034);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			member_declarator();
			setState(1041);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1037);
					match(COMMA);
					setState(1038);
					member_declarator();
					}
					} 
				}
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_member_declarator);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				identifier();
				setState(1046);
				match(ASSIGNMENT);
				setState(1047);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NotCParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(NotCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NotCParser.DOT, i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			identifier();
			setState(1060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1052);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(1055);
				match(DOUBLE_COLON);
				setState(1056);
				identifier();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1057);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1062);
				match(DOT);
				setState(1063);
				identifier();
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1064);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NotCParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(LT);
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1073);
				match(COMMA);
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(NotCParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NotCParser.STAR, i);
		}
		public TerminalNode INTERR() { return getToken(NotCParser.INTERR, 0); }
		public IsTypePatternArmsContext isTypePatternArms() {
			return getRuleContext(IsTypePatternArmsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_isType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			base_type();
			setState(1086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1084);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(1082);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(1083);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1089);
				match(INTERR);
				}
				break;
			}
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1092);
				isTypePatternArms();
				}
				break;
			}
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1095);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsTypePatternArmsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public List<IsTypePatternArmContext> isTypePatternArm() {
			return getRuleContexts(IsTypePatternArmContext.class);
		}
		public IsTypePatternArmContext isTypePatternArm(int i) {
			return getRuleContext(IsTypePatternArmContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public IsTypePatternArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArms; }
	}

	public final IsTypePatternArmsContext isTypePatternArms() throws RecognitionException {
		IsTypePatternArmsContext _localctx = new IsTypePatternArmsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_isTypePatternArms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(OPEN_BRACE);
			setState(1099);
			isTypePatternArm();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1100);
				match(COMMA);
				setState(1101);
				isTypePatternArm();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1107);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsTypePatternArmContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsTypePatternArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArm; }
	}

	public final IsTypePatternArmContext isTypePatternArm() throws RecognitionException {
		IsTypePatternArmContext _localctx = new IsTypePatternArmContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_isTypePatternArm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			identifier();
			setState(1110);
			match(COLON);
			setState(1111);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_expressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(NotCParser.ASYNC, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1113);
				match(ASYNC);
				}
				break;
			}
			setState(1116);
			anonymous_function_signature();
			setState(1117);
			right_arrow();
			setState(1118);
			anonymous_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_anonymous_function_signature);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				match(OPEN_PARENS);
				setState(1121);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				match(OPEN_PARENS);
				setState(1123);
				explicit_anonymous_function_parameter_list();
				setState(1124);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				match(OPEN_PARENS);
				setState(1127);
				implicit_anonymous_function_parameter_list();
				setState(1128);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			explicit_anonymous_function_parameter();
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1134);
				match(COMMA);
				setState(1135);
				explicit_anonymous_function_parameter();
				}
				}
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode OUT() { return getToken(NotCParser.OUT, 0); }
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 17301505L) != 0)) {
				{
				setState(1141);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 17301505L) != 0)) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1144);
			type_();
			setState(1145);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			identifier();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1148);
				match(COMMA);
				setState(1149);
				identifier();
				}
				}
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_anonymous_function_body);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THROW:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				throwable_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_expressionContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			from_clause();
			setState(1160);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(NotCParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(FROM);
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1163);
				type_();
				}
				break;
			}
			setState(1166);
			identifier();
			setState(1167);
			match(IN);
			setState(1168);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 288230376168501249L) != 0)) {
				{
				{
				setState(1170);
				query_body_clause();
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1176);
			select_or_group_clause();
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1177);
				query_continuation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_query_body_clause);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1184);
				orderby_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(NotCParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(LET);
			setState(1188);
			identifier();
			setState(1189);
			match(ASSIGNMENT);
			setState(1190);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(NotCParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(WHERE);
			setState(1193);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(NotCParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(NotCParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(NotCParser.EQUALS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode INTO() { return getToken(NotCParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(JOIN);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1196);
				type_();
				}
				break;
			}
			setState(1199);
			identifier();
			setState(1200);
			match(IN);
			setState(1201);
			expression();
			setState(1202);
			match(ON);
			setState(1203);
			expression();
			setState(1204);
			match(EQUALS);
			setState(1205);
			expression();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1206);
				match(INTO);
				setState(1207);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(NotCParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(ORDERBY);
			setState(1211);
			ordering();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1212);
				match(COMMA);
				setState(1213);
				ordering();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(NotCParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(NotCParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			expression();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1220);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(NotCParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(NotCParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(NotCParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_select_or_group_clause);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				match(SELECT);
				setState(1224);
				expression();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(GROUP);
				setState(1226);
				expression();
				setState(1227);
				match(BY);
				setState(1228);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(NotCParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(INTO);
			setState(1233);
			identifier();
			setState(1234);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statement);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				labeled_Statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1238);
				embedded_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1239);
				comment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public Local_function_declarationContext local_function_declaration() {
			return getRuleContext(Local_function_declarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declarationStatement);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				local_variable_declaration();
				setState(1243);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				local_constant_declaration();
				setState(1246);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				local_function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_function_declarationContext extends ParserRuleContext {
		public Local_function_headerContext local_function_header() {
			return getRuleContext(Local_function_headerContext.class,0);
		}
		public Local_function_bodyContext local_function_body() {
			return getRuleContext(Local_function_bodyContext.class,0);
		}
		public Local_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_declaration; }
	}

	public final Local_function_declarationContext local_function_declaration() throws RecognitionException {
		Local_function_declarationContext _localctx = new Local_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_local_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			local_function_header();
			setState(1252);
			local_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_function_headerContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Local_function_modifiersContext local_function_modifiers() {
			return getRuleContext(Local_function_modifiersContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Local_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_header; }
	}

	public final Local_function_headerContext local_function_header() throws RecognitionException {
		Local_function_headerContext _localctx = new Local_function_headerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_local_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1254);
				local_function_modifiers();
				}
				break;
			}
			setState(1257);
			return_type();
			setState(1258);
			identifier();
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1259);
				type_parameter_list();
				}
			}

			setState(1262);
			match(OPEN_PARENS);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
				{
				setState(1263);
				formal_parameter_list();
				}
			}

			setState(1266);
			match(CLOSE_PARENS);
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1267);
				type_parameter_constraints_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_function_modifiersContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(NotCParser.ASYNC, 0); }
		public TerminalNode UNSAFE() { return getToken(NotCParser.UNSAFE, 0); }
		public TerminalNode STATIC() { return getToken(NotCParser.STATIC, 0); }
		public Local_function_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_modifiers; }
	}

	public final Local_function_modifiersContext local_function_modifiers() throws RecognitionException {
		Local_function_modifiersContext _localctx = new Local_function_modifiersContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_local_function_modifiers);
		int _la;
		try {
			setState(1276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
			case UNSAFE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1271);
					match(STATIC);
					}
				}

				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(STATIC);
				setState(1275);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_function_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Local_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_body; }
	}

	public final Local_function_bodyContext local_function_body() throws RecognitionException {
		Local_function_bodyContext _localctx = new Local_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_local_function_body);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				right_arrow();
				setState(1280);
				throwable_expression();
				setState(1281);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			identifier();
			setState(1286);
			match(COLON);
			setState(1287);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_embedded_statement);
		try {
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				block();
				}
				break;
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends Simple_embedded_statementContext {
		public TerminalNode TRY() { return getToken(NotCParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(NotCParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(NotCParser.THROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TheEmptyStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public TheEmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(NotCParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOR() { return getToken(NotCParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(NotCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NotCParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public ForStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(NotCParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends Simple_embedded_statementContext {
		public TerminalNode IF() { return getToken(NotCParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NotCParser.ELSE, 0); }
		public IfStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(NotCParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(NotCParser.GOTO, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(NotCParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(NotCParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SWITCH() { return getToken(NotCParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(NotCParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends Simple_embedded_statementContext {
		public TerminalNode WHILE() { return getToken(NotCParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode DO() { return getToken(NotCParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(NotCParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public DoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOREACH() { return getToken(NotCParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(NotCParser.AWAIT, 0); }
		public ForeachStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(NotCParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(NotCParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(NotCParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(NotCParser.YIELD, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(NotCParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(NotCParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				_localctx = new TheEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				expression();
				setState(1295);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				match(IF);
				setState(1298);
				match(OPEN_PARENS);
				setState(1299);
				expression();
				setState(1300);
				match(CLOSE_PARENS);
				setState(1301);
				if_body();
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(ELSE);
					setState(1303);
					if_body();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1306);
				match(SWITCH);
				setState(1307);
				match(OPEN_PARENS);
				setState(1308);
				expression();
				setState(1309);
				match(CLOSE_PARENS);
				setState(1310);
				match(OPEN_BRACE);
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1311);
					switch_section();
					}
					}
					setState(1316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1317);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1319);
				match(WHILE);
				setState(1320);
				match(OPEN_PARENS);
				setState(1321);
				expression();
				setState(1322);
				match(CLOSE_PARENS);
				setState(1323);
				embedded_statement();
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1325);
				match(DO);
				setState(1326);
				embedded_statement();
				setState(1327);
				match(WHILE);
				setState(1328);
				match(OPEN_PARENS);
				setState(1329);
				expression();
				setState(1330);
				match(CLOSE_PARENS);
				setState(1331);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1333);
				match(FOR);
				setState(1334);
				match(OPEN_PARENS);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970984672411521412L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250890867779537L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(1335);
					for_initializer();
					}
				}

				setState(1338);
				match(SEMICOLON);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(1339);
					expression();
					}
				}

				setState(1342);
				match(SEMICOLON);
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(1343);
					for_iterator();
					}
				}

				setState(1346);
				match(CLOSE_PARENS);
				setState(1347);
				embedded_statement();
				}
				break;
			case 8:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(1348);
					match(AWAIT);
					}
				}

				setState(1351);
				match(FOREACH);
				setState(1352);
				match(OPEN_PARENS);
				setState(1353);
				local_variable_type();
				setState(1354);
				identifier();
				setState(1355);
				match(IN);
				setState(1356);
				expression();
				setState(1357);
				match(CLOSE_PARENS);
				setState(1358);
				embedded_statement();
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1360);
				match(BREAK);
				setState(1361);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1362);
				match(CONTINUE);
				setState(1363);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1364);
				match(GOTO);
				setState(1369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_LINE_DOC_COMMENT:
				case EMPTY_DELIMITED_DOC_COMMENT:
				case DELIMITED_DOC_COMMENT:
				case SINGLE_LINE_COMMENT:
				case DELIMITED_COMMENT:
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case REMOVE:
				case SELECT:
				case SET:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1365);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1366);
					match(CASE);
					setState(1367);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(1368);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1371);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1372);
				match(RETURN);
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(1373);
					expression();
					}
				}

				setState(1376);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1377);
				match(THROW);
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(1378);
					expression();
					}
				}

				setState(1381);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1382);
				match(TRY);
				setState(1383);
				block();
				setState(1389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1384);
					catch_clauses();
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1385);
						finally_clause();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1388);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1391);
				match(CHECKED);
				setState(1392);
				block();
				}
				break;
			case 16:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1393);
				match(UNCHECKED);
				setState(1394);
				block();
				}
				break;
			case 17:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1395);
				match(LOCK);
				setState(1396);
				match(OPEN_PARENS);
				setState(1397);
				expression();
				setState(1398);
				match(CLOSE_PARENS);
				setState(1399);
				embedded_statement();
				}
				break;
			case 18:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1401);
				match(USING);
				setState(1402);
				match(OPEN_PARENS);
				setState(1403);
				resource_acquisition();
				setState(1404);
				match(CLOSE_PARENS);
				setState(1405);
				embedded_statement();
				}
				break;
			case 19:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1407);
				match(YIELD);
				setState(1411);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1408);
					match(RETURN);
					setState(1409);
					expression();
					}
					break;
				case BREAK:
					{
					setState(1410);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1413);
				match(SEMICOLON);
				}
				break;
			case 20:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1414);
				match(UNSAFE);
				setState(1415);
				block();
				}
				break;
			case 21:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1416);
				match(FIXED);
				setState(1417);
				match(OPEN_PARENS);
				setState(1418);
				pointer_type();
				setState(1419);
				fixed_pointer_declarators();
				setState(1420);
				match(CLOSE_PARENS);
				setState(1421);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(OPEN_BRACE);
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4816603014114578820L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -4449556569285724113L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
				{
				setState(1426);
				statement_list();
				}
			}

			setState(1429);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public TerminalNode FIXED() { return getToken(NotCParser.FIXED, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_local_variable_declaration);
		int _la;
		try {
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case USING:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1431);
					match(USING);
					}
					break;
				case 2:
					{
					setState(1432);
					match(REF);
					}
					break;
				case 3:
					{
					setState(1433);
					match(REF);
					setState(1434);
					match(READONLY);
					}
					break;
				}
				setState(1437);
				local_variable_type();
				setState(1438);
				local_variable_declarator();
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1439);
					match(COMMA);
					setState(1440);
					local_variable_declarator();
					setState(1441);
					if (!( this.IsLocalVariableDeclaration() )) throw new FailedPredicateException(this, " this.IsLocalVariableDeclaration() ");
					}
					}
					setState(1447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				match(FIXED);
				setState(1449);
				pointer_type();
				setState(1450);
				fixed_pointer_declarators();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NotCParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_local_variable_type);
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_local_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			identifier();
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1459);
				match(ASSIGNMENT);
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1460);
					match(REF);
					}
					break;
				}
				setState(1463);
				local_variable_initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_local_variable_initializer);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
				stackalloc_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(NotCParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(CONST);
			setState(1472);
			type_();
			setState(1473);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_if_body);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				block();
				}
				break;
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1479);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1482); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1484);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(NotCParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(NotCParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_switch_label);
		int _la;
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				match(CASE);
				setState(1487);
				expression();
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1488);
					case_guard();
					}
				}

				setState(1491);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				match(DEFAULT);
				setState(1494);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_guardContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(NotCParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_guard; }
	}

	public final Case_guardContext case_guard() throws RecognitionException {
		Case_guardContext _localctx = new Case_guardContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_case_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(WHEN);
			setState(1498);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1501); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1500);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1503); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_for_initializer);
		int _la;
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				expression();
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1507);
					match(COMMA);
					setState(1508);
					expression();
					}
					}
					setState(1513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			expression();
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1517);
				match(COMMA);
				setState(1518);
				expression();
				}
				}
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				specific_catch_clause();
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1525);
						specific_catch_clause();
						}
						} 
					}
					setState(1530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1531);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				general_catch_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(NotCParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(CATCH);
			setState(1538);
			match(OPEN_PARENS);
			setState(1539);
			class_type();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8285849179792019844L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 932276351493L) != 0)) {
				{
				setState(1540);
				identifier();
				}
			}

			setState(1543);
			match(CLOSE_PARENS);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1544);
				exception_filter();
				}
			}

			setState(1547);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(NotCParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(CATCH);
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1550);
				exception_filter();
				}
			}

			setState(1553);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(NotCParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(WHEN);
			setState(1556);
			match(OPEN_PARENS);
			setState(1557);
			expression();
			setState(1558);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(NotCParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(FINALLY);
			setState(1561);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_resource_acquisition);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1563);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1564);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(NotCParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(NAMESPACE);
			setState(1568);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(1569);
			namespace_body();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1570);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(NotCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NotCParser.DOT, i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			identifier();
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1574);
				match(DOT);
				setState(1575);
				identifier();
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(OPEN_BRACE);
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1582);
				extern_alias_directives();
				}
				break;
			}
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1585);
				using_directives();
				}
			}

			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043780180885504L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 72057877516262915L) != 0)) {
				{
				setState(1588);
				namespace_member_declarations();
				}
			}

			setState(1591);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extern_alias_directivesContext extends ParserRuleContext {
		public List<Extern_alias_directiveContext> extern_alias_directive() {
			return getRuleContexts(Extern_alias_directiveContext.class);
		}
		public Extern_alias_directiveContext extern_alias_directive(int i) {
			return getRuleContext(Extern_alias_directiveContext.class,i);
		}
		public Extern_alias_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directives; }
	}

	public final Extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		Extern_alias_directivesContext _localctx = new Extern_alias_directivesContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_extern_alias_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1593);
					extern_alias_directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1596); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extern_alias_directiveContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(NotCParser.EXTERN, 0); }
		public TerminalNode ALIAS() { return getToken(NotCParser.ALIAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Extern_alias_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directive; }
	}

	public final Extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		Extern_alias_directiveContext _localctx = new Extern_alias_directiveContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(EXTERN);
			setState(1599);
			match(ALIAS);
			setState(1600);
			identifier();
			setState(1601);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1603);
				using_directive();
				}
				}
				setState(1606); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingAliasDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public UsingAliasDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(NotCParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingModuleDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public TerminalNode MODULE() { return getToken(NotCParser.MODULE, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public UsingModuleDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_using_directive);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new UsingAliasDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(USING);
				setState(1609);
				identifier();
				setState(1610);
				match(ASSIGNMENT);
				setState(1611);
				namespace_or_type_name();
				setState(1612);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				match(USING);
				setState(1615);
				namespace_or_type_name();
				setState(1616);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1618);
				match(USING);
				setState(1619);
				match(STATIC);
				setState(1620);
				namespace_or_type_name();
				setState(1621);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new UsingModuleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1623);
				match(USING);
				setState(1624);
				match(MODULE);
				setState(1625);
				namespace_or_type_name();
				setState(1626);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_namespace_member_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1630);
					namespace_member_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namespace_member_declaration);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				namespace_declaration();
				}
				break;
			case ASYNC:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case PRIVATE:
			case PUBLIC:
			case READONLY:
			case REF:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				type_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_declarationContext extends ParserRuleContext {
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1639);
				attributes();
				}
			}

			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1642);
				all_member_modifiers();
				}
				break;
			}
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READONLY:
			case REF:
			case STRUCT:
				{
				setState(1645);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1646);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1647);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1648);
				delegate_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NotCParser.DOUBLE_COLON, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			identifier();
			setState(1652);
			match(DOUBLE_COLON);
			setState(1653);
			identifier();
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1654);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NotCParser.LT, 0); }
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(LT);
			setState(1658);
			type_parameter();
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1659);
				match(COMMA);
				setState(1660);
				type_parameter();
				}
				}
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1666);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1668);
				attributes();
				}
			}

			setState(1671);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(COLON);
			setState(1674);
			class_type();
			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1675);
				match(COMMA);
				setState(1676);
				namespace_or_type_name();
				}
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			namespace_or_type_name();
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1683);
				match(COMMA);
				setState(1684);
				namespace_or_type_name();
				}
				}
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_type_parameter_constraints_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1690);
				type_parameter_constraints_clause();
				}
				}
				setState(1693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHERE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(NotCParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(WHERE);
			setState(1696);
			identifier();
			setState(1697);
			match(COLON);
			setState(1698);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				constructor_constraint();
				}
				break;
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				primary_constraint();
				setState(1704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1702);
					match(COMMA);
					setState(1703);
					secondary_constraints();
					}
					break;
				}
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1706);
					match(COMMA);
					setState(1707);
					constructor_constraint();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(NotCParser.STRUCT, 0); }
		public TerminalNode UNMANAGED() { return getToken(NotCParser.UNMANAGED, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_primary_constraint);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				class_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(STRUCT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1714);
				match(UNMANAGED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			namespace_or_type_name();
			setState(1722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1718);
					match(COMMA);
					setState(1719);
					namespace_or_type_name();
					}
					} 
				}
				setState(1724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(NotCParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(NEW);
			setState(1726);
			match(OPEN_PARENS);
			setState(1727);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(OPEN_BRACE);
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5914694178446840196L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 180151663161761581L) != 0) || _la==TILDE) {
				{
				setState(1730);
				class_member_declarations();
				}
			}

			setState(1733);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1735);
				class_member_declaration();
				}
				}
				setState(1738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -5914694178446840196L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 180151663161761581L) != 0) || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_class_member_declaration);
		int _la;
		try {
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1740);
					attributes();
					}
				}

				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1743);
					all_member_modifiers();
					}
					break;
				}
				setState(1748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_LINE_DOC_COMMENT:
				case EMPTY_DELIMITED_DOC_COMMENT:
				case DELIMITED_DOC_COMMENT:
				case SINGLE_LINE_COMMENT:
				case DELIMITED_COMMENT:
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case CONST:
				case DECIMAL:
				case DELEGATE:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case ENUM:
				case EQUALS:
				case EVENT:
				case EXPLICIT:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case IMPLICIT:
				case INT:
				case INTERFACE:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case READONLY:
				case REF:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case STRUCT:
				case UINT:
				case ULONG:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(1746);
					common_member_declaration();
					}
					break;
				case TILDE:
					{
					setState(1747);
					destructor_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				comments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentsContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_comments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1754); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1753);
					comment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1756); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_DOC_COMMENT() { return getToken(NotCParser.SINGLE_LINE_DOC_COMMENT, 0); }
		public TerminalNode EMPTY_DELIMITED_DOC_COMMENT() { return getToken(NotCParser.EMPTY_DELIMITED_DOC_COMMENT, 0); }
		public TerminalNode DELIMITED_DOC_COMMENT() { return getToken(NotCParser.DELIMITED_DOC_COMMENT, 0); }
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(NotCParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode DELIMITED_COMMENT() { return getToken(NotCParser.DELIMITED_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1761); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1760);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1763); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(NotCParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(NotCParser.PUBLIC, 0); }
		public TerminalNode INTERNAL() { return getToken(NotCParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(NotCParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(NotCParser.VOLATILE, 0); }
		public TerminalNode STATIC() { return getToken(NotCParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(NotCParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(NotCParser.EXTERN, 0); }
		public TerminalNode ASYNC() { return getToken(NotCParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36029346774794240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 141734971137L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Typed_member_declarationContext typed_member_declaration() {
			return getRuleContext(Typed_member_declarationContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_common_member_declaration);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1767);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1768);
				typed_member_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1769);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1770);
				conversion_operator_declarator();
				setState(1776);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1771);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1772);
					right_arrow();
					setState(1773);
					throwable_expression();
					setState(1774);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1778);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1779);
				match(VOID);
				setState(1780);
				method_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1781);
				struct_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1782);
				interface_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1783);
				enum_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1784);
				delegate_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typed_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NotCParser.DOT, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public Typed_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_member_declaration; }
	}

	public final Typed_member_declarationContext typed_member_declaration() throws RecognitionException {
		Typed_member_declarationContext _localctx = new Typed_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_typed_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1787);
				match(REF);
				}
				break;
			case 2:
				{
				setState(1788);
				match(READONLY);
				setState(1789);
				match(REF);
				}
				break;
			case 3:
				{
				setState(1790);
				match(REF);
				setState(1791);
				match(READONLY);
				}
				break;
			}
			setState(1794);
			type_();
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1795);
				namespace_or_type_name();
				setState(1796);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(1798);
				method_declaration();
				}
				break;
			case 3:
				{
				setState(1799);
				property_declaration();
				}
				break;
			case 4:
				{
				setState(1800);
				operator_declaration();
				}
				break;
			case 5:
				{
				setState(1801);
				field_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			constant_declarator();
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1805);
				match(COMMA);
				setState(1806);
				constant_declarator();
				}
				}
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			identifier();
			setState(1813);
			match(ASSIGNMENT);
			setState(1814);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			variable_declarator();
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1817);
				match(COMMA);
				setState(1818);
				variable_declarator();
				}
				}
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			identifier();
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1825);
				match(ASSIGNMENT);
				setState(1826);
				variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_variable_initializer);
		try {
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				array_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_return_type);
		try {
			setState(1835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1834);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_method_body);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1843);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1844);
				fixed_parameters();
				setState(1847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1845);
					match(COMMA);
					setState(1846);
					parameter_array();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			fixed_parameter();
			setState(1856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1852);
					match(COMMA);
					setState(1853);
					fixed_parameter();
					}
					} 
				}
				setState(1858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(NotCParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_fixed_parameter);
		int _la;
		try {
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1859);
					attributes();
					}
				}

				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 17301505L) != 0)) {
					{
					setState(1862);
					parameter_modifier();
					}
				}

				setState(1865);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
				match(ARGLIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode OUT() { return getToken(NotCParser.OUT, 0); }
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_parameter_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 17301505L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(NotCParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1871);
				attributes();
				}
			}

			setState(1874);
			match(PARAMS);
			setState(1875);
			array_type();
			setState(1876);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(NotCParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(NotCParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1878);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL || _la==PRIVATE) {
				{
				setState(1881);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1884);
				match(GET);
				setState(1885);
				accessor_body();
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 140737488355585L) != 0)) {
					{
					setState(1886);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1889);
				match(SET);
				setState(1890);
				accessor_body();
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || _la==PRIVATE || _la==OPEN_BRACKET) {
					{
					setState(1891);
					get_accessor_declaration();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(NotCParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1896);
				attributes();
				}
			}

			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL || _la==PRIVATE) {
				{
				setState(1899);
				accessor_modifier();
				}
			}

			setState(1902);
			match(GET);
			setState(1903);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(NotCParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1905);
				attributes();
				}
			}

			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL || _la==PRIVATE) {
				{
				setState(1908);
				accessor_modifier();
				}
			}

			setState(1911);
			match(SET);
			setState(1912);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode INTERNAL() { return getToken(NotCParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(NotCParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_accessor_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			_la = _input.LA(1);
			if ( !(_la==INTERNAL || _la==PRIVATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_accessor_body);
		try {
			setState(1918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1916);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1917);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(NotCParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(NotCParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1920);
				attributes();
				}
			}

			setState(1931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(1923);
				match(ADD);
				setState(1924);
				block();
				setState(1925);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(1927);
				match(REMOVE);
				setState(1928);
				block();
				setState(1929);
				add_accessor_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(NotCParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1933);
				attributes();
				}
			}

			setState(1936);
			match(ADD);
			setState(1937);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(NotCParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1939);
				attributes();
				}
			}

			setState(1942);
			match(REMOVE);
			setState(1943);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(NotCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotCParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(NotCParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(NotCParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(NotCParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(NotCParser.OP_DEC, 0); }
		public TerminalNode TRUE() { return getToken(NotCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NotCParser.FALSE, 0); }
		public TerminalNode STAR() { return getToken(NotCParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(NotCParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(NotCParser.PERCENT, 0); }
		public TerminalNode AMP() { return getToken(NotCParser.AMP, 0); }
		public TerminalNode BITWISE_OR() { return getToken(NotCParser.BITWISE_OR, 0); }
		public TerminalNode CARET() { return getToken(NotCParser.CARET, 0); }
		public TerminalNode OP_LEFT_SHIFT() { return getToken(NotCParser.OP_LEFT_SHIFT, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(NotCParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(NotCParser.OP_NE, 0); }
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public TerminalNode LT() { return getToken(NotCParser.LT, 0); }
		public TerminalNode OP_GE() { return getToken(NotCParser.OP_GE, 0); }
		public TerminalNode OP_LE() { return getToken(NotCParser.OP_LE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_overloadable_operator);
		try {
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1945);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1946);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1947);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1948);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1949);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1950);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1951);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1952);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1953);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1954);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1955);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1956);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1957);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1958);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1959);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1960);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1961);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1962);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1963);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1964);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1965);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1966);
				match(OP_LE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(NotCParser.OPERATOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(NotCParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(NotCParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1970);
			match(OPERATOR);
			setState(1971);
			type_();
			setState(1972);
			match(OPEN_PARENS);
			setState(1973);
			arg_declaration();
			setState(1974);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(NotCParser.BASE, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(COLON);
			{
			setState(1977);
			match(BASE);
			}
			setState(1978);
			match(OPEN_PARENS);
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966485470830662020L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250908047648657L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
				{
				setState(1979);
				argument_list();
				}
			}

			setState(1982);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_body);
		try {
			setState(1986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_interfacesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(COLON);
			setState(1989);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(OPEN_BRACE);
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5914689780400329092L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 180151663161761581L) != 0)) {
				{
				{
				setState(1992);
				struct_member_declaration();
				}
				}
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1998);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(NotCParser.FIXED, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2000);
				attributes();
				}
			}

			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(2003);
				all_member_modifiers();
				}
				break;
			}
			setState(2016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case READONLY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(2006);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(2007);
				match(FIXED);
				setState(2008);
				type_();
				setState(2010); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2009);
					fixed_size_buffer_declarator();
					}
					}
					setState(2012); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -8285849179792019844L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 932276351493L) != 0) );
				setState(2014);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(NotCParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NotCParser.STAR, i);
		}
		public List<TerminalNode> INTERR() { return getTokens(NotCParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(NotCParser.INTERR, i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			base_type();
			setState(2026); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(2019);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(2024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2025);
				rank_specifier();
				}
				}
				setState(2028); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 2098177L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rank_specifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			match(OPEN_BRACKET);
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2031);
				match(COMMA);
				}
				}
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2037);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(OPEN_BRACE);
			setState(2051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9061243777512384465L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
				{
				setState(2040);
				variable_initializer();
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2041);
						match(COMMA);
						setState(2042);
						variable_initializer();
						}
						} 
					}
					setState(2047);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				}
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2048);
					match(COMMA);
					}
				}

				}
			}

			setState(2053);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NotCParser.LT, 0); }
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			match(LT);
			setState(2056);
			variant_type_parameter();
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2057);
				match(COMMA);
				setState(2058);
				variant_type_parameter();
				}
				}
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2064);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2066);
				attributes();
				}
			}

			setState(2070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(2069);
				variance_annotation();
				}
			}

			setState(2072);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public TerminalNode OUT() { return getToken(NotCParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			match(COLON);
			setState(2077);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			match(OPEN_BRACE);
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970990033352855940L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 180151525717564461L) != 0)) {
				{
				{
				setState(2080);
				interface_member_declaration();
				}
				}
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2086);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public TerminalNode EVENT() { return getToken(NotCParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(NotCParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public TerminalNode UNSAFE() { return getToken(NotCParser.UNSAFE, 0); }
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2088);
				attributes();
				}
			}

			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(2091);
				match(NEW);
				}
			}

			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2094);
					match(UNSAFE);
					}
				}

				setState(2102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2097);
					match(REF);
					}
					break;
				case 2:
					{
					setState(2098);
					match(REF);
					setState(2099);
					match(READONLY);
					}
					break;
				case 3:
					{
					setState(2100);
					match(READONLY);
					setState(2101);
					match(REF);
					}
					break;
				}
				setState(2104);
				type_();
				setState(2124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2105);
					identifier();
					setState(2107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2106);
						type_parameter_list();
						}
					}

					setState(2109);
					match(OPEN_PARENS);
					setState(2111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
						{
						setState(2110);
						formal_parameter_list();
						}
					}

					setState(2113);
					match(CLOSE_PARENS);
					setState(2115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(2114);
						type_parameter_constraints_clauses();
						}
					}

					setState(2117);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(2119);
					identifier();
					setState(2120);
					match(OPEN_BRACE);
					setState(2121);
					interface_accessors();
					setState(2122);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2126);
					match(UNSAFE);
					}
				}

				setState(2129);
				match(VOID);
				setState(2130);
				identifier();
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2131);
					type_parameter_list();
					}
				}

				setState(2134);
				match(OPEN_PARENS);
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
					{
					setState(2135);
					formal_parameter_list();
					}
				}

				setState(2138);
				match(CLOSE_PARENS);
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(2139);
					type_parameter_constraints_clauses();
					}
				}

				setState(2142);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(2144);
				match(EVENT);
				setState(2145);
				type_();
				setState(2146);
				identifier();
				setState(2147);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(NotCParser.GET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(NotCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NotCParser.SEMICOLON, i);
		}
		public TerminalNode SET() { return getToken(NotCParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2151);
				attributes();
				}
			}

			setState(2172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(2154);
				match(GET);
				setState(2155);
				match(SEMICOLON);
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(2157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2156);
						attributes();
						}
					}

					setState(2159);
					match(SET);
					setState(2160);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(2163);
				match(SET);
				setState(2164);
				match(SEMICOLON);
				setState(2170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(2166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2165);
						attributes();
						}
					}

					setState(2168);
					match(GET);
					setState(2169);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(COLON);
			setState(2175);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(OPEN_BRACE);
			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8285849179792019844L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4504531903721989L) != 0)) {
				{
				setState(2178);
				enum_member_declaration();
				setState(2183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2179);
						match(COMMA);
						setState(2180);
						enum_member_declaration();
						}
						} 
					}
					setState(2185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				}
				setState(2187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2186);
					match(COMMA);
					}
				}

				}
			}

			setState(2191);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2193);
				attributes();
				}
			}

			setState(2196);
			identifier();
			setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2197);
				match(ASSIGNMENT);
				setState(2198);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(OPEN_BRACKET);
			setState(2202);
			global_attribute_target();
			setState(2203);
			match(COLON);
			setState(2204);
			attribute_list();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2205);
				match(COMMA);
				}
			}

			setState(2208);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_global_attribute_target);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2214);
				attribute_section();
				}
				}
				setState(2217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			match(OPEN_BRACKET);
			setState(2223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2220);
				attribute_target();
				setState(2221);
				match(COLON);
				}
				break;
			}
			setState(2225);
			attribute_list();
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2226);
				match(COMMA);
				}
			}

			setState(2229);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_attribute_target);
		try {
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2231);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2232);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			attribute();
			setState(2240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2236);
					match(COMMA);
					setState(2237);
					attribute();
					}
					} 
				}
				setState(2242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			namespace_or_type_name();
			setState(2256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2244);
				match(OPEN_PARENS);
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(2245);
					attribute_argument();
					setState(2250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2246);
						match(COMMA);
						setState(2247);
						attribute_argument();
						}
						}
						setState(2252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2255);
				match(CLOSE_PARENS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2258);
				identifier();
				setState(2259);
				match(COLON);
				}
				break;
			}
			setState(2263);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pointer_typeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(NotCParser.STAR, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> INTERR() { return getTokens(NotCParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(NotCParser.INTERR, i);
		}
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_pointer_type);
		int _la;
		try {
			setState(2280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2265);
					simple_type();
					}
					break;
				case SINGLE_LINE_DOC_COMMENT:
				case EMPTY_DELIMITED_DOC_COMMENT:
				case DELIMITED_DOC_COMMENT:
				case SINGLE_LINE_COMMENT:
				case DELIMITED_COMMENT:
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2266);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2271);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2269);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2270);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2276);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
				match(VOID);
				setState(2279);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			fixed_pointer_declarator();
			setState(2287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2283);
				match(COMMA);
				setState(2284);
				fixed_pointer_declarator();
				}
				}
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			identifier();
			setState(2291);
			match(ASSIGNMENT);
			setState(2292);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AMP() { return getToken(NotCParser.AMP, 0); }
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_fixed_pointer_initializer);
		try {
			setState(2299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2294);
					match(AMP);
					}
					break;
				}
				setState(2297);
				expression();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2298);
				stackalloc_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			identifier();
			setState(2302);
			match(OPEN_BRACKET);
			setState(2303);
			expression();
			setState(2304);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stackalloc_initializerContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(NotCParser.STACKALLOC, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NotCParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NotCParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public Stackalloc_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackalloc_initializer; }
	}

	public final Stackalloc_initializerContext stackalloc_initializer() throws RecognitionException {
		Stackalloc_initializerContext _localctx = new Stackalloc_initializerContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_stackalloc_initializer);
		int _la;
		try {
			int _alt;
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				match(STACKALLOC);
				setState(2307);
				type_();
				setState(2308);
				match(OPEN_BRACKET);
				setState(2309);
				expression();
				setState(2310);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				match(STACKALLOC);
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970990170791809412L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 36030681100907531L) != 0)) {
					{
					setState(2313);
					type_();
					}
				}

				setState(2316);
				match(OPEN_BRACKET);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
					{
					setState(2317);
					expression();
					}
				}

				setState(2320);
				match(CLOSE_BRACKET);
				setState(2321);
				match(OPEN_BRACE);
				setState(2322);
				expression();
				setState(2327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2323);
						match(COMMA);
						setState(2324);
						expression();
						}
						} 
					}
					setState(2329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				}
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2330);
					match(COMMA);
					}
				}

				setState(2333);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2338);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2339);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> GT() { return getTokens(NotCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(NotCParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2342);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2343);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode GT() { return getToken(NotCParser.GT, 0); }
		public TerminalNode OP_GE() { return getToken(NotCParser.OP_GE, 0); }
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2346);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2347);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(NotCParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(NotCParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode BIN_INTEGER_LITERAL() { return getToken(NotCParser.BIN_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(NotCParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(NotCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(NotCParser.NULL_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_literal);
		try {
			setState(2357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2351);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2352);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2353);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2354);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2355);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL_:
				enterOuterAlt(_localctx, 8);
				{
				setState(2356);
				match(NULL_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(NotCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NotCParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(NotCParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(NotCParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_string_literal);
		try {
			setState(2365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2361);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2363);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2364);
				match(VERBATIUM_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(NotCParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(NotCParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 2576980476371L) != 0)) {
				{
				{
				setState(2368);
				interpolated_regular_string_part();
				}
				}
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2374);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(NotCParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(NotCParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5970989070458032516L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250976767125457L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 5050881638867L) != 0)) {
				{
				{
				setState(2377);
				interpolated_verbatium_string_part();
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(NotCParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(NotCParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(NotCParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_interpolated_regular_string_part);
		try {
			setState(2389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2385);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2386);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2387);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2388);
				match(REGULAR_STRING_INSIDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(NotCParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(NotCParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(NotCParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_interpolated_verbatium_string_part);
		try {
			setState(2395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2393);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2394);
				match(VERBATIUM_INSIDE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NotCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NotCParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(NotCParser.COLON, 0); }
		public List<TerminalNode> FORMAT_STRING() { return getTokens(NotCParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(NotCParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			expression();
			setState(2402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2398);
				match(COMMA);
				setState(2399);
				expression();
				}
				}
				setState(2404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2405);
				match(COLON);
				setState(2407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2406);
					match(FORMAT_STRING);
					}
					}
					setState(2409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(NotCParser.AS, 0); }
		public TerminalNode BASE() { return getToken(NotCParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(NotCParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(NotCParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(NotCParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(NotCParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(NotCParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(NotCParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(NotCParser.CHECKED, 0); }
		public TerminalNode CONST() { return getToken(NotCParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(NotCParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(NotCParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(NotCParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(NotCParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(NotCParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(NotCParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(NotCParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(NotCParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(NotCParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(NotCParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(NotCParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(NotCParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(NotCParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(NotCParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(NotCParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(NotCParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(NotCParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(NotCParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(NotCParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(NotCParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(NotCParser.IN, 0); }
		public TerminalNode INT() { return getToken(NotCParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(NotCParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(NotCParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(NotCParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(NotCParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(NotCParser.LONG, 0); }
		public TerminalNode MODULE() { return getToken(NotCParser.MODULE, 0); }
		public TerminalNode NAMESPACE() { return getToken(NotCParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(NotCParser.NEW, 0); }
		public TerminalNode NULL_() { return getToken(NotCParser.NULL_, 0); }
		public TerminalNode OBJECT() { return getToken(NotCParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(NotCParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(NotCParser.OUT, 0); }
		public TerminalNode PARAMS() { return getToken(NotCParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(NotCParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(NotCParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(NotCParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(NotCParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(NotCParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(NotCParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(NotCParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(NotCParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(NotCParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(NotCParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(NotCParser.SWITCH, 0); }
		public TerminalNode THROW() { return getToken(NotCParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(NotCParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(NotCParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(NotCParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(NotCParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(NotCParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(NotCParser.UNCHECKED, 0); }
		public TerminalNode UNMANAGED() { return getToken(NotCParser.UNMANAGED, 0); }
		public TerminalNode UNSAFE() { return getToken(NotCParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(NotCParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(NotCParser.USING, 0); }
		public TerminalNode VOID() { return getToken(NotCParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(NotCParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(NotCParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8285849179792019456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2680059387823L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(NotCParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public TerminalNode READONLY() { return getToken(NotCParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(NotCParser.REF, 0); }
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY || _la==REF) {
				{
				setState(2415);
				_la = _input.LA(1);
				if ( !(_la==READONLY || _la==REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2418);
			match(STRUCT);
			setState(2419);
			identifier();
			setState(2421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2420);
				type_parameter_list();
				}
			}

			setState(2424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2423);
				struct_interfaces();
				}
			}

			setState(2427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2426);
				type_parameter_constraints_clauses();
				}
			}

			setState(2429);
			struct_body();
			setState(2431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2430);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(NotCParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(INTERFACE);
			setState(2434);
			identifier();
			setState(2436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2435);
				variant_type_parameter_list();
				}
			}

			setState(2439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2438);
				interface_base();
				}
			}

			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2441);
				type_parameter_constraints_clauses();
				}
			}

			setState(2444);
			class_body();
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2445);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(NotCParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			match(ENUM);
			setState(2449);
			identifier();
			setState(2451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2450);
				enum_base();
				}
			}

			setState(2453);
			enum_body();
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2454);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(NotCParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(DELEGATE);
			setState(2458);
			return_type();
			setState(2459);
			identifier();
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2460);
				variant_type_parameter_list();
				}
			}

			setState(2463);
			match(OPEN_PARENS);
			setState(2465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
				{
				setState(2464);
				formal_parameter_list();
				}
			}

			setState(2467);
			match(CLOSE_PARENS);
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2468);
				type_parameter_constraints_clauses();
				}
			}

			setState(2471);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(NotCParser.EVENT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(EVENT);
			setState(2474);
			type_();
			setState(2483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2475);
				variable_declarators();
				setState(2476);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2478);
				member_name();
				setState(2479);
				match(OPEN_BRACE);
				setState(2480);
				event_accessor_declarations();
				setState(2481);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			variable_declarators();
			setState(2486);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NotCParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NotCParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			member_name();
			setState(2502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2489);
				match(OPEN_BRACE);
				setState(2490);
				accessor_declarations();
				setState(2491);
				match(CLOSE_BRACE);
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2492);
					match(ASSIGNMENT);
					setState(2493);
					variable_initializer();
					setState(2494);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2498);
				right_arrow();
				setState(2499);
				throwable_expression();
				setState(2500);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(NotCParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			match(CONST);
			setState(2505);
			type_();
			setState(2506);
			constant_declarators();
			setState(2507);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Destructor_definitionContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(NotCParser.TILDE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			match(TILDE);
			setState(2510);
			identifier();
			setState(2511);
			match(OPEN_PARENS);
			setState(2512);
			match(CLOSE_PARENS);
			setState(2513);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2515);
			identifier();
			setState(2516);
			match(OPEN_PARENS);
			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
				{
				setState(2517);
				formal_parameter_list();
				}
			}

			setState(2520);
			match(CLOSE_PARENS);
			setState(2522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2521);
				constructor_initializer();
				}
			}

			setState(2524);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			method_member_name();
			setState(2528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2527);
				type_parameter_list();
				}
			}

			setState(2530);
			match(OPEN_PARENS);
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966486571164438916L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 45037880355649083L) != 0)) {
				{
				setState(2531);
				formal_parameter_list();
				}
			}

			setState(2534);
			match(CLOSE_PARENS);
			setState(2536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2535);
				type_parameter_constraints_clauses();
				}
			}

			setState(2543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2538);
				method_body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2539);
				right_arrow();
				setState(2540);
				throwable_expression();
				setState(2541);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NotCParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(NotCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NotCParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2545);
				identifier();
				}
				break;
			case 2:
				{
				setState(2546);
				identifier();
				setState(2547);
				match(DOUBLE_COLON);
				setState(2548);
				identifier();
				}
				break;
			}
			setState(2559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2552);
						type_argument_list();
						}
					}

					setState(2555);
					match(DOT);
					setState(2556);
					identifier();
					}
					} 
				}
				setState(2561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(NotCParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NotCParser.SEMICOLON, 0); }
		public List<TerminalNode> IN() { return getTokens(NotCParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(NotCParser.IN, i);
		}
		public TerminalNode COMMA() { return getToken(NotCParser.COMMA, 0); }
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			match(OPERATOR);
			setState(2563);
			overloadable_operator();
			setState(2564);
			match(OPEN_PARENS);
			setState(2566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2565);
				match(IN);
				}
			}

			setState(2568);
			arg_declaration();
			setState(2574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2569);
				match(COMMA);
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2570);
					match(IN);
					}
				}

				setState(2573);
				arg_declaration();
				}
			}

			setState(2576);
			match(CLOSE_PARENS);
			setState(2582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2577);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2578);
				right_arrow();
				setState(2579);
				throwable_expression();
				setState(2580);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NotCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			type_();
			setState(2585);
			identifier();
			setState(2588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2586);
				match(ASSIGNMENT);
				setState(2587);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(OPEN_PARENS);
			setState(2592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966485470830662020L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250908047648657L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
				{
				setState(2591);
				argument_list();
				}
			}

			setState(2594);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NotCParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NotCParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			match(OPEN_PARENS);
			setState(2598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5966485470830662020L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9070250908047648657L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 34359837139L) != 0)) {
				{
				setState(2597);
				argument_list();
				}
			}

			setState(2600);
			match(CLOSE_PARENS);
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2601);
				object_or_collection_initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NotCParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(NotCParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(NotCParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(NotCParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(NotCParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(NotCParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(NotCParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(NotCParser.BY, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TerminalNode DESCENDING() { return getToken(NotCParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(NotCParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(NotCParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(NotCParser.FROM, 0); }
		public TerminalNode GET() { return getToken(NotCParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(NotCParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(NotCParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(NotCParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(NotCParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(NotCParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(NotCParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(NotCParser.ORDERBY, 0); }
		public TerminalNode REMOVE() { return getToken(NotCParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(NotCParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(NotCParser.SET, 0); }
		public TerminalNode UNMANAGED() { return getToken(NotCParser.UNMANAGED, 0); }
		public TerminalNode VAR() { return getToken(NotCParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(NotCParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(NotCParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(NotCParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_identifier);
		try {
			int _alt;
			setState(2637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				match(IDENTIFIER);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2605);
				match(ADD);
				}
				break;
			case ALIAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2606);
				match(ALIAS);
				}
				break;
			case ARGLIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2607);
				match(ARGLIST);
				}
				break;
			case ASCENDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(2608);
				match(ASCENDING);
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(2609);
				match(ASYNC);
				}
				break;
			case AWAIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2610);
				match(AWAIT);
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2611);
				match(BY);
				}
				break;
			case SINGLE_LINE_DOC_COMMENT:
			case EMPTY_DELIMITED_DOC_COMMENT:
			case DELIMITED_DOC_COMMENT:
			case SINGLE_LINE_COMMENT:
			case DELIMITED_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2613); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2612);
						comment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2615); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DESCENDING:
				enterOuterAlt(_localctx, 10);
				{
				setState(2617);
				match(DESCENDING);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 11);
				{
				setState(2618);
				match(DYNAMIC);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 12);
				{
				setState(2619);
				match(EQUALS);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 13);
				{
				setState(2620);
				match(FROM);
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 14);
				{
				setState(2621);
				match(GET);
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 15);
				{
				setState(2622);
				match(GROUP);
				}
				break;
			case INTO:
				enterOuterAlt(_localctx, 16);
				{
				setState(2623);
				match(INTO);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 17);
				{
				setState(2624);
				match(JOIN);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 18);
				{
				setState(2625);
				match(LET);
				}
				break;
			case NAMEOF:
				enterOuterAlt(_localctx, 19);
				{
				setState(2626);
				match(NAMEOF);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 20);
				{
				setState(2627);
				match(ON);
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 21);
				{
				setState(2628);
				match(ORDERBY);
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 22);
				{
				setState(2629);
				match(REMOVE);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 23);
				{
				setState(2630);
				match(SELECT);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 24);
				{
				setState(2631);
				match(SET);
				}
				break;
			case UNMANAGED:
				enterOuterAlt(_localctx, 25);
				{
				setState(2632);
				match(UNMANAGED);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 26);
				{
				setState(2633);
				match(VAR);
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 27);
				{
				setState(2634);
				match(WHEN);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 28);
				{
				setState(2635);
				match(WHERE);
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 29);
				{
				setState(2636);
				match(YIELD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 87:
			return local_variable_declaration_sempred((Local_variable_declarationContext)_localctx, predIndex);
		case 190:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 191:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 192:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean local_variable_declaration_sempred(Local_variable_declarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  this.IsLocalVariableDeclaration() ;
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00bf\u0a50\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0001\u0000\u0003\u0000\u01b8\b\u0000\u0001\u0000\u0003\u0000\u01bb"+
		"\b\u0000\u0001\u0000\u0003\u0000\u01be\b\u0000\u0001\u0000\u0005\u0000"+
		"\u01c1\b\u0000\n\u0000\f\u0000\u01c4\t\u0000\u0001\u0000\u0003\u0000\u01c7"+
		"\b\u0000\u0001\u0000\u0003\u0000\u01ca\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u01d0\b\u0001\u0001\u0001\u0003\u0001"+
		"\u01d3\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u01d8\b"+
		"\u0001\u0005\u0001\u01da\b\u0001\n\u0001\f\u0001\u01dd\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u01e3\b\u0002\n\u0002"+
		"\f\u0002\u01e6\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u01ed\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u01f3\b\u0004\u000b\u0004\f\u0004\u01f4\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u01fb\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u01ff\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0204\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u020e\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0214\b\u000b\n\u000b\f\u000b\u0217\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u021e\b\f\n\f"+
		"\f\f\u0221\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u0226\b\r\u0001\r\u0003"+
		"\r\u0229\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u022e\b\r\u0001\r\u0003\r"+
		"\u0231\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0237\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u023c\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0246\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0253\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u025b\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0261\b\u0013\u0003\u0013\u0263\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0268\b\u0014\n\u0014\f\u0014\u026b\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0270\b\u0015\n\u0015\f\u0015"+
		"\u0273\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0278\b"+
		"\u0016\n\u0016\f\u0016\u027b\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0280\b\u0017\n\u0017\f\u0017\u0283\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0288\b\u0018\n\u0018\f\u0018\u028b\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0290\b\u0019\n\u0019"+
		"\f\u0019\u0293\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u029c\b\u001a\n\u001a"+
		"\f\u001a\u029f\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u02a4\b\u001b\u0001\u001b\u0005\u001b\u02a7\b\u001b\n\u001b\f\u001b\u02aa"+
		"\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02af\b\u001c"+
		"\n\u001c\f\u001c\u02b2\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u02b7\b\u001d\n\u001d\f\u001d\u02ba\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02c1\b\u001e\u0003\u001e"+
		"\u02c3\b\u001e\u0001\u001e\u0003\u001e\u02c6\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u02cb\b\u001f\n\u001f\f\u001f\u02ce\t\u001f"+
		"\u0001 \u0001 \u0003 \u02d2\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0003"+
		"!\u02d9\b!\u0001!\u0001!\u0003!\u02dd\b!\u0003!\u02df\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u02f7\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0003$\u0300\b$\u0001$\u0005$\u0303\b$\n$\f$\u0306\t$"+
		"\u0001$\u0003$\u0309\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0311\b$\u0001$\u0003$\u0314\b$\u0001$\u0005$\u0317\b$\n$\f$\u031a\t"+
		"$\u0001$\u0003$\u031d\b$\u0005$\u031f\b$\n$\f$\u0322\t$\u0001%\u0001%"+
		"\u0001%\u0003%\u0327\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0334\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u033a\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u0344\b%\n%\f%\u0347\t%\u0001%\u0003%\u034a\b%\u0001%\u0004%"+
		"\u034d\b%\u000b%\f%\u034e\u0001%\u0001%\u0003%\u0353\b%\u0001%\u0001%"+
		"\u0001%\u0001%\u0003%\u0359\b%\u0001%\u0001%\u0001%\u0001%\u0004%\u035f"+
		"\b%\u000b%\f%\u0360\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u036a\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u037c\b%\u0001"+
		"%\u0003%\u037f\b%\u0001%\u0001%\u0001%\u0003%\u0384\b%\u0001%\u0003%\u0387"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u0394\b%\n%\f%\u0397\t%\u0001%\u0001%\u0001%\u0003%\u039c"+
		"\b%\u0001&\u0001&\u0003&\u03a0\b&\u0001\'\u0001\'\u0001\'\u0001(\u0003"+
		"(\u03a6\b(\u0001(\u0001(\u0001(\u0003(\u03ab\b(\u0001)\u0003)\u03ae\b"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u03b4\b)\n)\f)\u03b7\t)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0003*\u03be\b*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0005,\u03c7\b,\n,\f,\u03ca\t,\u0001-\u0001-\u0003-\u03ce"+
		"\b-\u0001.\u0001.\u0001.\u0003.\u03d3\b.\u0003.\u03d5\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0005/\u03dc\b/\n/\f/\u03df\t/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u03e6\b0\u00010\u00010\u00010\u00011\u00011\u0003"+
		"1\u03ed\b1\u00012\u00012\u00012\u00012\u00052\u03f3\b2\n2\f2\u03f6\t2"+
		"\u00012\u00032\u03f9\b2\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00033\u0402\b3\u00014\u00014\u00014\u00034\u0407\b4\u00034\u0409\b"+
		"4\u00014\u00014\u00015\u00015\u00015\u00055\u0410\b5\n5\f5\u0413\t5\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u041a\b6\u00017\u00017\u00037\u041e"+
		"\b7\u00017\u00017\u00017\u00037\u0423\b7\u00037\u0425\b7\u00017\u0001"+
		"7\u00017\u00037\u042a\b7\u00057\u042c\b7\n7\f7\u042f\t7\u00018\u00018"+
		"\u00058\u0433\b8\n8\f8\u0436\t8\u00018\u00018\u00019\u00019\u00019\u0005"+
		"9\u043d\b9\n9\f9\u0440\t9\u00019\u00039\u0443\b9\u00019\u00039\u0446\b"+
		"9\u00019\u00039\u0449\b9\u0001:\u0001:\u0001:\u0001:\u0005:\u044f\b:\n"+
		":\f:\u0452\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0003<"+
		"\u045b\b<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u046c\b=\u0001>\u0001"+
		">\u0001>\u0005>\u0471\b>\n>\f>\u0474\t>\u0001?\u0003?\u0477\b?\u0001?"+
		"\u0001?\u0001?\u0001@\u0001@\u0001@\u0005@\u047f\b@\n@\f@\u0482\t@\u0001"+
		"A\u0001A\u0003A\u0486\bA\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u048d"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0001D\u0005D\u0494\bD\nD\fD\u0497\tD"+
		"\u0001D\u0001D\u0003D\u049b\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003"+
		"E\u04a2\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0003H\u04ae\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u04b9\bH\u0001I\u0001I\u0001I\u0001I\u0005I\u04bf"+
		"\bI\nI\fI\u04c2\tI\u0001J\u0001J\u0003J\u04c6\bJ\u0001K\u0001K\u0001K"+
		"\u0001K\u0001K\u0001K\u0001K\u0003K\u04cf\bK\u0001L\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0001M\u0003M\u04d9\bM\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0003N\u04e2\bN\u0001O\u0001O\u0001O\u0001P\u0003"+
		"P\u04e8\bP\u0001P\u0001P\u0001P\u0003P\u04ed\bP\u0001P\u0001P\u0003P\u04f1"+
		"\bP\u0001P\u0001P\u0003P\u04f5\bP\u0001Q\u0001Q\u0003Q\u04f9\bQ\u0001"+
		"Q\u0001Q\u0003Q\u04fd\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0504"+
		"\bR\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0003T\u050c\bT\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u0519\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u0521\bU\n"+
		"U\fU\u0524\tU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U"+
		"\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0003U\u0539\bU\u0001U\u0001U\u0003U\u053d\bU\u0001U\u0001U\u0003"+
		"U\u0541\bU\u0001U\u0001U\u0001U\u0003U\u0546\bU\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0003U\u055a\bU\u0001U\u0001U\u0001U\u0003"+
		"U\u055f\bU\u0001U\u0001U\u0001U\u0003U\u0564\bU\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0003U\u056b\bU\u0001U\u0003U\u056e\bU\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u0584\bU\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u0590"+
		"\bU\u0001V\u0001V\u0003V\u0594\bV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001"+
		"W\u0003W\u059c\bW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u05a4"+
		"\bW\nW\fW\u05a7\tW\u0001W\u0001W\u0001W\u0001W\u0003W\u05ad\bW\u0001X"+
		"\u0001X\u0003X\u05b1\bX\u0001Y\u0001Y\u0001Y\u0003Y\u05b6\bY\u0001Y\u0003"+
		"Y\u05b9\bY\u0001Z\u0001Z\u0001Z\u0003Z\u05be\bZ\u0001[\u0001[\u0001[\u0001"+
		"[\u0001\\\u0001\\\u0003\\\u05c6\b\\\u0001]\u0004]\u05c9\b]\u000b]\f]\u05ca"+
		"\u0001]\u0001]\u0001^\u0001^\u0001^\u0003^\u05d2\b^\u0001^\u0001^\u0001"+
		"^\u0001^\u0003^\u05d8\b^\u0001_\u0001_\u0001_\u0001`\u0004`\u05de\b`\u000b"+
		"`\f`\u05df\u0001a\u0001a\u0001a\u0001a\u0005a\u05e6\ba\na\fa\u05e9\ta"+
		"\u0003a\u05eb\ba\u0001b\u0001b\u0001b\u0005b\u05f0\bb\nb\fb\u05f3\tb\u0001"+
		"c\u0001c\u0005c\u05f7\bc\nc\fc\u05fa\tc\u0001c\u0003c\u05fd\bc\u0001c"+
		"\u0003c\u0600\bc\u0001d\u0001d\u0001d\u0001d\u0003d\u0606\bd\u0001d\u0001"+
		"d\u0003d\u060a\bd\u0001d\u0001d\u0001e\u0001e\u0003e\u0610\be\u0001e\u0001"+
		"e\u0001f\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001h\u0001"+
		"h\u0003h\u061e\bh\u0001i\u0001i\u0001i\u0001i\u0003i\u0624\bi\u0001j\u0001"+
		"j\u0001j\u0005j\u0629\bj\nj\fj\u062c\tj\u0001k\u0001k\u0003k\u0630\bk"+
		"\u0001k\u0003k\u0633\bk\u0001k\u0003k\u0636\bk\u0001k\u0001k\u0001l\u0004"+
		"l\u063b\bl\u000bl\fl\u063c\u0001m\u0001m\u0001m\u0001m\u0001m\u0001n\u0004"+
		"n\u0645\bn\u000bn\fn\u0646\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0003o\u065d\bo\u0001p\u0004p\u0660\bp\u000bp\f"+
		"p\u0661\u0001q\u0001q\u0003q\u0666\bq\u0001r\u0003r\u0669\br\u0001r\u0003"+
		"r\u066c\br\u0001r\u0001r\u0001r\u0001r\u0003r\u0672\br\u0001s\u0001s\u0001"+
		"s\u0001s\u0003s\u0678\bs\u0001t\u0001t\u0001t\u0001t\u0005t\u067e\bt\n"+
		"t\ft\u0681\tt\u0001t\u0001t\u0001u\u0003u\u0686\bu\u0001u\u0001u\u0001"+
		"v\u0001v\u0001v\u0001v\u0005v\u068e\bv\nv\fv\u0691\tv\u0001w\u0001w\u0001"+
		"w\u0005w\u0696\bw\nw\fw\u0699\tw\u0001x\u0004x\u069c\bx\u000bx\fx\u069d"+
		"\u0001y\u0001y\u0001y\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0003"+
		"z\u06a9\bz\u0001z\u0001z\u0003z\u06ad\bz\u0003z\u06af\bz\u0001{\u0001"+
		"{\u0001{\u0003{\u06b4\b{\u0001|\u0001|\u0001|\u0005|\u06b9\b|\n|\f|\u06bc"+
		"\t|\u0001}\u0001}\u0001}\u0001}\u0001~\u0001~\u0003~\u06c4\b~\u0001~\u0001"+
		"~\u0001\u007f\u0004\u007f\u06c9\b\u007f\u000b\u007f\f\u007f\u06ca\u0001"+
		"\u0080\u0003\u0080\u06ce\b\u0080\u0001\u0080\u0003\u0080\u06d1\b\u0080"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u06d5\b\u0080\u0001\u0080\u0003\u0080"+
		"\u06d8\b\u0080\u0001\u0081\u0004\u0081\u06db\b\u0081\u000b\u0081\f\u0081"+
		"\u06dc\u0001\u0082\u0001\u0082\u0001\u0083\u0004\u0083\u06e2\b\u0083\u000b"+
		"\u0083\f\u0083\u06e3\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
		"\u0085\u0003\u0085\u06f1\b\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u06fa\b\u0085\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0701"+
		"\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u070b\b\u0086\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0005\u0087\u0710\b\u0087\n\u0087\f\u0087\u0713\t\u0087"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0005\u0089\u071c\b\u0089\n\u0089\f\u0089\u071f\t\u0089\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0724\b\u008a\u0001\u008b\u0001"+
		"\u008b\u0003\u008b\u0728\b\u008b\u0001\u008c\u0001\u008c\u0003\u008c\u072c"+
		"\b\u008c\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0003\u008e\u0732"+
		"\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0738"+
		"\b\u008f\u0003\u008f\u073a\b\u008f\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0005\u0090\u073f\b\u0090\n\u0090\f\u0090\u0742\t\u0090\u0001\u0091\u0003"+
		"\u0091\u0745\b\u0091\u0001\u0091\u0003\u0091\u0748\b\u0091\u0001\u0091"+
		"\u0001\u0091\u0003\u0091\u074c\b\u0091\u0001\u0092\u0001\u0092\u0001\u0093"+
		"\u0003\u0093\u0751\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0094\u0003\u0094\u0758\b\u0094\u0001\u0094\u0003\u0094\u075b\b"+
		"\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u0760\b\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u0765\b\u0094\u0003\u0094\u0767"+
		"\b\u0094\u0001\u0095\u0003\u0095\u076a\b\u0095\u0001\u0095\u0003\u0095"+
		"\u076d\b\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0003\u0096"+
		"\u0773\b\u0096\u0001\u0096\u0003\u0096\u0776\b\u0096\u0001\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0003"+
		"\u0098\u077f\b\u0098\u0001\u0099\u0003\u0099\u0782\b\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0003\u0099\u078c\b\u0099\u0001\u009a\u0003\u009a\u078f\b"+
		"\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0003\u009b\u0795"+
		"\b\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0003\u009c\u07b0\b\u009c\u0001\u009d\u0001\u009d\u0001"+
		"\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u07bd\b\u009e\u0001\u009e\u0001"+
		"\u009e\u0001\u009f\u0001\u009f\u0003\u009f\u07c3\b\u009f\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0005\u00a1\u07ca\b\u00a1\n"+
		"\u00a1\f\u00a1\u07cd\t\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0003"+
		"\u00a2\u07d2\b\u00a2\u0001\u00a2\u0003\u00a2\u07d5\b\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0004\u00a2\u07db\b\u00a2\u000b\u00a2"+
		"\f\u00a2\u07dc\u0001\u00a2\u0001\u00a2\u0003\u00a2\u07e1\b\u00a2\u0001"+
		"\u00a3\u0001\u00a3\u0005\u00a3\u07e5\b\u00a3\n\u00a3\f\u00a3\u07e8\t\u00a3"+
		"\u0001\u00a3\u0004\u00a3\u07eb\b\u00a3\u000b\u00a3\f\u00a3\u07ec\u0001"+
		"\u00a4\u0001\u00a4\u0005\u00a4\u07f1\b\u00a4\n\u00a4\f\u00a4\u07f4\t\u00a4"+
		"\u0001\u00a4\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5"+
		"\u0005\u00a5\u07fc\b\u00a5\n\u00a5\f\u00a5\u07ff\t\u00a5\u0001\u00a5\u0003"+
		"\u00a5\u0802\b\u00a5\u0003\u00a5\u0804\b\u00a5\u0001\u00a5\u0001\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0005\u00a6\u080c\b\u00a6"+
		"\n\u00a6\f\u00a6\u080f\t\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0003"+
		"\u00a7\u0814\b\u00a7\u0001\u00a7\u0003\u00a7\u0817\b\u00a7\u0001\u00a7"+
		"\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9"+
		"\u0001\u00aa\u0001\u00aa\u0005\u00aa\u0822\b\u00aa\n\u00aa\f\u00aa\u0825"+
		"\t\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0003\u00ab\u082a\b\u00ab"+
		"\u0001\u00ab\u0003\u00ab\u082d\b\u00ab\u0001\u00ab\u0003\u00ab\u0830\b"+
		"\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0003"+
		"\u00ab\u0837\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u083c"+
		"\b\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0840\b\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0003\u00ab\u0844\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u084d\b\u00ab"+
		"\u0001\u00ab\u0003\u00ab\u0850\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0003\u00ab\u0855\b\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0859\b"+
		"\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u085d\b\u00ab\u0001\u00ab\u0001"+
		"\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0003"+
		"\u00ab\u0866\b\u00ab\u0001\u00ac\u0003\u00ac\u0869\b\u00ac\u0001\u00ac"+
		"\u0001\u00ac\u0001\u00ac\u0003\u00ac\u086e\b\u00ac\u0001\u00ac\u0001\u00ac"+
		"\u0003\u00ac\u0872\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac"+
		"\u0877\b\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u087b\b\u00ac\u0003"+
		"\u00ac\u087d\b\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0001\u00ae\u0005\u00ae\u0886\b\u00ae\n\u00ae\f\u00ae"+
		"\u0889\t\u00ae\u0001\u00ae\u0003\u00ae\u088c\b\u00ae\u0003\u00ae\u088e"+
		"\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00af\u0003\u00af\u0893\b\u00af"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0003\u00af\u0898\b\u00af\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0\u089f\b\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0003\u00b1\u08a5\b\u00b1"+
		"\u0001\u00b2\u0004\u00b2\u08a8\b\u00b2\u000b\u00b2\f\u00b2\u08a9\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u08b0\b\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0003\u00b3\u08b4\b\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b4\u0001\u00b4\u0003\u00b4\u08ba\b\u00b4\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b5\u0005\u00b5\u08bf\b\u00b5\n\u00b5\f\u00b5\u08c2\t\u00b5\u0001\u00b6"+
		"\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0005\u00b6\u08c9\b\u00b6"+
		"\n\u00b6\f\u00b6\u08cc\t\u00b6\u0003\u00b6\u08ce\b\u00b6\u0001\u00b6\u0003"+
		"\u00b6\u08d1\b\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u08d6"+
		"\b\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0001\u00b8\u0003\u00b8\u08dc"+
		"\b\u00b8\u0001\u00b8\u0001\u00b8\u0005\u00b8\u08e0\b\u00b8\n\u00b8\f\u00b8"+
		"\u08e3\t\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8"+
		"\u08e9\b\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0005\u00b9\u08ee\b"+
		"\u00b9\n\u00b9\f\u00b9\u08f1\t\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0001\u00ba\u0001\u00bb\u0003\u00bb\u08f8\b\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u08fc\b\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u090b\b\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0003\u00bd\u090f\b\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0005\u00bd\u0916\b\u00bd\n\u00bd\f\u00bd\u0919"+
		"\t\u00bd\u0001\u00bd\u0003\u00bd\u091c\b\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0003\u00bd\u0920\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0936\b\u00c1"+
		"\u0001\u00c2\u0001\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0003\u00c3\u093e\b\u00c3\u0001\u00c4\u0001\u00c4\u0005\u00c4\u0942\b"+
		"\u00c4\n\u00c4\f\u00c4\u0945\t\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c5"+
		"\u0001\u00c5\u0005\u00c5\u094b\b\u00c5\n\u00c5\f\u00c5\u094e\t\u00c5\u0001"+
		"\u00c5\u0001\u00c5\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0003"+
		"\u00c6\u0956\b\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003"+
		"\u00c7\u095c\b\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0005\u00c8\u0961"+
		"\b\u00c8\n\u00c8\f\u00c8\u0964\t\u00c8\u0001\u00c8\u0001\u00c8\u0004\u00c8"+
		"\u0968\b\u00c8\u000b\u00c8\f\u00c8\u0969\u0003\u00c8\u096c\b\u00c8\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00ca\u0003\u00ca\u0971\b\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0003\u00ca\u0976\b\u00ca\u0001\u00ca\u0003\u00ca\u0979"+
		"\b\u00ca\u0001\u00ca\u0003\u00ca\u097c\b\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0003\u00ca\u0980\b\u00ca\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb"+
		"\u0985\b\u00cb\u0001\u00cb\u0003\u00cb\u0988\b\u00cb\u0001\u00cb\u0003"+
		"\u00cb\u098b\b\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u098f\b\u00cb"+
		"\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003\u00cc\u0994\b\u00cc\u0001\u00cc"+
		"\u0001\u00cc\u0003\u00cc\u0998\b\u00cc\u0001\u00cd\u0001\u00cd\u0001\u00cd"+
		"\u0001\u00cd\u0003\u00cd\u099e\b\u00cd\u0001\u00cd\u0001\u00cd\u0003\u00cd"+
		"\u09a2\b\u00cd\u0001\u00cd\u0001\u00cd\u0003\u00cd\u09a6\b\u00cd\u0001"+
		"\u00cd\u0001\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003"+
		"\u00ce\u09b4\b\u00ce\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00d0\u0001"+
		"\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001"+
		"\u00d0\u0003\u00d0\u09c1\b\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001"+
		"\u00d0\u0003\u00d0\u09c7\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001"+
		"\u00d1\u0001\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001"+
		"\u00d2\u0001\u00d2\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0003\u00d3\u09d7"+
		"\b\u00d3\u0001\u00d3\u0001\u00d3\u0003\u00d3\u09db\b\u00d3\u0001\u00d3"+
		"\u0001\u00d3\u0001\u00d4\u0001\u00d4\u0003\u00d4\u09e1\b\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0003\u00d4\u09e5\b\u00d4\u0001\u00d4\u0001\u00d4\u0003\u00d4"+
		"\u09e9\b\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0003\u00d4\u09f0\b\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0003\u00d5\u09f7\b\u00d5\u0001\u00d5\u0003\u00d5\u09fa\b"+
		"\u00d5\u0001\u00d5\u0001\u00d5\u0005\u00d5\u09fe\b\u00d5\n\u00d5\f\u00d5"+
		"\u0a01\t\u00d5\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6"+
		"\u0a07\b\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u0a0c\b"+
		"\u00d6\u0001\u00d6\u0003\u00d6\u0a0f\b\u00d6\u0001\u00d6\u0001\u00d6\u0001"+
		"\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u0a17\b\u00d6\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0003\u00d7\u0a1d\b\u00d7\u0001"+
		"\u00d8\u0001\u00d8\u0003\u00d8\u0a21\b\u00d8\u0001\u00d8\u0001\u00d8\u0001"+
		"\u00d9\u0001\u00d9\u0003\u00d9\u0a27\b\u00d9\u0001\u00d9\u0001\u00d9\u0003"+
		"\u00d9\u0a2b\b\u00d9\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001"+
		"\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0004\u00da\u0a36"+
		"\b\u00da\u000b\u00da\f\u00da\u0a37\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0003\u00da"+
		"\u0a4e\b\u00da\u0001\u00da\u0000\u0000\u00db\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u0000\u0013\b\u0000\u0014\u0014\u0017"+
		"\u001755==OORR]^bb\u0002\u0000  ++\u0003\u000044GGLL\u0001\u0000\u0095"+
		"\u0096\u0002\u0000\u008b\u008c\u0097\u0098\u0001\u0000\u0080\u0081\u0001"+
		"\u0000\u0082\u0084\u000e\u0000\u0011\u0011\u0014\u0014\u0017\u0017\u001b"+
		"\u001b  ++55==CCOORRVV]^bb\u0002\u0000\r\r\u001e\u001e\u0002\u0000\u000e"+
		"\u000eaa\u0001\u0000\u0002\u0006\b\u0000\u000e\u000e\'\'77AAIKUUaaff\u0002"+
		"\u000077II\u0002\u0000&&33\u0002\u0000\u0082\u0082\u008d\u008d\u0002\u0000"+
		"44GG\u0002\u0000((ZZ\u0011\u0000\f\f\u0010\u0012\u0014\u001d\u001f \""+
		"#%-002799<>@CEEGLNORcefii\u0001\u0000KL\u0b6a\u0000\u01b7\u0001\u0000"+
		"\u0000\u0000\u0002\u01d2\u0001\u0000\u0000\u0000\u0004\u01de\u0001\u0000"+
		"\u0000\u0000\u0006\u01ec\u0001\u0000\u0000\u0000\b\u01ee\u0001\u0000\u0000"+
		"\u0000\n\u01f8\u0001\u0000\u0000\u0000\f\u01fe\u0001\u0000\u0000\u0000"+
		"\u000e\u0203\u0001\u0000\u0000\u0000\u0010\u0205\u0001\u0000\u0000\u0000"+
		"\u0012\u0207\u0001\u0000\u0000\u0000\u0014\u020d\u0001\u0000\u0000\u0000"+
		"\u0016\u020f\u0001\u0000\u0000\u0000\u0018\u021a\u0001\u0000\u0000\u0000"+
		"\u001a\u0225\u0001\u0000\u0000\u0000\u001c\u0236\u0001\u0000\u0000\u0000"+
		"\u001e\u023b\u0001\u0000\u0000\u0000 \u0245\u0001\u0000\u0000\u0000\""+
		"\u0252\u0001\u0000\u0000\u0000$\u0254\u0001\u0000\u0000\u0000&\u025c\u0001"+
		"\u0000\u0000\u0000(\u0264\u0001\u0000\u0000\u0000*\u026c\u0001\u0000\u0000"+
		"\u0000,\u0274\u0001\u0000\u0000\u0000.\u027c\u0001\u0000\u0000\u00000"+
		"\u0284\u0001\u0000\u0000\u00002\u028c\u0001\u0000\u0000\u00004\u0294\u0001"+
		"\u0000\u0000\u00006\u02a0\u0001\u0000\u0000\u00008\u02ab\u0001\u0000\u0000"+
		"\u0000:\u02b3\u0001\u0000\u0000\u0000<\u02bb\u0001\u0000\u0000\u0000>"+
		"\u02c7\u0001\u0000\u0000\u0000@\u02cf\u0001\u0000\u0000\u0000B\u02de\u0001"+
		"\u0000\u0000\u0000D\u02f6\u0001\u0000\u0000\u0000F\u02f8\u0001\u0000\u0000"+
		"\u0000H\u02fd\u0001\u0000\u0000\u0000J\u039b\u0001\u0000\u0000\u0000L"+
		"\u039f\u0001\u0000\u0000\u0000N\u03a1\u0001\u0000\u0000\u0000P\u03a5\u0001"+
		"\u0000\u0000\u0000R\u03ad\u0001\u0000\u0000\u0000T\u03bd\u0001\u0000\u0000"+
		"\u0000V\u03c1\u0001\u0000\u0000\u0000X\u03c3\u0001\u0000\u0000\u0000Z"+
		"\u03cd\u0001\u0000\u0000\u0000\\\u03cf\u0001\u0000\u0000\u0000^\u03d8"+
		"\u0001\u0000\u0000\u0000`\u03e5\u0001\u0000\u0000\u0000b\u03ec\u0001\u0000"+
		"\u0000\u0000d\u03ee\u0001\u0000\u0000\u0000f\u0401\u0001\u0000\u0000\u0000"+
		"h\u0403\u0001\u0000\u0000\u0000j\u040c\u0001\u0000\u0000\u0000l\u0419"+
		"\u0001\u0000\u0000\u0000n\u041b\u0001\u0000\u0000\u0000p\u0430\u0001\u0000"+
		"\u0000\u0000r\u0439\u0001\u0000\u0000\u0000t\u044a\u0001\u0000\u0000\u0000"+
		"v\u0455\u0001\u0000\u0000\u0000x\u045a\u0001\u0000\u0000\u0000z\u046b"+
		"\u0001\u0000\u0000\u0000|\u046d\u0001\u0000\u0000\u0000~\u0476\u0001\u0000"+
		"\u0000\u0000\u0080\u047b\u0001\u0000\u0000\u0000\u0082\u0485\u0001\u0000"+
		"\u0000\u0000\u0084\u0487\u0001\u0000\u0000\u0000\u0086\u048a\u0001\u0000"+
		"\u0000\u0000\u0088\u0495\u0001\u0000\u0000\u0000\u008a\u04a1\u0001\u0000"+
		"\u0000\u0000\u008c\u04a3\u0001\u0000\u0000\u0000\u008e\u04a8\u0001\u0000"+
		"\u0000\u0000\u0090\u04ab\u0001\u0000\u0000\u0000\u0092\u04ba\u0001\u0000"+
		"\u0000\u0000\u0094\u04c3\u0001\u0000\u0000\u0000\u0096\u04ce\u0001\u0000"+
		"\u0000\u0000\u0098\u04d0\u0001\u0000\u0000\u0000\u009a\u04d8\u0001\u0000"+
		"\u0000\u0000\u009c\u04e1\u0001\u0000\u0000\u0000\u009e\u04e3\u0001\u0000"+
		"\u0000\u0000\u00a0\u04e7\u0001\u0000\u0000\u0000\u00a2\u04fc\u0001\u0000"+
		"\u0000\u0000\u00a4\u0503\u0001\u0000\u0000\u0000\u00a6\u0505\u0001\u0000"+
		"\u0000\u0000\u00a8\u050b\u0001\u0000\u0000\u0000\u00aa\u058f\u0001\u0000"+
		"\u0000\u0000\u00ac\u0591\u0001\u0000\u0000\u0000\u00ae\u05ac\u0001\u0000"+
		"\u0000\u0000\u00b0\u05b0\u0001\u0000\u0000\u0000\u00b2\u05b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u05bd\u0001\u0000\u0000\u0000\u00b6\u05bf\u0001\u0000"+
		"\u0000\u0000\u00b8\u05c5\u0001\u0000\u0000\u0000\u00ba\u05c8\u0001\u0000"+
		"\u0000\u0000\u00bc\u05d7\u0001\u0000\u0000\u0000\u00be\u05d9\u0001\u0000"+
		"\u0000\u0000\u00c0\u05dd\u0001\u0000\u0000\u0000\u00c2\u05ea\u0001\u0000"+
		"\u0000\u0000\u00c4\u05ec\u0001\u0000\u0000\u0000\u00c6\u05ff\u0001\u0000"+
		"\u0000\u0000\u00c8\u0601\u0001\u0000\u0000\u0000\u00ca\u060d\u0001\u0000"+
		"\u0000\u0000\u00cc\u0613\u0001\u0000\u0000\u0000\u00ce\u0618\u0001\u0000"+
		"\u0000\u0000\u00d0\u061d\u0001\u0000\u0000\u0000\u00d2\u061f\u0001\u0000"+
		"\u0000\u0000\u00d4\u0625\u0001\u0000\u0000\u0000\u00d6\u062d\u0001\u0000"+
		"\u0000\u0000\u00d8\u063a\u0001\u0000\u0000\u0000\u00da\u063e\u0001\u0000"+
		"\u0000\u0000\u00dc\u0644\u0001\u0000\u0000\u0000\u00de\u065c\u0001\u0000"+
		"\u0000\u0000\u00e0\u065f\u0001\u0000\u0000\u0000\u00e2\u0665\u0001\u0000"+
		"\u0000\u0000\u00e4\u0668\u0001\u0000\u0000\u0000\u00e6\u0673\u0001\u0000"+
		"\u0000\u0000\u00e8\u0679\u0001\u0000\u0000\u0000\u00ea\u0685\u0001\u0000"+
		"\u0000\u0000\u00ec\u0689\u0001\u0000\u0000\u0000\u00ee\u0692\u0001\u0000"+
		"\u0000\u0000\u00f0\u069b\u0001\u0000\u0000\u0000\u00f2\u069f\u0001\u0000"+
		"\u0000\u0000\u00f4\u06ae\u0001\u0000\u0000\u0000\u00f6\u06b3\u0001\u0000"+
		"\u0000\u0000\u00f8\u06b5\u0001\u0000\u0000\u0000\u00fa\u06bd\u0001\u0000"+
		"\u0000\u0000\u00fc\u06c1\u0001\u0000\u0000\u0000\u00fe\u06c8\u0001\u0000"+
		"\u0000\u0000\u0100\u06d7\u0001\u0000\u0000\u0000\u0102\u06da\u0001\u0000"+
		"\u0000\u0000\u0104\u06de\u0001\u0000\u0000\u0000\u0106\u06e1\u0001\u0000"+
		"\u0000\u0000\u0108\u06e5\u0001\u0000\u0000\u0000\u010a\u06f9\u0001\u0000"+
		"\u0000\u0000\u010c\u0700\u0001\u0000\u0000\u0000\u010e\u070c\u0001\u0000"+
		"\u0000\u0000\u0110\u0714\u0001\u0000\u0000\u0000\u0112\u0718\u0001\u0000"+
		"\u0000\u0000\u0114\u0720\u0001\u0000\u0000\u0000\u0116\u0727\u0001\u0000"+
		"\u0000\u0000\u0118\u072b\u0001\u0000\u0000\u0000\u011a\u072d\u0001\u0000"+
		"\u0000\u0000\u011c\u0731\u0001\u0000\u0000\u0000\u011e\u0739\u0001\u0000"+
		"\u0000\u0000\u0120\u073b\u0001\u0000\u0000\u0000\u0122\u074b\u0001\u0000"+
		"\u0000\u0000\u0124\u074d\u0001\u0000\u0000\u0000\u0126\u0750\u0001\u0000"+
		"\u0000\u0000\u0128\u0757\u0001\u0000\u0000\u0000\u012a\u0769\u0001\u0000"+
		"\u0000\u0000\u012c\u0772\u0001\u0000\u0000\u0000\u012e\u077a\u0001\u0000"+
		"\u0000\u0000\u0130\u077e\u0001\u0000\u0000\u0000\u0132\u0781\u0001\u0000"+
		"\u0000\u0000\u0134\u078e\u0001\u0000\u0000\u0000\u0136\u0794\u0001\u0000"+
		"\u0000\u0000\u0138\u07af\u0001\u0000\u0000\u0000\u013a\u07b1\u0001\u0000"+
		"\u0000\u0000\u013c\u07b8\u0001\u0000\u0000\u0000\u013e\u07c2\u0001\u0000"+
		"\u0000\u0000\u0140\u07c4\u0001\u0000\u0000\u0000\u0142\u07c7\u0001\u0000"+
		"\u0000\u0000\u0144\u07d1\u0001\u0000\u0000\u0000\u0146\u07e2\u0001\u0000"+
		"\u0000\u0000\u0148\u07ee\u0001\u0000\u0000\u0000\u014a\u07f7\u0001\u0000"+
		"\u0000\u0000\u014c\u0807\u0001\u0000\u0000\u0000\u014e\u0813\u0001\u0000"+
		"\u0000\u0000\u0150\u081a\u0001\u0000\u0000\u0000\u0152\u081c\u0001\u0000"+
		"\u0000\u0000\u0154\u081f\u0001\u0000\u0000\u0000\u0156\u0829\u0001\u0000"+
		"\u0000\u0000\u0158\u0868\u0001\u0000\u0000\u0000\u015a\u087e\u0001\u0000"+
		"\u0000\u0000\u015c\u0881\u0001\u0000\u0000\u0000\u015e\u0892\u0001\u0000"+
		"\u0000\u0000\u0160\u0899\u0001\u0000\u0000\u0000\u0162\u08a4\u0001\u0000"+
		"\u0000\u0000\u0164\u08a7\u0001\u0000\u0000\u0000\u0166\u08ab\u0001\u0000"+
		"\u0000\u0000\u0168\u08b9\u0001\u0000\u0000\u0000\u016a\u08bb\u0001\u0000"+
		"\u0000\u0000\u016c\u08c3\u0001\u0000\u0000\u0000\u016e\u08d5\u0001\u0000"+
		"\u0000\u0000\u0170\u08e8\u0001\u0000\u0000\u0000\u0172\u08ea\u0001\u0000"+
		"\u0000\u0000\u0174\u08f2\u0001\u0000\u0000\u0000\u0176\u08fb\u0001\u0000"+
		"\u0000\u0000\u0178\u08fd\u0001\u0000\u0000\u0000\u017a\u091f\u0001\u0000"+
		"\u0000\u0000\u017c\u0921\u0001\u0000\u0000\u0000\u017e\u0925\u0001\u0000"+
		"\u0000\u0000\u0180\u0929\u0001\u0000\u0000\u0000\u0182\u0935\u0001\u0000"+
		"\u0000\u0000\u0184\u0937\u0001\u0000\u0000\u0000\u0186\u093d\u0001\u0000"+
		"\u0000\u0000\u0188\u093f\u0001\u0000\u0000\u0000\u018a\u0948\u0001\u0000"+
		"\u0000\u0000\u018c\u0955\u0001\u0000\u0000\u0000\u018e\u095b\u0001\u0000"+
		"\u0000\u0000\u0190\u095d\u0001\u0000\u0000\u0000\u0192\u096d\u0001\u0000"+
		"\u0000\u0000\u0194\u0970\u0001\u0000\u0000\u0000\u0196\u0981\u0001\u0000"+
		"\u0000\u0000\u0198\u0990\u0001\u0000\u0000\u0000\u019a\u0999\u0001\u0000"+
		"\u0000\u0000\u019c\u09a9\u0001\u0000\u0000\u0000\u019e\u09b5\u0001\u0000"+
		"\u0000\u0000\u01a0\u09b8\u0001\u0000\u0000\u0000\u01a2\u09c8\u0001\u0000"+
		"\u0000\u0000\u01a4\u09cd\u0001\u0000\u0000\u0000\u01a6\u09d3\u0001\u0000"+
		"\u0000\u0000\u01a8\u09de\u0001\u0000\u0000\u0000\u01aa\u09f6\u0001\u0000"+
		"\u0000\u0000\u01ac\u0a02\u0001\u0000\u0000\u0000\u01ae\u0a18\u0001\u0000"+
		"\u0000\u0000\u01b0\u0a1e\u0001\u0000\u0000\u0000\u01b2\u0a24\u0001\u0000"+
		"\u0000\u0000\u01b4\u0a4d\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005\u0001"+
		"\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003\u00d8"+
		"l\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01be\u0003\u00dcn\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000"+
		"\u01be\u01c2\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u0160\u00b0\u0000"+
		"\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c7\u0003\u00e0p\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8"+
		"\u01ca\u0003\u00fe\u007f\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005\u0000\u0000\u0001\u01cc\u0001\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cf\u0003\u01b4\u00da\u0000\u01ce\u01d0\u0003\u0016\u000b\u0000\u01cf"+
		"\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003\u00e6s\u0000\u01d2\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01db"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005|\u0000\u0000\u01d5\u01d7\u0003"+
		"\u01b4\u00da\u0000\u01d6\u01d8\u0003\u0016\u000b\u0000\u01d7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d4\u0001\u0000\u0000\u0000\u01da\u01dd\u0001"+
		"\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001"+
		"\u0000\u0000\u0000\u01dc\u0003\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01de\u01e4\u0003\u0006\u0003\u0000\u01df\u01e3\u0005"+
		"\u008d\u0000\u0000\u01e0\u01e3\u0003\u0148\u00a4\u0000\u01e1\u01e3\u0005"+
		"\u0082\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u0005\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ed\u0003\f\u0006\u0000\u01e8\u01ed\u0003\u0014"+
		"\n\u0000\u01e9\u01ea\u0005e\u0000\u0000\u01ea\u01ed\u0005\u0082\u0000"+
		"\u0000\u01eb\u01ed\u0003\b\u0004\u0000\u01ec\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u0007\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0005z\u0000\u0000\u01ef\u01f2\u0003\n\u0005\u0000\u01f0"+
		"\u01f1\u0005}\u0000\u0000\u01f1\u01f3\u0003\n\u0005\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005{\u0000\u0000\u01f7\t\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fa\u0003\u0004\u0002\u0000\u01f9\u01fb\u0003"+
		"\u01b4\u00da\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u000b\u0001\u0000\u0000\u0000\u01fc\u01ff\u0003"+
		"\u000e\u0007\u0000\u01fd\u01ff\u0005\u0011\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\r\u0001\u0000"+
		"\u0000\u0000\u0200\u0204\u0003\u0010\b\u0000\u0201\u0204\u0003\u0012\t"+
		"\u0000\u0202\u0204\u0005\u001b\u0000\u0000\u0203\u0200\u0001\u0000\u0000"+
		"\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u000f\u0001\u0000\u0000\u0000\u0205\u0206\u0007\u0000\u0000"+
		"\u0000\u0206\u0011\u0001\u0000\u0000\u0000\u0207\u0208\u0007\u0001\u0000"+
		"\u0000\u0208\u0013\u0001\u0000\u0000\u0000\u0209\u020e\u0003\u0002\u0001"+
		"\u0000\u020a\u020e\u0005C\u0000\u0000\u020b\u020e\u0005!\u0000\u0000\u020c"+
		"\u020e\u0005V\u0000\u0000\u020d\u0209\u0001\u0000\u0000\u0000\u020d\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u0015\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0005\u008b\u0000\u0000\u0210\u0215\u0003\u0004\u0002\u0000\u0211\u0212"+
		"\u0005}\u0000\u0000\u0212\u0214\u0003\u0004\u0002\u0000\u0213\u0211\u0001"+
		"\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u0219\u0005"+
		"\u008c\u0000\u0000\u0219\u0017\u0001\u0000\u0000\u0000\u021a\u021f\u0003"+
		"\u001a\r\u0000\u021b\u021c\u0005}\u0000\u0000\u021c\u021e\u0003\u001a"+
		"\r\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0019\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0003\u01b4\u00da\u0000\u0223\u0224\u0005~\u0000\u0000"+
		"\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000"+
		"\u0227\u0229\u0007\u0002\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u0230\u0001\u0000\u0000\u0000"+
		"\u022a\u0231\u0003\u001c\u000e\u0000\u022b\u022e\u0005d\u0000\u0000\u022c"+
		"\u022e\u0003\u0004\u0002\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d"+
		"\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f"+
		"\u0231\u0003\u001c\u000e\u0000\u0230\u022a\u0001\u0000\u0000\u0000\u0230"+
		"\u022d\u0001\u0000\u0000\u0000\u0231\u001b\u0001\u0000\u0000\u0000\u0232"+
		"\u0237\u0003 \u0010\u0000\u0233\u0237\u0003\u001e\u000f\u0000\u0234\u0235"+
		"\u0005L\u0000\u0000\u0235\u0237\u0003\u001e\u000f\u0000\u0236\u0232\u0001"+
		"\u0000\u0000\u0000\u0236\u0233\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0237\u001d\u0001\u0000\u0000\u0000\u0238\u023c\u0003"+
		"x<\u0000\u0239\u023c\u0003\u0084B\u0000\u023a\u023c\u0003$\u0012\u0000"+
		"\u023b\u0238\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000"+
		"\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u001f\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0003D\"\u0000\u023e\u023f\u0003\"\u0011\u0000\u023f\u0240"+
		"\u0003\u001c\u000e\u0000\u0240\u0246\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0003D\"\u0000\u0242\u0243\u0005\u00a3\u0000\u0000\u0243\u0244\u0003"+
		"L&\u0000\u0244\u0246\u0001\u0000\u0000\u0000\u0245\u023d\u0001\u0000\u0000"+
		"\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0246!\u0001\u0000\u0000\u0000"+
		"\u0247\u0253\u0005\u008a\u0000\u0000\u0248\u0253\u0005\u0099\u0000\u0000"+
		"\u0249\u0253\u0005\u009a\u0000\u0000\u024a\u0253\u0005\u009b\u0000\u0000"+
		"\u024b\u0253\u0005\u009c\u0000\u0000\u024c\u0253\u0005\u009d\u0000\u0000"+
		"\u024d\u0253\u0005\u009e\u0000\u0000\u024e\u0253\u0005\u009f\u0000\u0000"+
		"\u024f\u0253\u0005\u00a0\u0000\u0000\u0250\u0253\u0005\u00a2\u0000\u0000"+
		"\u0251\u0253\u0003\u0180\u00c0\u0000\u0252\u0247\u0001\u0000\u0000\u0000"+
		"\u0252\u0248\u0001\u0000\u0000\u0000\u0252\u0249\u0001\u0000\u0000\u0000"+
		"\u0252\u024a\u0001\u0000\u0000\u0000\u0252\u024b\u0001\u0000\u0000\u0000"+
		"\u0252\u024c\u0001\u0000\u0000\u0000\u0252\u024d\u0001\u0000\u0000\u0000"+
		"\u0252\u024e\u0001\u0000\u0000\u0000\u0252\u024f\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0253#\u0001\u0000\u0000\u0000\u0254\u025a\u0003&\u0013\u0000\u0255\u0256"+
		"\u0005\u008d\u0000\u0000\u0256\u0257\u0003L&\u0000\u0257\u0258\u0005~"+
		"\u0000\u0000\u0258\u0259\u0003L&\u0000\u0259\u025b\u0001\u0000\u0000\u0000"+
		"\u025a\u0255\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000"+
		"\u025b%\u0001\u0000\u0000\u0000\u025c\u0262\u0003(\u0014\u0000\u025d\u0260"+
		"\u0005\u008f\u0000\u0000\u025e\u0261\u0003&\u0013\u0000\u025f\u0261\u0003"+
		"N\'\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000"+
		"\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u025d\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\'\u0001\u0000\u0000"+
		"\u0000\u0264\u0269\u0003*\u0015\u0000\u0265\u0266\u0005\u0093\u0000\u0000"+
		"\u0266\u0268\u0003*\u0015\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268"+
		"\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a)\u0001\u0000\u0000\u0000\u026b\u0269"+
		"\u0001\u0000\u0000\u0000\u026c\u0271\u0003,\u0016\u0000\u026d\u026e\u0005"+
		"\u0092\u0000\u0000\u026e\u0270\u0003,\u0016\u0000\u026f\u026d\u0001\u0000"+
		"\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272+\u0001\u0000\u0000"+
		"\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0279\u0003.\u0017\u0000"+
		"\u0275\u0276\u0005\u0086\u0000\u0000\u0276\u0278\u0003.\u0017\u0000\u0277"+
		"\u0275\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a"+
		"-\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u0281"+
		"\u00030\u0018\u0000\u027d\u027e\u0005\u0087\u0000\u0000\u027e\u0280\u0003"+
		"0\u0018\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000"+
		"\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000"+
		"\u0000\u0000\u0282/\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0284\u0289\u00032\u0019\u0000\u0285\u0286\u0005\u0085\u0000\u0000"+
		"\u0286\u0288\u00032\u0019\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288"+
		"\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0001\u0000\u0000\u0000\u028a1\u0001\u0000\u0000\u0000\u028b\u0289"+
		"\u0001\u0000\u0000\u0000\u028c\u0291\u00034\u001a\u0000\u028d\u028e\u0007"+
		"\u0003\u0000\u0000\u028e\u0290\u00034\u001a\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u02923\u0001\u0000\u0000"+
		"\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u029d\u00036\u001b\u0000"+
		"\u0295\u0296\u0007\u0004\u0000\u0000\u0296\u029c\u00036\u001b\u0000\u0297"+
		"\u0298\u00059\u0000\u0000\u0298\u029c\u0003r9\u0000\u0299\u029a\u0005"+
		"\f\u0000\u0000\u029a\u029c\u0003\u0004\u0002\u0000\u029b\u0295\u0001\u0000"+
		"\u0000\u0000\u029b\u0297\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000"+
		"\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e5\u0001\u0000\u0000"+
		"\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a8\u00038\u001c\u0000"+
		"\u02a1\u02a4\u0005\u00a1\u0000\u0000\u02a2\u02a4\u0003\u017e\u00bf\u0000"+
		"\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u00038\u001c\u0000\u02a6"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9"+
		"7\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02b0"+
		"\u0003:\u001d\u0000\u02ac\u02ad\u0007\u0005\u0000\u0000\u02ad\u02af\u0003"+
		":\u001d\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b19\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b8\u0003<\u001e\u0000\u02b4\u02b5\u0007\u0006\u0000\u0000"+
		"\u02b5\u02b7\u0003<\u001e\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7"+
		"\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b9;\u0001\u0000\u0000\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02bb\u02c5\u0003B!\u0000\u02bc\u02bd\u0005X"+
		"\u0000\u0000\u02bd\u02c2\u0005v\u0000\u0000\u02be\u02c0\u0003>\u001f\u0000"+
		"\u02bf\u02c1\u0005}\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2"+
		"\u02be\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005w\u0000\u0000\u02c5\u02bc"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6=\u0001"+
		"\u0000\u0000\u0000\u02c7\u02cc\u0003@ \u0000\u02c8\u02c9\u0005}\u0000"+
		"\u0000\u02c9\u02cb\u0003@ \u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02cb"+
		"\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cd\u0001\u0000\u0000\u0000\u02cd?\u0001\u0000\u0000\u0000\u02ce\u02cc"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003\u001c\u000e\u0000\u02d0\u02d2"+
		"\u0003\u00be_\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003"+
		"\u017c\u00be\u0000\u02d4\u02d5\u0003L&\u0000\u02d5A\u0001\u0000\u0000"+
		"\u0000\u02d6\u02df\u0003D\"\u0000\u02d7\u02d9\u0003D\"\u0000\u02d8\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02da\u02dc\u0005\u00a4\u0000\u0000\u02db\u02dd"+
		"\u0003D\"\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de\u02d6\u0001"+
		"\u0000\u0000\u0000\u02de\u02d8\u0001\u0000\u0000\u0000\u02dfC\u0001\u0000"+
		"\u0000\u0000\u02e0\u02f7\u0003F#\u0000\u02e1\u02f7\u0003H$\u0000\u02e2"+
		"\u02e3\u0005\u0080\u0000\u0000\u02e3\u02f7\u0003D\"\u0000\u02e4\u02e5"+
		"\u0005\u0081\u0000\u0000\u02e5\u02f7\u0003D\"\u0000\u02e6\u02e7\u0005"+
		"\u0088\u0000\u0000\u02e7\u02f7\u0003D\"\u0000\u02e8\u02e9\u0005\u0089"+
		"\u0000\u0000\u02e9\u02f7\u0003D\"\u0000\u02ea\u02eb\u0005\u0090\u0000"+
		"\u0000\u02eb\u02f7\u0003D\"\u0000\u02ec\u02ed\u0005\u0091\u0000\u0000"+
		"\u02ed\u02f7\u0003D\"\u0000\u02ee\u02ef\u0005\u000f\u0000\u0000\u02ef"+
		"\u02f7\u0003D\"\u0000\u02f0\u02f1\u0005\u0085\u0000\u0000\u02f1\u02f7"+
		"\u0003D\"\u0000\u02f2\u02f3\u0005\u0082\u0000\u0000\u02f3\u02f7\u0003"+
		"D\"\u0000\u02f4\u02f5\u0005\u0087\u0000\u0000\u02f5\u02f7\u0003D\"\u0000"+
		"\u02f6\u02e0\u0001\u0000\u0000\u0000\u02f6\u02e1\u0001\u0000\u0000\u0000"+
		"\u02f6\u02e2\u0001\u0000\u0000\u0000\u02f6\u02e4\u0001\u0000\u0000\u0000"+
		"\u02f6\u02e6\u0001\u0000\u0000\u0000\u02f6\u02e8\u0001\u0000\u0000\u0000"+
		"\u02f6\u02ea\u0001\u0000\u0000\u0000\u02f6\u02ec\u0001\u0000\u0000\u0000"+
		"\u02f6\u02ee\u0001\u0000\u0000\u0000\u02f6\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f2\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f7E\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005z\u0000\u0000\u02f9\u02fa"+
		"\u0003\u0004\u0002\u0000\u02fa\u02fb\u0005{\u0000\u0000\u02fb\u02fc\u0003"+
		"D\"\u0000\u02fcG\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003J%\u0000\u02fe"+
		"\u0300\u0005\u0088\u0000\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0001\u0000\u0000\u0000\u0300\u0304\u0001\u0000\u0000\u0000\u0301"+
		"\u0303\u0003R)\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0306\u0001"+
		"\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001"+
		"\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0307\u0309\u0005\u0088\u0000\u0000\u0308\u0307\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u0320\u0001"+
		"\u0000\u0000\u0000\u030a\u0311\u0003P(\u0000\u030b\u0311\u0003\u01b0\u00d8"+
		"\u0000\u030c\u0311\u0005\u0090\u0000\u0000\u030d\u0311\u0005\u0091\u0000"+
		"\u0000\u030e\u030f\u0005\u0094\u0000\u0000\u030f\u0311\u0003\u01b4\u00da"+
		"\u0000\u0310\u030a\u0001\u0000\u0000\u0000\u0310\u030b\u0001\u0000\u0000"+
		"\u0000\u0310\u030c\u0001\u0000\u0000\u0000\u0310\u030d\u0001\u0000\u0000"+
		"\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000"+
		"\u0000\u0312\u0314\u0005\u0088\u0000\u0000\u0313\u0312\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0318\u0001\u0000\u0000"+
		"\u0000\u0315\u0317\u0003R)\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317"+
		"\u031a\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0001\u0000\u0000\u0000\u0319\u031c\u0001\u0000\u0000\u0000\u031a"+
		"\u0318\u0001\u0000\u0000\u0000\u031b\u031d\u0005\u0088\u0000\u0000\u031c"+
		"\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u031f\u0001\u0000\u0000\u0000\u031e\u0310\u0001\u0000\u0000\u0000\u031f"+
		"\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321I\u0001\u0000\u0000\u0000\u0322\u0320"+
		"\u0001\u0000\u0000\u0000\u0323\u039c\u0003\u0182\u00c1\u0000\u0324\u0326"+
		"\u0003\u01b4\u00da\u0000\u0325\u0327\u0003\u0016\u000b\u0000\u0326\u0325"+
		"\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u039c"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0005z\u0000\u0000\u0329\u032a\u0003"+
		"\u001c\u000e\u0000\u032a\u032b\u0005{\u0000\u0000\u032b\u039c\u0001\u0000"+
		"\u0000\u0000\u032c\u039c\u0003V+\u0000\u032d\u039c\u0003\u00e6s\u0000"+
		"\u032e\u039c\u0005l\u0000\u0000\u032f\u0339\u0005\u0010\u0000\u0000\u0330"+
		"\u0331\u0005|\u0000\u0000\u0331\u0333\u0003\u01b4\u00da\u0000\u0332\u0334"+
		"\u0003\u0016\u000b\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334"+
		"\u0001\u0000\u0000\u0000\u0334\u033a\u0001\u0000\u0000\u0000\u0335\u0336"+
		"\u0005x\u0000\u0000\u0336\u0337\u0003X,\u0000\u0337\u0338\u0005y\u0000"+
		"\u0000\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u0330\u0001\u0000\u0000"+
		"\u0000\u0339\u0335\u0001\u0000\u0000\u0000\u033a\u039c\u0001\u0000\u0000"+
		"\u0000\u033b\u0358\u0005A\u0000\u0000\u033c\u0352\u0003\u0004\u0002\u0000"+
		"\u033d\u0353\u0003\u01b2\u00d9\u0000\u033e\u0353\u0003Z-\u0000\u033f\u0340"+
		"\u0005x\u0000\u0000\u0340\u0341\u0003X,\u0000\u0341\u0345\u0005y\u0000"+
		"\u0000\u0342\u0344\u0003\u0148\u00a4\u0000\u0343\u0342\u0001\u0000\u0000"+
		"\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000"+
		"\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034a\u0003\u014a\u00a5"+
		"\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000"+
		"\u0000\u034a\u0353\u0001\u0000\u0000\u0000\u034b\u034d\u0003\u0148\u00a4"+
		"\u0000\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000"+
		"\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000"+
		"\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351\u0003\u014a\u00a5"+
		"\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u033d\u0001\u0000\u0000"+
		"\u0000\u0352\u033e\u0001\u0000\u0000\u0000\u0352\u033f\u0001\u0000\u0000"+
		"\u0000\u0352\u034c\u0001\u0000\u0000\u0000\u0353\u0359\u0001\u0000\u0000"+
		"\u0000\u0354\u0359\u0003h4\u0000\u0355\u0356\u0003\u0148\u00a4\u0000\u0356"+
		"\u0357\u0003\u014a\u00a5\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358"+
		"\u033c\u0001\u0000\u0000\u0000\u0358\u0354\u0001\u0000\u0000\u0000\u0358"+
		"\u0355\u0001\u0000\u0000\u0000\u0359\u039c\u0001\u0000\u0000\u0000\u035a"+
		"\u035b\u0005z\u0000\u0000\u035b\u035e\u0003\u001a\r\u0000\u035c\u035d"+
		"\u0005}\u0000\u0000\u035d\u035f\u0003\u001a\r\u0000\u035e\u035c\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u035e\u0001"+
		"\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0362\u0001"+
		"\u0000\u0000\u0000\u0362\u0363\u0005{\u0000\u0000\u0363\u039c\u0001\u0000"+
		"\u0000\u0000\u0364\u0365\u0005\\\u0000\u0000\u0365\u0369\u0005z\u0000"+
		"\u0000\u0366\u036a\u0003n7\u0000\u0367\u036a\u0003\u0004\u0002\u0000\u0368"+
		"\u036a\u0005e\u0000\u0000\u0369\u0366\u0001\u0000\u0000\u0000\u0369\u0367"+
		"\u0001\u0000\u0000\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\u0001\u0000\u0000\u0000\u036b\u039c\u0005{\u0000\u0000\u036c\u036d\u0005"+
		"\u0018\u0000\u0000\u036d\u036e\u0005z\u0000\u0000\u036e\u036f\u0003\u001c"+
		"\u000e\u0000\u036f\u0370\u0005{\u0000\u0000\u0370\u039c\u0001\u0000\u0000"+
		"\u0000\u0371\u0372\u0005_\u0000\u0000\u0372\u0373\u0005z\u0000\u0000\u0373"+
		"\u0374\u0003\u001c\u000e\u0000\u0374\u0375\u0005{\u0000\u0000\u0375\u039c"+
		"\u0001\u0000\u0000\u0000\u0376\u037b\u0005\u001c\u0000\u0000\u0377\u0378"+
		"\u0005z\u0000\u0000\u0378\u0379\u0003\u0004\u0002\u0000\u0379\u037a\u0005"+
		"{\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0377\u0001\u0000"+
		"\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u039c\u0001\u0000"+
		"\u0000\u0000\u037d\u037f\u0005\u000e\u0000\u0000\u037e\u037d\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000"+
		"\u0000\u0000\u0380\u0386\u0005\u001d\u0000\u0000\u0381\u0383\u0005z\u0000"+
		"\u0000\u0382\u0384\u0003|>\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0383"+
		"\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385"+
		"\u0387\u0005{\u0000\u0000\u0386\u0381\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u039c"+
		"\u0003\u00acV\u0000\u0389\u038a\u0005S\u0000\u0000\u038a\u038b\u0005z"+
		"\u0000\u0000\u038b\u038c\u0003\u0004\u0002\u0000\u038c\u038d\u0005{\u0000"+
		"\u0000\u038d\u039c\u0001\u0000\u0000\u0000\u038e\u038f\u0005?\u0000\u0000"+
		"\u038f\u0395\u0005z\u0000\u0000\u0390\u0391\u0003\u01b4\u00da\u0000\u0391"+
		"\u0392\u0005|\u0000\u0000\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u0390"+
		"\u0001\u0000\u0000\u0000\u0394\u0397\u0001\u0000\u0000\u0000\u0395\u0393"+
		"\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0398"+
		"\u0001\u0000\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0003\u01b4\u00da\u0000\u0399\u039a\u0005{\u0000\u0000\u039a\u039c\u0001"+
		"\u0000\u0000\u0000\u039b\u0323\u0001\u0000\u0000\u0000\u039b\u0324\u0001"+
		"\u0000\u0000\u0000\u039b\u0328\u0001\u0000\u0000\u0000\u039b\u032c\u0001"+
		"\u0000\u0000\u0000\u039b\u032d\u0001\u0000\u0000\u0000\u039b\u032e\u0001"+
		"\u0000\u0000\u0000\u039b\u032f\u0001\u0000\u0000\u0000\u039b\u033b\u0001"+
		"\u0000\u0000\u0000\u039b\u035a\u0001\u0000\u0000\u0000\u039b\u0364\u0001"+
		"\u0000\u0000\u0000\u039b\u036c\u0001\u0000\u0000\u0000\u039b\u0371\u0001"+
		"\u0000\u0000\u0000\u039b\u0376\u0001\u0000\u0000\u0000\u039b\u037e\u0001"+
		"\u0000\u0000\u0000\u039b\u0389\u0001\u0000\u0000\u0000\u039b\u038e\u0001"+
		"\u0000\u0000\u0000\u039cK\u0001\u0000\u0000\u0000\u039d\u03a0\u0003\u001c"+
		"\u000e\u0000\u039e\u03a0\u0003N\'\u0000\u039f\u039d\u0001\u0000\u0000"+
		"\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u03a0M\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0005Y\u0000\u0000\u03a2\u03a3\u0003\u001c\u000e\u0000\u03a3"+
		"O\u0001\u0000\u0000\u0000\u03a4\u03a6\u0005\u008d\u0000\u0000\u03a5\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005|\u0000\u0000\u03a8\u03aa\u0003"+
		"\u01b4\u00da\u0000\u03a9\u03ab\u0003\u0016\u000b\u0000\u03aa\u03a9\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03abQ\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ae\u0005\u008d\u0000\u0000\u03ad\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000"+
		"\u0000\u0000\u03af\u03b0\u0005x\u0000\u0000\u03b0\u03b5\u0003T*\u0000"+
		"\u03b1\u03b2\u0005}\u0000\u0000\u03b2\u03b4\u0003T*\u0000\u03b3\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b8"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0005y\u0000\u0000\u03b9S\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003\u01b4"+
		"\u00da\u0000\u03bb\u03bc\u0005~\u0000\u0000\u03bc\u03be\u0001\u0000\u0000"+
		"\u0000\u03bd\u03ba\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000"+
		"\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0003\u001c\u000e"+
		"\u0000\u03c0U\u0001\u0000\u0000\u0000\u03c1\u03c2\u0007\u0007\u0000\u0000"+
		"\u03c2W\u0001\u0000\u0000\u0000\u03c3\u03c8\u0003\u001c\u000e\u0000\u03c4"+
		"\u03c5\u0005}\u0000\u0000\u03c5\u03c7\u0003\u001c\u000e\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03ca\u0001\u0000\u0000\u0000\u03c8\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9Y\u0001"+
		"\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb\u03ce\u0003"+
		"\\.\u0000\u03cc\u03ce\u0003d2\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cd\u03cc\u0001\u0000\u0000\u0000\u03ce[\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d4\u0005v\u0000\u0000\u03d0\u03d2\u0003^/\u0000\u03d1\u03d3\u0005"+
		"}\u0000\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d7\u0005w\u0000\u0000\u03d7]\u0001\u0000\u0000\u0000"+
		"\u03d8\u03dd\u0003`0\u0000\u03d9\u03da\u0005}\u0000\u0000\u03da\u03dc"+
		"\u0003`0\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03dc\u03df\u0001\u0000"+
		"\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000"+
		"\u0000\u0000\u03de_\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e6\u0003\u01b4\u00da\u0000\u03e1\u03e2\u0005x\u0000\u0000"+
		"\u03e2\u03e3\u0003\u001c\u000e\u0000\u03e3\u03e4\u0005y\u0000\u0000\u03e4"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e5\u03e0\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7"+
		"\u03e8\u0005\u008a\u0000\u0000\u03e8\u03e9\u0003b1\u0000\u03e9a\u0001"+
		"\u0000\u0000\u0000\u03ea\u03ed\u0003\u001c\u000e\u0000\u03eb\u03ed\u0003"+
		"Z-\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03eb\u0001\u0000\u0000"+
		"\u0000\u03edc\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005v\u0000\u0000\u03ef"+
		"\u03f4\u0003f3\u0000\u03f0\u03f1\u0005}\u0000\u0000\u03f1\u03f3\u0003"+
		"f3\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f9\u0005}\u0000\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fa\u03fb\u0005w\u0000\u0000\u03fbe\u0001\u0000\u0000\u0000\u03fc\u0402"+
		"\u0003\u001e\u000f\u0000\u03fd\u03fe\u0005v\u0000\u0000\u03fe\u03ff\u0003"+
		"X,\u0000\u03ff\u0400\u0005w\u0000\u0000\u0400\u0402\u0001\u0000\u0000"+
		"\u0000\u0401\u03fc\u0001\u0000\u0000\u0000\u0401\u03fd\u0001\u0000\u0000"+
		"\u0000\u0402g\u0001\u0000\u0000\u0000\u0403\u0408\u0005v\u0000\u0000\u0404"+
		"\u0406\u0003j5\u0000\u0405\u0407\u0005}\u0000\u0000\u0406\u0405\u0001"+
		"\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0409\u0001"+
		"\u0000\u0000\u0000\u0408\u0404\u0001\u0000\u0000\u0000\u0408\u0409\u0001"+
		"\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040b\u0005"+
		"w\u0000\u0000\u040bi\u0001\u0000\u0000\u0000\u040c\u0411\u0003l6\u0000"+
		"\u040d\u040e\u0005}\u0000\u0000\u040e\u0410\u0003l6\u0000\u040f\u040d"+
		"\u0001\u0000\u0000\u0000\u0410\u0413\u0001\u0000\u0000\u0000\u0411\u040f"+
		"\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412k\u0001"+
		"\u0000\u0000\u0000\u0413\u0411\u0001\u0000\u0000\u0000\u0414\u041a\u0003"+
		"H$\u0000\u0415\u0416\u0003\u01b4\u00da\u0000\u0416\u0417\u0005\u008a\u0000"+
		"\u0000\u0417\u0418\u0003\u001c\u000e\u0000\u0418\u041a\u0001\u0000\u0000"+
		"\u0000\u0419\u0414\u0001\u0000\u0000\u0000\u0419\u0415\u0001\u0000\u0000"+
		"\u0000\u041am\u0001\u0000\u0000\u0000\u041b\u0424\u0003\u01b4\u00da\u0000"+
		"\u041c\u041e\u0003p8\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0001\u0000\u0000\u0000\u041e\u0425\u0001\u0000\u0000\u0000\u041f\u0420"+
		"\u0005\u008e\u0000\u0000\u0420\u0422\u0003\u01b4\u00da\u0000\u0421\u0423"+
		"\u0003p8\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000"+
		"\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424\u041d\u0001\u0000"+
		"\u0000\u0000\u0424\u041f\u0001\u0000\u0000\u0000\u0425\u042d\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0005|\u0000\u0000\u0427\u0429\u0003\u01b4\u00da"+
		"\u0000\u0428\u042a\u0003p8\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u0429"+
		"\u042a\u0001\u0000\u0000\u0000\u042a\u042c\u0001\u0000\u0000\u0000\u042b"+
		"\u0426\u0001\u0000\u0000\u0000\u042c\u042f\u0001\u0000\u0000\u0000\u042d"+
		"\u042b\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e"+
		"o\u0001\u0000\u0000\u0000\u042f\u042d\u0001\u0000\u0000\u0000\u0430\u0434"+
		"\u0005\u008b\u0000\u0000\u0431\u0433\u0005}\u0000\u0000\u0432\u0431\u0001"+
		"\u0000\u0000\u0000\u0433\u0436\u0001\u0000\u0000\u0000\u0434\u0432\u0001"+
		"\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0437\u0001"+
		"\u0000\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u0438\u0005"+
		"\u008c\u0000\u0000\u0438q\u0001\u0000\u0000\u0000\u0439\u043e\u0003\u0006"+
		"\u0003\u0000\u043a\u043d\u0003\u0148\u00a4\u0000\u043b\u043d\u0005\u0082"+
		"\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043c\u043b\u0001\u0000"+
		"\u0000\u0000\u043d\u0440\u0001\u0000\u0000\u0000\u043e\u043c\u0001\u0000"+
		"\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0442\u0001\u0000"+
		"\u0000\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0441\u0443\u0005\u008d"+
		"\u0000\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444\u0446\u0003t:\u0000"+
		"\u0445\u0444\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000"+
		"\u0446\u0448\u0001\u0000\u0000\u0000\u0447\u0449\u0003\u01b4\u00da\u0000"+
		"\u0448\u0447\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000"+
		"\u0449s\u0001\u0000\u0000\u0000\u044a\u044b\u0005v\u0000\u0000\u044b\u0450"+
		"\u0003v;\u0000\u044c\u044d\u0005}\u0000\u0000\u044d\u044f\u0003v;\u0000"+
		"\u044e\u044c\u0001\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000\u0000"+
		"\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u0453\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000"+
		"\u0453\u0454\u0005w\u0000\u0000\u0454u\u0001\u0000\u0000\u0000\u0455\u0456"+
		"\u0003\u01b4\u00da\u0000\u0456\u0457\u0005~\u0000\u0000\u0457\u0458\u0003"+
		"\u001c\u000e\u0000\u0458w\u0001\u0000\u0000\u0000\u0459\u045b\u0005\u000e"+
		"\u0000\u0000\u045a\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000"+
		"\u0000\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045d\u0003z=\u0000"+
		"\u045d\u045e\u0003\u017c\u00be\u0000\u045e\u045f\u0003\u0082A\u0000\u045f"+
		"y\u0001\u0000\u0000\u0000\u0460\u0461\u0005z\u0000\u0000\u0461\u046c\u0005"+
		"{\u0000\u0000\u0462\u0463\u0005z\u0000\u0000\u0463\u0464\u0003|>\u0000"+
		"\u0464\u0465\u0005{\u0000\u0000\u0465\u046c\u0001\u0000\u0000\u0000\u0466"+
		"\u0467\u0005z\u0000\u0000\u0467\u0468\u0003\u0080@\u0000\u0468\u0469\u0005"+
		"{\u0000\u0000\u0469\u046c\u0001\u0000\u0000\u0000\u046a\u046c\u0003\u01b4"+
		"\u00da\u0000\u046b\u0460\u0001\u0000\u0000\u0000\u046b\u0462\u0001\u0000"+
		"\u0000\u0000\u046b\u0466\u0001\u0000\u0000\u0000\u046b\u046a\u0001\u0000"+
		"\u0000\u0000\u046c{\u0001\u0000\u0000\u0000\u046d\u0472\u0003~?\u0000"+
		"\u046e\u046f\u0005}\u0000\u0000\u046f\u0471\u0003~?\u0000\u0470\u046e"+
		"\u0001\u0000\u0000\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472\u0470"+
		"\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473}\u0001"+
		"\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u0477\u0007"+
		"\u0002\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0476\u0477\u0001"+
		"\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u0479\u0003"+
		"\u0004\u0002\u0000\u0479\u047a\u0003\u01b4\u00da\u0000\u047a\u007f\u0001"+
		"\u0000\u0000\u0000\u047b\u0480\u0003\u01b4\u00da\u0000\u047c\u047d\u0005"+
		"}\u0000\u0000\u047d\u047f\u0003\u01b4\u00da\u0000\u047e\u047c\u0001\u0000"+
		"\u0000\u0000\u047f\u0482\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0081\u0001\u0000"+
		"\u0000\u0000\u0482\u0480\u0001\u0000\u0000\u0000\u0483\u0486\u0003L&\u0000"+
		"\u0484\u0486\u0003\u00acV\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0485"+
		"\u0484\u0001\u0000\u0000\u0000\u0486\u0083\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0003\u0086C\u0000\u0488\u0489\u0003\u0088D\u0000\u0489\u0085\u0001"+
		"\u0000\u0000\u0000\u048a\u048c\u0005.\u0000\u0000\u048b\u048d\u0003\u0004"+
		"\u0002\u0000\u048c\u048b\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000"+
		"\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048f\u0003\u01b4"+
		"\u00da\u0000\u048f\u0490\u00054\u0000\u0000\u0490\u0491\u0003\u001c\u000e"+
		"\u0000\u0491\u0087\u0001\u0000\u0000\u0000\u0492\u0494\u0003\u008aE\u0000"+
		"\u0493\u0492\u0001\u0000\u0000\u0000\u0494\u0497\u0001\u0000\u0000\u0000"+
		"\u0495\u0493\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000"+
		"\u0496\u0498\u0001\u0000\u0000\u0000\u0497\u0495\u0001\u0000\u0000\u0000"+
		"\u0498\u049a\u0003\u0096K\u0000\u0499\u049b\u0003\u0098L\u0000\u049a\u0499"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u0089"+
		"\u0001\u0000\u0000\u0000\u049c\u04a2\u0003\u0086C\u0000\u049d\u04a2\u0003"+
		"\u008cF\u0000\u049e\u04a2\u0003\u008eG\u0000\u049f\u04a2\u0003\u0090H"+
		"\u0000\u04a0\u04a2\u0003\u0092I\u0000\u04a1\u049c\u0001\u0000\u0000\u0000"+
		"\u04a1\u049d\u0001\u0000\u0000\u0000\u04a1\u049e\u0001\u0000\u0000\u0000"+
		"\u04a1\u049f\u0001\u0000\u0000\u0000\u04a1\u04a0\u0001\u0000\u0000\u0000"+
		"\u04a2\u008b\u0001\u0000\u0000\u0000\u04a3\u04a4\u0005;\u0000\u0000\u04a4"+
		"\u04a5\u0003\u01b4\u00da\u0000\u04a5\u04a6\u0005\u008a\u0000\u0000\u04a6"+
		"\u04a7\u0003\u001c\u000e\u0000\u04a7\u008d\u0001\u0000\u0000\u0000\u04a8"+
		"\u04a9\u0005h\u0000\u0000\u04a9\u04aa\u0003\u001c\u000e\u0000\u04aa\u008f"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ad\u0005:\u0000\u0000\u04ac\u04ae\u0003"+
		"\u0004\u0002\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001"+
		"\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b0\u0003"+
		"\u01b4\u00da\u0000\u04b0\u04b1\u00054\u0000\u0000\u04b1\u04b2\u0003\u001c"+
		"\u000e\u0000\u04b2\u04b3\u0005D\u0000\u0000\u04b3\u04b4\u0003\u001c\u000e"+
		"\u0000\u04b4\u04b5\u0005$\u0000\u0000\u04b5\u04b8\u0003\u001c\u000e\u0000"+
		"\u04b6\u04b7\u00058\u0000\u0000\u04b7\u04b9\u0003\u01b4\u00da\u0000\u04b8"+
		"\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9"+
		"\u0091\u0001\u0000\u0000\u0000\u04ba\u04bb\u0005F\u0000\u0000\u04bb\u04c0"+
		"\u0003\u0094J\u0000\u04bc\u04bd\u0005}\u0000\u0000\u04bd\u04bf\u0003\u0094"+
		"J\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04bf\u04c2\u0001\u0000\u0000"+
		"\u0000\u04c0\u04be\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000"+
		"\u0000\u04c1\u0093\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c5\u0003\u001c\u000e\u0000\u04c4\u04c6\u0007\b\u0000\u0000"+
		"\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000"+
		"\u04c6\u0095\u0001\u0000\u0000\u0000\u04c7\u04c8\u0005P\u0000\u0000\u04c8"+
		"\u04cf\u0003\u001c\u000e\u0000\u04c9\u04ca\u00051\u0000\u0000\u04ca\u04cb"+
		"\u0003\u001c\u000e\u0000\u04cb\u04cc\u0005\u0013\u0000\u0000\u04cc\u04cd"+
		"\u0003\u001c\u000e\u0000\u04cd\u04cf\u0001\u0000\u0000\u0000\u04ce\u04c7"+
		"\u0001\u0000\u0000\u0000\u04ce\u04c9\u0001\u0000\u0000\u0000\u04cf\u0097"+
		"\u0001\u0000\u0000\u0000\u04d0\u04d1\u00058\u0000\u0000\u04d1\u04d2\u0003"+
		"\u01b4\u00da\u0000\u04d2\u04d3\u0003\u0088D\u0000\u04d3\u0099\u0001\u0000"+
		"\u0000\u0000\u04d4\u04d9\u0003\u00a6S\u0000\u04d5\u04d9\u0003\u009cN\u0000"+
		"\u04d6\u04d9\u0003\u00a8T\u0000\u04d7\u04d9\u0003\u0104\u0082\u0000\u04d8"+
		"\u04d4\u0001\u0000\u0000\u0000\u04d8\u04d5\u0001\u0000\u0000\u0000\u04d8"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d9"+
		"\u009b\u0001\u0000\u0000\u0000\u04da\u04db\u0003\u00aeW\u0000\u04db\u04dc"+
		"\u0005\u007f\u0000\u0000\u04dc\u04e2\u0001\u0000\u0000\u0000\u04dd\u04de"+
		"\u0003\u00b6[\u0000\u04de\u04df\u0005\u007f\u0000\u0000\u04df\u04e2\u0001"+
		"\u0000\u0000\u0000\u04e0\u04e2\u0003\u009eO\u0000\u04e1\u04da\u0001\u0000"+
		"\u0000\u0000\u04e1\u04dd\u0001\u0000\u0000\u0000\u04e1\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e2\u009d\u0001\u0000\u0000\u0000\u04e3\u04e4\u0003\u00a0"+
		"P\u0000\u04e4\u04e5\u0003\u00a4R\u0000\u04e5\u009f\u0001\u0000\u0000\u0000"+
		"\u04e6\u04e8\u0003\u00a2Q\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9"+
		"\u04ea\u0003\u0118\u008c\u0000\u04ea\u04ec\u0003\u01b4\u00da\u0000\u04eb"+
		"\u04ed\u0003\u00e8t\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ec\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee\u04f0"+
		"\u0005z\u0000\u0000\u04ef\u04f1\u0003\u011e\u008f\u0000\u04f0\u04ef\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f4\u0005{\u0000\u0000\u04f3\u04f5\u0003\u00f0"+
		"x\u0000\u04f4\u04f3\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f5\u00a1\u0001\u0000\u0000\u0000\u04f6\u04f8\u0007\t\u0000\u0000"+
		"\u04f7\u04f9\u0005U\u0000\u0000\u04f8\u04f7\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fd\u0001\u0000\u0000\u0000\u04fa"+
		"\u04fb\u0005U\u0000\u0000\u04fb\u04fd\u0007\t\u0000\u0000\u04fc\u04f6"+
		"\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001\u0000\u0000\u0000\u04fd\u00a3"+
		"\u0001\u0000\u0000\u0000\u04fe\u0504\u0003\u00acV\u0000\u04ff\u0500\u0003"+
		"\u017c\u00be\u0000\u0500\u0501\u0003L&\u0000\u0501\u0502\u0005\u007f\u0000"+
		"\u0000\u0502\u0504\u0001\u0000\u0000\u0000\u0503\u04fe\u0001\u0000\u0000"+
		"\u0000\u0503\u04ff\u0001\u0000\u0000\u0000\u0504\u00a5\u0001\u0000\u0000"+
		"\u0000\u0505\u0506\u0003\u01b4\u00da\u0000\u0506\u0507\u0005~\u0000\u0000"+
		"\u0507\u0508\u0003\u009aM\u0000\u0508\u00a7\u0001\u0000\u0000\u0000\u0509"+
		"\u050c\u0003\u00acV\u0000\u050a\u050c\u0003\u00aaU\u0000\u050b\u0509\u0001"+
		"\u0000\u0000\u0000\u050b\u050a\u0001\u0000\u0000\u0000\u050c\u00a9\u0001"+
		"\u0000\u0000\u0000\u050d\u0590\u0005\u007f\u0000\u0000\u050e\u050f\u0003"+
		"\u001c\u000e\u0000\u050f\u0510\u0005\u007f\u0000\u0000\u0510\u0590\u0001"+
		"\u0000\u0000\u0000\u0511\u0512\u00052\u0000\u0000\u0512\u0513\u0005z\u0000"+
		"\u0000\u0513\u0514\u0003\u001c\u000e\u0000\u0514\u0515\u0005{\u0000\u0000"+
		"\u0515\u0518\u0003\u00b8\\\u0000\u0516\u0517\u0005\"\u0000\u0000\u0517"+
		"\u0519\u0003\u00b8\\\u0000\u0518\u0516\u0001\u0000\u0000\u0000\u0518\u0519"+
		"\u0001\u0000\u0000\u0000\u0519\u0590\u0001\u0000\u0000\u0000\u051a\u051b"+
		"\u0005X\u0000\u0000\u051b\u051c\u0005z\u0000\u0000\u051c\u051d\u0003\u001c"+
		"\u000e\u0000\u051d\u051e\u0005{\u0000\u0000\u051e\u0522\u0005v\u0000\u0000"+
		"\u051f\u0521\u0003\u00ba]\u0000\u0520\u051f\u0001\u0000\u0000\u0000\u0521"+
		"\u0524\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000\u0000\u0000\u0522"+
		"\u0523\u0001\u0000\u0000\u0000\u0523\u0525\u0001\u0000\u0000\u0000\u0524"+
		"\u0522\u0001\u0000\u0000\u0000\u0525\u0526\u0005w\u0000\u0000\u0526\u0590"+
		"\u0001\u0000\u0000\u0000\u0527\u0528\u0005i\u0000\u0000\u0528\u0529\u0005"+
		"z\u0000\u0000\u0529\u052a\u0003\u001c\u000e\u0000\u052a\u052b\u0005{\u0000"+
		"\u0000\u052b\u052c\u0003\u00a8T\u0000\u052c\u0590\u0001\u0000\u0000\u0000"+
		"\u052d\u052e\u0005\u001f\u0000\u0000\u052e\u052f\u0003\u00a8T\u0000\u052f"+
		"\u0530\u0005i\u0000\u0000\u0530\u0531\u0005z\u0000\u0000\u0531\u0532\u0003"+
		"\u001c\u000e\u0000\u0532\u0533\u0005{\u0000\u0000\u0533\u0534\u0005\u007f"+
		"\u0000\u0000\u0534\u0590\u0001\u0000\u0000\u0000\u0535\u0536\u0005,\u0000"+
		"\u0000\u0536\u0538\u0005z\u0000\u0000\u0537\u0539\u0003\u00c2a\u0000\u0538"+
		"\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u053a\u0001\u0000\u0000\u0000\u053a\u053c\u0005\u007f\u0000\u0000\u053b"+
		"\u053d\u0003\u001c\u000e\u0000\u053c\u053b\u0001\u0000\u0000\u0000\u053c"+
		"\u053d\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000\u0000\u053e"+
		"\u0540\u0005\u007f\u0000\u0000\u053f\u0541\u0003\u00c4b\u0000\u0540\u053f"+
		"\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0542"+
		"\u0001\u0000\u0000\u0000\u0542\u0543\u0005{\u0000\u0000\u0543\u0590\u0003"+
		"\u00a8T\u0000\u0544\u0546\u0005\u000f\u0000\u0000\u0545\u0544\u0001\u0000"+
		"\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000"+
		"\u0000\u0000\u0547\u0548\u0005-\u0000\u0000\u0548\u0549\u0005z\u0000\u0000"+
		"\u0549\u054a\u0003\u00b0X\u0000\u054a\u054b\u0003\u01b4\u00da\u0000\u054b"+
		"\u054c\u00054\u0000\u0000\u054c\u054d\u0003\u001c\u000e\u0000\u054d\u054e"+
		"\u0005{\u0000\u0000\u054e\u054f\u0003\u00a8T\u0000\u054f\u0590\u0001\u0000"+
		"\u0000\u0000\u0550\u0551\u0005\u0012\u0000\u0000\u0551\u0590\u0005\u007f"+
		"\u0000\u0000\u0552\u0553\u0005\u001a\u0000\u0000\u0553\u0590\u0005\u007f"+
		"\u0000\u0000\u0554\u0559\u00050\u0000\u0000\u0555\u055a\u0003\u01b4\u00da"+
		"\u0000\u0556\u0557\u0005\u0015\u0000\u0000\u0557\u055a\u0003\u001c\u000e"+
		"\u0000\u0558\u055a\u0005\u001c\u0000\u0000\u0559\u0555\u0001\u0000\u0000"+
		"\u0000\u0559\u0556\u0001\u0000\u0000\u0000\u0559\u0558\u0001\u0000\u0000"+
		"\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b\u0590\u0005\u007f\u0000"+
		"\u0000\u055c\u055e\u0005N\u0000\u0000\u055d\u055f\u0003\u001c\u000e\u0000"+
		"\u055e\u055d\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000\u0000\u0000"+
		"\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u0590\u0005\u007f\u0000\u0000"+
		"\u0561\u0563\u0005Y\u0000\u0000\u0562\u0564\u0003\u001c\u000e\u0000\u0563"+
		"\u0562\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564"+
		"\u0565\u0001\u0000\u0000\u0000\u0565\u0590\u0005\u007f\u0000\u0000\u0566"+
		"\u0567\u0005[\u0000\u0000\u0567\u056d\u0003\u00acV\u0000\u0568\u056a\u0003"+
		"\u00c6c\u0000\u0569\u056b\u0003\u00ceg\u0000\u056a\u0569\u0001\u0000\u0000"+
		"\u0000\u056a\u056b\u0001\u0000\u0000\u0000\u056b\u056e\u0001\u0000\u0000"+
		"\u0000\u056c\u056e\u0003\u00ceg\u0000\u056d\u0568\u0001\u0000\u0000\u0000"+
		"\u056d\u056c\u0001\u0000\u0000\u0000\u056e\u0590\u0001\u0000\u0000\u0000"+
		"\u056f\u0570\u0005\u0018\u0000\u0000\u0570\u0590\u0003\u00acV\u0000\u0571"+
		"\u0572\u0005_\u0000\u0000\u0572\u0590\u0003\u00acV\u0000\u0573\u0574\u0005"+
		"<\u0000\u0000\u0574\u0575\u0005z\u0000\u0000\u0575\u0576\u0003\u001c\u000e"+
		"\u0000\u0576\u0577\u0005{\u0000\u0000\u0577\u0578\u0003\u00a8T\u0000\u0578"+
		"\u0590\u0001\u0000\u0000\u0000\u0579\u057a\u0005c\u0000\u0000\u057a\u057b"+
		"\u0005z\u0000\u0000\u057b\u057c\u0003\u00d0h\u0000\u057c\u057d\u0005{"+
		"\u0000\u0000\u057d\u057e\u0003\u00a8T\u0000\u057e\u0590\u0001\u0000\u0000"+
		"\u0000\u057f\u0583\u0005j\u0000\u0000\u0580\u0581\u0005N\u0000\u0000\u0581"+
		"\u0584\u0003\u001c\u000e\u0000\u0582\u0584\u0005\u0012\u0000\u0000\u0583"+
		"\u0580\u0001\u0000\u0000\u0000\u0583\u0582\u0001\u0000\u0000\u0000\u0584"+
		"\u0585\u0001\u0000\u0000\u0000\u0585\u0590\u0005\u007f\u0000\u0000\u0586"+
		"\u0587\u0005a\u0000\u0000\u0587\u0590\u0003\u00acV\u0000\u0588\u0589\u0005"+
		"*\u0000\u0000\u0589\u058a\u0005z\u0000\u0000\u058a\u058b\u0003\u0170\u00b8"+
		"\u0000\u058b\u058c\u0003\u0172\u00b9\u0000\u058c\u058d\u0005{\u0000\u0000"+
		"\u058d\u058e\u0003\u00a8T\u0000\u058e\u0590\u0001\u0000\u0000\u0000\u058f"+
		"\u050d\u0001\u0000\u0000\u0000\u058f\u050e\u0001\u0000\u0000\u0000\u058f"+
		"\u0511\u0001\u0000\u0000\u0000\u058f\u051a\u0001\u0000\u0000\u0000\u058f"+
		"\u0527\u0001\u0000\u0000\u0000\u058f\u052d\u0001\u0000\u0000\u0000\u058f"+
		"\u0535\u0001\u0000\u0000\u0000\u058f\u0545\u0001\u0000\u0000\u0000\u058f"+
		"\u0550\u0001\u0000\u0000\u0000\u058f\u0552\u0001\u0000\u0000\u0000\u058f"+
		"\u0554\u0001\u0000\u0000\u0000\u058f\u055c\u0001\u0000\u0000\u0000\u058f"+
		"\u0561\u0001\u0000\u0000\u0000\u058f\u0566\u0001\u0000\u0000\u0000\u058f"+
		"\u056f\u0001\u0000\u0000\u0000\u058f\u0571\u0001\u0000\u0000\u0000\u058f"+
		"\u0573\u0001\u0000\u0000\u0000\u058f\u0579\u0001\u0000\u0000\u0000\u058f"+
		"\u057f\u0001\u0000\u0000\u0000\u058f\u0586\u0001\u0000\u0000\u0000\u058f"+
		"\u0588\u0001\u0000\u0000\u0000\u0590\u00ab\u0001\u0000\u0000\u0000\u0591"+
		"\u0593\u0005v\u0000\u0000\u0592\u0594\u0003\u00c0`\u0000\u0593\u0592\u0001"+
		"\u0000\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0595\u0001"+
		"\u0000\u0000\u0000\u0595\u0596\u0005w\u0000\u0000\u0596\u00ad\u0001\u0000"+
		"\u0000\u0000\u0597\u059c\u0005c\u0000\u0000\u0598\u059c\u0005L\u0000\u0000"+
		"\u0599\u059a\u0005L\u0000\u0000\u059a\u059c\u0005K\u0000\u0000\u059b\u0597"+
		"\u0001\u0000\u0000\u0000\u059b\u0598\u0001\u0000\u0000\u0000\u059b\u0599"+
		"\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u059d"+
		"\u0001\u0000\u0000\u0000\u059d\u059e\u0003\u00b0X\u0000\u059e\u05a5\u0003"+
		"\u00b2Y\u0000\u059f\u05a0\u0005}\u0000\u0000\u05a0\u05a1\u0003\u00b2Y"+
		"\u0000\u05a1\u05a2\u0004W\u0000\u0000\u05a2\u05a4\u0001\u0000\u0000\u0000"+
		"\u05a3\u059f\u0001\u0000\u0000\u0000\u05a4\u05a7\u0001\u0000\u0000\u0000"+
		"\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000"+
		"\u05a6\u05ad\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000\u0000"+
		"\u05a8\u05a9\u0005*\u0000\u0000\u05a9\u05aa\u0003\u0170\u00b8\u0000\u05aa"+
		"\u05ab\u0003\u0172\u00b9\u0000\u05ab\u05ad\u0001\u0000\u0000\u0000\u05ac"+
		"\u059b\u0001\u0000\u0000\u0000\u05ac\u05a8\u0001\u0000\u0000\u0000\u05ad"+
		"\u00af\u0001\u0000\u0000\u0000\u05ae\u05b1\u0005d\u0000\u0000\u05af\u05b1"+
		"\u0003\u0004\u0002\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b0\u05af"+
		"\u0001\u0000\u0000\u0000\u05b1\u00b1\u0001\u0000\u0000\u0000\u05b2\u05b8"+
		"\u0003\u01b4\u00da\u0000\u05b3\u05b5\u0005\u008a\u0000\u0000\u05b4\u05b6"+
		"\u0005L\u0000\u0000\u05b5\u05b4\u0001\u0000\u0000\u0000\u05b5\u05b6\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b9\u0003"+
		"\u00b4Z\u0000\u05b8\u05b3\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000"+
		"\u0000\u0000\u05b9\u00b3\u0001\u0000\u0000\u0000\u05ba\u05be\u0003\u001c"+
		"\u000e\u0000\u05bb\u05be\u0003\u014a\u00a5\u0000\u05bc\u05be\u0003\u017a"+
		"\u00bd\u0000\u05bd\u05ba\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000"+
		"\u0000\u0000\u05bd\u05bc\u0001\u0000\u0000\u0000\u05be\u00b5\u0001\u0000"+
		"\u0000\u0000\u05bf\u05c0\u0005\u0019\u0000\u0000\u05c0\u05c1\u0003\u0004"+
		"\u0002\u0000\u05c1\u05c2\u0003\u010e\u0087\u0000\u05c2\u00b7\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c6\u0003\u00acV\u0000\u05c4\u05c6\u0003\u00aaU\u0000"+
		"\u05c5\u05c3\u0001\u0000\u0000\u0000\u05c5\u05c4\u0001\u0000\u0000\u0000"+
		"\u05c6\u00b9\u0001\u0000\u0000\u0000\u05c7\u05c9\u0003\u00bc^\u0000\u05c8"+
		"\u05c7\u0001\u0000\u0000\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca"+
		"\u05c8\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb"+
		"\u05cc\u0001\u0000\u0000\u0000\u05cc\u05cd\u0003\u00c0`\u0000\u05cd\u00bb"+
		"\u0001\u0000\u0000\u0000\u05ce\u05cf\u0005\u0015\u0000\u0000\u05cf\u05d1"+
		"\u0003\u001c\u000e\u0000\u05d0\u05d2\u0003\u00be_\u0000\u05d1\u05d0\u0001"+
		"\u0000\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001"+
		"\u0000\u0000\u0000\u05d3\u05d4\u0005~\u0000\u0000\u05d4\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0005\u001c\u0000\u0000\u05d6\u05d8\u0005~\u0000"+
		"\u0000\u05d7\u05ce\u0001\u0000\u0000\u0000\u05d7\u05d5\u0001\u0000\u0000"+
		"\u0000\u05d8\u00bd\u0001\u0000\u0000\u0000\u05d9\u05da\u0005g\u0000\u0000"+
		"\u05da\u05db\u0003\u001c\u000e\u0000\u05db\u00bf\u0001\u0000\u0000\u0000"+
		"\u05dc\u05de\u0003\u009aM\u0000\u05dd\u05dc\u0001\u0000\u0000\u0000\u05de"+
		"\u05df\u0001\u0000\u0000\u0000\u05df\u05dd\u0001\u0000\u0000\u0000\u05df"+
		"\u05e0\u0001\u0000\u0000\u0000\u05e0\u00c1\u0001\u0000\u0000\u0000\u05e1"+
		"\u05eb\u0003\u00aeW\u0000\u05e2\u05e7\u0003\u001c\u000e\u0000\u05e3\u05e4"+
		"\u0005}\u0000\u0000\u05e4\u05e6\u0003\u001c\u000e\u0000\u05e5\u05e3\u0001"+
		"\u0000\u0000\u0000\u05e6\u05e9\u0001\u0000\u0000\u0000\u05e7\u05e5\u0001"+
		"\u0000\u0000\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000\u05e8\u05eb\u0001"+
		"\u0000\u0000\u0000\u05e9\u05e7\u0001\u0000\u0000\u0000\u05ea\u05e1\u0001"+
		"\u0000\u0000\u0000\u05ea\u05e2\u0001\u0000\u0000\u0000\u05eb\u00c3\u0001"+
		"\u0000\u0000\u0000\u05ec\u05f1\u0003\u001c\u000e\u0000\u05ed\u05ee\u0005"+
		"}\u0000\u0000\u05ee\u05f0\u0003\u001c\u000e\u0000\u05ef\u05ed\u0001\u0000"+
		"\u0000\u0000\u05f0\u05f3\u0001\u0000\u0000\u0000\u05f1\u05ef\u0001\u0000"+
		"\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000\u0000\u05f2\u00c5\u0001\u0000"+
		"\u0000\u0000\u05f3\u05f1\u0001\u0000\u0000\u0000\u05f4\u05f8\u0003\u00c8"+
		"d\u0000\u05f5\u05f7\u0003\u00c8d\u0000\u05f6\u05f5\u0001\u0000\u0000\u0000"+
		"\u05f7\u05fa\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000\u0000\u0000"+
		"\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9\u05fc\u0001\u0000\u0000\u0000"+
		"\u05fa\u05f8\u0001\u0000\u0000\u0000\u05fb\u05fd\u0003\u00cae\u0000\u05fc"+
		"\u05fb\u0001\u0000\u0000\u0000\u05fc\u05fd\u0001\u0000\u0000\u0000\u05fd"+
		"\u0600\u0001\u0000\u0000\u0000\u05fe\u0600\u0003\u00cae\u0000\u05ff\u05f4"+
		"\u0001\u0000\u0000\u0000\u05ff\u05fe\u0001\u0000\u0000\u0000\u0600\u00c7"+
		"\u0001\u0000\u0000\u0000\u0601\u0602\u0005\u0016\u0000\u0000\u0602\u0603"+
		"\u0005z\u0000\u0000\u0603\u0605\u0003\u0014\n\u0000\u0604\u0606\u0003"+
		"\u01b4\u00da\u0000\u0605\u0604\u0001\u0000\u0000\u0000\u0605\u0606\u0001"+
		"\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000\u0000\u0607\u0609\u0005"+
		"{\u0000\u0000\u0608\u060a\u0003\u00ccf\u0000\u0609\u0608\u0001\u0000\u0000"+
		"\u0000\u0609\u060a\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000"+
		"\u0000\u060b\u060c\u0003\u00acV\u0000\u060c\u00c9\u0001\u0000\u0000\u0000"+
		"\u060d\u060f\u0005\u0016\u0000\u0000\u060e\u0610\u0003\u00ccf\u0000\u060f"+
		"\u060e\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000\u0610"+
		"\u0611\u0001\u0000\u0000\u0000\u0611\u0612\u0003\u00acV\u0000\u0612\u00cb"+
		"\u0001\u0000\u0000\u0000\u0613\u0614\u0005g\u0000\u0000\u0614\u0615\u0005"+
		"z\u0000\u0000\u0615\u0616\u0003\u001c\u000e\u0000\u0616\u0617\u0005{\u0000"+
		"\u0000\u0617\u00cd\u0001\u0000\u0000\u0000\u0618\u0619\u0005)\u0000\u0000"+
		"\u0619\u061a\u0003\u00acV\u0000\u061a\u00cf\u0001\u0000\u0000\u0000\u061b"+
		"\u061e\u0003\u00aeW\u0000\u061c\u061e\u0003\u001c\u000e\u0000\u061d\u061b"+
		"\u0001\u0000\u0000\u0000\u061d\u061c\u0001\u0000\u0000\u0000\u061e\u00d1"+
		"\u0001\u0000\u0000\u0000\u061f\u0620\u0005@\u0000\u0000\u0620\u0621\u0003"+
		"\u00d4j\u0000\u0621\u0623\u0003\u00d6k\u0000\u0622\u0624\u0005\u007f\u0000"+
		"\u0000\u0623\u0622\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000"+
		"\u0000\u0624\u00d3\u0001\u0000\u0000\u0000\u0625\u062a\u0003\u01b4\u00da"+
		"\u0000\u0626\u0627\u0005|\u0000\u0000\u0627\u0629\u0003\u01b4\u00da\u0000"+
		"\u0628\u0626\u0001\u0000\u0000\u0000\u0629\u062c\u0001\u0000\u0000\u0000"+
		"\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000"+
		"\u062b\u00d5\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000"+
		"\u062d\u062f\u0005v\u0000\u0000\u062e\u0630\u0003\u00d8l\u0000\u062f\u062e"+
		"\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000\u0000\u0630\u0632"+
		"\u0001\u0000\u0000\u0000\u0631\u0633\u0003\u00dcn\u0000\u0632\u0631\u0001"+
		"\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000\u0000\u0633\u0635\u0001"+
		"\u0000\u0000\u0000\u0634\u0636\u0003\u00e0p\u0000\u0635\u0634\u0001\u0000"+
		"\u0000\u0000\u0635\u0636\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000"+
		"\u0000\u0000\u0637\u0638\u0005w\u0000\u0000\u0638\u00d7\u0001\u0000\u0000"+
		"\u0000\u0639\u063b\u0003\u00dam\u0000\u063a\u0639\u0001\u0000\u0000\u0000"+
		"\u063b\u063c\u0001\u0000\u0000\u0000\u063c\u063a\u0001\u0000\u0000\u0000"+
		"\u063c\u063d\u0001\u0000\u0000\u0000\u063d\u00d9\u0001\u0000\u0000\u0000"+
		"\u063e\u063f\u0005\'\u0000\u0000\u063f\u0640\u0005\n\u0000\u0000\u0640"+
		"\u0641\u0003\u01b4\u00da\u0000\u0641\u0642\u0005\u007f\u0000\u0000\u0642"+
		"\u00db\u0001\u0000\u0000\u0000\u0643\u0645\u0003\u00deo\u0000\u0644\u0643"+
		"\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646\u0644"+
		"\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u00dd"+
		"\u0001\u0000\u0000\u0000\u0648\u0649\u0005c\u0000\u0000\u0649\u064a\u0003"+
		"\u01b4\u00da\u0000\u064a\u064b\u0005\u008a\u0000\u0000\u064b\u064c\u0003"+
		"\u0002\u0001\u0000\u064c\u064d\u0005\u007f\u0000\u0000\u064d\u065d\u0001"+
		"\u0000\u0000\u0000\u064e\u064f\u0005c\u0000\u0000\u064f\u0650\u0003\u0002"+
		"\u0001\u0000\u0650\u0651\u0005\u007f\u0000\u0000\u0651\u065d\u0001\u0000"+
		"\u0000\u0000\u0652\u0653\u0005c\u0000\u0000\u0653\u0654\u0005U\u0000\u0000"+
		"\u0654\u0655\u0003\u0002\u0001\u0000\u0655\u0656\u0005\u007f\u0000\u0000"+
		"\u0656\u065d\u0001\u0000\u0000\u0000\u0657\u0658\u0005c\u0000\u0000\u0658"+
		"\u0659\u0005>\u0000\u0000\u0659\u065a\u0003\u0002\u0001\u0000\u065a\u065b"+
		"\u0005\u007f\u0000\u0000\u065b\u065d\u0001\u0000\u0000\u0000\u065c\u0648"+
		"\u0001\u0000\u0000\u0000\u065c\u064e\u0001\u0000\u0000\u0000\u065c\u0652"+
		"\u0001\u0000\u0000\u0000\u065c\u0657\u0001\u0000\u0000\u0000\u065d\u00df"+
		"\u0001\u0000\u0000\u0000\u065e\u0660\u0003\u00e2q\u0000\u065f\u065e\u0001"+
		"\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000\u0661\u065f\u0001"+
		"\u0000\u0000\u0000\u0661\u0662\u0001\u0000\u0000\u0000\u0662\u00e1\u0001"+
		"\u0000\u0000\u0000\u0663\u0666\u0003\u00d2i\u0000\u0664\u0666\u0003\u00e4"+
		"r\u0000\u0665\u0663\u0001\u0000\u0000\u0000\u0665\u0664\u0001\u0000\u0000"+
		"\u0000\u0666\u00e3\u0001\u0000\u0000\u0000\u0667\u0669\u0003\u0164\u00b2"+
		"\u0000\u0668\u0667\u0001\u0000\u0000\u0000\u0668\u0669\u0001\u0000\u0000"+
		"\u0000\u0669\u066b\u0001\u0000\u0000\u0000\u066a\u066c\u0003\u0106\u0083"+
		"\u0000\u066b\u066a\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000"+
		"\u0000\u066c\u0671\u0001\u0000\u0000\u0000\u066d\u0672\u0003\u0194\u00ca"+
		"\u0000\u066e\u0672\u0003\u0196\u00cb\u0000\u066f\u0672\u0003\u0198\u00cc"+
		"\u0000\u0670\u0672\u0003\u019a\u00cd\u0000\u0671\u066d\u0001\u0000\u0000"+
		"\u0000\u0671\u066e\u0001\u0000\u0000\u0000\u0671\u066f\u0001\u0000\u0000"+
		"\u0000\u0671\u0670\u0001\u0000\u0000\u0000\u0672\u00e5\u0001\u0000\u0000"+
		"\u0000\u0673\u0674\u0003\u01b4\u00da\u0000\u0674\u0675\u0005\u008e\u0000"+
		"\u0000\u0675\u0677\u0003\u01b4\u00da\u0000\u0676\u0678\u0003\u0016\u000b"+
		"\u0000\u0677\u0676\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000"+
		"\u0000\u0678\u00e7\u0001\u0000\u0000\u0000\u0679\u067a\u0005\u008b\u0000"+
		"\u0000\u067a\u067f\u0003\u00eau\u0000\u067b\u067c\u0005}\u0000\u0000\u067c"+
		"\u067e\u0003\u00eau\u0000\u067d\u067b\u0001\u0000\u0000\u0000\u067e\u0681"+
		"\u0001\u0000\u0000\u0000\u067f\u067d\u0001\u0000\u0000\u0000\u067f\u0680"+
		"\u0001\u0000\u0000\u0000\u0680\u0682\u0001\u0000\u0000\u0000\u0681\u067f"+
		"\u0001\u0000\u0000\u0000\u0682\u0683\u0005\u008c\u0000\u0000\u0683\u00e9"+
		"\u0001\u0000\u0000\u0000\u0684\u0686\u0003\u0164\u00b2\u0000\u0685\u0684"+
		"\u0001\u0000\u0000\u0000\u0685\u0686\u0001\u0000\u0000\u0000\u0686\u0687"+
		"\u0001\u0000\u0000\u0000\u0687\u0688\u0003\u01b4\u00da\u0000\u0688\u00eb"+
		"\u0001\u0000\u0000\u0000\u0689\u068a\u0005~\u0000\u0000\u068a\u068f\u0003"+
		"\u0014\n\u0000\u068b\u068c\u0005}\u0000\u0000\u068c\u068e\u0003\u0002"+
		"\u0001\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068e\u0691\u0001\u0000"+
		"\u0000\u0000\u068f\u068d\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000"+
		"\u0000\u0000\u0690\u00ed\u0001\u0000\u0000\u0000\u0691\u068f\u0001\u0000"+
		"\u0000\u0000\u0692\u0697\u0003\u0002\u0001\u0000\u0693\u0694\u0005}\u0000"+
		"\u0000\u0694\u0696\u0003\u0002\u0001\u0000\u0695\u0693\u0001\u0000\u0000"+
		"\u0000\u0696\u0699\u0001\u0000\u0000\u0000\u0697\u0695\u0001\u0000\u0000"+
		"\u0000\u0697\u0698\u0001\u0000\u0000\u0000\u0698\u00ef\u0001\u0000\u0000"+
		"\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u069a\u069c\u0003\u00f2y\u0000"+
		"\u069b\u069a\u0001\u0000\u0000\u0000\u069c\u069d\u0001\u0000\u0000\u0000"+
		"\u069d\u069b\u0001\u0000\u0000\u0000\u069d\u069e\u0001\u0000\u0000\u0000"+
		"\u069e\u00f1\u0001\u0000\u0000\u0000\u069f\u06a0\u0005h\u0000\u0000\u06a0"+
		"\u06a1\u0003\u01b4\u00da\u0000\u06a1\u06a2\u0005~\u0000\u0000\u06a2\u06a3"+
		"\u0003\u00f4z\u0000\u06a3\u00f3\u0001\u0000\u0000\u0000\u06a4\u06af\u0003"+
		"\u00fa}\u0000\u06a5\u06a8\u0003\u00f6{\u0000\u06a6\u06a7\u0005}\u0000"+
		"\u0000\u06a7\u06a9\u0003\u00f8|\u0000\u06a8\u06a6\u0001\u0000\u0000\u0000"+
		"\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06ac\u0001\u0000\u0000\u0000"+
		"\u06aa\u06ab\u0005}\u0000\u0000\u06ab\u06ad\u0003\u00fa}\u0000\u06ac\u06aa"+
		"\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000\u0000\u06ad\u06af"+
		"\u0001\u0000\u0000\u0000\u06ae\u06a4\u0001\u0000\u0000\u0000\u06ae\u06a5"+
		"\u0001\u0000\u0000\u0000\u06af\u00f5\u0001\u0000\u0000\u0000\u06b0\u06b4"+
		"\u0003\u0014\n\u0000\u06b1\u06b4\u0005W\u0000\u0000\u06b2\u06b4\u0005"+
		"`\u0000\u0000\u06b3\u06b0\u0001\u0000\u0000\u0000\u06b3\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b3\u06b2\u0001\u0000\u0000\u0000\u06b4\u00f7\u0001\u0000"+
		"\u0000\u0000\u06b5\u06ba\u0003\u0002\u0001\u0000\u06b6\u06b7\u0005}\u0000"+
		"\u0000\u06b7\u06b9\u0003\u0002\u0001\u0000\u06b8\u06b6\u0001\u0000\u0000"+
		"\u0000\u06b9\u06bc\u0001\u0000\u0000\u0000\u06ba\u06b8\u0001\u0000\u0000"+
		"\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb\u00f9\u0001\u0000\u0000"+
		"\u0000\u06bc\u06ba\u0001\u0000\u0000\u0000\u06bd\u06be\u0005A\u0000\u0000"+
		"\u06be\u06bf\u0005z\u0000\u0000\u06bf\u06c0\u0005{\u0000\u0000\u06c0\u00fb"+
		"\u0001\u0000\u0000\u0000\u06c1\u06c3\u0005v\u0000\u0000\u06c2\u06c4\u0003"+
		"\u00fe\u007f\u0000\u06c3\u06c2\u0001\u0000\u0000\u0000\u06c3\u06c4\u0001"+
		"\u0000\u0000\u0000\u06c4\u06c5\u0001\u0000\u0000\u0000\u06c5\u06c6\u0005"+
		"w\u0000\u0000\u06c6\u00fd\u0001\u0000\u0000\u0000\u06c7\u06c9\u0003\u0100"+
		"\u0080\u0000\u06c8\u06c7\u0001\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000"+
		"\u0000\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06ca\u06cb\u0001\u0000"+
		"\u0000\u0000\u06cb\u00ff\u0001\u0000\u0000\u0000\u06cc\u06ce\u0003\u0164"+
		"\u00b2\u0000\u06cd\u06cc\u0001\u0000\u0000\u0000\u06cd\u06ce\u0001\u0000"+
		"\u0000\u0000\u06ce\u06d0\u0001\u0000\u0000\u0000\u06cf\u06d1\u0003\u0106"+
		"\u0083\u0000\u06d0\u06cf\u0001\u0000\u0000\u0000\u06d0\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d1\u06d4\u0001\u0000\u0000\u0000\u06d2\u06d5\u0003\u010a"+
		"\u0085\u0000\u06d3\u06d5\u0003\u01a4\u00d2\u0000\u06d4\u06d2\u0001\u0000"+
		"\u0000\u0000\u06d4\u06d3\u0001\u0000\u0000\u0000\u06d5\u06d8\u0001\u0000"+
		"\u0000\u0000\u06d6\u06d8\u0003\u0102\u0081\u0000\u06d7\u06cd\u0001\u0000"+
		"\u0000\u0000\u06d7\u06d6\u0001\u0000\u0000\u0000\u06d8\u0101\u0001\u0000"+
		"\u0000\u0000\u06d9\u06db\u0003\u0104\u0082\u0000\u06da\u06d9\u0001\u0000"+
		"\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06da\u0001\u0000"+
		"\u0000\u0000\u06dc\u06dd\u0001\u0000\u0000\u0000\u06dd\u0103\u0001\u0000"+
		"\u0000\u0000\u06de\u06df\u0007\n\u0000\u0000\u06df\u0105\u0001\u0000\u0000"+
		"\u0000\u06e0\u06e2\u0003\u0108\u0084\u0000\u06e1\u06e0\u0001\u0000\u0000"+
		"\u0000\u06e2\u06e3\u0001\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u0107\u0001\u0000\u0000"+
		"\u0000\u06e5\u06e6\u0007\u000b\u0000\u0000\u06e6\u0109\u0001\u0000\u0000"+
		"\u0000\u06e7\u06fa\u0003\u01a2\u00d1\u0000\u06e8\u06fa\u0003\u010c\u0086"+
		"\u0000\u06e9\u06fa\u0003\u019c\u00ce\u0000\u06ea\u06f0\u0003\u013a\u009d"+
		"\u0000\u06eb\u06f1\u0003\u013e\u009f\u0000\u06ec\u06ed\u0003\u017c\u00be"+
		"\u0000\u06ed\u06ee\u0003L&\u0000\u06ee\u06ef\u0005\u007f\u0000\u0000\u06ef"+
		"\u06f1\u0001\u0000\u0000\u0000\u06f0\u06eb\u0001\u0000\u0000\u0000\u06f0"+
		"\u06ec\u0001\u0000\u0000\u0000\u06f1\u06fa\u0001\u0000\u0000\u0000\u06f2"+
		"\u06fa\u0003\u01a6\u00d3\u0000\u06f3\u06f4\u0005e\u0000\u0000\u06f4\u06fa"+
		"\u0003\u01a8\u00d4\u0000\u06f5\u06fa\u0003\u0194\u00ca\u0000\u06f6\u06fa"+
		"\u0003\u0196\u00cb\u0000\u06f7\u06fa\u0003\u0198\u00cc\u0000\u06f8\u06fa"+
		"\u0003\u019a\u00cd\u0000\u06f9\u06e7\u0001\u0000\u0000\u0000\u06f9\u06e8"+
		"\u0001\u0000\u0000\u0000\u06f9\u06e9\u0001\u0000\u0000\u0000\u06f9\u06ea"+
		"\u0001\u0000\u0000\u0000\u06f9\u06f2\u0001\u0000\u0000\u0000\u06f9\u06f3"+
		"\u0001\u0000\u0000\u0000\u06f9\u06f5\u0001\u0000\u0000\u0000\u06f9\u06f6"+
		"\u0001\u0000\u0000\u0000\u06f9\u06f7\u0001\u0000\u0000\u0000\u06f9\u06f8"+
		"\u0001\u0000\u0000\u0000\u06fa\u010b\u0001\u0000\u0000\u0000\u06fb\u0701"+
		"\u0005L\u0000\u0000\u06fc\u06fd\u0005K\u0000\u0000\u06fd\u0701\u0005L"+
		"\u0000\u0000\u06fe\u06ff\u0005L\u0000\u0000\u06ff\u0701\u0005K\u0000\u0000"+
		"\u0700\u06fb\u0001\u0000\u0000\u0000\u0700\u06fc\u0001\u0000\u0000\u0000"+
		"\u0700\u06fe\u0001\u0000\u0000\u0000\u0700\u0701\u0001\u0000\u0000\u0000"+
		"\u0701\u0702\u0001\u0000\u0000\u0000\u0702\u070a\u0003\u0004\u0002\u0000"+
		"\u0703\u0704\u0003\u0002\u0001\u0000\u0704\u0705\u0005|\u0000\u0000\u0705"+
		"\u070b\u0001\u0000\u0000\u0000\u0706\u070b\u0003\u01a8\u00d4\u0000\u0707"+
		"\u070b\u0003\u01a0\u00d0\u0000\u0708\u070b\u0003\u01ac\u00d6\u0000\u0709"+
		"\u070b\u0003\u019e\u00cf\u0000\u070a\u0703\u0001\u0000\u0000\u0000\u070a"+
		"\u0706\u0001\u0000\u0000\u0000\u070a\u0707\u0001\u0000\u0000\u0000\u070a"+
		"\u0708\u0001\u0000\u0000\u0000\u070a\u0709\u0001\u0000\u0000\u0000\u070b"+
		"\u010d\u0001\u0000\u0000\u0000\u070c\u0711\u0003\u0110\u0088\u0000\u070d"+
		"\u070e\u0005}\u0000\u0000\u070e\u0710\u0003\u0110\u0088\u0000\u070f\u070d"+
		"\u0001\u0000\u0000\u0000\u0710\u0713\u0001\u0000\u0000\u0000\u0711\u070f"+
		"\u0001\u0000\u0000\u0000\u0711\u0712\u0001\u0000\u0000\u0000\u0712\u010f"+
		"\u0001\u0000\u0000\u0000\u0713\u0711\u0001\u0000\u0000\u0000\u0714\u0715"+
		"\u0003\u01b4\u00da\u0000\u0715\u0716\u0005\u008a\u0000\u0000\u0716\u0717"+
		"\u0003\u001c\u000e\u0000\u0717\u0111\u0001\u0000\u0000\u0000\u0718\u071d"+
		"\u0003\u0114\u008a\u0000\u0719\u071a\u0005}\u0000\u0000\u071a\u071c\u0003"+
		"\u0114\u008a\u0000\u071b\u0719\u0001\u0000\u0000\u0000\u071c\u071f\u0001"+
		"\u0000\u0000\u0000\u071d\u071b\u0001\u0000\u0000\u0000\u071d\u071e\u0001"+
		"\u0000\u0000\u0000\u071e\u0113\u0001\u0000\u0000\u0000\u071f\u071d\u0001"+
		"\u0000\u0000\u0000\u0720\u0723\u0003\u01b4\u00da\u0000\u0721\u0722\u0005"+
		"\u008a\u0000\u0000\u0722\u0724\u0003\u0116\u008b\u0000\u0723\u0721\u0001"+
		"\u0000\u0000\u0000\u0723\u0724\u0001\u0000\u0000\u0000\u0724\u0115\u0001"+
		"\u0000\u0000\u0000\u0725\u0728\u0003\u001c\u000e\u0000\u0726\u0728\u0003"+
		"\u014a\u00a5\u0000\u0727\u0725\u0001\u0000\u0000\u0000\u0727\u0726\u0001"+
		"\u0000\u0000\u0000\u0728\u0117\u0001\u0000\u0000\u0000\u0729\u072c\u0003"+
		"\u0004\u0002\u0000\u072a\u072c\u0005e\u0000\u0000\u072b\u0729\u0001\u0000"+
		"\u0000\u0000\u072b\u072a\u0001\u0000\u0000\u0000\u072c\u0119\u0001\u0000"+
		"\u0000\u0000\u072d\u072e\u0003\u0002\u0001\u0000\u072e\u011b\u0001\u0000"+
		"\u0000\u0000\u072f\u0732\u0003\u00acV\u0000\u0730\u0732\u0005\u007f\u0000"+
		"\u0000\u0731\u072f\u0001\u0000\u0000\u0000\u0731\u0730\u0001\u0000\u0000"+
		"\u0000\u0732\u011d\u0001\u0000\u0000\u0000\u0733\u073a\u0003\u0126\u0093"+
		"\u0000\u0734\u0737\u0003\u0120\u0090\u0000\u0735\u0736\u0005}\u0000\u0000"+
		"\u0736\u0738\u0003\u0126\u0093\u0000\u0737\u0735\u0001\u0000\u0000\u0000"+
		"\u0737\u0738\u0001\u0000\u0000\u0000\u0738\u073a\u0001\u0000\u0000\u0000"+
		"\u0739\u0733\u0001\u0000\u0000\u0000\u0739\u0734\u0001\u0000\u0000\u0000"+
		"\u073a\u011f\u0001\u0000\u0000\u0000\u073b\u0740\u0003\u0122\u0091\u0000"+
		"\u073c\u073d\u0005}\u0000\u0000\u073d\u073f\u0003\u0122\u0091\u0000\u073e"+
		"\u073c\u0001\u0000\u0000\u0000\u073f\u0742\u0001\u0000\u0000\u0000\u0740"+
		"\u073e\u0001\u0000\u0000\u0000\u0740\u0741\u0001\u0000\u0000\u0000\u0741"+
		"\u0121\u0001\u0000\u0000\u0000\u0742\u0740\u0001\u0000\u0000\u0000\u0743"+
		"\u0745\u0003\u0164\u00b2\u0000\u0744\u0743\u0001\u0000\u0000\u0000\u0744"+
		"\u0745\u0001\u0000\u0000\u0000\u0745\u0747\u0001\u0000\u0000\u0000\u0746"+
		"\u0748\u0003\u0124\u0092\u0000\u0747\u0746\u0001\u0000\u0000\u0000\u0747"+
		"\u0748\u0001\u0000\u0000\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749"+
		"\u074c\u0003\u01ae\u00d7\u0000\u074a\u074c\u0005\u000b\u0000\u0000\u074b"+
		"\u0744\u0001\u0000\u0000\u0000\u074b\u074a\u0001\u0000\u0000\u0000\u074c"+
		"\u0123\u0001\u0000\u0000\u0000\u074d\u074e\u0007\u0002\u0000\u0000\u074e"+
		"\u0125\u0001\u0000\u0000\u0000\u074f\u0751\u0003\u0164\u00b2\u0000\u0750"+
		"\u074f\u0001\u0000\u0000\u0000\u0750\u0751\u0001\u0000\u0000\u0000\u0751"+
		"\u0752\u0001\u0000\u0000\u0000\u0752\u0753\u0005H\u0000\u0000\u0753\u0754"+
		"\u0003\u0146\u00a3\u0000\u0754\u0755\u0003\u01b4\u00da\u0000\u0755\u0127"+
		"\u0001\u0000\u0000\u0000\u0756\u0758\u0003\u0164\u00b2\u0000\u0757\u0756"+
		"\u0001\u0000\u0000\u0000\u0757\u0758\u0001\u0000\u0000\u0000\u0758\u075a"+
		"\u0001\u0000\u0000\u0000\u0759\u075b\u0003\u012e\u0097\u0000\u075a\u0759"+
		"\u0001\u0000\u0000\u0000\u075a\u075b\u0001\u0000\u0000\u0000\u075b\u0766"+
		"\u0001\u0000\u0000\u0000\u075c\u075d\u0005/\u0000\u0000\u075d\u075f\u0003"+
		"\u0130\u0098\u0000\u075e\u0760\u0003\u012c\u0096\u0000\u075f\u075e\u0001"+
		"\u0000\u0000\u0000\u075f\u0760\u0001\u0000\u0000\u0000\u0760\u0767\u0001"+
		"\u0000\u0000\u0000\u0761\u0762\u0005Q\u0000\u0000\u0762\u0764\u0003\u0130"+
		"\u0098\u0000\u0763\u0765\u0003\u012a\u0095\u0000\u0764\u0763\u0001\u0000"+
		"\u0000\u0000\u0764\u0765\u0001\u0000\u0000\u0000\u0765\u0767\u0001\u0000"+
		"\u0000\u0000\u0766\u075c\u0001\u0000\u0000\u0000\u0766\u0761\u0001\u0000"+
		"\u0000\u0000\u0767\u0129\u0001\u0000\u0000\u0000\u0768\u076a\u0003\u0164"+
		"\u00b2\u0000\u0769\u0768\u0001\u0000\u0000\u0000\u0769\u076a\u0001\u0000"+
		"\u0000\u0000\u076a\u076c\u0001\u0000\u0000\u0000\u076b\u076d\u0003\u012e"+
		"\u0097\u0000\u076c\u076b\u0001\u0000\u0000\u0000\u076c\u076d\u0001\u0000"+
		"\u0000\u0000\u076d\u076e\u0001\u0000\u0000\u0000\u076e\u076f\u0005/\u0000"+
		"\u0000\u076f\u0770\u0003\u0130\u0098\u0000\u0770\u012b\u0001\u0000\u0000"+
		"\u0000\u0771\u0773\u0003\u0164\u00b2\u0000\u0772\u0771\u0001\u0000\u0000"+
		"\u0000\u0772\u0773\u0001\u0000\u0000\u0000\u0773\u0775\u0001\u0000\u0000"+
		"\u0000\u0774\u0776\u0003\u012e\u0097\u0000\u0775\u0774\u0001\u0000\u0000"+
		"\u0000\u0775\u0776\u0001\u0000\u0000\u0000\u0776\u0777\u0001\u0000\u0000"+
		"\u0000\u0777\u0778\u0005Q\u0000\u0000\u0778\u0779\u0003\u0130\u0098\u0000"+
		"\u0779\u012d\u0001\u0000\u0000\u0000\u077a\u077b\u0007\f\u0000\u0000\u077b"+
		"\u012f\u0001\u0000\u0000\u0000\u077c\u077f\u0003\u00acV\u0000\u077d\u077f"+
		"\u0005\u007f\u0000\u0000\u077e\u077c\u0001\u0000\u0000\u0000\u077e\u077d"+
		"\u0001\u0000\u0000\u0000\u077f\u0131\u0001\u0000\u0000\u0000\u0780\u0782"+
		"\u0003\u0164\u00b2\u0000\u0781\u0780\u0001\u0000\u0000\u0000\u0781\u0782"+
		"\u0001\u0000\u0000\u0000\u0782\u078b\u0001\u0000\u0000\u0000\u0783\u0784"+
		"\u0005\t\u0000\u0000\u0784\u0785\u0003\u00acV\u0000\u0785\u0786\u0003"+
		"\u0136\u009b\u0000\u0786\u078c\u0001\u0000\u0000\u0000\u0787\u0788\u0005"+
		"M\u0000\u0000\u0788\u0789\u0003\u00acV\u0000\u0789\u078a\u0003\u0134\u009a"+
		"\u0000\u078a\u078c\u0001\u0000\u0000\u0000\u078b\u0783\u0001\u0000\u0000"+
		"\u0000\u078b\u0787\u0001\u0000\u0000\u0000\u078c\u0133\u0001\u0000\u0000"+
		"\u0000\u078d\u078f\u0003\u0164\u00b2\u0000\u078e\u078d\u0001\u0000\u0000"+
		"\u0000\u078e\u078f\u0001\u0000\u0000\u0000\u078f\u0790\u0001\u0000\u0000"+
		"\u0000\u0790\u0791\u0005\t\u0000\u0000\u0791\u0792\u0003\u00acV\u0000"+
		"\u0792\u0135\u0001\u0000\u0000\u0000\u0793\u0795\u0003\u0164\u00b2\u0000"+
		"\u0794\u0793\u0001\u0000\u0000\u0000\u0794\u0795\u0001\u0000\u0000\u0000"+
		"\u0795\u0796\u0001\u0000\u0000\u0000\u0796\u0797\u0005M\u0000\u0000\u0797"+
		"\u0798\u0003\u00acV\u0000\u0798\u0137\u0001\u0000\u0000\u0000\u0799\u07b0"+
		"\u0005\u0080\u0000\u0000\u079a\u07b0\u0005\u0081\u0000\u0000\u079b\u07b0"+
		"\u0005\u0088\u0000\u0000\u079c\u07b0\u0005\u0089\u0000\u0000\u079d\u07b0"+
		"\u0005\u0090\u0000\u0000\u079e\u07b0\u0005\u0091\u0000\u0000\u079f\u07b0"+
		"\u0005Z\u0000\u0000\u07a0\u07b0\u0005(\u0000\u0000\u07a1\u07b0\u0005\u0082"+
		"\u0000\u0000\u07a2\u07b0\u0005\u0083\u0000\u0000\u07a3\u07b0\u0005\u0084"+
		"\u0000\u0000\u07a4\u07b0\u0005\u0085\u0000\u0000\u07a5\u07b0\u0005\u0086"+
		"\u0000\u0000\u07a6\u07b0\u0005\u0087\u0000\u0000\u07a7\u07b0\u0005\u00a1"+
		"\u0000\u0000\u07a8\u07b0\u0003\u017e\u00bf\u0000\u07a9\u07b0\u0005\u0095"+
		"\u0000\u0000\u07aa\u07b0\u0005\u0096\u0000\u0000\u07ab\u07b0\u0005\u008c"+
		"\u0000\u0000\u07ac\u07b0\u0005\u008b\u0000\u0000\u07ad\u07b0\u0005\u0098"+
		"\u0000\u0000\u07ae\u07b0\u0005\u0097\u0000\u0000\u07af\u0799\u0001\u0000"+
		"\u0000\u0000\u07af\u079a\u0001\u0000\u0000\u0000\u07af\u079b\u0001\u0000"+
		"\u0000\u0000\u07af\u079c\u0001\u0000\u0000\u0000\u07af\u079d\u0001\u0000"+
		"\u0000\u0000\u07af\u079e\u0001\u0000\u0000\u0000\u07af\u079f\u0001\u0000"+
		"\u0000\u0000\u07af\u07a0\u0001\u0000\u0000\u0000\u07af\u07a1\u0001\u0000"+
		"\u0000\u0000\u07af\u07a2\u0001\u0000\u0000\u0000\u07af\u07a3\u0001\u0000"+
		"\u0000\u0000\u07af\u07a4\u0001\u0000\u0000\u0000\u07af\u07a5\u0001\u0000"+
		"\u0000\u0000\u07af\u07a6\u0001\u0000\u0000\u0000\u07af\u07a7\u0001\u0000"+
		"\u0000\u0000\u07af\u07a8\u0001\u0000\u0000\u0000\u07af\u07a9\u0001\u0000"+
		"\u0000\u0000\u07af\u07aa\u0001\u0000\u0000\u0000\u07af\u07ab\u0001\u0000"+
		"\u0000\u0000\u07af\u07ac\u0001\u0000\u0000\u0000\u07af\u07ad\u0001\u0000"+
		"\u0000\u0000\u07af\u07ae\u0001\u0000\u0000\u0000\u07b0\u0139\u0001\u0000"+
		"\u0000\u0000\u07b1\u07b2\u0007\r\u0000\u0000\u07b2\u07b3\u0005E\u0000"+
		"\u0000\u07b3\u07b4\u0003\u0004\u0002\u0000\u07b4\u07b5\u0005z\u0000\u0000"+
		"\u07b5\u07b6\u0003\u01ae\u00d7\u0000\u07b6\u07b7\u0005{\u0000\u0000\u07b7"+
		"\u013b\u0001\u0000\u0000\u0000\u07b8\u07b9\u0005~\u0000\u0000\u07b9\u07ba"+
		"\u0005\u0010\u0000\u0000\u07ba\u07bc\u0005z\u0000\u0000\u07bb\u07bd\u0003"+
		"\u0018\f\u0000\u07bc\u07bb\u0001\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000"+
		"\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07bf\u0005{\u0000"+
		"\u0000\u07bf\u013d\u0001\u0000\u0000\u0000\u07c0\u07c3\u0003\u00acV\u0000"+
		"\u07c1\u07c3\u0005\u007f\u0000\u0000\u07c2\u07c0\u0001\u0000\u0000\u0000"+
		"\u07c2\u07c1\u0001\u0000\u0000\u0000\u07c3\u013f\u0001\u0000\u0000\u0000"+
		"\u07c4\u07c5\u0005~\u0000\u0000\u07c5\u07c6\u0003\u00eew\u0000\u07c6\u0141"+
		"\u0001\u0000\u0000\u0000\u07c7\u07cb\u0005v\u0000\u0000\u07c8\u07ca\u0003"+
		"\u0144\u00a2\u0000\u07c9\u07c8\u0001\u0000\u0000\u0000\u07ca\u07cd\u0001"+
		"\u0000\u0000\u0000\u07cb\u07c9\u0001\u0000\u0000\u0000\u07cb\u07cc\u0001"+
		"\u0000\u0000\u0000\u07cc\u07ce\u0001\u0000\u0000\u0000\u07cd\u07cb\u0001"+
		"\u0000\u0000\u0000\u07ce\u07cf\u0005w\u0000\u0000\u07cf\u0143\u0001\u0000"+
		"\u0000\u0000\u07d0\u07d2\u0003\u0164\u00b2\u0000\u07d1\u07d0\u0001\u0000"+
		"\u0000\u0000\u07d1\u07d2\u0001\u0000\u0000\u0000\u07d2\u07d4\u0001\u0000"+
		"\u0000\u0000\u07d3\u07d5\u0003\u0106\u0083\u0000\u07d4\u07d3\u0001\u0000"+
		"\u0000\u0000\u07d4\u07d5\u0001\u0000\u0000\u0000\u07d5\u07e0\u0001\u0000"+
		"\u0000\u0000\u07d6\u07e1\u0003\u010a\u0085\u0000\u07d7\u07d8\u0005*\u0000"+
		"\u0000\u07d8\u07da\u0003\u0004\u0002\u0000\u07d9\u07db\u0003\u0178\u00bc"+
		"\u0000\u07da\u07d9\u0001\u0000\u0000\u0000\u07db\u07dc\u0001\u0000\u0000"+
		"\u0000\u07dc\u07da\u0001\u0000\u0000\u0000\u07dc\u07dd\u0001\u0000\u0000"+
		"\u0000\u07dd\u07de\u0001\u0000\u0000\u0000\u07de\u07df\u0005\u007f\u0000"+
		"\u0000\u07df\u07e1\u0001\u0000\u0000\u0000\u07e0\u07d6\u0001\u0000\u0000"+
		"\u0000\u07e0\u07d7\u0001\u0000\u0000\u0000\u07e1\u0145\u0001\u0000\u0000"+
		"\u0000\u07e2\u07ea\u0003\u0006\u0003\u0000\u07e3\u07e5\u0007\u000e\u0000"+
		"\u0000\u07e4\u07e3\u0001\u0000\u0000\u0000\u07e5\u07e8\u0001\u0000\u0000"+
		"\u0000\u07e6\u07e4\u0001\u0000\u0000\u0000\u07e6\u07e7\u0001\u0000\u0000"+
		"\u0000\u07e7\u07e9\u0001\u0000\u0000\u0000\u07e8\u07e6\u0001\u0000\u0000"+
		"\u0000\u07e9\u07eb\u0003\u0148\u00a4\u0000\u07ea\u07e6\u0001\u0000\u0000"+
		"\u0000\u07eb\u07ec\u0001\u0000\u0000\u0000\u07ec\u07ea\u0001\u0000\u0000"+
		"\u0000\u07ec\u07ed\u0001\u0000\u0000\u0000\u07ed\u0147\u0001\u0000\u0000"+
		"\u0000\u07ee\u07f2\u0005x\u0000\u0000\u07ef\u07f1\u0005}\u0000\u0000\u07f0"+
		"\u07ef\u0001\u0000\u0000\u0000\u07f1\u07f4\u0001\u0000\u0000\u0000\u07f2"+
		"\u07f0\u0001\u0000\u0000\u0000\u07f2\u07f3\u0001\u0000\u0000\u0000\u07f3"+
		"\u07f5\u0001\u0000\u0000\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000\u07f5"+
		"\u07f6\u0005y\u0000\u0000\u07f6\u0149\u0001\u0000\u0000\u0000\u07f7\u0803"+
		"\u0005v\u0000\u0000\u07f8\u07fd\u0003\u0116\u008b\u0000\u07f9\u07fa\u0005"+
		"}\u0000\u0000\u07fa\u07fc\u0003\u0116\u008b\u0000\u07fb\u07f9\u0001\u0000"+
		"\u0000\u0000\u07fc\u07ff\u0001\u0000\u0000\u0000\u07fd\u07fb\u0001\u0000"+
		"\u0000\u0000\u07fd\u07fe\u0001\u0000\u0000\u0000\u07fe\u0801\u0001\u0000"+
		"\u0000\u0000\u07ff\u07fd\u0001\u0000\u0000\u0000\u0800\u0802\u0005}\u0000"+
		"\u0000\u0801\u0800\u0001\u0000\u0000\u0000\u0801\u0802\u0001\u0000\u0000"+
		"\u0000\u0802\u0804\u0001\u0000\u0000\u0000\u0803\u07f8\u0001\u0000\u0000"+
		"\u0000\u0803\u0804\u0001\u0000\u0000\u0000\u0804\u0805\u0001\u0000\u0000"+
		"\u0000\u0805\u0806\u0005w\u0000\u0000\u0806\u014b\u0001\u0000\u0000\u0000"+
		"\u0807\u0808\u0005\u008b\u0000\u0000\u0808\u080d\u0003\u014e\u00a7\u0000"+
		"\u0809\u080a\u0005}\u0000\u0000\u080a\u080c\u0003\u014e\u00a7\u0000\u080b"+
		"\u0809\u0001\u0000\u0000\u0000\u080c\u080f\u0001\u0000\u0000\u0000\u080d"+
		"\u080b\u0001\u0000\u0000\u0000\u080d\u080e\u0001\u0000\u0000\u0000\u080e"+
		"\u0810\u0001\u0000\u0000\u0000\u080f\u080d\u0001\u0000\u0000\u0000\u0810"+
		"\u0811\u0005\u008c\u0000\u0000\u0811\u014d\u0001\u0000\u0000\u0000\u0812"+
		"\u0814\u0003\u0164\u00b2\u0000\u0813\u0812\u0001\u0000\u0000\u0000\u0813"+
		"\u0814\u0001\u0000\u0000\u0000\u0814\u0816\u0001\u0000\u0000\u0000\u0815"+
		"\u0817\u0003\u0150\u00a8\u0000\u0816\u0815\u0001\u0000\u0000\u0000\u0816"+
		"\u0817\u0001\u0000\u0000\u0000\u0817\u0818\u0001\u0000\u0000\u0000\u0818"+
		"\u0819\u0003\u01b4\u00da\u0000\u0819\u014f\u0001\u0000\u0000\u0000\u081a"+
		"\u081b\u0007\u000f\u0000\u0000\u081b\u0151\u0001\u0000\u0000\u0000\u081c"+
		"\u081d\u0005~\u0000\u0000\u081d\u081e\u0003\u00eew\u0000\u081e\u0153\u0001"+
		"\u0000\u0000\u0000\u081f\u0823\u0005v\u0000\u0000\u0820\u0822\u0003\u0156"+
		"\u00ab\u0000\u0821\u0820\u0001\u0000\u0000\u0000\u0822\u0825\u0001\u0000"+
		"\u0000\u0000\u0823\u0821\u0001\u0000\u0000\u0000\u0823\u0824\u0001\u0000"+
		"\u0000\u0000\u0824\u0826\u0001\u0000\u0000\u0000\u0825\u0823\u0001\u0000"+
		"\u0000\u0000\u0826\u0827\u0005w\u0000\u0000\u0827\u0155\u0001\u0000\u0000"+
		"\u0000\u0828\u082a\u0003\u0164\u00b2\u0000\u0829\u0828\u0001\u0000\u0000"+
		"\u0000\u0829\u082a\u0001\u0000\u0000\u0000\u082a\u082c\u0001\u0000\u0000"+
		"\u0000\u082b\u082d\u0005A\u0000\u0000\u082c\u082b\u0001\u0000\u0000\u0000"+
		"\u082c\u082d\u0001\u0000\u0000\u0000\u082d\u0865\u0001\u0000\u0000\u0000"+
		"\u082e\u0830\u0005a\u0000\u0000\u082f\u082e\u0001\u0000\u0000\u0000\u082f"+
		"\u0830\u0001\u0000\u0000\u0000\u0830\u0836\u0001\u0000\u0000\u0000\u0831"+
		"\u0837\u0005L\u0000\u0000\u0832\u0833\u0005L\u0000\u0000\u0833\u0837\u0005"+
		"K\u0000\u0000\u0834\u0835\u0005K\u0000\u0000\u0835\u0837\u0005L\u0000"+
		"\u0000\u0836\u0831\u0001\u0000\u0000\u0000\u0836\u0832\u0001\u0000\u0000"+
		"\u0000\u0836\u0834\u0001\u0000\u0000\u0000\u0836\u0837\u0001\u0000\u0000"+
		"\u0000\u0837\u0838\u0001\u0000\u0000\u0000\u0838\u084c\u0003\u0004\u0002"+
		"\u0000\u0839\u083b\u0003\u01b4\u00da\u0000\u083a\u083c\u0003\u00e8t\u0000"+
		"\u083b\u083a\u0001\u0000\u0000\u0000\u083b\u083c\u0001\u0000\u0000\u0000"+
		"\u083c\u083d\u0001\u0000\u0000\u0000\u083d\u083f\u0005z\u0000\u0000\u083e"+
		"\u0840\u0003\u011e\u008f\u0000\u083f\u083e\u0001\u0000\u0000\u0000\u083f"+
		"\u0840\u0001\u0000\u0000\u0000\u0840\u0841\u0001\u0000\u0000\u0000\u0841"+
		"\u0843\u0005{\u0000\u0000\u0842\u0844\u0003\u00f0x\u0000\u0843\u0842\u0001"+
		"\u0000\u0000\u0000\u0843\u0844\u0001\u0000\u0000\u0000\u0844\u0845\u0001"+
		"\u0000\u0000\u0000\u0845\u0846\u0005\u007f\u0000\u0000\u0846\u084d\u0001"+
		"\u0000\u0000\u0000\u0847\u0848\u0003\u01b4\u00da\u0000\u0848\u0849\u0005"+
		"v\u0000\u0000\u0849\u084a\u0003\u0158\u00ac\u0000\u084a\u084b\u0005w\u0000"+
		"\u0000\u084b\u084d\u0001\u0000\u0000\u0000\u084c\u0839\u0001\u0000\u0000"+
		"\u0000\u084c\u0847\u0001\u0000\u0000\u0000\u084d\u0866\u0001\u0000\u0000"+
		"\u0000\u084e\u0850\u0005a\u0000\u0000\u084f\u084e\u0001\u0000\u0000\u0000"+
		"\u084f\u0850\u0001\u0000\u0000\u0000\u0850\u0851\u0001\u0000\u0000\u0000"+
		"\u0851\u0852\u0005e\u0000\u0000\u0852\u0854\u0003\u01b4\u00da\u0000\u0853"+
		"\u0855\u0003\u00e8t\u0000\u0854\u0853\u0001\u0000\u0000\u0000\u0854\u0855"+
		"\u0001\u0000\u0000\u0000\u0855\u0856\u0001\u0000\u0000\u0000\u0856\u0858"+
		"\u0005z\u0000\u0000\u0857\u0859\u0003\u011e\u008f\u0000\u0858\u0857\u0001"+
		"\u0000\u0000\u0000\u0858\u0859\u0001\u0000\u0000\u0000\u0859\u085a\u0001"+
		"\u0000\u0000\u0000\u085a\u085c\u0005{\u0000\u0000\u085b\u085d\u0003\u00f0"+
		"x\u0000\u085c\u085b\u0001\u0000\u0000\u0000\u085c\u085d\u0001\u0000\u0000"+
		"\u0000\u085d\u085e\u0001\u0000\u0000\u0000\u085e\u085f\u0005\u007f\u0000"+
		"\u0000\u085f\u0866\u0001\u0000\u0000\u0000\u0860\u0861\u0005%\u0000\u0000"+
		"\u0861\u0862\u0003\u0004\u0002\u0000\u0862\u0863\u0003\u01b4\u00da\u0000"+
		"\u0863\u0864\u0005\u007f\u0000\u0000\u0864\u0866\u0001\u0000\u0000\u0000"+
		"\u0865\u082f\u0001\u0000\u0000\u0000\u0865\u084f\u0001\u0000\u0000\u0000"+
		"\u0865\u0860\u0001\u0000\u0000\u0000\u0866\u0157\u0001\u0000\u0000\u0000"+
		"\u0867\u0869\u0003\u0164\u00b2\u0000\u0868\u0867\u0001\u0000\u0000\u0000"+
		"\u0868\u0869\u0001\u0000\u0000\u0000\u0869\u087c\u0001\u0000\u0000\u0000"+
		"\u086a\u086b\u0005/\u0000\u0000\u086b\u0871\u0005\u007f\u0000\u0000\u086c"+
		"\u086e\u0003\u0164\u00b2\u0000\u086d\u086c\u0001\u0000\u0000\u0000\u086d"+
		"\u086e\u0001\u0000\u0000\u0000\u086e\u086f\u0001\u0000\u0000\u0000\u086f"+
		"\u0870\u0005Q\u0000\u0000\u0870\u0872\u0005\u007f\u0000\u0000\u0871\u086d"+
		"\u0001\u0000\u0000\u0000\u0871\u0872\u0001\u0000\u0000\u0000\u0872\u087d"+
		"\u0001\u0000\u0000\u0000\u0873\u0874\u0005Q\u0000\u0000\u0874\u087a\u0005"+
		"\u007f\u0000\u0000\u0875\u0877\u0003\u0164\u00b2\u0000\u0876\u0875\u0001"+
		"\u0000\u0000\u0000\u0876\u0877\u0001\u0000\u0000\u0000\u0877\u0878\u0001"+
		"\u0000\u0000\u0000\u0878\u0879\u0005/\u0000\u0000\u0879\u087b\u0005\u007f"+
		"\u0000\u0000\u087a\u0876\u0001\u0000\u0000\u0000\u087a\u087b\u0001\u0000"+
		"\u0000\u0000\u087b\u087d\u0001\u0000\u0000\u0000\u087c\u086a\u0001\u0000"+
		"\u0000\u0000\u087c\u0873\u0001\u0000\u0000\u0000\u087d\u0159\u0001\u0000"+
		"\u0000\u0000\u087e\u087f\u0005~\u0000\u0000\u087f\u0880\u0003\u0004\u0002"+
		"\u0000\u0880\u015b\u0001\u0000\u0000\u0000\u0881\u088d\u0005v\u0000\u0000"+
		"\u0882\u0887\u0003\u015e\u00af\u0000\u0883\u0884\u0005}\u0000\u0000\u0884"+
		"\u0886\u0003\u015e\u00af\u0000\u0885\u0883\u0001\u0000\u0000\u0000\u0886"+
		"\u0889\u0001\u0000\u0000\u0000\u0887\u0885\u0001\u0000\u0000\u0000\u0887"+
		"\u0888\u0001\u0000\u0000\u0000\u0888\u088b\u0001\u0000\u0000\u0000\u0889"+
		"\u0887\u0001\u0000\u0000\u0000\u088a\u088c\u0005}\u0000\u0000\u088b\u088a"+
		"\u0001\u0000\u0000\u0000\u088b\u088c\u0001\u0000\u0000\u0000\u088c\u088e"+
		"\u0001\u0000\u0000\u0000\u088d\u0882\u0001\u0000\u0000\u0000\u088d\u088e"+
		"\u0001\u0000\u0000\u0000\u088e\u088f\u0001\u0000\u0000\u0000\u088f\u0890"+
		"\u0005w\u0000\u0000\u0890\u015d\u0001\u0000\u0000\u0000\u0891\u0893\u0003"+
		"\u0164\u00b2\u0000\u0892\u0891\u0001\u0000\u0000\u0000\u0892\u0893\u0001"+
		"\u0000\u0000\u0000\u0893\u0894\u0001\u0000\u0000\u0000\u0894\u0897\u0003"+
		"\u01b4\u00da\u0000\u0895\u0896\u0005\u008a\u0000\u0000\u0896\u0898\u0003"+
		"\u001c\u000e\u0000\u0897\u0895\u0001\u0000\u0000\u0000\u0897\u0898\u0001"+
		"\u0000\u0000\u0000\u0898\u015f\u0001\u0000\u0000\u0000\u0899\u089a\u0005"+
		"x\u0000\u0000\u089a\u089b\u0003\u0162\u00b1\u0000\u089b\u089c\u0005~\u0000"+
		"\u0000\u089c\u089e\u0003\u016a\u00b5\u0000\u089d\u089f\u0005}\u0000\u0000"+
		"\u089e\u089d\u0001\u0000\u0000\u0000\u089e\u089f\u0001\u0000\u0000\u0000"+
		"\u089f\u08a0\u0001\u0000\u0000\u0000\u08a0\u08a1\u0005y\u0000\u0000\u08a1"+
		"\u0161\u0001\u0000\u0000\u0000\u08a2\u08a5\u0003\u0192\u00c9\u0000\u08a3"+
		"\u08a5\u0003\u01b4\u00da\u0000\u08a4\u08a2\u0001\u0000\u0000\u0000\u08a4"+
		"\u08a3\u0001\u0000\u0000\u0000\u08a5\u0163\u0001\u0000\u0000\u0000\u08a6"+
		"\u08a8\u0003\u0166\u00b3\u0000\u08a7\u08a6\u0001\u0000\u0000\u0000\u08a8"+
		"\u08a9\u0001\u0000\u0000\u0000\u08a9\u08a7\u0001\u0000\u0000\u0000\u08a9"+
		"\u08aa\u0001\u0000\u0000\u0000\u08aa\u0165\u0001\u0000\u0000\u0000\u08ab"+
		"\u08af\u0005x\u0000\u0000\u08ac\u08ad\u0003\u0168\u00b4\u0000\u08ad\u08ae"+
		"\u0005~\u0000\u0000\u08ae\u08b0\u0001\u0000\u0000\u0000\u08af\u08ac\u0001"+
		"\u0000\u0000\u0000\u08af\u08b0\u0001\u0000\u0000\u0000\u08b0\u08b1\u0001"+
		"\u0000\u0000\u0000\u08b1\u08b3\u0003\u016a\u00b5\u0000\u08b2\u08b4\u0005"+
		"}\u0000\u0000\u08b3\u08b2\u0001\u0000\u0000\u0000\u08b3\u08b4\u0001\u0000"+
		"\u0000\u0000\u08b4\u08b5\u0001\u0000\u0000\u0000\u08b5\u08b6\u0005y\u0000"+
		"\u0000\u08b6\u0167\u0001\u0000\u0000\u0000\u08b7\u08ba\u0003\u0192\u00c9"+
		"\u0000\u08b8\u08ba\u0003\u01b4\u00da\u0000\u08b9\u08b7\u0001\u0000\u0000"+
		"\u0000\u08b9\u08b8\u0001\u0000\u0000\u0000\u08ba\u0169\u0001\u0000\u0000"+
		"\u0000\u08bb\u08c0\u0003\u016c\u00b6\u0000\u08bc\u08bd\u0005}\u0000\u0000"+
		"\u08bd\u08bf\u0003\u016c\u00b6\u0000\u08be\u08bc\u0001\u0000\u0000\u0000"+
		"\u08bf\u08c2\u0001\u0000\u0000\u0000\u08c0\u08be\u0001\u0000\u0000\u0000"+
		"\u08c0\u08c1\u0001\u0000\u0000\u0000\u08c1\u016b\u0001\u0000\u0000\u0000"+
		"\u08c2\u08c0\u0001\u0000\u0000\u0000\u08c3\u08d0\u0003\u0002\u0001\u0000"+
		"\u08c4\u08cd\u0005z\u0000\u0000\u08c5\u08ca\u0003\u016e\u00b7\u0000\u08c6"+
		"\u08c7\u0005}\u0000\u0000\u08c7\u08c9\u0003\u016e\u00b7\u0000\u08c8\u08c6"+
		"\u0001\u0000\u0000\u0000\u08c9\u08cc\u0001\u0000\u0000\u0000\u08ca\u08c8"+
		"\u0001\u0000\u0000\u0000\u08ca\u08cb\u0001\u0000\u0000\u0000\u08cb\u08ce"+
		"\u0001\u0000\u0000\u0000\u08cc\u08ca\u0001\u0000\u0000\u0000\u08cd\u08c5"+
		"\u0001\u0000\u0000\u0000\u08cd\u08ce\u0001\u0000\u0000\u0000\u08ce\u08cf"+
		"\u0001\u0000\u0000\u0000\u08cf\u08d1\u0005{\u0000\u0000\u08d0\u08c4\u0001"+
		"\u0000\u0000\u0000\u08d0\u08d1\u0001\u0000\u0000\u0000\u08d1\u016d\u0001"+
		"\u0000\u0000\u0000\u08d2\u08d3\u0003\u01b4\u00da\u0000\u08d3\u08d4\u0005"+
		"~\u0000\u0000\u08d4\u08d6\u0001\u0000\u0000\u0000\u08d5\u08d2\u0001\u0000"+
		"\u0000\u0000\u08d5\u08d6\u0001\u0000\u0000\u0000\u08d6\u08d7\u0001\u0000"+
		"\u0000\u0000\u08d7\u08d8\u0003\u001c\u000e\u0000\u08d8\u016f\u0001\u0000"+
		"\u0000\u0000\u08d9\u08dc\u0003\f\u0006\u0000\u08da\u08dc\u0003\u0014\n"+
		"\u0000\u08db\u08d9\u0001\u0000\u0000\u0000\u08db\u08da\u0001\u0000\u0000"+
		"\u0000\u08dc\u08e1\u0001\u0000\u0000\u0000\u08dd\u08e0\u0003\u0148\u00a4"+
		"\u0000\u08de\u08e0\u0005\u008d\u0000\u0000\u08df\u08dd\u0001\u0000\u0000"+
		"\u0000\u08df\u08de\u0001\u0000\u0000\u0000\u08e0\u08e3\u0001\u0000\u0000"+
		"\u0000\u08e1\u08df\u0001\u0000\u0000\u0000\u08e1\u08e2\u0001\u0000\u0000"+
		"\u0000\u08e2\u08e4\u0001\u0000\u0000\u0000\u08e3\u08e1\u0001\u0000\u0000"+
		"\u0000\u08e4\u08e5\u0005\u0082\u0000\u0000\u08e5\u08e9\u0001\u0000\u0000"+
		"\u0000\u08e6\u08e7\u0005e\u0000\u0000\u08e7\u08e9\u0005\u0082\u0000\u0000"+
		"\u08e8\u08db\u0001\u0000\u0000\u0000\u08e8\u08e6\u0001\u0000\u0000\u0000"+
		"\u08e9\u0171\u0001\u0000\u0000\u0000\u08ea\u08ef\u0003\u0174\u00ba\u0000"+
		"\u08eb\u08ec\u0005}\u0000\u0000\u08ec\u08ee\u0003\u0174\u00ba\u0000\u08ed"+
		"\u08eb\u0001\u0000\u0000\u0000\u08ee\u08f1\u0001\u0000\u0000\u0000\u08ef"+
		"\u08ed\u0001\u0000\u0000\u0000\u08ef\u08f0\u0001\u0000\u0000\u0000\u08f0"+
		"\u0173\u0001\u0000\u0000\u0000\u08f1\u08ef\u0001\u0000\u0000\u0000\u08f2"+
		"\u08f3\u0003\u01b4\u00da\u0000\u08f3\u08f4\u0005\u008a\u0000\u0000\u08f4"+
		"\u08f5\u0003\u0176\u00bb\u0000\u08f5\u0175\u0001\u0000\u0000\u0000\u08f6"+
		"\u08f8\u0005\u0085\u0000\u0000\u08f7\u08f6\u0001\u0000\u0000\u0000\u08f7"+
		"\u08f8\u0001\u0000\u0000\u0000\u08f8\u08f9\u0001\u0000\u0000\u0000\u08f9"+
		"\u08fc\u0003\u001c\u000e\u0000\u08fa\u08fc\u0003\u017a\u00bd\u0000\u08fb"+
		"\u08f7\u0001\u0000\u0000\u0000\u08fb\u08fa\u0001\u0000\u0000\u0000\u08fc"+
		"\u0177\u0001\u0000\u0000\u0000\u08fd\u08fe\u0003\u01b4\u00da\u0000\u08fe"+
		"\u08ff\u0005x\u0000\u0000\u08ff\u0900\u0003\u001c\u000e\u0000\u0900\u0901"+
		"\u0005y\u0000\u0000\u0901\u0179\u0001\u0000\u0000\u0000\u0902\u0903\u0005"+
		"T\u0000\u0000\u0903\u0904\u0003\u0004\u0002\u0000\u0904\u0905\u0005x\u0000"+
		"\u0000\u0905\u0906\u0003\u001c\u000e\u0000\u0906\u0907\u0005y\u0000\u0000"+
		"\u0907\u0920\u0001\u0000\u0000\u0000\u0908\u090a\u0005T\u0000\u0000\u0909"+
		"\u090b\u0003\u0004\u0002\u0000\u090a\u0909\u0001\u0000\u0000\u0000\u090a"+
		"\u090b\u0001\u0000\u0000\u0000\u090b\u090c\u0001\u0000\u0000\u0000\u090c"+
		"\u090e\u0005x\u0000\u0000\u090d\u090f\u0003\u001c\u000e\u0000\u090e\u090d"+
		"\u0001\u0000\u0000\u0000\u090e\u090f\u0001\u0000\u0000\u0000\u090f\u0910"+
		"\u0001\u0000\u0000\u0000\u0910\u0911\u0005y\u0000\u0000\u0911\u0912\u0005"+
		"v\u0000\u0000\u0912\u0917\u0003\u001c\u000e\u0000\u0913\u0914\u0005}\u0000"+
		"\u0000\u0914\u0916\u0003\u001c\u000e\u0000\u0915\u0913\u0001\u0000\u0000"+
		"\u0000\u0916\u0919\u0001\u0000\u0000\u0000\u0917\u0915\u0001\u0000\u0000"+
		"\u0000\u0917\u0918\u0001\u0000\u0000\u0000\u0918\u091b\u0001\u0000\u0000"+
		"\u0000\u0919\u0917\u0001\u0000\u0000\u0000\u091a\u091c\u0005}\u0000\u0000"+
		"\u091b\u091a\u0001\u0000\u0000\u0000\u091b\u091c\u0001\u0000\u0000\u0000"+
		"\u091c\u091d\u0001\u0000\u0000\u0000\u091d\u091e\u0005w\u0000\u0000\u091e"+
		"\u0920\u0001\u0000\u0000\u0000\u091f\u0902\u0001\u0000\u0000\u0000\u091f"+
		"\u0908\u0001\u0000\u0000\u0000\u0920\u017b\u0001\u0000\u0000\u0000\u0921"+
		"\u0922\u0005\u008a\u0000\u0000\u0922\u0923\u0005\u008c\u0000\u0000\u0923"+
		"\u0924\u0004\u00be\u0001\u0001\u0924\u017d\u0001\u0000\u0000\u0000\u0925"+
		"\u0926\u0005\u008c\u0000\u0000\u0926\u0927\u0005\u008c\u0000\u0000\u0927"+
		"\u0928\u0004\u00bf\u0002\u0001\u0928\u017f\u0001\u0000\u0000\u0000\u0929"+
		"\u092a\u0005\u008c\u0000\u0000\u092a\u092b\u0005\u0098\u0000\u0000\u092b"+
		"\u092c\u0004\u00c0\u0003\u0001\u092c\u0181\u0001\u0000\u0000\u0000\u092d"+
		"\u0936\u0003\u0184\u00c2\u0000\u092e\u0936\u0003\u0186\u00c3\u0000\u092f"+
		"\u0936\u0005m\u0000\u0000\u0930\u0936\u0005n\u0000\u0000\u0931\u0936\u0005"+
		"o\u0000\u0000\u0932\u0936\u0005p\u0000\u0000\u0933\u0936\u0005q\u0000"+
		"\u0000\u0934\u0936\u0005B\u0000\u0000\u0935\u092d\u0001\u0000\u0000\u0000"+
		"\u0935\u092e\u0001\u0000\u0000\u0000\u0935\u092f\u0001\u0000\u0000\u0000"+
		"\u0935\u0930\u0001\u0000\u0000\u0000\u0935\u0931\u0001\u0000\u0000\u0000"+
		"\u0935\u0932\u0001\u0000\u0000\u0000\u0935\u0933\u0001\u0000\u0000\u0000"+
		"\u0935\u0934\u0001\u0000\u0000\u0000\u0936\u0183\u0001\u0000\u0000\u0000"+
		"\u0937\u0938\u0007\u0010\u0000\u0000\u0938\u0185\u0001\u0000\u0000\u0000"+
		"\u0939\u093e\u0003\u0188\u00c4\u0000\u093a\u093e\u0003\u018a\u00c5\u0000"+
		"\u093b\u093e\u0005r\u0000\u0000\u093c\u093e\u0005s\u0000\u0000\u093d\u0939"+
		"\u0001\u0000\u0000\u0000\u093d\u093a\u0001\u0000\u0000\u0000\u093d\u093b"+
		"\u0001\u0000\u0000\u0000\u093d\u093c\u0001\u0000\u0000\u0000\u093e\u0187"+
		"\u0001\u0000\u0000\u0000\u093f\u0943\u0005t\u0000\u0000\u0940\u0942\u0003"+
		"\u018c\u00c6\u0000\u0941\u0940\u0001\u0000\u0000\u0000\u0942\u0945\u0001"+
		"\u0000\u0000\u0000\u0943\u0941\u0001\u0000\u0000\u0000\u0943\u0944\u0001"+
		"\u0000\u0000\u0000\u0944\u0946\u0001\u0000\u0000\u0000\u0945\u0943\u0001"+
		"\u0000\u0000\u0000\u0946\u0947\u0005\u00a9\u0000\u0000\u0947\u0189\u0001"+
		"\u0000\u0000\u0000\u0948\u094c\u0005u\u0000\u0000\u0949\u094b\u0003\u018e"+
		"\u00c7\u0000\u094a\u0949\u0001\u0000\u0000\u0000\u094b\u094e\u0001\u0000"+
		"\u0000\u0000\u094c\u094a\u0001\u0000\u0000\u0000\u094c\u094d\u0001\u0000"+
		"\u0000\u0000\u094d\u094f\u0001\u0000\u0000\u0000\u094e\u094c\u0001\u0000"+
		"\u0000\u0000\u094f\u0950\u0005\u00a9\u0000\u0000\u0950\u018b\u0001\u0000"+
		"\u0000\u0000\u0951\u0956\u0003\u0190\u00c8\u0000\u0952\u0956\u0005\u00a5"+
		"\u0000\u0000\u0953\u0956\u0005\u00a7\u0000\u0000\u0954\u0956\u0005\u00aa"+
		"\u0000\u0000\u0955\u0951\u0001\u0000\u0000\u0000\u0955\u0952\u0001\u0000"+
		"\u0000\u0000\u0955\u0953\u0001\u0000\u0000\u0000\u0955\u0954\u0001\u0000"+
		"\u0000\u0000\u0956\u018d\u0001\u0000\u0000\u0000\u0957\u095c\u0003\u0190"+
		"\u00c8\u0000\u0958\u095c\u0005\u00a5\u0000\u0000\u0959\u095c\u0005\u00a8"+
		"\u0000\u0000\u095a\u095c\u0005\u00ab\u0000\u0000\u095b\u0957\u0001\u0000"+
		"\u0000\u0000\u095b\u0958\u0001\u0000\u0000\u0000\u095b\u0959\u0001\u0000"+
		"\u0000\u0000\u095b\u095a\u0001\u0000\u0000\u0000\u095c\u018f\u0001\u0000"+
		"\u0000\u0000\u095d\u0962\u0003\u001c\u000e\u0000\u095e\u095f\u0005}\u0000"+
		"\u0000\u095f\u0961\u0003\u001c\u000e\u0000\u0960\u095e\u0001\u0000\u0000"+
		"\u0000\u0961\u0964\u0001\u0000\u0000\u0000\u0962\u0960\u0001\u0000\u0000"+
		"\u0000\u0962\u0963\u0001\u0000\u0000\u0000\u0963\u096b\u0001\u0000\u0000"+
		"\u0000\u0964\u0962";
	private static final String _serializedATNSegment1 =
		"\u0001\u0000\u0000\u0000\u0965\u0967\u0005~\u0000\u0000\u0966\u0968\u0005"+
		"\u00ad\u0000\u0000\u0967\u0966\u0001\u0000\u0000\u0000\u0968\u0969\u0001"+
		"\u0000\u0000\u0000\u0969\u0967\u0001\u0000\u0000\u0000\u0969\u096a\u0001"+
		"\u0000\u0000\u0000\u096a\u096c\u0001\u0000\u0000\u0000\u096b\u0965\u0001"+
		"\u0000\u0000\u0000\u096b\u096c\u0001\u0000\u0000\u0000\u096c\u0191\u0001"+
		"\u0000\u0000\u0000\u096d\u096e\u0007\u0011\u0000\u0000\u096e\u0193\u0001"+
		"\u0000\u0000\u0000\u096f\u0971\u0007\u0012\u0000\u0000\u0970\u096f\u0001"+
		"\u0000\u0000\u0000\u0970\u0971\u0001\u0000\u0000\u0000\u0971\u0972\u0001"+
		"\u0000\u0000\u0000\u0972\u0973\u0005W\u0000\u0000\u0973\u0975\u0003\u01b4"+
		"\u00da\u0000\u0974\u0976\u0003\u00e8t\u0000\u0975\u0974\u0001\u0000\u0000"+
		"\u0000\u0975\u0976\u0001\u0000\u0000\u0000\u0976\u0978\u0001\u0000\u0000"+
		"\u0000\u0977\u0979\u0003\u0140\u00a0\u0000\u0978\u0977\u0001\u0000\u0000"+
		"\u0000\u0978\u0979\u0001\u0000\u0000\u0000\u0979\u097b\u0001\u0000\u0000"+
		"\u0000\u097a\u097c\u0003\u00f0x\u0000\u097b\u097a\u0001\u0000\u0000\u0000"+
		"\u097b\u097c\u0001\u0000\u0000\u0000\u097c\u097d\u0001\u0000\u0000\u0000"+
		"\u097d\u097f\u0003\u0142\u00a1\u0000\u097e\u0980\u0005\u007f\u0000\u0000"+
		"\u097f\u097e\u0001\u0000\u0000\u0000\u097f\u0980\u0001\u0000\u0000\u0000"+
		"\u0980\u0195\u0001\u0000\u0000\u0000\u0981\u0982\u00056\u0000\u0000\u0982"+
		"\u0984\u0003\u01b4\u00da\u0000\u0983\u0985\u0003\u014c\u00a6\u0000\u0984"+
		"\u0983\u0001\u0000\u0000\u0000\u0984\u0985\u0001\u0000\u0000\u0000\u0985"+
		"\u0987\u0001\u0000\u0000\u0000\u0986\u0988\u0003\u0152\u00a9\u0000\u0987"+
		"\u0986\u0001\u0000\u0000\u0000\u0987\u0988\u0001\u0000\u0000\u0000\u0988"+
		"\u098a\u0001\u0000\u0000\u0000\u0989\u098b\u0003\u00f0x\u0000\u098a\u0989"+
		"\u0001\u0000\u0000\u0000\u098a\u098b\u0001\u0000\u0000\u0000\u098b\u098c"+
		"\u0001\u0000\u0000\u0000\u098c\u098e\u0003\u00fc~\u0000\u098d\u098f\u0005"+
		"\u007f\u0000\u0000\u098e\u098d\u0001\u0000\u0000\u0000\u098e\u098f\u0001"+
		"\u0000\u0000\u0000\u098f\u0197\u0001\u0000\u0000\u0000\u0990\u0991\u0005"+
		"#\u0000\u0000\u0991\u0993\u0003\u01b4\u00da\u0000\u0992\u0994\u0003\u015a"+
		"\u00ad\u0000\u0993\u0992\u0001\u0000\u0000\u0000\u0993\u0994\u0001\u0000"+
		"\u0000\u0000\u0994\u0995\u0001\u0000\u0000\u0000\u0995\u0997\u0003\u015c"+
		"\u00ae\u0000\u0996\u0998\u0005\u007f\u0000\u0000\u0997\u0996\u0001\u0000"+
		"\u0000\u0000\u0997\u0998\u0001\u0000\u0000\u0000\u0998\u0199\u0001\u0000"+
		"\u0000\u0000\u0999\u099a\u0005\u001d\u0000\u0000\u099a\u099b\u0003\u0118"+
		"\u008c\u0000\u099b\u099d\u0003\u01b4\u00da\u0000\u099c\u099e\u0003\u014c"+
		"\u00a6\u0000\u099d\u099c\u0001\u0000\u0000\u0000\u099d\u099e\u0001\u0000"+
		"\u0000\u0000\u099e\u099f\u0001\u0000\u0000\u0000\u099f\u09a1\u0005z\u0000"+
		"\u0000\u09a0\u09a2\u0003\u011e\u008f\u0000\u09a1\u09a0\u0001\u0000\u0000"+
		"\u0000\u09a1\u09a2\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001\u0000\u0000"+
		"\u0000\u09a3\u09a5\u0005{\u0000\u0000\u09a4\u09a6\u0003\u00f0x\u0000\u09a5"+
		"\u09a4\u0001\u0000\u0000\u0000\u09a5\u09a6\u0001\u0000\u0000\u0000\u09a6"+
		"\u09a7\u0001\u0000\u0000\u0000\u09a7\u09a8\u0005\u007f\u0000\u0000\u09a8"+
		"\u019b\u0001\u0000\u0000\u0000\u09a9\u09aa\u0005%\u0000\u0000\u09aa\u09b3"+
		"\u0003\u0004\u0002\u0000\u09ab\u09ac\u0003\u0112\u0089\u0000\u09ac\u09ad"+
		"\u0005\u007f\u0000\u0000\u09ad\u09b4\u0001\u0000\u0000\u0000\u09ae\u09af"+
		"\u0003\u011a\u008d\u0000\u09af\u09b0\u0005v\u0000\u0000\u09b0\u09b1\u0003"+
		"\u0132\u0099\u0000\u09b1\u09b2\u0005w\u0000\u0000\u09b2\u09b4\u0001\u0000"+
		"\u0000\u0000\u09b3\u09ab\u0001\u0000\u0000\u0000\u09b3\u09ae\u0001\u0000"+
		"\u0000\u0000\u09b4\u019d\u0001\u0000\u0000\u0000\u09b5\u09b6\u0003\u0112"+
		"\u0089\u0000\u09b6\u09b7\u0005\u007f\u0000\u0000\u09b7\u019f\u0001\u0000"+
		"\u0000\u0000\u09b8\u09c6\u0003\u011a\u008d\u0000\u09b9\u09ba\u0005v\u0000"+
		"\u0000\u09ba\u09bb\u0003\u0128\u0094\u0000\u09bb\u09c0\u0005w\u0000\u0000"+
		"\u09bc\u09bd\u0005\u008a\u0000\u0000\u09bd\u09be\u0003\u0116\u008b\u0000"+
		"\u09be\u09bf\u0005\u007f\u0000\u0000\u09bf\u09c1\u0001\u0000\u0000\u0000"+
		"\u09c0\u09bc\u0001\u0000\u0000\u0000\u09c0\u09c1\u0001\u0000\u0000\u0000"+
		"\u09c1\u09c7\u0001\u0000\u0000\u0000\u09c2\u09c3\u0003\u017c\u00be\u0000"+
		"\u09c3\u09c4\u0003L&\u0000\u09c4\u09c5\u0005\u007f\u0000\u0000\u09c5\u09c7"+
		"\u0001\u0000\u0000\u0000\u09c6\u09b9\u0001\u0000\u0000\u0000\u09c6\u09c2"+
		"\u0001\u0000\u0000\u0000\u09c7\u01a1\u0001\u0000\u0000\u0000\u09c8\u09c9"+
		"\u0005\u0019\u0000\u0000\u09c9\u09ca\u0003\u0004\u0002\u0000\u09ca\u09cb"+
		"\u0003\u010e\u0087\u0000\u09cb\u09cc\u0005\u007f\u0000\u0000\u09cc\u01a3"+
		"\u0001\u0000\u0000\u0000\u09cd\u09ce\u0005\u0089\u0000\u0000\u09ce\u09cf"+
		"\u0003\u01b4\u00da\u0000\u09cf\u09d0\u0005z\u0000\u0000\u09d0\u09d1\u0005"+
		"{\u0000\u0000\u09d1\u09d2\u0003\u013e\u009f\u0000\u09d2\u01a5\u0001\u0000"+
		"\u0000\u0000\u09d3\u09d4\u0003\u01b4\u00da\u0000\u09d4\u09d6\u0005z\u0000"+
		"\u0000\u09d5\u09d7\u0003\u011e\u008f\u0000\u09d6\u09d5\u0001\u0000\u0000"+
		"\u0000\u09d6\u09d7\u0001\u0000\u0000\u0000\u09d7\u09d8\u0001\u0000\u0000"+
		"\u0000\u09d8\u09da\u0005{\u0000\u0000\u09d9\u09db\u0003\u013c\u009e\u0000"+
		"\u09da\u09d9\u0001\u0000\u0000\u0000\u09da\u09db\u0001\u0000\u0000\u0000"+
		"\u09db\u09dc\u0001\u0000\u0000\u0000\u09dc\u09dd\u0003\u013e\u009f\u0000"+
		"\u09dd\u01a7\u0001\u0000\u0000\u0000\u09de\u09e0\u0003\u01aa\u00d5\u0000"+
		"\u09df\u09e1\u0003\u00e8t\u0000\u09e0\u09df\u0001\u0000\u0000\u0000\u09e0"+
		"\u09e1\u0001\u0000\u0000\u0000\u09e1\u09e2\u0001\u0000\u0000\u0000\u09e2"+
		"\u09e4\u0005z\u0000\u0000\u09e3\u09e5\u0003\u011e\u008f\u0000\u09e4\u09e3"+
		"\u0001\u0000\u0000\u0000\u09e4\u09e5\u0001\u0000\u0000\u0000\u09e5\u09e6"+
		"\u0001\u0000\u0000\u0000\u09e6\u09e8\u0005{\u0000\u0000\u09e7\u09e9\u0003"+
		"\u00f0x\u0000\u09e8\u09e7\u0001\u0000\u0000\u0000\u09e8\u09e9\u0001\u0000"+
		"\u0000\u0000\u09e9\u09ef\u0001\u0000\u0000\u0000\u09ea\u09f0\u0003\u011c"+
		"\u008e\u0000\u09eb\u09ec\u0003\u017c\u00be\u0000\u09ec\u09ed\u0003L&\u0000"+
		"\u09ed\u09ee\u0005\u007f\u0000\u0000\u09ee\u09f0\u0001\u0000\u0000\u0000"+
		"\u09ef\u09ea\u0001\u0000\u0000\u0000\u09ef\u09eb\u0001\u0000\u0000\u0000"+
		"\u09f0\u01a9\u0001\u0000\u0000\u0000\u09f1\u09f7\u0003\u01b4\u00da\u0000"+
		"\u09f2\u09f3\u0003\u01b4\u00da\u0000\u09f3\u09f4\u0005\u008e\u0000\u0000"+
		"\u09f4\u09f5\u0003\u01b4\u00da\u0000\u09f5\u09f7\u0001\u0000\u0000\u0000"+
		"\u09f6\u09f1\u0001\u0000\u0000\u0000\u09f6\u09f2\u0001\u0000\u0000\u0000"+
		"\u09f7\u09ff\u0001\u0000\u0000\u0000\u09f8\u09fa\u0003\u0016\u000b\u0000"+
		"\u09f9\u09f8\u0001\u0000\u0000\u0000\u09f9\u09fa\u0001\u0000\u0000\u0000"+
		"\u09fa\u09fb\u0001\u0000\u0000\u0000\u09fb\u09fc\u0005|\u0000\u0000\u09fc"+
		"\u09fe\u0003\u01b4\u00da\u0000\u09fd\u09f9\u0001\u0000\u0000\u0000\u09fe"+
		"\u0a01\u0001\u0000\u0000\u0000\u09ff\u09fd\u0001\u0000\u0000\u0000\u09ff"+
		"\u0a00\u0001\u0000\u0000\u0000\u0a00\u01ab\u0001\u0000\u0000\u0000\u0a01"+
		"\u09ff\u0001\u0000\u0000\u0000\u0a02\u0a03\u0005E\u0000\u0000\u0a03\u0a04"+
		"\u0003\u0138\u009c\u0000\u0a04\u0a06\u0005z\u0000\u0000\u0a05\u0a07\u0005"+
		"4\u0000\u0000\u0a06\u0a05\u0001\u0000\u0000\u0000\u0a06\u0a07\u0001\u0000"+
		"\u0000\u0000\u0a07\u0a08\u0001\u0000\u0000\u0000\u0a08\u0a0e\u0003\u01ae"+
		"\u00d7\u0000\u0a09\u0a0b\u0005}\u0000\u0000\u0a0a\u0a0c\u00054\u0000\u0000"+
		"\u0a0b\u0a0a\u0001\u0000\u0000\u0000\u0a0b\u0a0c\u0001\u0000\u0000\u0000"+
		"\u0a0c\u0a0d\u0001\u0000\u0000\u0000\u0a0d\u0a0f\u0003\u01ae\u00d7\u0000"+
		"\u0a0e\u0a09\u0001\u0000\u0000\u0000\u0a0e\u0a0f\u0001\u0000\u0000\u0000"+
		"\u0a0f\u0a10\u0001\u0000\u0000\u0000\u0a10\u0a16\u0005{\u0000\u0000\u0a11"+
		"\u0a17\u0003\u013e\u009f\u0000\u0a12\u0a13\u0003\u017c\u00be\u0000\u0a13"+
		"\u0a14\u0003L&\u0000\u0a14\u0a15\u0005\u007f\u0000\u0000\u0a15\u0a17\u0001"+
		"\u0000\u0000\u0000\u0a16\u0a11\u0001\u0000\u0000\u0000\u0a16\u0a12\u0001"+
		"\u0000\u0000\u0000\u0a17\u01ad\u0001\u0000\u0000\u0000\u0a18\u0a19\u0003"+
		"\u0004\u0002\u0000\u0a19\u0a1c\u0003\u01b4\u00da\u0000\u0a1a\u0a1b\u0005"+
		"\u008a\u0000\u0000\u0a1b\u0a1d\u0003\u001c\u000e\u0000\u0a1c\u0a1a\u0001"+
		"\u0000\u0000\u0000\u0a1c\u0a1d\u0001\u0000\u0000\u0000\u0a1d\u01af\u0001"+
		"\u0000\u0000\u0000\u0a1e\u0a20\u0005z\u0000\u0000\u0a1f\u0a21\u0003\u0018"+
		"\f\u0000\u0a20\u0a1f\u0001\u0000\u0000\u0000\u0a20\u0a21\u0001\u0000\u0000"+
		"\u0000\u0a21\u0a22\u0001\u0000\u0000\u0000\u0a22\u0a23\u0005{\u0000\u0000"+
		"\u0a23\u01b1\u0001\u0000\u0000\u0000\u0a24\u0a26\u0005z\u0000\u0000\u0a25"+
		"\u0a27\u0003\u0018\f\u0000\u0a26\u0a25\u0001\u0000\u0000\u0000\u0a26\u0a27"+
		"\u0001\u0000\u0000\u0000\u0a27\u0a28\u0001\u0000\u0000\u0000\u0a28\u0a2a"+
		"\u0005{\u0000\u0000\u0a29\u0a2b\u0003Z-\u0000\u0a2a\u0a29\u0001\u0000"+
		"\u0000\u0000\u0a2a\u0a2b\u0001\u0000\u0000\u0000\u0a2b\u01b3\u0001\u0000"+
		"\u0000\u0000\u0a2c\u0a4e\u0005k\u0000\u0000\u0a2d\u0a4e\u0005\t\u0000"+
		"\u0000\u0a2e\u0a4e\u0005\n\u0000\u0000\u0a2f\u0a4e\u0005\u000b\u0000\u0000"+
		"\u0a30\u0a4e\u0005\r\u0000\u0000\u0a31\u0a4e\u0005\u000e\u0000\u0000\u0a32"+
		"\u0a4e\u0005\u000f\u0000\u0000\u0a33\u0a4e\u0005\u0013\u0000\u0000\u0a34"+
		"\u0a36\u0003\u0104\u0082\u0000\u0a35\u0a34\u0001\u0000\u0000\u0000\u0a36"+
		"\u0a37\u0001\u0000\u0000\u0000\u0a37\u0a35\u0001\u0000\u0000\u0000\u0a37"+
		"\u0a38\u0001\u0000\u0000\u0000\u0a38\u0a4e\u0001\u0000\u0000\u0000\u0a39"+
		"\u0a4e\u0005\u001e\u0000\u0000\u0a3a\u0a4e\u0005!\u0000\u0000\u0a3b\u0a4e"+
		"\u0005$\u0000\u0000\u0a3c\u0a4e\u0005.\u0000\u0000\u0a3d\u0a4e\u0005/"+
		"\u0000\u0000\u0a3e\u0a4e\u00051\u0000\u0000\u0a3f\u0a4e\u00058\u0000\u0000"+
		"\u0a40\u0a4e\u0005:\u0000\u0000\u0a41\u0a4e\u0005;\u0000\u0000\u0a42\u0a4e"+
		"\u0005?\u0000\u0000\u0a43\u0a4e\u0005D\u0000\u0000\u0a44\u0a4e\u0005F"+
		"\u0000\u0000\u0a45\u0a4e\u0005M\u0000\u0000\u0a46\u0a4e\u0005P\u0000\u0000"+
		"\u0a47\u0a4e\u0005Q\u0000\u0000\u0a48\u0a4e\u0005`\u0000\u0000\u0a49\u0a4e"+
		"\u0005d\u0000\u0000\u0a4a\u0a4e\u0005g\u0000\u0000\u0a4b\u0a4e\u0005h"+
		"\u0000\u0000\u0a4c\u0a4e\u0005j\u0000\u0000\u0a4d\u0a2c\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a2d\u0001\u0000\u0000\u0000\u0a4d\u0a2e\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a2f\u0001\u0000\u0000\u0000\u0a4d\u0a30\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a31\u0001\u0000\u0000\u0000\u0a4d\u0a32\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a33\u0001\u0000\u0000\u0000\u0a4d\u0a35\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a39\u0001\u0000\u0000\u0000\u0a4d\u0a3a\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a3b\u0001\u0000\u0000\u0000\u0a4d\u0a3c\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a3d\u0001\u0000\u0000\u0000\u0a4d\u0a3e\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a3f\u0001\u0000\u0000\u0000\u0a4d\u0a40\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a41\u0001\u0000\u0000\u0000\u0a4d\u0a42\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a43\u0001\u0000\u0000\u0000\u0a4d\u0a44\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a45\u0001\u0000\u0000\u0000\u0a4d\u0a46\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a47\u0001\u0000\u0000\u0000\u0a4d\u0a48\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a49\u0001\u0000\u0000\u0000\u0a4d\u0a4a\u0001\u0000\u0000"+
		"\u0000\u0a4d\u0a4b\u0001\u0000\u0000\u0000\u0a4d\u0a4c\u0001\u0000\u0000"+
		"\u0000\u0a4e\u01b5\u0001\u0000\u0000\u0000\u0156\u01b7\u01ba\u01bd\u01c2"+
		"\u01c6\u01c9\u01cf\u01d2\u01d7\u01db\u01e2\u01e4\u01ec\u01f4\u01fa\u01fe"+
		"\u0203\u020d\u0215\u021f\u0225\u0228\u022d\u0230\u0236\u023b\u0245\u0252"+
		"\u025a\u0260\u0262\u0269\u0271\u0279\u0281\u0289\u0291\u029b\u029d\u02a3"+
		"\u02a8\u02b0\u02b8\u02c0\u02c2\u02c5\u02cc\u02d1\u02d8\u02dc\u02de\u02f6"+
		"\u02ff\u0304\u0308\u0310\u0313\u0318\u031c\u0320\u0326\u0333\u0339\u0345"+
		"\u0349\u034e\u0352\u0358\u0360\u0369\u037b\u037e\u0383\u0386\u0395\u039b"+
		"\u039f\u03a5\u03aa\u03ad\u03b5\u03bd\u03c8\u03cd\u03d2\u03d4\u03dd\u03e5"+
		"\u03ec\u03f4\u03f8\u0401\u0406\u0408\u0411\u0419\u041d\u0422\u0424\u0429"+
		"\u042d\u0434\u043c\u043e\u0442\u0445\u0448\u0450\u045a\u046b\u0472\u0476"+
		"\u0480\u0485\u048c\u0495\u049a\u04a1\u04ad\u04b8\u04c0\u04c5\u04ce\u04d8"+
		"\u04e1\u04e7\u04ec\u04f0\u04f4\u04f8\u04fc\u0503\u050b\u0518\u0522\u0538"+
		"\u053c\u0540\u0545\u0559\u055e\u0563\u056a\u056d\u0583\u058f\u0593\u059b"+
		"\u05a5\u05ac\u05b0\u05b5\u05b8\u05bd\u05c5\u05ca\u05d1\u05d7\u05df\u05e7"+
		"\u05ea\u05f1\u05f8\u05fc\u05ff\u0605\u0609\u060f\u061d\u0623\u062a\u062f"+
		"\u0632\u0635\u063c\u0646\u065c\u0661\u0665\u0668\u066b\u0671\u0677\u067f"+
		"\u0685\u068f\u0697\u069d\u06a8\u06ac\u06ae\u06b3\u06ba\u06c3\u06ca\u06cd"+
		"\u06d0\u06d4\u06d7\u06dc\u06e3\u06f0\u06f9\u0700\u070a\u0711\u071d\u0723"+
		"\u0727\u072b\u0731\u0737\u0739\u0740\u0744\u0747\u074b\u0750\u0757\u075a"+
		"\u075f\u0764\u0766\u0769\u076c\u0772\u0775\u077e\u0781\u078b\u078e\u0794"+
		"\u07af\u07bc\u07c2\u07cb\u07d1\u07d4\u07dc\u07e0\u07e6\u07ec\u07f2\u07fd"+
		"\u0801\u0803\u080d\u0813\u0816\u0823\u0829\u082c\u082f\u0836\u083b\u083f"+
		"\u0843\u084c\u084f\u0854\u0858\u085c\u0865\u0868\u086d\u0871\u0876\u087a"+
		"\u087c\u0887\u088b\u088d\u0892\u0897\u089e\u08a4\u08a9\u08af\u08b3\u08b9"+
		"\u08c0\u08ca\u08cd\u08d0\u08d5\u08db\u08df\u08e1\u08e8\u08ef\u08f7\u08fb"+
		"\u090a\u090e\u0917\u091b\u091f\u0935\u093d\u0943\u094c\u0955\u095b\u0962"+
		"\u0969\u096b\u0970\u0975\u0978\u097b\u097f\u0984\u0987\u098a\u098e\u0993"+
		"\u0997\u099d\u09a1\u09a5\u09b3\u09c0\u09c6\u09d6\u09da\u09e0\u09e4\u09e8"+
		"\u09ef\u09f6\u09f9\u09ff\u0a06\u0a0b\u0a0e\u0a16\u0a1c\u0a20\u0a26\u0a2a"+
		"\u0a37\u0a4d";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}