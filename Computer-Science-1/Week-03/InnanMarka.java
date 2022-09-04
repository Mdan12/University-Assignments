/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn eina heiltölu af skipanalínu. Skrifar út Innan marka ef talan er stærri
 *  *  eða jafnt og 6 og minna en 60 en annars Utan marka
 *  *  ef talan af skipanalínu er á röngu sniði þá er prentað Ekki heiltala
 *
 *
 *****************************************************************************/
public class InnanMarka {
    public static void main(String[] args) {
        try {
            int tala = Integer.parseInt(args[0]);
            if (tala >= 6 && tala < 60) {
                System.out.print("Innan marka");
            } else {
                System.out.print("Utan marka");
            }
        } catch (NumberFormatException e) {
            System.out.print("Ekki heiltala");
        }
    }
}
