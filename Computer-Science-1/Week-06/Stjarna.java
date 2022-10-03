 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Stjarna {
    public static String stjornur(int n) {
        StringBuilder s = new StringBuilder();
        for (int i =0; i<=n-1; i++){
        s.append("*");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.printf(" Stjörnurnar eru %2d  %s ", n, stjornur(n));
    }
}