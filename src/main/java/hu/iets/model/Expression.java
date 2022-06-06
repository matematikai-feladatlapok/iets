package hu.iets.model;

public class Expression {
    Expression leftSide;
    Expression rightSide;
    MathOperation operation;

    public Expression(Expression leftSide, Expression rightSide, MathOperation operation) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.operation = operation;
    }

    public Expression getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Expression leftSide) {
        this.leftSide = leftSide;
    }

    public Expression getRightSide() {
        return rightSide;
    }

    public void setRightSide(Expression rightSide) {
        this.rightSide = rightSide;
    }

    public MathOperation getOperation() {
        return operation;
    }

    public void setOperation(MathOperation operation) {
        this.operation = operation;
    }
}
