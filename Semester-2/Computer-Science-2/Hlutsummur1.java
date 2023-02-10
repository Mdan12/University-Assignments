import edu.princeton.cs.algs4.*; 
 
public class Hlutsummur1 { 
 
    public static int[][] reiknaHS(int[] A) { 
        int N = A.length; 
        int[][] B = new int[N][N]; 
         
        for (int i=0; i<N; i++) {
            int hsum = 0;
            for (int j=i; j<N; j++) { 
                hsum += A[j];
                B[i][j] = hsum; 
            } 
        }    
        return B; 
    } 
     
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]); 
        int[] A = new int[N]; 
         
        // Búa til slembigildi í fylkið 
        for (int i=0; i<N; i++) 
            A[i] = StdRandom.uniformInt(1000); 
 
        // Taka tímann á útreikningi 
        Stopwatch timer = new Stopwatch(); 
        int[][] B = reiknaHS(A); 
        double eTime = timer.elapsedTime(); 
         
        StdOut.println("Elapsed time = " + eTime);
    } 
}