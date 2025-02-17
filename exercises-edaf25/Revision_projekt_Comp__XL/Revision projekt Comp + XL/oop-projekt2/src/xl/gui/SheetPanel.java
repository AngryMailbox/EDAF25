package xl.gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

import java.util.Observer;

import xl.util.Sheet;

public class SheetPanel extends BorderPanel {

    public SheetPanel(int rows, int columns, Sheet sheet) {
        add(WEST, new RowLabels(rows));
        add(CENTER, new SlotLabels(rows, columns, sheet));
    }
}
