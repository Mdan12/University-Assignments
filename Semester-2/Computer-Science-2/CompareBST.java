import edu.princeton.cs.algs4.*;

import java.util.Random;

public class CompareBST {
    private static Random random = new Random();

    public static int createTreeSorted(String treeType, int n) {
        if (treeType.equals("BST")) {
            BST<Integer, Integer> tree = new BST<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                tree.put(i, i);
            }
            return tree.height();
        } else if (treeType.equals("RedBlackBST")) {
            RedBlackBST<Integer, Integer> tree = new RedBlackBST<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                tree.put(i, i);
            }
            return tree.height();
        } else {
            throw new IllegalArgumentException("Invalid tree: " + treeType);
        }

    }

    public static int createTreeUnsorted(String treeType, int n) {
        if (treeType.equals("BST")) {
            BST<Integer, Integer> tree = new BST<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int key = random.nextInt(10000000);
                tree.put(key, i);
            }
            return tree.height();
        } else if (treeType.equals("RedBlackBST")) {
            RedBlackBST<Integer, Integer> tree = new RedBlackBST<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int key = random.nextInt(10000000);
                tree.put(key, i);
            }
            return tree.height();
        } else {
            throw new IllegalArgumentException("Invalid tree: " + treeType);
        }

    }

    public static int timeRandomInput(String alg, int n, int trials)  {
        int totalHeight = 0;
        for (int t = 0; t < trials; t++) {
            totalHeight += createTreeUnsorted(alg, n);
        }
        return totalHeight;
    }

    public static int timeSortedInput(String alg, int n, int trials) {
        int totalHeight = 0;
        for (int t = 0; t < trials; t++) {
            totalHeight += createTreeSorted(alg, n);
        }
        return totalHeight;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double time1, time2;
        int height1, height2;
        String treeType1 = "BST";
        String treeType2 = "RedBlackBST";
        if (args.length == 3 && args[2].equals("sorted") && n < 5000) {
            System.out.println("Sorted input");
            Stopwatch sw = new Stopwatch();
            height1 = timeSortedInput(treeType1, n, trials);   // Total for treeType1.
            time1 = sw.elapsedTime();
            Stopwatch sww = new Stopwatch();
            height2 = timeSortedInput(treeType2, n, trials);   // Total for treeType2.
            time2 = sww.elapsedTime();
        }
        else {
            Stopwatch sw = new Stopwatch();
            height1 = timeRandomInput(treeType1, n, trials);   // Total for treeType1.
            time1 = sw.elapsedTime();
            Stopwatch sww = new Stopwatch();
            height2 = timeRandomInput(treeType2, n, trials);   // Total for treeType2.
            time2 = sw.elapsedTime();
        }
        StdOut.printf("For %d key-value pairs and %d trials:\n", n, trials);
        StdOut.printf("  Median height for BST is %d and for RedBlackBST is %d\n", height1, height2);
        StdOut.printf("  %s took %.5f sec\n", treeType1, time1);
        StdOut.printf("  and %s took %.5f sec\n",treeType2, time2);
    }

}
