package task4;

import java.util.stream.Stream;

public class CogruentGenerator {
    public static void main(String[] args) {
        long seed = System.currentTimeMillis();
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generate(a, c, m, seed);
        randomStream.limit(5).forEach(System.out::println);
    }
        public static Stream<Long> generate(long a, long c, long m, long seed) {
            return Stream.iterate(seed, x -> (a * x+ c) % m);
        }

}
