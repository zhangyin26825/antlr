package labeledexpr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		InputStream in=new FileInputStream(new File("C:\\test.txt"));
		ANTLRInputStream input = new ANTLRInputStream(in);
		LabeledExprLexer lexer = new LabeledExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledExprParser parser = new LabeledExprParser(tokens);
	
		ParseTree tree =parser.expr();
		//ParseTree tree = parser.stat();
		EvalVisitor eval = new EvalVisitor();
		Integer visit = eval.visit(tree);
		
		System.out.println(visit);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
	}

}
