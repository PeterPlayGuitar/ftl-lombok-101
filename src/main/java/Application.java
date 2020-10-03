import lombok.val;
import tasks.CleanupExample;
import tasks.EqualsAndHashCodeExample;
import tasks.GetterSetterExample;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        EqualsAndHashCodeExample example1 = new EqualsAndHashCodeExample(1, 2, 1);
        EqualsAndHashCodeExample example2 = new EqualsAndHashCodeExample(1, 2, 1);
        EqualsAndHashCodeExample example3 = new EqualsAndHashCodeExample(0, 0, 2);

        EqualsAndHashCodeExample example4 = new EqualsAndHashCodeExample(99990, 99990, 1);

        System.out.println(example1.equals(example2));
        System.out.println(example1.equals(example3));
        System.out.println(example1.hashCode() == example2.hashCode());
        System.out.println(example1.hashCode() == example3.hashCode());

        System.out.println(example1.equals(example4));
        System.out.println(example1.hashCode() == example4.hashCode());
    }
}
