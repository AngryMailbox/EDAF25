package xl.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class  XLBufferedReader extends BufferedReader {

    public XLBufferedReader(String name) throws FileNotFoundException {
        super(new FileReader(name));
    }

    public void load(Map<String, Cell> map) {
        try {
            while (ready()) {
                String string = readLine();
                String[] values = string.split("=");
                
                Cell cellValue = new CommentCell(values[1]);// = CellFactory.create(values[1]); såhär ska det göras, Cellfactory skapar en cell som är appropriate
                map.put(values[0], cellValue);
            }
        } catch (Exception e) {
            throw new XLException(e.getMessage());
        }
    }
}
