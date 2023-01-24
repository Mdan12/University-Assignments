 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Rumfraedi {
    public static double ummalHrings(double r) {
        return r * 2 * Math.PI;
    }

     public static void main(String[] args) {
        double N = Double.parseDouble(args[0]);
        System.out.println("Hringur með radíus " + N + " er " + ummalHrings(N));
        }
    }


