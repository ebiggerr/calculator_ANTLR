package com.ebiggerr;

import com.ebiggerr.grammar.output.ebiggerrLexer;
import com.ebiggerr.grammar.output.ebiggerrParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger;

    public static void main(String[] args) {
        try {

            //file path
            String fn="C:\\Users\\alexi\\IdeaProjects\\ebiggerr_language\\src\\com\\ebiggerr\\calc.ebiggerr";

            //create a CharStream that reads from the file
            CharStream input = CharStreams.fromFileName(fn);

            //create a lexer that feeds off the input CharStream
            ebiggerrLexer lexer = new ebiggerrLexer(input);

            //create a buffer of token pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //create a parse that feeds off the tokens buffer
            ebiggerrParser parser = new ebiggerrParser(tokens);

            //begin parsing
            parser.prog();

        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
}
