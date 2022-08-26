/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class Hradi {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = (a + b) / 2;
        boolean d;
        d = (c <= 50);

        System.out.print(c + " " + d);
    }
}
