package iterable_learning_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    static void main() {

        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            numbers.add(i);
        }
//
//        System.out.println(numbers);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while(iterator.hasNext()) {
//            int value = iterator.next();
//            System.out.println(value);
//            if(value == 5) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(numbers);

//        numbers.forEach(value -> System.out.println(value));

        List<Integer> evenNumbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

//        numbers.addAll(evenNumbers);
        System.out.println(numbers);
        System.out.println(numbers.contains(100));
        System.out.println(numbers.containsAll(evenNumbers));

        List<Integer> evenSubList = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println(evenNumbers.equals(evenSubList));


        System.out.println(evenNumbers ==  evenSubList);
        System.out.println(evenNumbers.equals(evenSubList));
        evenNumbers.removeAll(evenSubList);
        System.out.println(evenNumbers);
    }
}
