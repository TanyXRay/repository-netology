public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    /**
     * Данный метод возвращает максимальное значение по продажам.
     * @return long max (максимальное значение).
     */
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    /**
     * Данный метод вычисляет среднее значение по продажам, за исключением max и min значений.
     * @return  int mean (среднее значение).
     */
    public int averageSalesValue() {
        int sum = 0;
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
            sum += sale;
        }
        return (sum - min - max()) / (sales.length - 2);
    }
}
