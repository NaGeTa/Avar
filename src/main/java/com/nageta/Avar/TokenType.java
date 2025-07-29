package com.nageta.Avar;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TokenType {
    private final String name;
    private final String regex;

    public TokenType(String name, String regex) {
        this.name = name;
        this.regex = regex;
    }
}
