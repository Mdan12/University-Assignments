import java.util.Arrays;
import java.util.Comparator;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Listi af lögum. Listinn er alltaf raðaður í röð eftir hve oft lögin hafa
 *  verið spiluð
 *
 *
 *****************************************************************************/

public class Lagalisti {
    //Tilviksbreyta
    private Lag[] lagalisti;

    /**
     * Býr til hlut af Lagalisti, les gögn úr nafnASakr, mest n lög og raðar listanum
     * @param nafnASkra nafn á skránni sem á að lesa úr
     * @param n fjöldi laga sem eru lesin inn. Reiknað er með að í nafnASkra séu ekki fleiri en n lög
     */
    public Lagalisti(String nafnASkra, int n) {
        // forritið hér
        lagalisti = new Lag[n];
        lesaLog(nafnASkra, lagalisti);
        Arrays.sort(lagalisti, getLagComparator());
    }

    /**
     * Les lög úr skrá skra og setur í lista log
     *
     * @param skra nafnið á skránni sem gögnin eru lesin úr
     * @param log  fylkið sem inniheldur lögin
     */
    private void lesaLog(String skra, Lag[] log) {
        In in = new In(skra);
        for (int i = 0; i < log.length; i++) {
            String s = in.readLine();
            String[] gogn = s.split(",");
            log[i] = new Lag(gogn[0], gogn[1], Integer.parseInt(gogn[2]));
        }
    }

    /**
     * Bætir við lagi á lagalistann ef hann er vinsælli en óvinsælasta lagið
     *
     * @param lag lagið sem á að bæta við
     */
    public void baetaVidLagi(Lag lag) {
        // forritið hér
        if (lag.getSpilun() > lagalisti[0].getSpilun()) {
            lagalisti[0] = lag;
            Arrays.sort(lagalisti, getLagComparator());
        }
    }

    // skila lagalisti fylkinu
    public Lag[] getListi() {
        return lagalisti;
    }

    /**
     * útfæra samanburðarfall fyrir Lag. Skilar 0 ef eins, -1 ef spilun á fyrra laginu
     * er minni en á seinna laginu
     */
    private class LagComparator implements Comparator<Lag> {
        public int compare(Lag o1, Lag o2) {
            if(o1.getSpilun()==o2.getSpilun()){
                return o1.getTitill().compareTo(o2.getTitill());
            }
            // forritið hér
            return Integer.compare(o1.getSpilun(), o2.getSpilun());
        }
    }

    // skila LagComparator hlut
    private Comparator<Lag> getLagComparator() {
        // forritið hér
        return new LagComparator();
    }


    // Gefin
    public static void main(String[] args) {
        int fjoldi = Integer.parseInt(args[0]);
        Lagalisti ll = new Lagalisti("lagalisti.txt", fjoldi);
        Lag[] listi = ll.getListi();
        System.out.println("innlesið " + Arrays.toString(listi));

        Lag nyttLag1 = new Lag("Bréfbátar", "KARL ORGELTRÍÓ", 18);
        ll.baetaVidLagi(nyttLag1);
        System.out.println("raðað eftir viðbót " + nyttLag1 + "\n"
                                   + Arrays.toString(listi));

        Lag nyttLag2 = new Lag("Ingileif", "SNORRI HELGASON", 3);
        ll.baetaVidLagi(nyttLag2);
        System.out.println("raðað eftir viðbót " + nyttLag2
                                   + "\n" + Arrays.toString(listi));
    }
}
