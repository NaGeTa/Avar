package com.nageta.Avar.util;

import com.nageta.Avar.structure.TokenNamesEnum;
import com.nageta.Avar.structure.TokenType;
import lombok.Getter;

import java.util.Map;

public class TokenTypesUtil {
    @Getter
    private static final Map<String, TokenType> tokenTypes;

    static {
        tokenTypes = Map.ofEntries(
                Map.entry("NUMBER", new TokenType(TokenNamesEnum.NUMBER, "[0-9]*")),
                Map.entry("VARIABLE", new TokenType(TokenNamesEnum.VARIABLE, "[a-zа-я]*")),
                Map.entry("SEMICOLON", new TokenType(TokenNamesEnum.SEMICOLON, ";")),
                Map.entry("SPACE", new TokenType(TokenNamesEnum.SPACE, "[ \\n\\t\\r]*")),
                Map.entry("ASSIGN", new TokenType(TokenNamesEnum.ASSIGN, "=")),
                Map.entry("LOG", new TokenType(TokenNamesEnum.LOG, "БИХЬЕ")),
                Map.entry("PLUS", new TokenType(TokenNamesEnum.PLUS, "\\+")),
                Map.entry("MINUS", new TokenType(TokenNamesEnum.MINUS, "\\-")),
                Map.entry("LPAR", new TokenType(TokenNamesEnum.LPAR, "\\(")),
                Map.entry("RPAR", new TokenType(TokenNamesEnum.RPAR, "\\)"))
        );
    }
}
