package conn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterList {

    private static StringBuilder result = new StringBuilder();

    private static void getLetter(List<String> list,
            Consumer<String> letterConsumer) {
        for (String s : list) {
            letterConsumer.accept(s);
        }
    }

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<String>();
        nameList.add("vishal");
        nameList.add("tom");
        nameList.add("jerry");
        nameList.add("abc");
 

        Consumer<String> firstLetter = (String s) -> result
                .append(s.charAt(0));

        getLetter(nameList, firstLetter);

        System.out.println(result);

    }
}