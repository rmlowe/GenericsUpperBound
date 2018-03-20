package academy.learnprogramming.upperbound.academy.learnprogramming.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList();
        strings.add("Hello");

        boolean b = strings instanceof List;
    }

}
