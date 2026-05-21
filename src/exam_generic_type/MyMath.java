package exam_generic_type;

public class MyMath<T extends Number> {
    public double getAverage(T[] a) {
        double sum = 0.0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i].doubleValue();
        }

        return sum / a.length;
    }
}
