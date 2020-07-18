package Chapter1.Section12;

/**
 * @Program: Algorithm
 * @ClassName: Accumulator
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-18 21:41
 * @Version: V1.0
 * @Description: 累加器
 **/

public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }
}

