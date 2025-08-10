package com.nageta.Avar.structure;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TokenType {
    private final TokenNamesEnum name;
    private final String regex;

    public TokenType(TokenNamesEnum name, String regex) {
        this.name = name;
        this.regex = regex;
    }
}
