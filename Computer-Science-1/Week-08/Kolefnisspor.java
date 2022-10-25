import java.nio.charset.Charset;
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

public class Kolefnisspor {
    /**
     * Les inn af Scanner s ferdamati.length pör (f, k) af ferðamáta og 
kolefnisspor ferðamáta. Setur f í fylkið
     * ferdamati og k í fylkið kolefnisspor.
     * Dæmi
     * ganga 1.0
     * rafbíll 7.8
     * rafhlaupahjól 1.1
     * strætó 2.5
     *
     * @param s Scanner sem lesið er úr
     * @param ferdamati fylki af mögulegum ferðamátum
     * @param kolefnisspor fylki af kolefnisspori hvers ferðamáta
     */
    public static void lesaSpor(Scanner s, String[] ferdamati, double [] kolefnisspor) {
        for (int i = 0; i<ferdamati.length;i++){
            ferdamati[i] = s.next();
            kolefnisspor[i] = s.nextDouble();
        }
    }
    /**
     *
     *  Þetta fall var forritað í verkefni 6
     * @param s
     * @param safn
     * @return
     */
    public static int ixFerdamati(String s, String[] safn) {
        for (int i = 0; i < safn.length; i++) {
            if (s.equals(safn[i]))
                return i;
        }
        return -1;
    }
    /**
     * Ef gefið er kolefnisspor (spor) allra ferðamáta (ferdamati) þá reiknar 
fallið út
     * kolefnisspor ferðar sem er lýst í ferd. Ferd er strengur sem lýsir ferð sem 
mengi af
     * ferðamáta og vegalengd í km.
     * dæmi
     * strætó,5,rafhlaupahjól,3
     * notandi hefur ferðast 5 km með strætó og 3 km með rafhlaupahjóli
     * @param spor kolefnisspor
     * @param ferdamati ferðamáti
     * @param ferd ferð sem inniheldur pör (f, v) af ferðamáta og vegalengd í km
     * @return kolefnisspor einnar ferðar sem er lýst í ferd
     */
    public static double kolefnissporFerdar(double[] spor, String[] ferdamati, String[] ferd) {
        int saeti = 0;
        double sum = 0;
       for (int i = 0; i<ferd.length/2; i++){
        saeti = ixFerdamati(ferd[i*2], ferdamati);
        sum += spor[saeti] * Double.parseDouble(ferd[2*i+1]);
       }
       return sum;
    }
    public static void main(String[] args) {
        // setja upp Scanner
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int N = s.nextInt();
        double[] spor = new double[N];
        String[] ferdamati = new String[N];
        lesaSpor(s, ferdamati, spor);
        String[] ferd;
        double sum = 0.0;
        int fjoldiFerda = 0;
        s.nextLine();
        while(s.hasNextLine()){
            ferd = s.nextLine().split(",");
            sum += kolefnissporFerdar(spor, ferdamati, ferd);
            fjoldiFerda++;
        }
        double cntsum = sum / fjoldiFerda;
        System.out.println("meðalkolefnisspor í " + fjoldiFerda + " er " + cntsum);
        System.out.println("heildarkolefnisspor einstaklings var " + sum);

        
        // lesa inn fjölda mögulegra ferðamáta af scanner
        // skilgreina fylki fyrir kolefnisspor ferðamáta
        // lesa inn kolefnisspor og ferðamáta af scanner
        // upphafsstilla breytur
        // setja upp síu sem les inn ferðir og reiknar út heildar kolefnisseyðslu ferða og fjölda ferða
        // prenta út
    }
}