 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Bil {
    private double minni;
    private double staerri;
    // smiður
    public Bil(double min, double max) {
        minni = min;
        staerri = max;
    }
    public boolean inniheldur(double x) {
        if(minni>=x || staerri<=x) return false;
        return true;
    }
    public boolean skarast(Bil b) {
        if (b.staerri>minni && b.minni<minni) return true;
        if (b.staerri>minni && b.minni<staerri) return true;
        if (b.staerri==staerri || b.minni==minni) return true;
        return false;
        
    }
    public String toString () {
        return "bilin [" + minni + ", " + staerri + "] og" ;
    }
    
    public static void main(String[] args) {
        Bil a = new Bil(3.5, 4.5);
        System.out.println(a.toString());
    }
}