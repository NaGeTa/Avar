package com.nageta.Avar;

import java.util.List;

public class Parser {
    private final List<Token> tokens;
    private int position;
    private Object scope;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }
}
