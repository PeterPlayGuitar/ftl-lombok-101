package tasks;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

@Builder
@ToString
public class BuilderExample {
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
    @Builder.Default private int number = 2;
}
