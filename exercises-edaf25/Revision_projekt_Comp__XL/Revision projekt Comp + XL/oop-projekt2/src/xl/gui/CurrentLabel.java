package xl.gui;

import java.awt.Color;
import java.util.Observer;

import xl.util.SelectedUpdate;
import xl.util.Update;

import java.util.Observable;

public class CurrentLabel extends ColoredLabel implements Observer {

    public CurrentLabel() {
        super("A1", Color.WHITE);
    }

    public void update(Observable observable, Object object) {
        Update update = (Update) object;

        if (!update.isFieldsUpdate()) {
            SelectedUpdate sUpdate = (SelectedUpdate) update;
            this.setText(sUpdate.getUpdate());
        }

    }

}
