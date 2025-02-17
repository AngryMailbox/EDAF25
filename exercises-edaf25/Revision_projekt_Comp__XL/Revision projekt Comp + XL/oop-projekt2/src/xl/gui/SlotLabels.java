package xl.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Observable;
import java.util.TreeMap;

import javax.swing.SwingConstants;

import xl.util.EmptyCell;
import xl.util.Sheet;

public class SlotLabels extends GridPanel {
    private Sheet sheet;
    private List<SlotLabel> labelList;

    public SlotLabels(int rows, int cols, Sheet sheet) {
        super(rows + 1, cols);
        this.sheet = sheet;
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY, SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                String cellId = new StringBuilder().append(ch).append(row).toString();
                SlotLabel label = new SlotLabel(cellId, this);

                sheet.addObserver(label);

                add(label);
                labelList.add(label);
            }
        }
    }

    public void setSelected(String selected) {
        sheet.setSelected(selected);
    }
}
