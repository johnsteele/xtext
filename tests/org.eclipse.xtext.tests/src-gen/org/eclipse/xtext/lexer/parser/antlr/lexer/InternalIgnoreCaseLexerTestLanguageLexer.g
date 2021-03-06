
/*
* generated by Xtext
*/
lexer grammar InternalIgnoreCaseLexerTestLanguageLexer;


@header {
package org.eclipse.xtext.lexer.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




KEYWORD_2 : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');

KEYWORD_1 : ('F'|'f')('O'|'o')('O'|'o');



RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;



