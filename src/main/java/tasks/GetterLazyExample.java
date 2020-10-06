package tasks;


import lombok.Getter;
import lombok.val;

public class GetterLazyExample {
    @Getter(lazy = true)
    private final double[] data = expensive();

    private double[] expensive() {
        val tmpData = new double[5000000];
        for (int i = 0; i < tmpData.length; i++) {
            tmpData[i] = Math.sin(i);
        }
        return tmpData;
    }
}
