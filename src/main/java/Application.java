import lombok.NonNull;
import lombok.val;
import tasks.*;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        DataAnnotationExample example = new DataAnnotationExample("peter", 21, "af85097cd8658a87");
        System.out.println(example.getName());
        System.out.println(example.getId());
        example.setName("Peter");
        System.out.println(example.getName());
        example.setAge(69);
        System.out.println(example.toString());

        DataAnnotationExample example1 = new DataAnnotationExample("dPeter", 69, "af85097cd8658a87");
        System.out.println(example.equals(example1));
        example1.setName("Peter");
        System.out.println(example.equals(example1));
        System.out.println(example.hashCode() == example1.hashCode());

        DataAnnotationExample.InnerClass<StringBuilder> innerClass =
                new DataAnnotationExample.InnerClass<>("WOW", new StringBuilder().append("Hello i am String Builder"));
        System.out.println(innerClass);
    }
}
