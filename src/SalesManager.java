public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    /**
     * Данный метод возвращает максимальное значение по продажам.
     * @return long max (максимальное значение).
     */
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    /**
     * Данный метод вычисляет среднее значение по продажам, за исключением max и min значений.
     * @return  long min (среднее значение).
     */
    public long averageSalesValue() {
        long sum = 0;
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
            sum += sale;
        }
        return (sum - min - max()) / (sales.length - 2);
    }
}
