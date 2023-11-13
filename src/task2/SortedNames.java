package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Kolya", "John", "Bill");

        List<String> sortedNames = names.stream()
                .map(String:: toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("sortedNames = " + sortedNames);

    }
}
