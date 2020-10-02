import lombok.val;
import tasks.CleanupExample;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        CleanupExample.run();
    }
}
