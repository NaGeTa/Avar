package com.nageta.Avar.processor;

import com.nageta.Avar.structure.Token;
import com.nageta.Avar.structure.TokenType;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Parser {
    private final List<Token> tokens;
    private int position;
    private Object scope;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    private Token match(TokenType...expectedTypes) {
        if (this.position < tokens.size() - 1) {
            Token curr = tokens.get(this.position);
            boolean b = Arrays.stream(expectedTypes).anyMatch(type -> type.getName().equals(curr.getType().getName()));
            if (b) {
                this.position++;
                return curr;
            }
        }
        return null;
    }

    public Token require(TokenType ...expectedTypes) {
        Token token = match(expectedTypes);
        if (Objects.isNull(token)) {
            throw new RuntimeException(String.format("Miss character '%s' at position %s", Arrays.stream(expectedTypes).findFirst().get().getName(), this.position));
        }
        return token;
    }
}
