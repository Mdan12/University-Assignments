import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Tolfraedi {

    public static double stddev (int x [] ){
        double sum = 0.0;
        double standDev = 0.0;
        int length = x.length;
        for(double num : x){
            sum += num;
        }
        double mean = sum/length;

        for (double num: x){
            standDev += ((num - mean)*(num - mean));
        }
        return Math.sqrt(standDev/length);

    }
    public static void main(String[] args) {
        int [] x = {3, 4, 5};
        System.out.println ("Gefið dæmi 1: \n"+Arrays.toString(x));
        System.out.println (stddev(x));
        int [] gogn = new int[8];
        for (int i=0; i<8; i++) {
            gogn[i] = StdRandom.uniformInt(1,10);
        }
        System.out.println ("Gefið dæmi 2: \n"+Arrays.toString(gogn));
        System.out.println (stddev(gogn));
    }
}