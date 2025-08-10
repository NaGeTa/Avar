package com.nageta.Avar.AST;

import com.nageta.Avar.structure.Token;

public class VariableNode extends ExpressionNode {

    private final Token variable;

    public VariableNode(Token variable) {
        this.variable = variable;
    }
}
