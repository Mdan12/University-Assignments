 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : Lesin eru inn af staðalinntaki, notið gögn þannig að fjöldi innan marka sé 0, látið x0 fylkið vera null
*  Látið y0 fylkið vera null, látið lengdir á x0 og y0 fylkjunum vera mismunandi 
*
*
 *****************************************************************************/
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.lang.Math;

public class Ferill {

    /**
     * Tekur inn kommutölufylkin x, y og kommutöluna f. Reiknar út raunverulega y gildi fyrir x og
     * sér hvort að y gildið sem er gefið sé nógu nálægt raunverulega gildinu. Skilar fjölda y gilda sem
     * uppfylla þau skilyrði.
     * @param x kommutölufylki
     * @param y kommutölufylki
     * @param f kommutala
     * @return svar fjöldi nákvæma y gilda
     * @throws IllegalArgumentException
     */

    public static int innanFerils (double [ ] x, double [ ] y, double f) throws IllegalArgumentException {
        int svar = 0;
        for (int j = 0; j < x.length; j++) {
            double yRaun = Math.cos(x[j]) + Math.sqrt(x[j] + 5);
            if (y[j] <= (yRaun + f) && y[j] >= (yRaun - f)) {
                svar++;
            }
        }
        return svar;
    }

    /**
     * Tekur inn tvær kommutölufylki og skilar út Exception ef þau eru ekki jafn löng
     * @param x0 kommutölufylki
     * @param y0 kommutölufylki
     * @throws IllegalArgumentException
     */


    public static void loglegarLengdir (double [] x0, double [] y0) {
        if (x0.length != y0.length) {
            throw new IllegalArgumentException("Lengdir x0 og y0 ekki þær sömu");
        }

    }

    /**
     * Tekur inn tvö kommutölufylki og skilar út Exception ef hvor þeirra er null
     * @param x0 Þetta er kommutölufylki
     * @param y0 Þetta er hitt kommutölufylkið
     * @throws IllegalArgumentException
     */

    public static void ekkiNull (double [] x0, double [] y0) {
        boolean bool = false;
        if (x0.length != 0 || y0.length != 0) {
            for (int l = 0; l < x0.length; l++) {
                if (x0[l] != 0 && y0[l] != 0) {
                    bool = true;
                }
            }

        } else {
            throw new IllegalArgumentException("x0 eða y0 fylkin eru null");
        }
        if (!bool){
            throw new IllegalArgumentException("x0 eða y0 fylkin eru null");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

        if (!s.hasNext()){
            System.out.println("Fjöldi innan marka er 0 sem er 0.0%");
            System.exit(0);
        }

        double F = s.nextDouble();
        int n = s.nextInt();

        double[] xFylki = new double[n];
        double[] yFylki = new double[n];
        double x = 0.0;
        double y = 0.0;




        for (int i = 0; i < n; i++) {
            x = s.nextDouble();
            xFylki[i] = x;

            try {
                y = s.nextDouble();
                yFylki[i] = y;
            } catch (Exception e) {
                loglegarLengdir(xFylki, yFylki);
                throw new IllegalArgumentException("Lengdir x0 og y0 ekki þær sömu");
            }

        }

        ekkiNull(xFylki, yFylki);
        int fjoldi = innanFerils(xFylki, yFylki, F);
        double prosenta = ((double)fjoldi/(double)n) * 100;
        System.out.println("Fjöldi innan marka er " + fjoldi + " sem er " + prosenta + "%");


    }

}