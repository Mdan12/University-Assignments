/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class ABBA {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);
        int a = aTala;
        int b = aTala + bil;
        int c = aTala + 2 * bil;
        System.out.println("" + (char) (a) + (char) b + (char) c + (char) (b) + (char) (a));

    }
}

