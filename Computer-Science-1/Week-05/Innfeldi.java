import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Innfeldi {
    public static void main(String[] args) {
        int lengd = Integer.parseInt(args[0]);
        int[] a = new int[lengd];
        int[] b = new int[lengd];
        int cnta = 0;
        int cntb = 0;
        int sum = 0;
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        while(s.hasNextInt()){
            if (lengd > cnta){
                a[cnta] = s.nextInt();
                cnta ++;
            } else if (lengd > cntb) {
                b[cntb] = s.nextInt();
                cntb ++;
            }
        }
        for (int i = 0; i < lengd; i++){
            sum += a[i]*b[i];
    }
    System.out.println(sum);
    }
}