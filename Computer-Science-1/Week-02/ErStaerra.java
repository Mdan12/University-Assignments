/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Les inn kommutölu, k, setur kvaðratrót af k í annað
 * veldi og setur í breytuna utkoma, prentar út utkoma og röksegðina  utkoma > k
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
