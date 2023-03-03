import edu.princeton.cs.algs4.*;
import java.util.Random;

public class Verkefni {


    public static int uniform(int min, int max){
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }

    public static void sort(int[] a){
        int n = a.length;
        while(!isSorted(a)){
            int z = uniform(0,n-1);
            int b = uniform(z,n-1);
            if (a[z]>a[b]){
                int temp = a[z];
                a[z] = a[b];
                a[b] = temp;
            }
        }
    }

    public static boolean isSorted(int[] b){
        for (int i = 1; i<b.length; i++){
            if (b[i]<b[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        In in = new In("32Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch(); 
        sort(a);
        double eTime = timer.elapsedTime(); 
        StdOut.println("Elapsed time = " + eTime);
    
      }
}