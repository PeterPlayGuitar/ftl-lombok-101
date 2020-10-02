package tasks;

import lombok.var;

public class VarExample {
    public static void run() {
        var str = "Hello world!";
        str += (int) (Math.random() * 10);
        System.out.println(str);
    }
}
