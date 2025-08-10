package com.nageta.Avar.AST;

import com.nageta.Avar.structure.Token;

public class BinaryOperationNode extends ExpressionNode {

    private final Token operator;
    private final ExpressionNode leftOperand;
    private final ExpressionNode rightOperand;

    public BinaryOperationNode(Token operator, ExpressionNode leftOperand, ExpressionNode rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}
