package xl.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Observable;
import java.util.Observer;
import xl.expr.Environment;

public class Sheet extends Observable implements Environment {
    private Map<String, Cell> map = new TreeMap<String, Cell>();
    private String selected = "A1";

    public Sheet() {
    }

    public void put(String name, String expression) {
        Cell cell = CellFactory.create(expression, this);

        if (cell == null) {
            return;
        }

        map.put(name, cell);
        this.setChanged();
        this.notifyObservers(new FieldsUpdate(map));
    }

    public double value(String name) {
        try {
            return map.get(name).value(this);
        } catch (Exception e) {
            return 0;
        }
    }

    public String getExpression(String name) {
        if (!map.containsKey(name))
            return "";

        return map.get(name).getExpression();
    }

    public void load(String path) throws IOException {
        XLBufferedReader reader = new XLBufferedReader(path);
        reader.load(map);
        reader.close();

        this.setChanged();
        this.notifyObservers(new FieldsUpdate(map));
    }

    public void save(String path) throws IOException {

        try (FileWriter writer = new FileWriter(path)) {
            for (Map.Entry<String, Cell> entry : map.entrySet()) {
                String name = entry.getKey();
                Cell cell = entry.getValue();
                String expression = cell.getExpression();

                writer.write(name + "=" + expression + "\n");
            }
        }

    }

    public void setSelected(String value) {
        this.selected = value;

        this.setChanged();
        this.notifyObservers(new SelectedUpdate(this.selected));
    }

    public String getSelected() {
        return this.selected;
    }

    public void clear() {
        this.map.remove(selected);

        this.setChanged();
        this.notifyObservers(new FieldsUpdate(map));
    }

    public void clearAll() {
        this.map = new TreeMap<String, Cell>();

        this.setChanged();
        this.notifyObservers(new FieldsUpdate(map));
    }

    public void updateCells() {
        this.setChanged();
        this.notifyObservers(new FieldsUpdate(map));
    }

    public String toString() {
        return map.toString();
    }
}
