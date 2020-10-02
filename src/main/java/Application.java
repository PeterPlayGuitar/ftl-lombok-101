import lombok.val;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("John");
        val nonNullExample = new NonNullExample(person);
        val nonNullExample2 = new NonNullExample(null);
    }
}
