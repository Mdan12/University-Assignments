 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Slembi {
    public static void main(String[] args) {
        double xtra = StdRandom.uniformDouble(0.0, 1.0);
        while (xtra <= 0.8) {
            System.out.println(xtra);
            xtra = StdRandom.uniformDouble(0.0, 1.0);
        }
    }
 }