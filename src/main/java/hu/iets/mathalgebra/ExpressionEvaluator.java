package hu.iets.mathalgebra;

import java.util.Hashtable;

public class ExpressionEvaluator {
    private  String expression;
    private Hashtable<Character,Double> substitutedValue;

    public ExpressionEvaluator(String expression, Hashtable<Character, Double> substitutedValue) {
        this.expression = expression;
        this.substitutedValue = substitutedValue;
    }

    public double Evaluate() {
        return 0;
    }
}
