 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Einkunn {
    private int Lokaprof;
    private double MaetingHlutfall;
    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }

    public Einkunn(double m, int l){
        Lokaprof = l; 
        if (erLogLegt(m))
        MaetingHlutfall = m;
    }
    private boolean erLogLegt(double m){
        if (m<0.0 || m>1.0) return false;
        return true;
    }
    public int getLokaprof(){
        return Lokaprof;
    }
    public void setLokaprof(int l){
        this.Lokaprof = l;
    }
    public void setMaetingHlutfall(double m){
        if (erLogLegt(m)) this.MaetingHlutfall = m;
    }
    public double getMaetingHlutfall(){
        return MaetingHlutfall;
    }
    public boolean erLagmarkseinkunn(){
        if (Lokaprof>=5){
        return true;
        }
        return false;
    }
}