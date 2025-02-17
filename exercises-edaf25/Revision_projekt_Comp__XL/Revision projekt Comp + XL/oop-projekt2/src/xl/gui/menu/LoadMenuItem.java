package xl.gui.menu;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import xl.gui.StatusLabel;
import xl.gui.XL;
import xl.util.Sheet;

class LoadMenuItem extends OpenMenuItem {

    public LoadMenuItem(XL xl, StatusLabel statusLabel) {
        super(xl, statusLabel, "Load");
    }

    protected void action(String path) throws FileNotFoundException {
        // TODO

        Sheet sheet = xl.getSheet();
        
        try {
            sheet.load(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int openDialog(JFileChooser fileChooser) {
        return fileChooser.showOpenDialog(xl);
    }
}
