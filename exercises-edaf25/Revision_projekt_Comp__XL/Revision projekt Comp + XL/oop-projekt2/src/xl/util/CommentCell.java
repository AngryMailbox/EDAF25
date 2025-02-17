package xl.util;

import xl.expr.Environment;

public class CommentCell implements Cell {
    private String comment;

    public CommentCell(String comment) {
        this.comment = comment;
    }

    public String getValue() {
        return comment.substring(1);
    }

    public String getExpression() {
        return comment;
    }

    public double value(Environment env) {
        return 0;
    }
}
