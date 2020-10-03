import lombok.NonNull;
import lombok.val;
import tasks.CleanupExample;
import tasks.ConstructorArgsExample;
import tasks.EqualsAndHashCodeExample;
import tasks.GetterSetterExample;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        ConstructorArgsExample example = new ConstructorArgsExample(242, "A1");
        val example2 = new ConstructorArgsExample.Example2(3);
        val example3 = new ConstructorArgsExample.Example3();

        System.out.println(example);
        System.out.println(example2);
        System.out.println(example3);
    }
}
