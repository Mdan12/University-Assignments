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
public class Graenn {
    /**
     * Ef gefið er kolefnisspor (spor) allra ferðamáta (ferdamati) þá reiknar fallið út
     * kolefnisspor ferðar sem er lýst í ferd.
     *
     * @param ferdamatar ferðamátar
     * @param ferd       ferð sem á að reikna út kolefnisspor fyrir
     * @return kolefnisspor einnar ferðar sem er lýst í ferd
     */
    public static double kolefnissporFerdar(Ferdamati[] ferdamatar,
                                            Leggur[] ferd) {
        double heildarSpor = 0;
        for (int i = 0; i < ferd.length; i++) {
            heildarSpor += ferd[i].reiknaKolefnisspor(ferdamatar);
        }
        return heildarSpor;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        // lesa inn fjölda mögulegra ferðamáta af scanner
        int fjoldi = s.nextInt();
        // skilgreina fylki fyrir kolefnisspor ferðamáta
        Ferdamati[] ferdamati = new Ferdamati[fjoldi];
        // lesa inn kolefnisspor og ferðamáta af scanner
        Ferdamati.lesaSpor(s, ferdamati);

        // upphafsstilla breytur
        double eydslaAllraFerda = 0;
        int fjFerda = 0;
        // setja upp síu sem les inn ferðir og reiknar út heildar kolefnisseyðslu ferða og fjölda ferða
        while (s.hasNextLine()) {
            String next = s.nextLine();
            Leggur[] leggur = Leggur.lesaFerd(next);
            eydslaAllraFerda += kolefnissporFerdar(ferdamati, leggur);
            fjFerda++;
        }

        // prenta út
        System.out.printf(Locale.US, "meðalkolefnisspor í %2d ferðum er %5.2f %n", fjFerda,
                          eydslaAllraFerda / fjFerda);
        System.out.printf(Locale.US, "heildarkolefnisspor einstaklings var %5.2f %n",
                          eydslaAllraFerda);
    }
}
