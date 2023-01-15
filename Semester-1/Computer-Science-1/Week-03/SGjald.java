/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn af skipanalínu þyngd sendingar sem heiltölu og áfangastaður sendingar, 
 * E fyrir Evrópa og U fyrir utan Evrópu  
 * Reiknar út sendingakostnað sem samanstendur af grunngjaldi og aðalgjaldi. 
 *
 *
 *****************************************************************************/
public class SGjald {
    public static void main(String[] args) {
        int thyngd = Integer.parseInt(args[0]);
        char afangi = args[1].toLowerCase().charAt(0);
        if (afangi == 'e') {
            int svar = 400;
            if (thyngd <= 3 && thyngd > 0) {
                float reikningur = (float) svar + thyngd * 500;
                System.out.print(reikningur);
            } else {
                float reikningur = (float) svar + 1500 + (thyngd - 3) * 1000;
                System.out.print(reikningur);
            }

        } else if (afangi == 'u') {
            int svar = 600;
            if (thyngd <= 3 && thyngd > 0) {
                double reikningur = (double) (svar + thyngd * 500) * 1.05;
                System.out.print(reikningur);
            } else {
                double reikningur = (double) (svar + 1500 + (thyngd - 3) * 1000) * 1.05;
                System.out.print(reikningur);
            }


        }
    }
}

