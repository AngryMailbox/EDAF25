package xl.gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

import xl.util.Sheet;

class ClearMenuItem extends JMenuItem implements ActionListener {
    private Sheet sheet;

    public ClearMenuItem(Sheet sheet) {
        super("Clear");
        addActionListener(this);
        this.sheet = sheet;
    }

    public void actionPerformed(ActionEvent e) {
        sheet.clear();
    }
}
