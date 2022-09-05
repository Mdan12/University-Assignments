/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn heiltölu af skipanalínu sem táknar gasmengun og prentar út Góð ef talan
 *    er á bilinu 0-350 að báðum tölum meðtöldum en Ekki góð ef talan er stærri en 350.
 *    ef talan er lægri en 0 er prentað út Ólöglegt gildi
 *    Ef sett er inn kommutala eða bókstafir, þ.e. ekki  heiltala þá er prentuð út villumelding Ólöglegt snið tölu.
 *
 *
 *****************************************************************************/
public class Gasmengun {
    public static void main(String[] args) {
        try {
            int gas = Integer.parseInt(args[0]);
            if (gas < 0) {
                System.out.print("Ólöglegt gildi");
            } else if (gas <= 350) {
                System.out.print("Góð");
            } else {
                System.out.print("Ekki góð");
            }
        } catch (NumberFormatException e) {
            System.out.print("Ólöglegt snið tölu");
        }
    }
}
