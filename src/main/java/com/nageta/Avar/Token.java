package com.nageta.Avar;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class Token {
    private final TokenType type;
    private final String text;
    private final Integer position;

    public Token(TokenType type, String text, Integer position) {
        this.type = type;
        this.text = text;
        this.position = position;
    }
}
