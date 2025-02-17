package xl.util;

import java.util.Map;
import java.util.TreeMap;

public final class SelectedUpdate implements Update {
    private String selected;

    public SelectedUpdate(String selected) {
        this.selected = selected;
    }

    public boolean isFieldsUpdate() {
        return false;
    }

    public String getUpdate() {
        return this.selected;
    }
}
