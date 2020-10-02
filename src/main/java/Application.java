import lombok.val;
import tasks.CleanupExample;
import tasks.GetterSetterExample;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        GetterSetterExample g = new GetterSetterExample();

        System.out.println(g.getName());
        g.setName("Vasya");
        System.out.println(g);
    }
}
