 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Spil21 {
    public static void main(String[] args) {
        int spil;
        int n = Integer.parseInt(args[0]);
        int summa = 0;
        for (int i=0; i < n; i++) {
            spil = StdRandom.uniformInt(1, 13);
            summa += spil;
            if (summa >=21) {
                break;
            }
        }
        if (summa < 21){
            System.out.print("Ekki fleiri sénsar ");
        } else if (summa > 21) {
            System.out.print("Sprunginn ");
        } else {
            System.out.print("Vinningur ");
        }
        System.out.print(summa);
      }
}