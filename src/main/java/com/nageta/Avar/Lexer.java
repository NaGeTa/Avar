package com.nageta.Avar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    private final String code;
    private Integer position;
    private final List<Token> tokens;

    public Lexer(String code) {
        this.code = code;
        this.position = 0;
        this.tokens = new ArrayList<>();
    }

    List<Token> analys() {
        while (nextToken()) {

        }
        return tokens;
    }

    private boolean nextToken() {
        if (this.position >= this.code.length()) {
            return false;
        }

        Map<String, TokenType> tokenTypes = TokenTypesUtil.getTokenTypes();
        for (TokenType tokenType: tokenTypes.values()) {
            String regex = "^" + tokenType.getRegex();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(this.code.substring(this.position));
            if (matcher.find() && !matcher.group().isEmpty()) {
                String word = matcher.group();
                Token token = new Token(tokenType, word, this.position);
                this.position += word.length();
                this.tokens.add(token);
                System.out.println(word);
                return true;
            }
        }
        throw new Error("Error on " + this.position + " position");
    }
}
