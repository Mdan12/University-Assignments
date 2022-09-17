/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn radíus kúlu sem kommutölu af skipanalínu og prentar út rúmmál hennar.
 *
 *
 *****************************************************************************/

public class RummalKulu {
    public static void main(String[] args) {
        Double number = Double.parseDouble(args[0]);
        Double number1 = Math.pow(number, 3);
        Double math = (4.0 / 3.0) * Math.PI * number1;
        System.out.println(math);
    }
}
