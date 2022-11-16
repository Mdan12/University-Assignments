import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


/******************************************************************************
 *  Nafn    : Höfundur
 *  T-póstur: t póst höfundar
 *
 *  Lýsing  : Beinagrind að Lagalisti - lagið lýsinguna
 *            Ekki taka út nein línucomment
 *
 *****************************************************************************/

public class Lagalisti {
    private String nafnASkra;
    private int n;
    private Lag[] listi;

    public Lagalisti(String nafnASkra, int n) {
        this.nafnASkra = nafnASkra;
        this.n = n;
        listi = new Lag[n];
        lesaLog(nafnASkra, listi);
        Arrays.sort(listi, getLagComparator());
    }

    /**
     * Les lög úr skránni skra og setur í fylkið log. Reiknað er með að búið sé að smíða
     * fylki af nógu mörgum stökum til að rúma lögin í skránni.
     *
     * @param skra nafn á skránni sem á að lesa
     * @param log  fylki af lögum
     */
    private void lesaLog(String skra, Lag[] log) {
        In in = new In(skra);
        for (int i = 0; i < log.length; i++) {
            String s = in.readLine();
            String[] gogn = s.split(",");
            log[i] = new Lag(gogn[0], gogn[1], Integer.parseInt(gogn[2]));
        }
    }

    public void baetaVidLagi(Lag lag) {

        if(lag.getSpilun()>listi[0].getSpilun()){
            listi[0] = lag;
        }
        Arrays.sort(listi, getLagComparator());
        
    }

    // skila lagalisti fylkinu
    public Lag[] getListi() {
        return listi;
    }

    private class LagComparator implements Comparator<Lag> {
        public int compare(Lag o1, Lag o2) {
            int utkoma = 0;
            // forritið hér
            if (o1.getSpilun() > o2.getSpilun()){
                utkoma =1;
            } else if (o1.getSpilun() < o2.getSpilun()){
                utkoma = -1;
            }
            // og hingað ekki breyta hér fyrir neðan
            return utkoma;
        }
    }


    private Comparator<Lag> getLagComparator() {
        Comparator<Lag> utkoma = null;
        // forritið hér
        utkoma = (o1,o2) -> (Integer.compare(o1.getSpilun(), o2.getSpilun()));
        // og hingað - ekki breyta hér fyrir neðan
        return utkoma;
    }


    // Gefin
    public static void main(String[] args) {
        int fjoldi = Integer.parseInt(args[0]);
        Lagalisti ll = new Lagalisti("lagalisti.txt", fjoldi);
        Lag[] listi = ll.getListi();
        System.out.println("innlesið " + Arrays.toString(listi));

        Lag nyttLag1 = new Lag("Bréfbátar", "KARL ORGELTRÍÓ", 18);
        ll.baetaVidLagi(nyttLag1);
        System.out.println("raðað eftir viðbót" + nyttLag1 + "\n"
                                   + Arrays.toString(listi));

        Lag nyttLag2 = new Lag("Ingileif", "SNORRI HELGASON", 3);
        ll.baetaVidLagi(nyttLag2);
        System.out.println("raðað eftir viðbót " + nyttLag2
                                   + "\n" + Arrays.toString(listi));
    }
}
