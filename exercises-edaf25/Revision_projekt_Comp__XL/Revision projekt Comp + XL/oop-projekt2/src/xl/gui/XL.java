package xl.gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;

import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import xl.gui.menu.XLMenuBar;
import xl.util.Sheet;

public class XL extends JFrame {

    private static final int ROWS = 10, COLUMNS = 8;
    private XLCounter counter;
    private Sheet sheet;
    private StatusLabel statusLabel = new StatusLabel();
    private XLList xlList;

    public XL(XL oldXL) {
        this(oldXL.xlList, oldXL.counter, oldXL.sheet);
    }

    public XL(XLList xlList, XLCounter counter, Sheet sheet) {
        super("Untitled-" + counter);
        this.xlList = xlList;
        this.counter = counter;
        this.sheet = sheet;
        xlList.add(this);
        counter.increment();
        JPanel statusPanel = new StatusPanel(statusLabel, sheet);
        JPanel sheetPanel = new SheetPanel(ROWS, COLUMNS, sheet);
        Editor editor = new Editor(sheet);
        sheet.addObserver(editor);
        add(NORTH, statusPanel);
        add(CENTER, editor);
        add(SOUTH, sheetPanel);
        XLMenuBar menu = new XLMenuBar(this, xlList, statusLabel, sheet);
        setJMenuBar(menu);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void rename(String title) {
        setTitle(title);
        xlList.setChanged();
    }

    public static void main(String[] args) {
        new XL(new XLList(), new XLCounter(), new Sheet());
    }

    public Sheet getSheet() {
        return this.sheet;
    }
}
