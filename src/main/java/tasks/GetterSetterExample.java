package tasks;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterExample {
    @Getter
    @Setter
    private String name;

    @Setter(AccessLevel.PROTECTED)
    int age = 10;

    public GetterSetterExample() {
        name = "Noname";
    }

    @Override
    public String toString() {
        return "GetterSetterExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
