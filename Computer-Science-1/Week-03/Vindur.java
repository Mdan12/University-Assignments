/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn heiltölu m/s af skipanalínu og prentar út orðið:
 *  *  Ofsaveður ef talan er stærri en 31, Fárviðri ef hún er 29-31,
 *  *  Rok ef hún er 24-28 og Annað ef talan er minni en 24.
 *  *  Ólöglegt ef heiltalan er minni en 0.
 *
 *
 *****************************************************************************/
public class Vindur {
    public static void main(String[] args) {
        int wind = Integer.parseInt(args[0]);
        if (wind > 31) {
            System.out.print("Ofsaveður");
        } else if (wind > 29) {
            System.out.print("fáviðri");
        } else if (wind > 24) {
            System.out.print("Rok");
        } else if (wind > 0) {
            System.out.print("Annað");
        } else if (wind < 0) {
            System.out.print("Ólöglegt");
        }
    }
}
