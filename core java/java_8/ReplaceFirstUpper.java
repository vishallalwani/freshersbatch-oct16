package conn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceFirstUpper {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("vishal");
        list.add("tom");
        list.add("jerry");
        list.add("abc");

        UnaryOperator<String> upperCase = (String s) -> s.toUpperCase();

        list.replaceAll(upperCase);

        System.out.println(list);
    }
}	