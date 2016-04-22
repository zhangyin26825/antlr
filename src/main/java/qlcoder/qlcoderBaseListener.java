package qlcoder;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Generated from qlcoder.g4 by ANTLR 4.5.3

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link qlcoderListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class qlcoderBaseListener implements qlcoderListener {
    
    public static Set<String> types=new TreeSet<String>();
    
    public static Map<String,String> varMappingType=new TreeMap<String,String>();
    
    public static void show(){
        StringBuffer sb=new StringBuffer();
        for(Map.Entry<String,String> entry:varMappingType.entrySet()){
            sb.append(entry.getKey()+"-");
            sb.append(entry.getValue()+"-");
        }
       System.out.println(sb.toString()); 
    }
    
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFile(qlcoderParser.FileContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFile(qlcoderParser.FileContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override 
	public void enterRtype(qlcoderParser.RtypeContext ctx) { 
	    TerminalNode id = ctx.ID();
	    String text = id.getText();
	    types.add(text);
	    System.out.println("新增类型"+text);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRtype(qlcoderParser.RtypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRnew(qlcoderParser.RnewContext ctx) {
	    
	    TerminalNode var = ctx.ID(0);
	    TerminalNode type = ctx.ID(1);
	    if(types.contains(type)){
	        varMappingType.put(var.getText(), type.getText());
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRnew(qlcoderParser.RnewContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRassign(qlcoderParser.RassignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRassign(qlcoderParser.RassignContext ctx) {
	    
	    TerminalNode varnew = ctx.ID(0);
	    String newvar = varnew.getText();
        TerminalNode varold = ctx.ID(1);
        String oldvar = varold.getText();
        
        if(varMappingType.containsKey(oldvar)){
            varMappingType.put(newvar, varMappingType.get(oldvar));
        }
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}