 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Ferdamati {

    // tilviksbreytur
    // Forritið hér

    // smiður - tekur inn nafn ferðamáta og kolefnisspor hans
    Ferdamati(String f, double k) {
        // Forritið hér
    }

    // getterar
    public String getFerdamati() {
        // Forritið hér
        return null;
    }

    public double getKolefnisspor() {
        // Forritið hér
        return 0;
    }

    // flettir upp ferðamáta s í safni safn og skilar ferðamáta
    public static Ferdamati flettaUppFerdamati(String s, Ferdamati[] safn) {
        for (int i = 0; i < safn.length; i++) {
            if (Objects.equals(safn[i].getFerdamati(), s))
                return safn[i];
        }
        return null;
    }

    /**
     * Les inn af Scanner s ferdamati.length Ferdamati hluta
     * Dæmi
     * ganga 1.0
     * rafbíll 7.8
     * rafhlaupahjól 1.1
     * strætó 2.5
     *
     * @param s         Scanner sem lesið er úr. Endað á að lesa fram yfir loka línunnar
     * @param ferdamati fylki af mögulegum ferðamátum og kolefnisspori þeirra
     */
    public static void lesaSpor(Scanner s, Ferdamati[] ferdamati) {
        // Forritið hér

        // Síðasta lína í ykkar forriti
        s.nextLine();
    }


    // prófanaaktygi fyrir Ferdamati
    public static void main(String[] args) {
        // Forritið hér
    }
}