package day3;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);

        System.out.println("HashSet: " + h);

        for (int i : h) {
            System.out.println(i);
        }

   
        Iterator<Integer> it = h.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}