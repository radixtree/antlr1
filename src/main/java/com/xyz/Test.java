package com.xyz;

import com.xyz.parse.ArrayInitLexer;
import com.xyz.parse.ArrayInitParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String args[]) throws Exception  {
        //InputStream is = new FileInputStream("D:\\workspace\\java\\antlr1\\src\\main\\java\\com\\xyz\\data.txt");
        ANTLRInputStream in = new ANTLRInputStream(System.in);
        ArrayInitLexer lexer = new ArrayInitLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();
        String res = tree.toStringTree(parser);
        System.out.println("res="+res);
    }
}
