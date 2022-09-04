/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn tvær heiltölur af skipanalínu.
 *  *  Skrifar út textann Báðar jákvæðar ef
 *  *  báðar eru jákvæðar, Önnur  jákvæð eða Hvorug jákvæð
 *
 *
 *****************************************************************************/
public class Positive2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a > 0 && b > 0) {
            System.out.print("Báðar jákvæðar");
        } else if (a > 0 && b < 0 || a < 0 && b > 0) {
            System.out.print("Önnur jákvæð");
        } else if (a < 0 && b < 0) {
            System.out.print("Hvorug jákvæð");
        }
    }
}
