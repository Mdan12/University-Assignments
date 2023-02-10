import java.util.Arrays;

import edu.princeton.cs.algs4.*;
/******************************************************************************
 *  Compilation:  javac FourSum.java
 *  Execution:    java FourSum < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *
 *  A program with N^4 running time. Read in N long integers
 *  and counts the number of 4-tuples that sum to exactly 0.
 *
 *  Limitations
 *  -----------
 *     - we ignore integer overflow
 *
 ******************************************************************************/

public class FourSumFast {

    // print distinct 4-tuples (i, j, k, l) such that a[i] + a[j] + a[k] + a[l] = 0
    public static int printAll(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    for (int l = k+1; l < N; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == 0) {
                            StdOut.println(a[i] + " " + a[j] + " " + a[k] + " " + a[l]);
                        }
                    }
                }
            }
        }
        return cnt;
    }

    // return number of distinct 4-tuples (i, j, k, l) such that a[i] + a[j] + a[k] + a[l] = 0
    public static int count(int[] a) {
        int N = a.length;
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int z = Arrays.binarySearch(a, -(a[i] + a[j] + a[k]));
                    if (z > k) cnt++;
                    }
                }
            }
            return cnt;
        }

    public static void main(String[] args)  {
        In in = new In("1Kints.txt");
        int[] a = in.readAllInts();
        int count = count(a);
        StdOut.println(count);
    }
}
