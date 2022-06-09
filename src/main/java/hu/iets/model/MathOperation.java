package hu.iets.model;

public enum MathOperation {
    Mul, Div, Add, Sub;

    public int getPrecedence () {
        switch (this) {
            case Mul:
            case Div: return 2;
            case Add:
            case Sub: return 1;

            default:
                return -1;
        }
    }

    public MathOperation getOperation(char operation) {
        switch (operation) {
            case '+': return MathOperation.Add;
            case '-': return MathOperation.Sub;
            case '*': return MathOperation.Mul;
            case '/': return MathOperation.Div;

            default:
                return null;
        }
    }

    public boolean IsOperation(char character) {
        switch (character) {
            case '+':
            case '-':
            case '*':
            case '/': return true;

            default: return false;

        }
    }
}


