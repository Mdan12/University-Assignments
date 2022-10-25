import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class MaxBelow  {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        int c = Integer.MIN_VALUE;
        while (s.hasNext()){
            int b = s.nextInt();
            if (a>b && b>c){
                c=b;
            }
        }
        if (c == Integer.MIN_VALUE) {
            System.out.println("Engin tala minni en " + a);
        } else {
        System.out.println("stærsta tala minna en " + a + " er " + c);
        }
      }
}