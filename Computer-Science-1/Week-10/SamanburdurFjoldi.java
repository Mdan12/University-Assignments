import java.awt.Color;
/******************************************************************************
 * Beinagrind að SamanburdurFjoldi
 ******************************************************************************/
public class SamanburdurFjoldi {
    /**
     * Reiknar út punkta samkvæmt fallinu f með vaxtahrada vaxtahradi yfir n ár.
     * Athugið að stærðin á útkomufylkinu er n+1
     *
     * @param f          fallið sem á að reikna
     * @param vaxtahradi vaxtahraðinn
     * @param n          fjöldi ára
     * @return skilar fylki með punktunum sem voru reiknaðir
     */
    public static double[] reiknaPunkta(Mannfjoldi f, double vaxtahradi, int n) {
       double[] fylki = new double[n+1];
       for (int x = 0; x<n; x++){
        fylki[x] = f.fjoldi(x, vaxtahradi);
       }
       return fylki;
    }
    /**
     * Teiknar punkta og línur á milli þeirra sem eru fengnir úr y í lit litur
     *
     * @param y     punktar sem á að teikna
     * @param litur liturinn á punktum og línum
     */
    public static void teiknaPunkta(double[] y, Color litur) {
       StdDraw.setPenColor(litur);
       StdStats.plotpoints(y);
       StdStats.plotLines(y);
    }
    /**
     * finnur stærsta gildi í tvívíða fylkinu y
     *
     * @param y tvívítt fylki sem á finna hámarksgildi úr
     * @return stærsta gildið
     */
    private static double staersta(double[][] y) {
        double max = 0;
        for (int i=0;i<y.length; i++){
            for (int j=0; j<y.length; j++){
                if (y[i][j]>max) max= y[i][j];
            }
        }
        return max;
    }
    /**
     * sjá leiðbeiningar í verkefni
     *
     * @param args ónotað
     */
    public static void main(String[] args) {
        final int upphaf = 8;
        final int PR = 100;
        final Color[] litir = {Color.RED, Color.BLUE, Color.GREEN};

    }
}
