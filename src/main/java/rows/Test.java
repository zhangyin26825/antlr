package rows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {

	public static void main(String[] args) throws Exception {
		InputStream in=new FileInputStream(new File("C:\\test.txt"));
		ANTLRInputStream input = new ANTLRInputStream(in);
		RowsLexer lexer = new RowsLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		int col = 1;
		RowsParser parser = new RowsParser(tokens, col); // pass column number!
		parser.setBuildParseTree(false); // don't waste time bulding a tree
		parser.file(); // parse

	}

}
