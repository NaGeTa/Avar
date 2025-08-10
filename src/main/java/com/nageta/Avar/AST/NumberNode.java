package com.nageta.Avar.AST;

import com.nageta.Avar.structure.Token;

public class NumberNode extends ExpressionNode {
    private final Token number;

    public NumberNode(Token number) {
        this.number = number;
    }
}
