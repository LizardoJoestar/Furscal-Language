/* Furscal.java */
/* Generated By:JavaCC: Do not edit this line. Furscal.java */
import java.util.ArrayList;
import java.util.List;

public class Furscal implements FurscalConstants {
  /** Main entry point. */
  public static void main(String args[]) throws ParseException, TokenMgrError
  {
    Furscal parser = new Furscal(System.in);
    parser.Start();
  }

/** PARSER/GRAMMAR/SYNTAX SPECIFICATION */
/** BEGINS HERE */

/** Root production. */
  static final public 
void Start() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case TYPE:
      case STRINGDEF:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case FUNCTIONDECLARE:
      case LOOP:
      case SHOW:
      case CLASSDECLARE:
      case CHECK:
      case FROM:
      case SQUARE_LEFT:
      case SET:
      case MATH_CONSTANTS:
      case TRIG_FUNCTIONS:
      case ARITHMETIC_FUNCTIONS:
      case COMPLEX:
      case OBJECT:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Expression();
    }
    jj_consume_token(0);
}

  static final public void Expression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FROM:{
      Imports();
      break;
      }
    case CLASSDECLARE:{
      Inst_Class();
      break;
      }
    case FUNCTIONDECLARE:{
      Inst_Function();
      break;
      }
    case LOOP:{
      Inst_Loop();
      break;
      }
    case CHECK:{
      Inst_Check();
      break;
      }
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case SET:
    case COMPLEX:
    case OBJECT:
    case ID:{
      Inst_ID();
      break;
      }
    case SHOW:{
      Inst_Show();
      break;
      }
    case COMMENT:{
      Term_Comment();
      break;
      }
    case MATH_CONSTANTS:
    case TRIG_FUNCTIONS:
    case ARITHMETIC_FUNCTIONS:{
      Math_Reference();
      Term_LineEnd();
      break;
      }
    case SQUARE_LEFT:{
      Array_JS();
      break;
      }
    case STRINGDEF:{
      Index_Smalltalk();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

// Furscal instructions
  static final public void Imports() throws ParseException {
    Term_From();
    Term_ID();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case REQUIRE:{
      Term_Require();
      Term_ID();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    Term_LineEnd();
}

  static final public void Inst_Class() throws ParseException {
    Term_ClassDeclare();
    Term_ID();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PARENTHESIS_LEFT:{
      Term_ParLeft();
      Term_ID();
      Term_ParRight();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    Term_BracketLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PASSALL:{
      Term_PassAll();
      Term_LineEnd();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SELF:{
          ;
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          break label_2;
        }
        Term_Self();
        Term_Type();
        Term_ID();
        Term_Assign();
        Type_Def();
        Term_LineEnd();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case TYPE:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case FUNCTIONDECLARE:
      case LOOP:
      case SHOW:
      case CHECK:
      case SET:
      case COMPLEX:
      case OBJECT:
      case ID:{
        Block_Class();
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        ;
      }
    }
    Term_BracketRight();
    Term_LineEnd();
}

  static final public void Inst_Function() throws ParseException {
    Term_FuncDeclare();
    Term_ID();
    Term_ParLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:
    case DECIMALDEF:
    case STRINGDEF:
    case ID:{
      Args();
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    Term_ParRight();
    Term_BracketLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMENT:
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case LOOP:
    case SHOW:
    case CHECK:
    case SET:
    case COMPLEX:
    case OBJECT:
    case ID:{
      Block();
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    Term_BracketRight();
    Term_LineEnd();
}

  static final public void Inst_Loop() throws ParseException {
    Term_Perform();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      Term_LoopCounter();
      break;
      }
    case LOOPTESTBEFORE:{
      Term_LoopTestBefore();
      Term_LoopUntil();
      Term_ParLeft();
      Condition();
      Term_ParRight();
      break;
      }
    case LOOPTESTAFTER:{
      Term_LoopTestAfter();
      Term_LoopUntil();
      Term_ParLeft();
      Condition();
      Term_ParRight();
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    Term_BracketLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMENT:
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case LOOP:
    case SHOW:
    case CHECK:
    case SET:
    case COMPLEX:
    case OBJECT:
    case ID:{
      Block();
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    Term_BracketRight();
    Term_LineEnd();
}

  static final public void Inst_Check() throws ParseException {
    Term_Check();
    Term_BracketLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMENT:
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case LOOP:
    case SHOW:
    case CHECK:
    case SET:
    case COMPLEX:
    case OBJECT:
    case ID:{
      Block();
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    Term_BracketRight();
    Term_OnError();
    Term_ParLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:
    case DECIMALDEF:
    case STRINGDEF:
    case ID:{
      Args();
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    Term_ParRight();
    Term_BracketLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMENT:
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case LOOP:
    case SHOW:
    case CHECK:
    case SET:
    case COMPLEX:
    case OBJECT:
    case ID:{
      Block();
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    Term_BracketRight();
    Term_LineEnd();
}

  static final public void Inst_Object() throws ParseException {
    Term_ObjDeclare();
    Term_ID();
    Term_ParLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:
    case DECIMALDEF:
    case STRINGDEF:
    case ID:{
      Args();
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      ;
    }
    Term_ParRight();
}

  static final public void Inst_ID() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TYPE:
    case ARR:
    case MATRIX:
    case CONSTANT:
    case GLOBAL:
    case SET:
    case COMPLEX:
    case OBJECT:{
      Inst_Tags();
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    Term_ID();
    Property_Alt();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ASSIGN:
    case ASSIGN_OPERATORS:{
      Inst_Assign();
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ID:{
      Term_ID();
      Property_Alt();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    Term_LineEnd();
}

  static final public void Inst_Tags() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONSTANT:
    case GLOBAL:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case GLOBAL:{
        Term_Global();
        break;
        }
      case CONSTANT:{
        Term_Const();
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TYPE:{
      Term_Type();
      break;
      }
    case ARR:{
      Term_Arr();
      break;
      }
    case MATRIX:{
      Term_Matrix();
      break;
      }
    case SET:{
      Term_Set();
      break;
      }
    case COMPLEX:{
      Term_Complex();
      break;
      }
    case OBJECT:{
      Term_Obj();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Inst_Assign() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ASSIGN:{
      Term_Assign();
      break;
      }
    case ASSIGN_OPERATORS:{
      Term_AssignOp();
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:
    case DECIMALDEF:
    case BOOLDEF:
    case CHARDEF:
    case STRINGDEF:
    case DATEDEF:
    case TIMEDEF:
    case DATETIMEDEF:
    case ARRAYSETDEF:
    case OBJECTDECLARE:
    case PARENTHESIS_LEFT:
    case MATH_CONSTANTS:
    case TRIG_FUNCTIONS:
    case ARITHMETIC_FUNCTIONS:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTDEF:
      case DECIMALDEF:
      case BOOLDEF:
      case CHARDEF:
      case STRINGDEF:
      case DATEDEF:
      case TIMEDEF:
      case DATETIMEDEF:
      case ARRAYSETDEF:{
        Type_Def();
        break;
        }
      case PARENTHESIS_LEFT:{
        Complex_Def();
        break;
        }
      case OBJECTDECLARE:{
        Inst_Object();
        break;
        }
      case MATH_CONSTANTS:
      case TRIG_FUNCTIONS:
      case ARITHMETIC_FUNCTIONS:{
        Math_Reference();
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      ;
    }
}

  static final public void Inst_Show() throws ParseException {
    Term_Show();
    Term_ParLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ID:{
      Term_ID();
      Property_Complex_Func();
      break;
      }
    case STRINGDEF:{
      Term_StrDef();
      break;
      }
    case DATEDEF:{
      Term_DateDef();
      break;
      }
    case TIMEDEF:{
      Term_TimeDef();
      break;
      }
    case DATETIMEDEF:{
      Term_DateTimeDef();
      break;
      }
    case PARENTHESIS_LEFT:{
      Complex_Def();
      Property_Complex_Func();
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    Term_ParRight();
    Term_LineEnd();
}

// Non-Furscal instructions

// General
  static final public void Property_Alt() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 83:{
      jj_consume_token(83);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SET_OPERATIONS:{
        Inst_Set_Ops();
        break;
        }
      case ARRMETHODS:{
        Arr_Funcs_JS();
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      ;
    }
}

// Python
  static final public void Math_Reference() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MATH_CONSTANTS:{
      Term_Math_Const();
      break;
      }
    case TRIG_FUNCTIONS:
    case ARITHMETIC_FUNCTIONS:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ARITHMETIC_FUNCTIONS:{
        Term_Arithmetic_Func();
        break;
        }
      case TRIG_FUNCTIONS:{
        Term_Trig_Func();
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term_ParLeft();
      Args();
      Term_ParRight();
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

// Python
  static final public void Inst_Set_Ops() throws ParseException {
    Term_Set_Ops();
    Term_ParLeft();
    Term_ID();
    jj_consume_token(SEPARATOR);
    Term_ID();
    Term_ParRight();
}

// Javascript
  static final public void Array_JS() throws ParseException {
    Term_SquareLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:
    case DECIMALDEF:
    case STRINGDEF:
    case ID:{
      Args();
      break;
      }
    default:
      jj_la1[29] = jj_gen;
      ;
    }
    Term_SquareRight();
    Term_LineEnd();
}

// Javascript
  static final public void Arr_Funcs_JS() throws ParseException {
    Term_Arr_Func();
    Term_ParLeft();
    Term_ParRight();
}

// Smalltalk
  static final public void Index_Smalltalk() throws ParseException {
    Term_StrDef();
    jj_consume_token(84);
    Term_CharDef();
    jj_consume_token(85);
    Term_IntDef();
}

// Special non-terminals, for ease of maintenance and understanding
  static final public 
void Args() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ID:{
      Term_ID();
      break;
      }
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    case STRINGDEF:{
      Term_StrDef();
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEPARATOR:{
        ;
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        break label_3;
      }
      jj_consume_token(SEPARATOR);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        Term_ID();
        break;
        }
      case INTDEF:{
        Term_IntDef();
        break;
        }
      case DECIMALDEF:{
        Term_DecDef();
        break;
        }
      case STRINGDEF:{
        Term_StrDef();
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  static final public void Block_Class() throws ParseException {
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TYPE:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case SET:
      case COMPLEX:
      case OBJECT:
      case ID:{
        Inst_ID();
        break;
        }
      case LOOP:{
        Inst_Loop();
        break;
        }
      case CHECK:{
        Inst_Check();
        break;
        }
      case FUNCTIONDECLARE:{
        Inst_Function();
        break;
        }
      case SHOW:{
        Inst_Show();
        break;
        }
      case COMMENT:{
        Term_Comment();
        break;
        }
      default:
        jj_la1[33] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case TYPE:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case FUNCTIONDECLARE:
      case LOOP:
      case SHOW:
      case CHECK:
      case SET:
      case COMPLEX:
      case OBJECT:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[34] = jj_gen;
        break label_4;
      }
    }
}

  static final public void Block() throws ParseException {
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TYPE:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case SET:
      case COMPLEX:
      case OBJECT:
      case ID:{
        Inst_ID();
        break;
        }
      case LOOP:{
        Inst_Loop();
        break;
        }
      case CHECK:{
        Inst_Check();
        break;
        }
      case SHOW:{
        Inst_Show();
        break;
        }
      case COMMENT:{
        Term_Comment();
        break;
        }
      default:
        jj_la1[35] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case TYPE:
      case ARR:
      case MATRIX:
      case CONSTANT:
      case GLOBAL:
      case LOOP:
      case SHOW:
      case CHECK:
      case SET:
      case COMPLEX:
      case OBJECT:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[36] = jj_gen;
        break label_5;
      }
    }
}

  static final public void Condition() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    case STRINGDEF:{
      Term_StrDef();
      break;
      }
    case ID:{
      Term_ID();
      break;
      }
    default:
      jj_la1[37] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case RELATIONALOPERATOR:{
      Term_RelOp();
      break;
      }
    case LOGICALOPERATOR:{
      Term_LogicOp();
      break;
      }
    default:
      jj_la1[38] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    case STRINGDEF:{
      Term_StrDef();
      break;
      }
    case ID:{
      Term_ID();
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Complex_Def() throws ParseException {
    Term_ParLeft();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    default:
      jj_la1[40] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(SEPARATOR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    default:
      jj_la1[41] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    Term_ParRight();
}

  static final public void Property_Complex_Func() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 86:{
      jj_consume_token(86);
      Term_ComplexFunc();
      break;
      }
    default:
      jj_la1[42] = jj_gen;
      ;
    }
}

  static final public void Type_Def() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTDEF:{
      Term_IntDef();
      break;
      }
    case DECIMALDEF:{
      Term_DecDef();
      break;
      }
    case BOOLDEF:{
      Term_BoolDef();
      break;
      }
    case CHARDEF:{
      Term_CharDef();
      break;
      }
    case STRINGDEF:{
      Term_StrDef();
      break;
      }
    case DATEDEF:{
      Term_DateDef();
      break;
      }
    case TIMEDEF:{
      Term_TimeDef();
      break;
      }
    case DATETIMEDEF:{
      Term_DateTimeDef();
      break;
      }
    case ARRAYSETDEF:{
      Term_ArraySetDef();
      break;
      }
    default:
      jj_la1[43] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

// Terminal BNFs (TOKENs), for easier maintenance
  static final public 
void Term_Comment() throws ParseException {Token t;
    t = jj_consume_token(COMMENT);
System.out.println("<COMMENT>: ");
}

  static final public void Term_From() throws ParseException {Token t;
    t = jj_consume_token(FROM);
System.out.println("<FROM>: ");
}

  static final public void Term_ID() throws ParseException {Token t;
    t = jj_consume_token(ID);
System.out.println("<ID>: ");
}

  static final public void Term_Require() throws ParseException {Token t;
    t = jj_consume_token(REQUIRE);
System.out.println("<REQUIRE>: ");
}

  static final public void Term_LineEnd() throws ParseException {Token t;
    t = jj_consume_token(LINE_END);
System.out.println("<LINE_END>: ");
}

  static final public void Term_ClassDeclare() throws ParseException {Token t;
    t = jj_consume_token(CLASSDECLARE);
System.out.println("<CLASSDECLARE>: ");
}

  static final public void Term_ParLeft() throws ParseException {Token t;
    t = jj_consume_token(PARENTHESIS_LEFT);
System.out.println("<PARENTHESIS_LEFT>: ");
}

  static final public void Term_ParRight() throws ParseException {Token t;
    t = jj_consume_token(PARENTHESIS_RIGHT);
System.out.println("<PARENTHESIS_RIGHT>: ");
}

  static final public void Term_BracketLeft() throws ParseException {Token t;
    t = jj_consume_token(BRACKET_LEFT);
System.out.println("<BRACKET_LEFT>: ");
}

  static final public void Term_BracketRight() throws ParseException {Token t;
    t = jj_consume_token(BRACKET_RIGHT);
System.out.println("<BRACKET_RIGHT>: ");
}

  static final public void Term_Self() throws ParseException {Token t;
    t = jj_consume_token(SELF);
System.out.println("<SELF>: ");
}

  static final public void Term_Type() throws ParseException {Token t;
    t = jj_consume_token(TYPE);
System.out.println("<TYPE>: " + t.image);
}

  static final public void Term_Assign() throws ParseException {Token t;
    t = jj_consume_token(ASSIGN);
System.out.println("<ASSIGN>: ");
}

  static final public void Term_PassAll() throws ParseException {Token t;
    t = jj_consume_token(PASSALL);
System.out.println("<PASSALL>: ");
}

  static final public void Term_FuncDeclare() throws ParseException {Token t;
    t = jj_consume_token(FUNCTIONDECLARE);
System.out.println("<FUNCTIONDECLARE>: ");
}

  static final public void Term_IntDef() throws ParseException {Token t;
    t = jj_consume_token(INTDEF);
System.out.println("<INTDEF>: ");
}

  static final public void Term_DecDef() throws ParseException {Token t;
    t = jj_consume_token(DECIMALDEF);
System.out.println("<DECIMALDEF>: ");
}

  static final public void Term_StrDef() throws ParseException {Token t;
    t = jj_consume_token(STRINGDEF);
System.out.println("<STRINGDEF>: ");
}

  static final public void Term_Perform() throws ParseException {Token t;
    t = jj_consume_token(LOOP);
System.out.println("<LOOP>: ");
}

  static final public void Term_LoopCounter() throws ParseException {Token t;
    t = jj_consume_token(LOOPCOUNTER);
System.out.println("<LOOPCOUNTER>: ");
}

  static final public void Term_LoopTestBefore() throws ParseException {Token t;
    t = jj_consume_token(LOOPTESTBEFORE);
System.out.println("<LOOPTESTBEFORE>: ");
}

  static final public void Term_LoopTestAfter() throws ParseException {Token t;
    t = jj_consume_token(LOOPTESTAFTER);
System.out.println("<LOOPTESTAFTER>: ");
}

  static final public void Term_LoopUntil() throws ParseException {Token t;
    t = jj_consume_token(LOOPUNTIL);
System.out.println("<LOOPUNTIL>: ");
}

  static final public void Term_RelOp() throws ParseException {Token t;
    t = jj_consume_token(RELATIONALOPERATOR);
System.out.println("<RELATIONALOPERATOR>: ");
}

  static final public void Term_LogicOp() throws ParseException {Token t;
    t = jj_consume_token(LOGICALOPERATOR);
System.out.println("<LOGICALOPERATOR>: ");
}

  static final public void Term_Check() throws ParseException {Token t;
    t = jj_consume_token(CHECK);
System.out.println("<CHECK>: ");
}

  static final public void Term_OnError() throws ParseException {Token t;
    t = jj_consume_token(ONERROR);
System.out.println("<ONERROR>: ");
}

  static final public void Term_ObjDeclare() throws ParseException {Token t;
    t = jj_consume_token(OBJECTDECLARE);
System.out.println("<OBJECTDECLARE>: ");
}

  static final public void Term_Complex() throws ParseException {Token t;
    t = jj_consume_token(COMPLEX);
System.out.println("<COMPLEX>: ");
}

  static final public void Term_ComplexFunc() throws ParseException {Token t;
    t = jj_consume_token(COMPLEX_FUNCTIONS);
System.out.println("<COMPLEX_FUNCTIONS>: " + t.image);
}

  static final public void Term_Global() throws ParseException {Token t;
    t = jj_consume_token(GLOBAL);
System.out.println("<GLOBAL>: ");
}

  static final public void Term_Const() throws ParseException {Token t;
    t = jj_consume_token(CONSTANT);
System.out.println("<CONSTANT>: ");
}

  static final public void Term_Arr() throws ParseException {Token t;
    t = jj_consume_token(ARR);
System.out.println("<ARR>: ");
}

  static final public void Term_Matrix() throws ParseException {Token t;
    t = jj_consume_token(MATRIX);
System.out.println("<MATRIX>: ");
}

  static final public void Term_Set() throws ParseException {Token t;
    t = jj_consume_token(SET);
System.out.println("<SET>: ");
}

  static final public void Term_AssignOp() throws ParseException {Token t;
    t = jj_consume_token(ASSIGN_OPERATORS);
System.out.println("<ASSIGN_OPERATORS>: " + t.image);
}

  static final public void Term_BoolDef() throws ParseException {Token t;
    t = jj_consume_token(BOOLDEF);
System.out.println("<BOOLDEF>: ");
}

  static final public void Term_CharDef() throws ParseException {Token t;
    t = jj_consume_token(CHARDEF);
System.out.println("<CHARDEF>: ");
}

  static final public void Term_DateDef() throws ParseException {Token t;
    t = jj_consume_token(DATEDEF);
System.out.println("<DATEDEF>: ");
}

  static final public void Term_TimeDef() throws ParseException {Token t;
    t = jj_consume_token(TIMEDEF);
System.out.println("<TIMEDEF>: ");
}

  static final public void Term_DateTimeDef() throws ParseException {Token t;
    t = jj_consume_token(DATETIMEDEF);
System.out.println("<DATETIMEDEF>: ");
}

  static final public void Term_ArraySetDef() throws ParseException {Token t;
    t = jj_consume_token(ARRAYSETDEF);
System.out.println("<ARRAYSETDEF>: ");
}

  static final public void Term_Show() throws ParseException {Token t;
    t = jj_consume_token(SHOW);
System.out.println("<SHOW>: " + t.image);
}

  static final public void Term_Math_Const() throws ParseException {Token t;
    t = jj_consume_token(MATH_CONSTANTS);
System.out.println("<MATH_CONSTANTS>: " + t.image);
}

  static final public void Term_Arithmetic_Func() throws ParseException {Token t;
    t = jj_consume_token(ARITHMETIC_FUNCTIONS);
System.out.println("<ARITHMETIC_FUNCTIONS>: " + t.image);
}

  static final public void Term_Trig_Func() throws ParseException {Token t;
    t = jj_consume_token(TRIG_FUNCTIONS);
System.out.println("<TRIG_FUNCTIONS>: " + t.image);
}

  static final public void Term_Set_Ops() throws ParseException {Token t;
    t = jj_consume_token(SET_OPERATIONS);
System.out.println("<SET_OPERATIONS>: " + t.image);
}

  static final public void Term_Arr_Func() throws ParseException {Token t;
    t = jj_consume_token(ARRMETHODS);
System.out.println("<ARRMETHODS>: " + t.image);
}

  static final public void Term_SquareLeft() throws ParseException {Token t;
    t = jj_consume_token(SQUARE_LEFT);
System.out.println("<SQUARE_LEFT>: ");
}

  static final public void Term_SquareRight() throws ParseException {Token t;
    t = jj_consume_token(SQUARE_RIGHT);
System.out.println("<SQUARE_RIGHT>: ");
}

  static final public void Term_Obj() throws ParseException {Token t;
    t = jj_consume_token(OBJECT);
System.out.println("<OBJECT>: ");
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
  static final private int[] jj_la1 = new int[44];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x2b10c0,0x2b10c0,0x0,0x0,0x0,0x2b00c0,0x0,0x1300,0x2b00c0,0x100,0x2b00c0,0x2b00c0,0x1300,0x2b00c0,0x1300,0x2b0080,0x8000000,0x0,0x280000,0x280000,0x30080,0x8000000,0x4ff00,0x4ff00,0xf000,0x0,0x0,0x0,0x0,0x1300,0x1300,0x0,0x1300,0x2b00c0,0x2b00c0,0x2b00c0,0x2b00c0,0x1300,0xc0000000,0x1300,0x300,0x300,0x0,0x4ff00,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x10888211,0x10888211,0x400000,0x4000000,0x20000,0x80211,0x40000,0x0,0x80210,0x180,0x80210,0x80210,0x0,0x80210,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4010000,0x4010000,0x4000000,0x0,0x0,0x0,0x0,0x0,0x0,0x2000000,0x0,0x80211,0x80211,0x80210,0x80210,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x4a0b2,0x4a0b2,0x0,0x0,0x0,0x4a002,0x0,0x40000,0x4a002,0x0,0x4a002,0x4a002,0x40000,0x4a002,0x40000,0xa002,0x40,0x40000,0x0,0x0,0xa002,0x40,0xb0,0xb0,0x40000,0x104,0x80000,0xa0,0xb0,0x40000,0x40000,0x0,0x40000,0x4a002,0x4a002,0x4a002,0x4a002,0x40000,0x0,0x40000,0x0,0x0,0x400000,0x0,};
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
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(FurscalTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 44; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[87];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 44; i++) {
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
	 for (int i = 0; i < 87; i++) {
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
