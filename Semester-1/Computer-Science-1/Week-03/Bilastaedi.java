/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Forritið tekur  inn á skipanalínu Bílnúmer, Gjaldflokkinn,
 *  kls sem bifreið fer inn á stæðið og  kls. sem biðfreið fer út af stæði.
 *  Til einföldunar fer bíll alltaf út af stæði sama dag og hann fer inn á það.
 *  Þið getið reiknað með að klst sem bifreið fer út af stæði sé stærri en kls sem bifreið fer inn á stæði.
 *  Forritið á að prenta út bílnúmer og  gjald (heiltala) sem er rukkað.
 *
 *
 *****************************************************************************/
public class Bilastaedi {
    public static void main(String[] args) {
        String bilnumer = args[0];
        char stafur = args[1].charAt(0);
        int tala1 = Integer.parseInt(args[2]);
        int tala2 = Integer.parseInt(args[3]);
        int tala3 = tala2 - tala1;
        switch (stafur) {
            case 'A':
                int svar = 450 * tala3;
                System.out.print(bilnumer + " " + svar);
                break;
            case 'B':
                svar = 600 * tala3;
                System.out.print(bilnumer + " " + svar);
                break;
            case 'U':
                svar = 750 * tala3;
                System.out.print(bilnumer + " " + svar);
                break;
            case 'W':
                svar = 900 * tala3;
                System.out.print(bilnumer + " " + svar);
                break;
        }

    }
}
