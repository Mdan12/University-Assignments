/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn tvær heiltölur, a og b,  af skipanalínu, prentar út samsvarandi char gildi a og char gildi af a+b 
 *
 *
 *****************************************************************************/
public class Stafir {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print("" + (char) a + " " + (char) (a + b));
    }
}
