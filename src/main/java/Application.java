import lombok.NonNull;
import lombok.Synchronized;
import lombok.val;
import tasks.*;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        WithExample example1 = new WithExample("Peter", 12, 1.2);
        System.out.println(example1.toString());
        WithExample example2 =example1.withName("Vasya");
        System.out.println(example2);
    }
}
