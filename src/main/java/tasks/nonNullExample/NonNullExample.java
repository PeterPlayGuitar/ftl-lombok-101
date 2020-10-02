package tasks.nonNullExample;

import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample() {
        System.out.println("No parameters constructor");
    }

    public NonNullExample(@NonNull Person person) {
        super();
        this.name = person.getName();
        System.out.println("NICE");
    }
}
