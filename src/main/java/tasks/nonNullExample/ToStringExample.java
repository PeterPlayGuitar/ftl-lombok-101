package tasks.nonNullExample;

import lombok.ToString;

@ToString
public class ToStringExample {
    private int age = 3;
    private String name = "Nice";
    @ToString.Exclude private String data = "18.10.1998";
    private boolean married = false;

    @ToString(onlyExplicitlyIncluded = true)
    class Dog {
        @ToString.Include(name = "name") private String nickname = "Dawg";
        @ToString.Include(rank = 1) private int age = 2;
        private int id = 4139874;
    }

    private Dog dog = new Dog();
}
