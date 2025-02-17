package xl.util;

import xl.expr.Environment;

public class EmptyCell implements Cell {
    String emptyString;

    public EmptyCell(String emptyString) {
        this.emptyString = emptyString;
    }

    @Override
    public String getValue() {
        return "          ";
    }

    @Override
    public String getExpression() {
        return "";
    }

    @Override
    public double value(Environment env) {
        return 0;
    }
}

