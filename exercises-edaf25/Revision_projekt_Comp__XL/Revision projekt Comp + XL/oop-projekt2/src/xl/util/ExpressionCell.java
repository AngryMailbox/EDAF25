package xl.util;

import java.io.IOException;

import xl.expr.Environment;
import xl.expr.ExprParser;

public class ExpressionCell implements Cell {
    private String expression;
    private Environment environment;
    private ExprParser parser = new ExprParser();

    public ExpressionCell(String expression, Environment environment) {
        this.expression = expression;
        this.environment = environment;
    }

    public String getValue() {
        try {
            return String.valueOf( parser.build(expression).value(environment));
        } catch (Exception e) {
            return "";
        }
    }

    public String getExpression() {
        return expression;
    }

    public double value(Environment env) {
        try {
            return parser.build(expression).value(environment);
        } catch (Exception e) {
            return 0;
        }
    }
}
