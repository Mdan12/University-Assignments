/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Forritið les inn tvær kommutölur, breidd og hæð og
 *  reiknar út flatarmál rétthyrnings og prentar út á console.
 *
 *
 *****************************************************************************/
public class Flatarmal {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        System.out.println(a * b);
    }
}
