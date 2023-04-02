 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/

 import java.lang.reflect.Array;
 import edu.princeton.cs.algs4.*;
 public class CompareMST {
    public static void main(String[] args) {
        String[] files = {"10000EWG.txt", "LargeEWG.txt"};
        String[] tests = {"KruskalMST", "LazyPrimMST", "PrimMST"};
        
        for (int i = 0; i<2; i++){
          In in = new In(files[0]);
          In in1 = new In(files[1]);
          
          EdgeWeightedGraph Gr = new EdgeWeightedGraph(new In(files[i]));
          Stopwatch timer = new Stopwatch();
          KruskalMST G = new KruskalMST(Gr);
          double eTime = timer.elapsedTime(); 
          System.out.println(files[i] + " takes " + eTime + " seconds to run with " + tests[0]);

          EdgeWeightedGraph Gr1 = new EdgeWeightedGraph(new In(files[i]));
          Stopwatch timer2 = new Stopwatch();
          LazyPrimMST G1 = new LazyPrimMST(Gr1);
          double eTime1 = timer2.elapsedTime(); 
          System.out.println(files[i] + " takes " + eTime1 + " seconds to run " + tests[1]);

          EdgeWeightedGraph Gr2 = new EdgeWeightedGraph(new In(files[i]));
          Stopwatch timer3 = new Stopwatch();
          PrimMST G2 = new PrimMST(Gr2);
          double eTime2 = timer3.elapsedTime(); 
          System.out.println(files[i] + " takes " + eTime2 + " seconds to run " + tests[2]);

        }

      }
}