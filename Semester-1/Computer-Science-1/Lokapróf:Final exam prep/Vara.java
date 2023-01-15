 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Vara {
    private final int verd;
    private final int vsk;

    public Vara(int v, int vsk){
        verd = v;
        this.vsk = vsk;
    }

    public Vara plus (Vara v){
        int verd = this.verd + v.verd;
        int vsk = this.vsk + v.vsk;
        return new Vara(verd, vsk);
    }
    public static void main(String[] args) {
        int 
      }
}