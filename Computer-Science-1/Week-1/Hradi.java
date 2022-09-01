/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :Forritið les inn tvær heiltölur, hraði á kls., reiknar út meðalhraða (kommutala) og prentar út.
 *  Prentar einnig út true ef meðalhraði er minni eða jafnt og 50. Prentar annars út false.
 *
 *
 *****************************************************************************/
public class Hradi {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        boolean d = (((a + b) / 2) <= 50);
        System.out.print(((a + b) / 2) + " " + d);
    }
}
