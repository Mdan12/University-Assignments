 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Runa {
    public static void main(String[] args) {
        int tala1 = 1;
        System.out.print(tala1);
        try {
            int tala = Integer.parseInt(args[0]);
            for (int i = 2; i<tala; i++) {
                System.out.print("0");
            }
        } catch (NumberFormatException e){
            return;
        }
        System.out.println(tala1);
        System.out.println(tala1 + tala1);
    }
}
