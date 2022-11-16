import java.util.Arrays;


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

    public Vara(int v, int vsk) {
        verd = v;
        this.vsk = vsk;
    }


    public Vara plus(Vara v) {
        int verd3 = verd + v.verd;
        int vsk3 = vsk + v.vsk;
        Vara vara3 = new Vara(verd3, vsk3);
        return vara3;
    }

    public static void main(String[] args) {
        Vara a = new Vara(1000, 12);
        Vara b = new Vara(2000, 20);
        Vara c = a.plus(b);
        StdOut.println(c.verd + " " + c.vsk);
    }

}
