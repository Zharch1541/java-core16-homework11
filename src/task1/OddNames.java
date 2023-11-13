package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class OddNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Kolya", "John", "Bill");


        String oddNames = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));

        System.out.println("oddNames = " + oddNames);


    }
}
