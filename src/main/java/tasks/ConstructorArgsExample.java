package tasks;

import lombok.*;

@RequiredArgsConstructor
@ToString
public class ConstructorArgsExample {
    private String name;
    private int age;
    private final int id;
    @NonNull
    private String house;

    @AllArgsConstructor
    @ToString
    public static class Example2 {
        private int argument1 = 1;
        private final int argument2 = 2;
    }

    @NoArgsConstructor
    @ToString
    public static class Example3 {
        private int argument1 = 1;
        private int argument2;
    }
}
