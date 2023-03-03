import edu.princeton.cs.algs4.*;

public class MeasureBST {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int sumOptimalHeight = 0;
        int sumHeight = 0;
        for (int t = 0; t < trials; t++) {
            BST<Double, Integer> bst = new BST<>();
            for (int i = 0; i < n; i++) {
                double key = StdRandom.uniform();
                bst.put(key, i);
            }
            sumHeight += bst.height();
            sumOptimalHeight += Math.floor(Math.log(n) / Math.log(2));
        }
        double avgHeight = (double) sumHeight / trials;
        double avgOptimalHeight = (double) sumOptimalHeight / trials;
        double ratio = avgHeight / avgOptimalHeight;
        StdOut.printf("For n = %d, optimal height is %d\n", n, (int) Math.floor(Math.log(n) / Math.log(2)));
        StdOut.printf("Average height in %d trials is %.2f, %.2f times optimal\n", trials, avgHeight, ratio);
    }
}