public class practice2 {
    public static void main(String[] args) {
        int[] heights = {165, 156, -178, -176, 164, -154, 205, -185, 177, 168, -155, -170,
        172, 163, -160, -169, 169, -170, -173, 166, 171, -172, -162, 168, -170};
        System.out.println("girls " + calcGirlsAvgHeight(heights));
        System.out.println("boys " + calcBoysAvgHeight(heights));
    }

    public static double calcBoysAvgHeight(int[] heights) {
        return calc(heights, true);
    }

    public static double calcGirlsAvgHeight(int[] heights) {
        return calc(heights, false);
    }
    public static double calc(int[] heights, boolean isBoy) {
        double sum = 0;
        int amount = 0;
        for (int height : heights) {
            if ((isBoy && height < 0) || (!isBoy && height > 0)) {
                amount++;
                sum += height;
            }
        }
        return Math.abs(sum / amount);
    }
}
