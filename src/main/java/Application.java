import lombok.NonNull;
import lombok.val;
import tasks.*;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        ValueExample valueExample = new ValueExample("Peter", true, "Sit");
        valueExample.setStatus("Stand");
        System.out.println(valueExample.getAge());
        System.out.println(valueExample.getStatus());

        ValueExample.InnerClass<Double> innerClass = ValueExample.InnerClass.of("Alex", 2.3);
        System.out.println(innerClass);
    }
}
