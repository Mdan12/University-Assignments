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
 public class Tekk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int test = 0;
        int next1 = 0;
        boolean swift = true;
        while (s.hasNext()){
            String next = s.next();
            try {
                next1 = Integer.parseInt(next);
            } catch (Exception e) {
                next1 = test + 1;
            }
            if (next1!=test+1){
                System.out.println("Gölluð");
                swift = false;
                break;
            }
            test++;
        }
        if (swift){
            System.out.println(next1);
        }
        
    }
}