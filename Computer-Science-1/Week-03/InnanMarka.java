/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class InnanMarka {
    public static void main(String[] args) {
        int tala = Integer.parseInt(args[0]);
        if (tala != (int) tala) {
            System.out.print("Ekki heiltala");
        } else if (tala >= 6 && tala < 60) {
            System.out.print("innan marka");
        }


    }
}
