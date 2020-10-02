import lombok.val;
import tasks.CleanupExample;
import tasks.GetterSetterExample;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ToStringExample a = new ToStringExample();
        System.out.println(a.toString());
    }
}
