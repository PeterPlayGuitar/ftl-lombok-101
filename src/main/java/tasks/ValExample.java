package tasks;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExample {

    public String example() {
        val list = new ArrayList<String>();
        list.add("Hello");
        val element = list.get(0).toLowerCase();
        return element;
    }

    public void example2() {
        val hashMap = new HashMap<Integer, String>();
        hashMap.put(2, "hey");
        hashMap.put(3, "Ohh");
        for (val entry : hashMap.entrySet()) {
            System.out.println(String.format("%d and %s", entry.getKey(), entry.getValue()));
        }
    }
}
