package xl.util;

import xl.expr.Environment;

public class BombCell implements Cell {
    private String expression;

    public BombCell (String expression) {
        this.expression = expression;
    }

    @Override
    public String getValue() {
        return "ERROR";
    }

    @Override
    public String getExpression() {
        return this.expression;
    }

    @Override
    public double value(Environment env) {
        return 0;
    }

}
