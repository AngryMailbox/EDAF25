package xl.util;

import java.io.IOException;

import xl.expr.Environment;
import xl.expr.ExprParser;
import xl.util.Sheet;
import xl.util.Cell;
import xl.util.BombCell;
import xl.util.CommentCell;
import xl.util.EmptyCell;
import xl.util.ExpressionCell;
import xl.util.XLException;

public class CellFactory {
    public static Cell create(String expression, Environment sheet) {
        if (expression.trim().isEmpty()) {
            return null;
        }

        if (expression.charAt(0) == '#') {
            return new CommentCell(expression);
        }

        try {
            ExprParser parser = new ExprParser();
            parser.build(expression);
            return new ExpressionCell(expression, sheet);
        } catch (Exception e) {
            return new BombCell(expression);
        }
    }
}
