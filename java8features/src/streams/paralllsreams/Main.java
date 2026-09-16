package streams.paralllsreams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<1000000; i++) {
            numbers.add(i);
        }

        long startTime = System.currentTimeMillis();
        numbers.parallelStream().map(n -> compute(n)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by stream: " + (endTime - startTime));
    }

    public static int compute(int n) {
        for(int i=0; i<1000; i++) {
            n += i;
        }
        return n;
    }
}
