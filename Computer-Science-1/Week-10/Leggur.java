 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Leggur {
    private final String ferdamati;
    private final double kilometer;

    // smiður fyrir legg - tekur inn ferðamáta og vegalengd innan ferðar
    public Leggur(String ferdamati, double kilometer) {
        this.ferdamati = ferdamati;
        this.kilometer = kilometer;
    }


    // reiknar út kolefnisspor fyrir legginn ef spor inniheldur alla ferðamáta
    public double reiknaKolefnisspor(Ferdamati[] spor) {
        return (Ferdamati.flettaUppFerdamati(ferdamati, spor).getKolefnisspor() * kilometer);
    }

    // les inn eina ferð úr strengnum s og býr til fylki af Leggur
    public static Leggur[] lesaFerd(String s) {
        String[] ferd = s.split(",");
        Leggur[] leggur = new Leggur[ferd.length / 2];

        for (int i = 0; i < ferd.length; i += 2) {
            String f = ferd[i];
            double k = Double.parseDouble(ferd[i + 1]);
            leggur[i / 2] = new Leggur(f, k);

        }
        return leggur;
    }

    // prófanaaktygi fyrir Leggur
    public static void main(String[] args) {
        // Forritið hér
    }

}
