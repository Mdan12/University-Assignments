/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class ErStaerra {
    public static void main(String[] args) {
        double k = Double.parseDouble(args[0]);
        double d = Math.sqrt(k);
        double utkoma = Math.pow(d, 2);
        boolean c;
        c = (utkoma > k);

        System.out.println(utkoma);
        System.out.println(c);
    }
}
