package xl.gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;

import org.w3c.dom.Document;
import xl.util.CommentCell;
import xl.util.ExpressionCell;
import xl.util.SelectedUpdate;
import xl.util.Sheet;
import xl.util.Update;

public class Editor extends JTextField implements Observer {
    private Sheet sheet;
    AbstractDocument document;

    public Editor(Sheet sheet) {
        this.sheet = sheet;

        setBackground(Color.WHITE);

        AbstractDocument document = (AbstractDocument) getDocument();

        document.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleTextChange();
            }
        });
    }

    private void handleTextChange() {
        sheet.put(sheet.getSelected(), getText());
    }

    @Override
    public void update(Observable o, Object arg) {
        Update update = (Update) arg;

        if (!update.isFieldsUpdate()) {
            SelectedUpdate sUpdate = (SelectedUpdate) update;

            setText(sheet.getExpression(sUpdate.getUpdate()));
        }
    }

}
