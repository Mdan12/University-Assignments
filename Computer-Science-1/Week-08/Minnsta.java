import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.NoSuchElementException;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Minnsta  {

    public static double [] minnsta(double [] a){
        int N = a.length;
        double[] fylki = new double[N];
        for (int i = 0; i<N; i++){
            double minnsta = a[i];
            for (int j = i; j < N; j++){
                if (a[j]<minnsta){
                    minnsta = a[j];
                }
            }
            fylki[i] = minnsta;
        }
        return fylki;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int n = s.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++){
            a[i] = s.nextDouble();
        }
        double[] b = minnsta(a);
        for (int k = 0; k < a.length; k++) {
            System.out.print(b[k] + " ");
        }
        
        
    }
}