package day3;

import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(100, "Sachin");
        map.put(85, "Virat");
        map.put(90, "Rohit");
        map.put(95, "Dhoni");

        System.out.println(map);

        map.replace(85, "Kohli");

        System.out.println(map);
    }
}