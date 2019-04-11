
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package cup.example;

import java_cup.runtime.*;
import cup.example.Lexer;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\005\000\002\002\004\000\002\002" +
    "\004\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\005\000\002\003\004\000" +
    "\002\003\005\000\002\003\003\000\002\003\010\000\002" +
    "\003\006\000\002\003\006\000\002\003\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\024\005\011\006\004\011\015\013\016\014" +
    "\005\015\012\016\007\021\013\022\010\001\002\000\024" +
    "\005\011\006\004\011\015\013\016\014\005\015\012\016" +
    "\007\021\013\022\010\001\002\000\004\011\051\001\002" +
    "\000\026\002\046\005\011\006\004\011\015\013\016\014" +
    "\005\015\012\016\007\021\013\022\010\001\002\000\004" +
    "\011\041\001\002\000\016\004\ufff7\005\ufff7\006\ufff7\010" +
    "\ufff7\012\ufff7\017\ufff7\001\002\000\024\005\011\006\004" +
    "\011\015\013\016\014\005\015\012\016\007\021\013\022" +
    "\010\001\002\000\004\011\035\001\002\000\004\005\033" +
    "\001\002\000\012\004\032\005\022\006\023\010\024\001" +
    "\002\000\024\005\011\006\004\011\015\013\016\014\005" +
    "\015\012\016\007\021\013\022\010\001\002\000\004\011" +
    "\017\001\002\000\024\005\011\006\004\011\015\013\016" +
    "\014\005\015\012\016\007\021\013\022\010\001\002\000" +
    "\012\005\022\006\023\010\024\012\021\001\002\000\016" +
    "\004\ufff5\005\ufff5\006\ufff5\010\ufff5\012\ufff5\017\ufff5\001" +
    "\002\000\024\005\011\006\004\011\015\013\016\014\005" +
    "\015\012\016\007\021\013\022\010\001\002\000\024\005" +
    "\011\006\004\011\015\013\016\014\005\015\012\016\007" +
    "\021\013\022\010\001\002\000\024\005\011\006\004\011" +
    "\015\013\016\014\005\015\012\016\007\021\013\022\010" +
    "\001\002\000\016\004\ufffc\005\ufffc\006\ufffc\010\ufffc\012" +
    "\ufffc\017\ufffc\001\002\000\016\004\ufffd\005\ufffd\006\ufffd" +
    "\010\024\012\ufffd\017\ufffd\001\002\000\016\004\ufffe\005" +
    "\ufffe\006\ufffe\010\024\012\ufffe\017\ufffe\001\002\000\012" +
    "\005\022\006\023\010\024\012\031\001\002\000\016\004" +
    "\ufff8\005\ufff8\006\ufff8\010\ufff8\012\ufff8\017\ufff8\001\002" +
    "\000\026\002\uffff\005\uffff\006\uffff\011\uffff\013\uffff\014" +
    "\uffff\015\uffff\016\uffff\021\uffff\022\uffff\001\002\000\024" +
    "\005\011\006\004\011\015\013\016\014\005\015\012\016" +
    "\007\021\013\022\010\001\002\000\016\004\ufffa\005\ufffa" +
    "\006\ufffa\010\024\012\ufffa\017\ufffa\001\002\000\024\005" +
    "\011\006\004\011\015\013\016\014\005\015\012\016\007" +
    "\021\013\022\010\001\002\000\012\005\022\006\023\010" +
    "\024\012\037\001\002\000\016\004\ufff4\005\ufff4\006\ufff4" +
    "\010\ufff4\012\ufff4\017\ufff4\001\002\000\016\004\ufff9\005" +
    "\ufff9\006\ufff9\010\ufff9\012\ufff9\017\ufff9\001\002\000\024" +
    "\005\011\006\004\011\015\013\016\014\005\015\012\016" +
    "\007\021\013\022\010\001\002\000\012\005\022\006\023" +
    "\010\024\017\043\001\002\000\024\005\011\006\004\011" +
    "\015\013\016\014\005\015\012\016\007\021\013\022\010" +
    "\001\002\000\012\005\022\006\023\010\024\012\045\001" +
    "\002\000\016\004\ufff6\005\ufff6\006\ufff6\010\ufff6\012\ufff6" +
    "\017\ufff6\001\002\000\004\002\000\001\002\000\012\004" +
    "\050\005\022\006\023\010\024\001\002\000\026\002\001" +
    "\005\001\006\001\011\001\013\001\014\001\015\001\016" +
    "\001\021\001\022\001\001\002\000\024\005\011\006\004" +
    "\011\015\013\016\014\005\015\012\016\007\021\013\022" +
    "\010\001\002\000\012\005\022\006\023\010\024\012\053" +
    "\001\002\000\016\004\ufff3\005\ufff3\006\ufff3\010\ufff3\012" +
    "\ufff3\017\ufff3\001\002\000\016\004\ufffb\005\ufffb\006\ufffb" +
    "\010\024\012\ufffb\017\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\002\005\003\013\001\001\000\004\003" +
    "\053\001\001\000\002\001\001\000\004\003\046\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\037\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\027\001\001\000\002\001\001\000\004\003" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\026\001\001\000\004\003\025\001\001\000\004\003" +
    "\024\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\033\001\001\000\002\001\001\000\004" +
    "\003\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\041\001\001\000\002\001\001" +
    "\000\004\003\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\051\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.next_token(); 
    }

//@@CUPDBG0

  protected Lexer lexer;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr SEMI 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG3
 System.out.println(e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr SEMI 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG4
 System.out.println(e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr PLUS expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG5
 RESULT = e1+e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr MINUS expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG6
 RESULT = e1-e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr TIMES expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG7
 RESULT = e1*e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= MINUS expr 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG8
 RESULT = -e;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= INF PLUS expr 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG9
 System.out.print(" INF ");	        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= PLUS expr 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG10
 RESULT = e;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= LPAREN expr RPAREN 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG11
 RESULT = e;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= NUMBER 
            {
              Double RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG12
 RESULT = n;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= EXPONENTIAL LPAREN expr COMMA expr RPAREN 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG13
 RESULT= Math.pow(e1,e2); 	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= LOG LPAREN expr RPAREN 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG14
 RESULT= Math.log(e); 		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= COS LPAREN expr RPAREN 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG15
 RESULT= Math.cos(e); 		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= SIN LPAREN expr RPAREN 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG16
 RESULT= Math.sin(e); 		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
