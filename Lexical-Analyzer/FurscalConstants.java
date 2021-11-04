/* Generated By:JavaCC: Do not edit this line. FurscalConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface FurscalConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT = 6;
  /** RegularExpression Id. */
  int TYPE = 7;
  /** RegularExpression Id. */
  int INTDEF = 8;
  /** RegularExpression Id. */
  int DECIMALDEF = 9;
  /** RegularExpression Id. */
  int BOOLDEF = 10;
  /** RegularExpression Id. */
  int CHARDEF = 11;
  /** RegularExpression Id. */
  int STRINGDEF = 12;
  /** RegularExpression Id. */
  int DATEDEF = 13;
  /** RegularExpression Id. */
  int TIMEDEF = 14;
  /** RegularExpression Id. */
  int DATETIMEDEF = 15;
  /** RegularExpression Id. */
  int ARR = 16;
  /** RegularExpression Id. */
  int MATRIX = 17;
  /** RegularExpression Id. */
  int ARRAYSETDEF = 18;
  /** RegularExpression Id. */
  int CONSTANT = 19;
  /** RegularExpression Id. */
  int NULL = 20;
  /** RegularExpression Id. */
  int GLOBAL = 21;
  /** RegularExpression Id. */
  int ARITHMETICOPERATOR = 22;
  /** RegularExpression Id. */
  int POWER = 23;
  /** RegularExpression Id. */
  int POSTFIXINC = 24;
  /** RegularExpression Id. */
  int POSTFIXDEC = 25;
  /** RegularExpression Id. */
  int MODULUS = 26;
  /** RegularExpression Id. */
  int ASSIGN = 27;
  /** RegularExpression Id. */
  int SHIFTLEFT = 28;
  /** RegularExpression Id. */
  int SHIFTRIGHT = 29;
  /** RegularExpression Id. */
  int RELATIONALOPERATOR = 30;
  /** RegularExpression Id. */
  int LOGICALOPERATOR = 31;
  /** RegularExpression Id. */
  int FUNCTIONDECLARE = 32;
  /** RegularExpression Id. */
  int RETURN = 33;
  /** RegularExpression Id. */
  int QUESTION = 34;
  /** RegularExpression Id. */
  int DEFAULT_ = 35;
  /** RegularExpression Id. */
  int LOOP = 36;
  /** RegularExpression Id. */
  int LOOPCOUNTER = 37;
  /** RegularExpression Id. */
  int LOOPUNTIL = 38;
  /** RegularExpression Id. */
  int LOOPTESTBEFORE = 39;
  /** RegularExpression Id. */
  int LOOPTESTAFTER = 40;
  /** RegularExpression Id. */
  int SHOW = 41;
  /** RegularExpression Id. */
  int CLEAR = 42;
  /** RegularExpression Id. */
  int EXIT = 43;
  /** RegularExpression Id. */
  int TYPEOF = 44;
  /** RegularExpression Id. */
  int HALT = 45;
  /** RegularExpression Id. */
  int PROCEED = 46;
  /** RegularExpression Id. */
  int CLASSDECLARE = 47;
  /** RegularExpression Id. */
  int OBJECTDECLARE = 48;
  /** RegularExpression Id. */
  int SELF = 49;
  /** RegularExpression Id. */
  int PASSALL = 50;
  /** RegularExpression Id. */
  int CHECK = 51;
  /** RegularExpression Id. */
  int ONERROR = 52;
  /** RegularExpression Id. */
  int AFTERALL = 53;
  /** RegularExpression Id. */
  int REQUIRE = 54;
  /** RegularExpression Id. */
  int FROM = 55;
  /** RegularExpression Id. */
  int LINE_END = 56;
  /** RegularExpression Id. */
  int SEPARATOR = 57;
  /** RegularExpression Id. */
  int PARENTHESIS_LEFT = 58;
  /** RegularExpression Id. */
  int PARENTHESIS_RIGHT = 59;
  /** RegularExpression Id. */
  int SQUARE_LEFT = 60;
  /** RegularExpression Id. */
  int SQUARE_RIGHT = 61;
  /** RegularExpression Id. */
  int BRACKET_LEFT = 62;
  /** RegularExpression Id. */
  int BRACKET_RIGHT = 63;
  /** RegularExpression Id. */
  int PROCEDURE = 64;
  /** RegularExpression Id. */
  int SET = 65;
  /** RegularExpression Id. */
  int SET_OPERATIONS = 66;
  /** RegularExpression Id. */
  int SET_COMPARISONS = 67;
  /** RegularExpression Id. */
  int MATH_CONSTANTS = 68;
  /** RegularExpression Id. */
  int TRIG_FUNCTIONS = 69;
  /** RegularExpression Id. */
  int ASSIGN_OPERATORS = 70;
  /** RegularExpression Id. */
  int ARITHMETIC_FUNCTIONS = 71;
  /** RegularExpression Id. */
  int ARRMETHODS = 72;
  /** RegularExpression Id. */
  int HELP = 73;
  /** RegularExpression Id. */
  int VERSION = 74;
  /** RegularExpression Id. */
  int EMPTY = 75;
  /** RegularExpression Id. */
  int MATRIX_FUNCTIONS = 76;
  /** RegularExpression Id. */
  int COMPLEX = 77;
  /** RegularExpression Id. */
  int COMPLEX_FUNCTIONS = 78;
  /** RegularExpression Id. */
  int DIGIT = 79;
  /** RegularExpression Id. */
  int LETTER = 80;
  /** RegularExpression Id. */
  int ID = 81;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\t\"",
    "<COMMENT>",
    "<TYPE>",
    "<INTDEF>",
    "<DECIMALDEF>",
    "<BOOLDEF>",
    "<CHARDEF>",
    "<STRINGDEF>",
    "<DATEDEF>",
    "<TIMEDEF>",
    "<DATETIMEDEF>",
    "\"arr\"",
    "\"matrix\"",
    "<ARRAYSETDEF>",
    "\"const\"",
    "\"null\"",
    "\"global\"",
    "<ARITHMETICOPERATOR>",
    "\"**\"",
    "\"++\"",
    "\"--\"",
    "\"%\"",
    "\":=\"",
    "\"<<\"",
    "\">>\"",
    "<RELATIONALOPERATOR>",
    "<LOGICALOPERATOR>",
    "\"def\"",
    "\"return\"",
    "\"inquire\"",
    "<DEFAULT_>",
    "\"perform\"",
    "\"times\"",
    "\"until\"",
    "\"with test before\"",
    "\"with test after\"",
    "<SHOW>",
    "<CLEAR>",
    "\"exit\"",
    "\"typeof\"",
    "\"halt\"",
    "\"proceed\"",
    "\"class\"",
    "\"summon\"",
    "\"self\"",
    "\"pass\"",
    "\"check\"",
    "\"onError\"",
    "\"after all\"",
    "\"require\"",
    "\"from\"",
    "\";\"",
    "\",\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"procedure\"",
    "\"set\"",
    "<SET_OPERATIONS>",
    "<SET_COMPARISONS>",
    "<MATH_CONSTANTS>",
    "<TRIG_FUNCTIONS>",
    "<ASSIGN_OPERATORS>",
    "<ARITHMETIC_FUNCTIONS>",
    "<ARRMETHODS>",
    "\"--help\"",
    "\"--version\"",
    "\"empty\"",
    "<MATRIX_FUNCTIONS>",
    "\"complex\"",
    "<COMPLEX_FUNCTIONS>",
    "<DIGIT>",
    "<LETTER>",
    "<ID>",
  };

}
