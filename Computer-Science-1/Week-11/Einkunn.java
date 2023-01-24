 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Einkunn implements Comparable<Einkunn>{
    private static final int LAGMARK = 5;
    private double maetingHlutfall;
    private int lokaprof;
    /**
     * Smiður fyrir Einkunn. Gætir þess að mætingarhlutfall sé löglegt. Ef ekki þá 
er það 0
     *
     * @param m mætingarhlutfall
     * @param l lokaprófseinkunn
     */
    public Einkunn(double m, int l) {
        if (erLoglegt(m))
            maetingHlutfall = m;
        else
            maetingHlutfall = 0.0;
        lokaprof = l;
    }
    /**
     * Hjálparfall sem segir til hvort m er á bilinu 0.0 til og með 1.0
     *
     * @param m mætingarhlutfall
     * @return true eða false eftir lögmæti m
     */
    private boolean erLoglegt(double m) {
        return m >= 0 && m <= 1.0;
    }
    public int getLokaprof() {
        return lokaprof;
    }
    public void setLokaprof(int l) {
        this.lokaprof = l;
    }
    /**
     * Setur mætingahlutfall sem m ef m er löglegt mætingahlutfall
     *
     * @param m mætingahlutfall á bilinu 0.0 og 1.0 (bæði meðtalin)
     */
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m))
            maetingHlutfall = m;
    }
    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }
    /**
     * Skilar true ef lokaprófseinkunn er stærri eða jafnt og 5.0
     *
     * @return true eða false eftir því hvort lokaprófseinkunn er stærri eða jafnt 
og 5.0
     */
    public boolean erLagmarkseinkunn() {
        return lokaprof >= LAGMARK;
    }
    public int compareTo(Einkunn o) {
        return Integer.compare(lokaprof, o.lokaprof);
    }
    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + 
        e.erLagmarkseinkunn());
        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }
}