package qlcoder;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {
    
    public static void main(String[] args) throws Exception {
        String filepath="C:\\Users\\zhangyin\\Downloads\\145743685778441.txt";
        ANTLRFileStream f=new ANTLRFileStream(filepath,"utf-8"); 
        qlcoderLexer lexer=new qlcoderLexer(f);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        qlcoderParser parser = new qlcoderParser(tokens);
        ParseTree tree  = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        qlcoderBaseListener qlisten=new qlcoderBaseListener();
        walker.walk(qlisten, tree);
        qlisten.show();
    }
    
}
