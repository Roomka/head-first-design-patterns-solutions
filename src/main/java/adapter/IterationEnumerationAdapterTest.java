package adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IterationEnumerationAdapterTest {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ball");
        words.add("sun");

        Enumeration enumerationAdapter = new IteratorEnumerationAdapter(words.iterator());

        while (enumerationAdapter.hasMoreElements()) {
            System.out.println(enumerationAdapter.nextElement());
        }
    }
}
