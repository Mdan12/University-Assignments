/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur tvö args og prentar virðisauka á console
 *
 *
 *****************************************************************************/
public class Virdisauki {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = b / 100;
        double d = a * c;
        System.out.println(d);
    }
}
