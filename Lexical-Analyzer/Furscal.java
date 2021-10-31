/* Furscal.java */
/* Generated By:JavaCC: Do not edit this line. Furscal.java */
/** Simple brace matcher. */
public class Furscal implements FurscalConstants {
  /** Main entry point. */
  public static void main(String args[]) throws ParseException, TokenMgrError
  {
    Furscal parser = new Furscal(System.in);
    parser.Input();
  }

/** Parser/Syntax analyzer specification! */
/** Root production. */
/** This only checks that there are no errors. 
 * It outputs nothing, except errors if any.
*/
  static final public void Input() throws ParseException {Token t;
  int ID_counter = 0;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case TYPE:
      case INTDEF:
      case DECIMALDEF:
      case BOOLDEF:
      case CHARDEF:
      case STRINGDEF:
      case DATEDEF:
      case TIMEDEF:
      case DATETIMEDEF:
      case ARR:
      case MATRIX:
      case ARRAYSETDEF:
      case CONSTANT:
      case NULL:
      case GLOBAL:
      case ARITHMETICOPERATOR:
      case POWER:
      case POSTFIXINC:
      case POSTFIXDEC:
      case MODULUS:
      case ASSIGN:
      case SHIFTLEFT:
      case SHIFTRIGHT:
      case RELATIONALOPERATOR:
      case LOGICALOPERATOR:
      case FUNCTIONDECLARE:
      case RETURN:
      case QUESTION:
      case DEFAULT_:
      case LOOP:
      case LOOPCOUNTER:
      case LOOPUNTIL:
      case LOOPTESTBEFORE:
      case LOOPTESTAFTER:
      case SHOW:
      case CLEAR:
      case EXIT:
      case TYPEOF:
      case HALT:
      case PROCEED:
      case CLASSDECLARE:
      case OBJECTDECLARE:
      case SELF:
      case PASSALL:
      case CHECK:
      case ONERROR:
      case AFTERALL:
      case REQUIRE:
      case FROM:
      case LINE_END:
      case SEPARATOR:
      case PARENTHESIS_LEFT:
      case PARENTHESIS_RIGHT:
      case SQUARE_LEFT:
      case SQUARE_RIGHT:
      case BRACKET_LEFT:
      case BRACKET_RIGHT:
      case PROCEDURE:
      case SET:
      case SET_OPERATIONS:
      case SET_COMPARISONS:
      case MATH_CONSTANTS:
      case TRIG_FUNCTIONS:
      case ASSIGN_OPERATORS:
      case ARITHMETIC_FUNCTIONS:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:{
        t = jj_consume_token(COMMENT);
System.out.println("<COMMENT>: " + t.image);
        break;
        }
      case TYPE:{
        t = jj_consume_token(TYPE);
System.out.println("<TYPE>: " + t.image);
        break;
        }
      case INTDEF:{
        t = jj_consume_token(INTDEF);
System.out.println("<INTDEF>: " + t.image);
        break;
        }
      case DECIMALDEF:{
        t = jj_consume_token(DECIMALDEF);
System.out.println("<DECIMALDEF>: " + t.image);
        break;
        }
      case BOOLDEF:{
        t = jj_consume_token(BOOLDEF);
System.out.println("<BOOLDEF>: " + t.image);
        break;
        }
      case CHARDEF:{
        t = jj_consume_token(CHARDEF);
System.out.println("<CHARDEF>: " + t.image);
        break;
        }
      case STRINGDEF:{
        t = jj_consume_token(STRINGDEF);
System.out.println("<STRINGDEF>: " + t.image);
        break;
        }
      case TIMEDEF:{
        t = jj_consume_token(TIMEDEF);
System.out.println("<TIMEDEF>: " + t.image);
        break;
        }
      case DATEDEF:{
        t = jj_consume_token(DATEDEF);
System.out.println("<DATEDEF>: " + t.image);
        break;
        }
      case DATETIMEDEF:{
        t = jj_consume_token(DATETIMEDEF);
System.out.println("<DATETIMEDEF>: " + t.image);
        break;
        }
      case ARR:{
        t = jj_consume_token(ARR);
System.out.println("<ARR>: " + t.image);
        break;
        }
      case MATRIX:{
        t = jj_consume_token(MATRIX);
System.out.println("<MATRIX>: " + t.image);
        break;
        }
      case ARRAYSETDEF:{
        t = jj_consume_token(ARRAYSETDEF);
System.out.println("<ARRAYSETDEF>: " + t.image);
        break;
        }
      case CONSTANT:{
        t = jj_consume_token(CONSTANT);
System.out.println("<CONSTANT>: " + t.image);
        break;
        }
      case NULL:{
        t = jj_consume_token(NULL);
System.out.println("<NULL>: " + t.image);
        break;
        }
      case GLOBAL:{
        t = jj_consume_token(GLOBAL);
System.out.println("<GLOBAL>: " + t.image);
        break;
        }
      case ARITHMETICOPERATOR:{
        t = jj_consume_token(ARITHMETICOPERATOR);
System.out.println("<ARITHMETICOPERATOR>: " + t.image);
        break;
        }
      case POWER:{
        t = jj_consume_token(POWER);
System.out.println("<POWER>: " + t.image);
        break;
        }
      case POSTFIXINC:{
        t = jj_consume_token(POSTFIXINC);
System.out.println("<POSTFIXINC>: " + t.image);
        break;
        }
      case POSTFIXDEC:{
        t = jj_consume_token(POSTFIXDEC);
System.out.println("<POSTFIXDEC>: " + t.image);
        break;
        }
      case MODULUS:{
        t = jj_consume_token(MODULUS);
System.out.println("<MODULUS>: " + t.image);
        break;
        }
      case ASSIGN:{
        t = jj_consume_token(ASSIGN);
System.out.println("<ASSIGN>: " + t.image);
        break;
        }
      case SHIFTLEFT:{
        t = jj_consume_token(SHIFTLEFT);
System.out.println("<SHIFTLEFT>: " + t.image);
        break;
        }
      case SHIFTRIGHT:{
        t = jj_consume_token(SHIFTRIGHT);
System.out.println("<SHIFTRIGHT>: " + t.image);
        break;
        }
      case RELATIONALOPERATOR:{
        t = jj_consume_token(RELATIONALOPERATOR);
System.out.println("<RELATIONALOPERATOR>: " + t.image);
        break;
        }
      case LOGICALOPERATOR:{
        t = jj_consume_token(LOGICALOPERATOR);
System.out.println("<LOGICALOPERATOR>: " + t.image);
        break;
        }
      case FUNCTIONDECLARE:{
        t = jj_consume_token(FUNCTIONDECLARE);
System.out.println("<FUNCTIONDECLARE>: " + t.image);
        break;
        }
      case RETURN:{
        t = jj_consume_token(RETURN);
System.out.println("<RETURN>: " + t.image);
        break;
        }
      case QUESTION:{
        t = jj_consume_token(QUESTION);
System.out.println("<QUESTION>: " + t.image);
        break;
        }
      case DEFAULT_:{
        t = jj_consume_token(DEFAULT_);
System.out.println("<DEFAULT_>: " + t.image);
        break;
        }
      case LOOP:{
        t = jj_consume_token(LOOP);
System.out.println("<LOOP>: " + t.image);
        break;
        }
      case LOOPCOUNTER:{
        t = jj_consume_token(LOOPCOUNTER);
System.out.println("<LOOPCOUNTER>: " + t.image);
        break;
        }
      case LOOPUNTIL:{
        t = jj_consume_token(LOOPUNTIL);
System.out.println("<LOOPUNTIL>: " + t.image);
        break;
        }
      case LOOPTESTAFTER:{
        t = jj_consume_token(LOOPTESTAFTER);
System.out.println("<LOOPTESTAFTER>: " + t.image);
        break;
        }
      case LOOPTESTBEFORE:{
        t = jj_consume_token(LOOPTESTBEFORE);
System.out.println("<LOOPTESTBEFORE>: " + t.image);
        break;
        }
      case SHOW:{
        t = jj_consume_token(SHOW);
System.out.println("<SHOW>: " + t.image);
        break;
        }
      case CLEAR:{
        t = jj_consume_token(CLEAR);
System.out.println("<CLEAR>: " + t.image);
        break;
        }
      case EXIT:{
        t = jj_consume_token(EXIT);
System.out.println("<EXIT>: " + t.image);
        break;
        }
      case TYPEOF:{
        t = jj_consume_token(TYPEOF);
System.out.println("<TYPEOF>: " + t.image);
        break;
        }
      case HALT:{
        t = jj_consume_token(HALT);
System.out.println("<HALT>: " + t.image);
        break;
        }
      case PROCEED:{
        t = jj_consume_token(PROCEED);
System.out.println("<PROCEED>: " + t.image);
        break;
        }
      case CLASSDECLARE:{
        //t = <CALLING>
              //{
                //System.out.println("<CALLING>: " + t.image);
              //}
            //|
            t = jj_consume_token(CLASSDECLARE);
System.out.println("<CLASSDECLARE>: " + t.image);
        break;
        }
      case OBJECTDECLARE:{
        t = jj_consume_token(OBJECTDECLARE);
System.out.println("<OBJECTDECLARE>: " + t.image);
        break;
        }
      case SELF:{
        t = jj_consume_token(SELF);
System.out.println("<SELF>: " + t.image);
        break;
        }
      case PASSALL:{
        t = jj_consume_token(PASSALL);
System.out.println("<PASSALL>: " + t.image);
        break;
        }
      case CHECK:{
        t = jj_consume_token(CHECK);
System.out.println("<CHECK>: " + t.image);
        break;
        }
      case ONERROR:{
        t = jj_consume_token(ONERROR);
System.out.println("<ONERROR>: " + t.image);
        break;
        }
      case AFTERALL:{
        t = jj_consume_token(AFTERALL);
System.out.println("<AFTERALLL>: " + t.image);
        break;
        }
      case REQUIRE:{
        t = jj_consume_token(REQUIRE);
System.out.println("<REQUIRE>: " + t.image);
        break;
        }
      case FROM:{
        t = jj_consume_token(FROM);
System.out.println("<FROM>: " + t.image);
        break;
        }
      case LINE_END:{
        t = jj_consume_token(LINE_END);
System.out.println("<LINE_END>: " + t.image);
        break;
        }
      case SEPARATOR:{
        t = jj_consume_token(SEPARATOR);
System.out.println("<SEPARATOR>: " + t.image);
        break;
        }
      case PARENTHESIS_LEFT:{
        t = jj_consume_token(PARENTHESIS_LEFT);
System.out.println("<PARENTHESIS_LEFT>: " + t.image);
        break;
        }
      case PARENTHESIS_RIGHT:{
        t = jj_consume_token(PARENTHESIS_RIGHT);
System.out.println("<PARENTHESIS_RIGHT>: " + t.image);
        break;
        }
      case SQUARE_LEFT:{
        t = jj_consume_token(SQUARE_LEFT);
System.out.println("<SQUARE_LEFT>: " + t.image);
        break;
        }
      case SQUARE_RIGHT:{
        t = jj_consume_token(SQUARE_RIGHT);
System.out.println("<SQUARE_RIGHT>: " + t.image);
        break;
        }
      case BRACKET_LEFT:{
        t = jj_consume_token(BRACKET_LEFT);
System.out.println("<BRACKET_LEFT>: " + t.image);
        break;
        }
      case BRACKET_RIGHT:{
        t = jj_consume_token(BRACKET_RIGHT);
System.out.println("<BRACKET_RIGHT>: " + t.image);
        break;
        }
      case PROCEDURE:{
        t = jj_consume_token(PROCEDURE);
System.out.println("<PROCEDURE>: " + t.image);
        break;
        }
      case SET:{
        t = jj_consume_token(SET);
System.out.println("<SET>: " + t.image);
        break;
        }
      case SET_OPERATIONS:{
        t = jj_consume_token(SET_OPERATIONS);
System.out.println("<SET_OPERATIONS>: " + t.image);
        break;
        }
      case SET_COMPARISONS:{
        t = jj_consume_token(SET_COMPARISONS);
System.out.println("<SET_COMPARISONS>: " + t.image);
        break;
        }
      case MATH_CONSTANTS:{
        t = jj_consume_token(MATH_CONSTANTS);
System.out.println("<MATH_CONSTANTS>: " + t.image);
        break;
        }
      case TRIG_FUNCTIONS:{
        t = jj_consume_token(TRIG_FUNCTIONS);
System.out.println("<TRIG_FUNCTIONS>: " + t.image);
        break;
        }
      case ASSIGN_OPERATORS:{
        t = jj_consume_token(ASSIGN_OPERATORS);
System.out.println("<ASSIGN_OPERATORS>: " + t.image);
        break;
        }
      case ARITHMETIC_FUNCTIONS:{
        t = jj_consume_token(ARITHMETIC_FUNCTIONS);
System.out.println("<ARITHMETIC_FUNCTIONS>: " + t.image);
        break;
        }
      case ID:{
        t = jj_consume_token(ID);
System.out.println("<ID>: " + t.image + " " + "(" + ID_counter + ")");
      ID_counter++;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
System.out.println("\nNo invalid strings found.");
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public FurscalTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xffffffc0,0xffffffc0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0xffffffff,0xffffffff,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x4ff,0x4ff,};
	}

  /** Constructor with InputStream. */
  public Furscal(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Furscal(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new FurscalTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Furscal(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new FurscalTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new FurscalTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Furscal(FurscalTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(FurscalTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[75];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 2; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		   if ((jj_la1_2[i] & (1<<j)) != 0) {
			 la1tokens[64+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 75; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
