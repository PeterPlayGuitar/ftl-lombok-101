package tasks;

import lombok.*;

@Value
@RequiredArgsConstructor
public class WithExample {
    @With
    @NonNull String name;

    @With(AccessLevel.PACKAGE)
    int age;

    @With
    double height;
}
