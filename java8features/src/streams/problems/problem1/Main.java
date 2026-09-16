package streams.problems.problem1;

import java.lang.annotation.ElementType;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 6, 2, 1, 4, 2, 7, 8, 9));
//        List<Integer> sortedUniqueNumbers = numbers.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue)).toList();
//        System.out.println(sortedUniqueNumbers);
//        List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0)
//                .map(num->num * num).toList();
//        System.out.println(oddNumbers);
//        List<Integer> secondAndThird = numbers.stream().distinct().sorted().skip(1).limit(2).toList();
//        System.out.println(secondAndThird);
//        List<Integer> secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();
//        System.out.println(secondHighest);

//        OptionalInt max = numbers.stream().mapToInt(n -> n).max();
//        System.out.println(max.getAsInt());
//        Map<Boolean, List<Integer>> evenOddNumbers = numbers.stream().distinct().collect(Collectors.partitioningBy(n -> n % 2 != 0));
//        System.out.println(evenOddNumbers);

        List<String> names = new ArrayList<>(Arrays.asList("Ganesh", "Suresh", "Deepak", "Swapna", "Lalith Modi"));
//        Map<String, Integer> lengthString = names.stream().collect(Collectors.toMap(Function.identity(), String::length));
//        lengthString.values()
//                .stream()
//                .mapToInt(integer -> integer).max().ifPresent(maxLength -> {
//                    lengthString.entrySet()
//                            .stream()
//                            .filter(entry -> entry.getValue() == maxLength)
//                            .forEach(entry -> System.out.println(entry.getKey()));
//                });
//        Optional<String> maxString = names.stream().max(Comparator.comparing(ele -> ele.length()));
//        System.out.println(maxString.get());

//        Map<Integer, Long> frequency = numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        System.out.println(frequency);

//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
//        List<Integer> commonElements = list1.stream()
//                .filter(list2::contains)
//                .toList();
//        System.out.println(commonElements);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 1, 2),
                Arrays.asList(6, 7, 8, 9, 3)
        );

//        List<Integer> list = listOfLists.stream()
//                .flatMap(List::stream)
//                .distinct()
//                .toList();
//        System.out.println(list);
    }
}
