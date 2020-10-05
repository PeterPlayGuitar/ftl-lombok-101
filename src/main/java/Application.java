import lombok.NonNull;
import lombok.val;
import tasks.*;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        BuilderExample example = BuilderExample.builder().age(2).name("Peter").occupation("One").build();
        System.out.println(example);
        example = BuilderExample.builder().occupations(Arrays.asList("One", "Two", "Three")).build();
        System.out.println(example);
    }
}
