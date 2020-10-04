package tasks;

import lombok.*;

@Data
@AllArgsConstructor
public class DataAnnotationExample {
    private String name;
    @Getter(AccessLevel.PACKAGE)
    private int age;
    @Setter(AccessLevel.PACKAGE)
    private String id;

    @Data(staticConstructor = "of")
    @RequiredArgsConstructor
    @ToString(includeFieldNames = false)
    public static class InnerClass<T> {
        private final String name;
        private int age;
        private final T data;
    }
}
