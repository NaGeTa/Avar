package com.nageta.Avar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
            System.out.println("Token");
        }
        return tokens;
    }

    private boolean nextToken() {
        if (this.position >= this.code.length()) {
            return false;
        }

        Map<String, TokenType> tokenTypes = TokenTypesUtil.getTokenTypes();
        for (TokenType tokenType: tokenTypes.values()) {
            System.out.println(tokenType);
        }

        return true;
    }
}
