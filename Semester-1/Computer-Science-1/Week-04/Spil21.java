 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : main fall í klasanum Spil21 sem er nálgun á spilinu 21. Heiltala er fengin inn af skipanalínu og sett í breytuna n. 
* Dregin eru í mesta lagi n fjöldi spila. Dragið spil (breytan spil) af handahófi sem hefur gildið á bilinu 1-12, leggið spilið
* efst í bunkann og leggið það við summu (breytan summa) spilanna sem eru í bunkanum. Forritið þarf ekki að geyma spilin í bunkanum. 
* Ef dregin hafa verið n spil og summan er minni en 21 þá
* prentast út ekki fleiri sénsar og summan er prentuð út. Ef summan er orðin stærri
* en 21 þá hættirðu og prentar út Sprunginn og summan, en ef summan er jafnt og 21
* þá er prentað út Vinningur og summan. Eftir það hættir forritið.
*
*
 *****************************************************************************/
 public class Spil21 {
    public static void main(String[] args) {
        int spil;
        int n = Integer.parseInt(args[0]);
        int summa = 0;
        for (int i=0; i < n; i++) {
            spil = StdRandom.uniformInt(1, 13);
            summa += spil;
            if (summa >=21) {
                break;
            }
        }
        if (summa < 21){
            System.out.print("Ekki fleiri sénsar ");
        } else if (summa > 21) {
            System.out.print("Sprunginn ");
        } else {
            System.out.print("Vinningur ");
        }
        System.out.print(summa);
      }
}