package util;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class Util {

    public static String getValueDataTable(DataTable dataTable, String value) {
        List<Map<String, String>> list =dataTable.asMaps(String.class, String.class);
        return list.get(0).get(value);
    }
}
