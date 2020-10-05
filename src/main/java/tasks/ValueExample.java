package tasks;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;

@Value
public class ValueExample {
    String name;
    int age = 2;
    @With(AccessLevel.PACKAGE)
    boolean sex;
    @NonFinal
    @Setter
    String status;

    @Value(staticConstructor = "of")
    public static class InnerClass<T> {
        String name;
        T value;
    }
}
