import lombok.val;
import lombok.var;
import tasks.GetterLazyExample;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        GetterLazyExample getterLazyExample = new GetterLazyExample();

        long startTime = System.currentTimeMillis();
        var data = getterLazyExample.getData();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        data = getterLazyExample.getData();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
