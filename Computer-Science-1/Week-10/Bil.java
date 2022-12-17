 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : Reiknar út tvö bil og skilar true ef þessi tvö bil skarast og false annars.
*
*
 *****************************************************************************/
public class Bil {
    
    private double minni;
    private double staerri;
    public Bil(double min, double max) {
        minni = min;
        staerri = max;
    }
    /**
     * 
     * @param x Tala sem gefin er til að skoða hvort sé minni en 0.0 eða meiri en 1.0
     * @return
     */
    public boolean inniheldur(double x) {
        if(minni>=x || staerri<=x) return false;
        return true;
    }
    /**
     * 
     * @param b Eitt bil af tveimur þar sem tékkað er á því hvort hitt bilið skarast.
     * @return
     */
    public boolean skarast(Bil b) {
        if (b.minni>staerri|| b.staerri<minni) return false;
        return true; 
    }
    // Breytir textanum í streng og prentar í main fallinu.
    public String toString () {
        return "bilin [" + minni + ", " + staerri + "] og" ;
    }
    
    public static void main(String[] args) {
        Bil a = new Bil(3.5, 3.9);
        Bil b = new Bil(2.5, 4.0);
        boolean c = a.skarast(b);
        System.out.println(c);
    }
}