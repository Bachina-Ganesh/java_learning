package queue_learning.priority_queue_learning;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void main() {
        Queue<Integer> minPriorityQueue = new PriorityQueue<>();
        minPriorityQueue.add(16);
        minPriorityQueue.add(15);
        minPriorityQueue.add(20);
        minPriorityQueue.add(1);
        minPriorityQueue.add(18);

//        minPriorityQueue.forEach(System.out::println);
//
//        System.out.println("------------------------------");
//        while(!minPriorityQueue.isEmpty()) {
//            System.out.println(minPriorityQueue.poll());
//        }

//        System.out.println(minPriorityQueue.peek());
//        minPriorityQueue.poll();
//        System.out.println(minPriorityQueue.peek());

        Queue<Integer> maxPriorityQueue = new PriorityQueue<>((a, b) -> b - a);
        maxPriorityQueue.add(16);
        maxPriorityQueue.add(15);
        maxPriorityQueue.add(20);
        maxPriorityQueue.add(1);
        maxPriorityQueue.add(18);

        System.out.println(maxPriorityQueue);

        while (!maxPriorityQueue.isEmpty()) {
            System.out.println(maxPriorityQueue.poll());
        }
    }
}
