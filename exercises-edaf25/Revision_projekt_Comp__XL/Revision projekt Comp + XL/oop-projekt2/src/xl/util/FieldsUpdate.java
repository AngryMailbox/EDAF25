package xl.util;

import java.util.Map;
import java.util.TreeMap;

public final class FieldsUpdate implements Update {
    private Map<String, Cell> map;

    public FieldsUpdate(Map<String, Cell> map) {
        this.map = map;
    }

    public boolean isFieldsUpdate () {
        return true;
    }

    public Map<String, Cell> getUpdate() {
        return this.map;
    }
}
