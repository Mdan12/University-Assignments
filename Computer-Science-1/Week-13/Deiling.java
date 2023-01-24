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
 public class Deiling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        while (s.hasNext()) {
            String[] lina = s.nextLine().split(" ");
            int a = Integer.parseInt(lina[0]);
            int b = Integer.parseInt(lina[1]);
            int c = deiling(a, b);
            System.out.println(c);
        }
        

    }
    public static int deiling(int teljari, int nefnari){
        if (nefnari == 0) {
            return Integer.MAX_VALUE;
        }
        else if (teljari-nefnari==0){
            return 1;
        }
        else if (teljari<nefnari && teljari>=0){
            return 0;
        }
        else if (teljari<0 && nefnari<0){
            teljari = -1*teljari;
            nefnari = -1*nefnari;
            if (teljari<nefnari) return 0;
            else return (1 + deiling(teljari-nefnari, nefnari));
        }
        else if (teljari<0 && nefnari>0){
            teljari = -1*teljari;
            if (teljari<nefnari) return 0;
            else return -1*(1 + deiling(teljari-nefnari, nefnari));
        }
        else if (teljari>0 && nefnari<0){
            nefnari = -1*nefnari;
            if (teljari<nefnari) return 0;
            else return -1*(1 + deiling(teljari-nefnari, nefnari));
        }
        else{
            return (1 + deiling(teljari-nefnari, nefnari));
        }
    }
}