import java.util.Random;
import edu.princeton.cs.algs4.*;

public class CardDeal {
    public static void main(String[] args) {
        Card[] count = new Card[52];
        int k = Integer.parseInt(args[0]);

        for (int i = 0; i<=3; i++){
            for (int l = 0; l<=12; l++){
                count[i*13+l]=new Card(i,l+1);
            }
        }
        StdRandom.shuffle(count);
        for (int m =0; m<=k; m++){
           StdOut.printf(count[m] +  " ");;
        }
      }
}