package xl.util;

import java.io.IOException;

import xl.expr.Environment;

public interface Cell {
    public String getValue();

    public String getExpression();

    public double value(Environment env);
}
