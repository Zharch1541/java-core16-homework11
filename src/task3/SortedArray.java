package task3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedArray {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        List<Integer> sortedArray = Arrays.stream(array)
                .flatMap(s -> Pattern.compile("\\D+").splitAsStream(s))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String result = sortedArray.stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println("result = " + result);


    }
}
