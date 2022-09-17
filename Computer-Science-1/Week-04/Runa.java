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
        try {int summa, tala, runa;
        tala = Integer.parseInt(args[0]);
        summa = 0;
        for (int i = 1; i <= tala; i++){
            if (tala % i == 0){
                summa += 1;
                System.out.print(1);
            } else {
                summa += 0; 
                System.out.print(0);
            }
        }
        System.out.println("");
        System.out.println(summa);
    } catch (NumberFormatException e) {
        System.out.print("Ólöglegt snið tölu");
    }
    }
}
