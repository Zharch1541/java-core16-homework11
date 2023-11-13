package task5;

import java.util.*;
import java.util.stream.Stream;

public class MixedStreams<T> {
    public static void main(String[] args) {

        Stream<Integer> first = Stream.of(1, 2, 3, 4);
        Stream<Integer> second = Stream.of(5, 6, 7, 8, 9);

        List<Integer> mixedStream = zip(first, second)
                .toList();

        System.out.println("mixedStream = " + mixedStream);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list = new ArrayList<>();

        Iterator<T> firstItem = first.iterator();
        Iterator<T> secondItem = second.iterator();

        while (firstItem.hasNext() && secondItem.hasNext()) {
            list.add(firstItem.next());
            list.add(secondItem.next());
        }

        return list.stream();
    }
}
