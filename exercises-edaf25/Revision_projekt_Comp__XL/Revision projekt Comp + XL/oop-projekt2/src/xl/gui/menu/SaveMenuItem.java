package xl.gui.menu;
import xl.util.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import xl.gui.StatusLabel;
import xl.gui.XL;

class SaveMenuItem extends OpenMenuItem {

    public SaveMenuItem(XL xl, StatusLabel statusLabel) {
        super(xl, statusLabel, "Save");
    }

    protected void action(String path) throws FileNotFoundException {
        // TODO
        Sheet sheet = xl.getSheet();
        
        try {
            sheet.save(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int openDialog(JFileChooser fileChooser) {
        return fileChooser.showSaveDialog(xl);
    }
}
