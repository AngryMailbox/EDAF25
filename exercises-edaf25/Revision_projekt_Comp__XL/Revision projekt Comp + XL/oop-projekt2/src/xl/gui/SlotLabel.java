package xl.gui;

import java.awt.Color;
import java.util.TreeMap;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.Map;
import java.util.Observer;
import java.util.Observable;
import xl.util.Cell;
import xl.util.FieldsUpdate;
import xl.util.SelectedUpdate;
import xl.util.Update;

public class SlotLabel extends ColoredLabel implements Observer {
    private String cellId;

    public SlotLabel(String cellId, SlotLabels container) {
        super("        ", Color.WHITE, RIGHT);
        this.cellId = cellId;

        if ("A1".equals(cellId)) {
            setBackground(Color.YELLOW);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                container.setSelected(cellId);
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        Update update = (Update) arg;

        if (update.isFieldsUpdate()) {
            Map<String, Cell> map = ((FieldsUpdate) arg).getUpdate();
            this.setText(map.containsKey(this.cellId) ? map.get(this.cellId).getValue() : "        ");
        } else {
            SelectedUpdate sUpdate = (SelectedUpdate) update;

            if (sUpdate.getUpdate().equals(cellId)) {
                setBackground(Color.YELLOW);
            } else {
                setBackground(Color.WHITE);
            }
        }
    }
}

