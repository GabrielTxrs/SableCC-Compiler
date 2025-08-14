package prolixa;
import prolixa.parser.*;
import prolixa.lexer.*;
import prolixa.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "teste/teste.calc";
  
   Lexer lex = new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024));
   Token token;
   while (!((token = lex.next()) instanceof EOF)) {
	   System.out.print(token.getClass());
	   System.out.println('(' + token.toString() + ')');
   }
//   Parser p = new Parser(lex); 
   
//   Start tree = p.parse();
   //Imprime árvore na saída padrão
   //tree.apply(new ASTPrinter());
   //Imprime árvore em interface gráfica
//   tree.apply(new ASTDisplay());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}