package com.nageta.Avar;

import java.util.Map;

public class TokenTypesUtil {
    public static final Map<String, TokenType> tokenTypes;

    static {
        tokenTypes = Map.ofEntries(
                Map.entry("NUMBER", new TokenType("NUMBER", "[0-9]*")),
                Map.entry("VARIABLE", new TokenType("VARIABLE", "[a-zа-я]*")),
                Map.entry("SEMICOLON", new TokenType("SEMICOLON", ";")),
                Map.entry("SPACE", new TokenType("SPACE", "[ \\n\\t\\r]*")),
                Map.entry("ASSIGN", new TokenType("ASSIGN", "=")),
                Map.entry("LOG", new TokenType("LOG", "БИХЬЕ")),
                Map.entry("PLUS", new TokenType("PLUS", "+")),
                Map.entry("MINUS", new TokenType("MINUS", "-")),
                Map.entry("LPAR", new TokenType("LPAR", "\\(")),
                Map.entry("RPAR", new TokenType("RPAR", "\\)"))
        );
    }

    public static Map<String, TokenType> getTokenTypes() {
        return tokenTypes;
    }
}
