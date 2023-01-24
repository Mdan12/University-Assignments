import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Leit {
     public static int finna(String[] a, String x){
        int n = 0;
        boolean saeti = false;
        for (String t : a){
            if (t.equals(x)){
                saeti = true;
                break;
            }
        n++;
        }
        if (!saeti)
            n = -1;
            return n;
    }
    public static void main(String[] args) {
        // Hér er dæmi um prófanafall en þið getið skrifað ykkar eigið
        // RandomStringUtils er í pakkanum import org.apache.commons.lang3.RandomStringUtils;
        // þið þurfið að hlaða library niður frá apache ef þið notað hann
        int N = 10;
        String[] a = new String[N];
        // Hér bý ég til slembistrengi en þið getið líka sett inn fasta 
        for (int i = 0; i < N; i++) {       // prófum með 10 strengjum
            a[i] = RandomStringUtils.randomAlphanumeric(i+1); // slembistrengir af stærð 1 upp í N
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(a[2]+" er í sæti " + finna(a, a[2]));      // strengur sem fannst
        System.out.println(a[5]+" er í sæti " + finna(a, a[5]));
        System.out.println("Háskóli"+" er í sæti " + finna(a, "Háskóli"));   // strengur sem ekki fannst
        // eða
        for (int i = 1; i < N; i++) {
            int slembi = StdRandom.uniformInt(0, a.length);
            System.out.printf(" %s er í sæti %3d\n", a[slembi], finna(a, a[slembi]));
        }
    }
}