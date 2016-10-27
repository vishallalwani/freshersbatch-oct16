package conn;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class KeyValueMain {

    private static StringBuilder str = new StringBuilder();

    private static void displayMap(Map<Integer, String> map,
            BiFunction<Integer, String, String> mapScanner) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            str.append(mapScanner.apply(entry.getKey(), entry.getValue()));
        }
    }

    public static void main(String[] args) {

        Map<Integer, String> nameMap = new HashMap<Integer, String>();
        nameMap.put(1, "vishal");
        nameMap.put(2, "tom");
        nameMap.put(3, "jerry");

        BiFunction<Integer, String, String> mapScanner = (Integer i,
                String s) -> String.valueOf(i) + " " + s+" ";

        displayMap(nameMap, mapScanner);

        System.out.print(str);
    }
}