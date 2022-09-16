public class practice1 {
    public static void main(String[] args) {
        double[] prices = {1050.5, 150, 500.25, 3500,
                250, 66.5, 15000, 1399.99,
                850.3, 500.7, 33000, 5000};
        System.out.println("price over 1k is: " +calcSumConditionally(prices));
    }

    public static double calcSumConditionally(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            if (price > 1000) {
                sum += price;
            }
        }
        return sum;
    }
}
