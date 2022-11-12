 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class HaeHoHi {
    public static void main(String[] args) {
        int fjoldi = Integer.parseInt(args[0]);
        for (int i = 1; i < fjoldi+1; i ++){
            if (i % 3 == 0) {
                System.out.print("Hæ");
            }
            if (i % 5 == 0) {
                System.out.print("Hó");
            }
            if (i % 7 == 0) {
                System.out.print("Hí");
            }
            if ((i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                System.out.print(i);
            }
            if (i % 12 == 0) {
                System.out.println();
            }
            else System.out.print(", ");
                
            }
        }

}
