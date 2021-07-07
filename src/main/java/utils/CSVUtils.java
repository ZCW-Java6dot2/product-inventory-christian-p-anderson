package utils;

import java.io.FileWriter;
import java.io.IOException;

public class CSVUtils {

    private static final char DEFAULT_SEPARATOR = ',';

    public static void writeLine(Writer writer, ArrayList<String> values) throws IOException {
        boolean first = true;

        StringBuilder sb = new StringBuilder();

        for (String value : values) {
            if(!first) {
                sb.append(DEFAULT_SEPARATOR);
            }
            sb.append(value);
            first = false;
        }
        sb.append("\n");

        writer.append(sb.toString());
    }
}
