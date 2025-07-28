package com.nageta.Avar;

public final class Token {
    private final TokenType type;
    private final String text;
    private final Integer position;

    public Token(TokenType type, String text, Integer position) {
        this.type = type;
        this.text = text;
        this.position = position;
    }

    public TokenType getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public Integer getPosition() {
        return this.position;
    }
}
