package com.nageta.Avar.AST;

import com.nageta.Avar.structure.Token;

public class UnarOperationNode extends ExpressionNode {

    private final Token operator;
    private final ExpressionNode operand;

    public UnarOperationNode(Token operator, ExpressionNode operand) {
        this.operator = operator;
        this.operand = operand;
    }
}
