package day3;

import java.util.PriorityQueue;

public class QueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(10);
        p.offer(20);
        p.offer(30);
        p.offer(40);

        System.out.println("PriorityQueue: " + p);
    }
}