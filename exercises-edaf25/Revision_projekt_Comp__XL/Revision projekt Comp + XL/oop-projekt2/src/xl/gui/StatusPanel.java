package xl.gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

import xl.util.Sheet;

public class StatusPanel extends BorderPanel {

    protected StatusPanel(StatusLabel statusLabel, Sheet sheet) {
        CurrentLabel currentLabel = new CurrentLabel();
        sheet.addObserver(currentLabel);

        add(WEST, currentLabel);
        add(CENTER, statusLabel);
    }
}
