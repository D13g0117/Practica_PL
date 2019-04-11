package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}


/* EJERCICIO 1 */
/* APARTADO A */
Comment = "%%" {CommentContent} {Newline}?
CommentContent = (.)*

/*APARTADO B*/
dot = "."
Entero  = ([1-9][0-9]*) | 0 
Real = [0-9]* {dot} [0-9]+
Octal=[0-9]+o

/* EJERCICIO 2 */
exp= "exp"
cos= "cos"
log= "log"
sin= "sin"

/* EJERCICIO 3 */



ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} {                              }
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "n"          { return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }
  ","		   { return symbolFactory.newSymbol("COMMA", COMMA); }
  "="		   { return symbolFactory.newSymbol("EQUAL", EQUAL); }  
  "INF"        { return symbolFactory.newSymbol("INF",INF); }
  {Comment}    {							  }
  {Real}	   { return symbolFactory.newSymbol("NUMBER", NUMBER, Double.parseDouble(yytext())); }
  {Entero}	   { return symbolFactory.newSymbol("NUMBER", NUMBER, Double.parseDouble(yytext())); }	
  {Octal}	   { return symbolFactory.newSymbol("NUMBER", NUMBER, (double) Integer.parseInt(yytext().replace("o",""), 8)); }
  {exp}		   { return symbolFactory.newSymbol("EXPONENTIAL", EXPONENTIAL);}
  {sin}	       { return symbolFactory.newSymbol("SIN", SIN); }
  {cos}		   { return symbolFactory.newSymbol("COS", COS); }
  {log}		   { return symbolFactory.newSymbol("LOG", LOG); }
  
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
