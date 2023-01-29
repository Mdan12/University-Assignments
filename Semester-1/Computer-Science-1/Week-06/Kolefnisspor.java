 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Kolefnisspor {
    public static int ixFerdamati(String s, String[] safn) {
        int n = 0;
        boolean saeti = false;
        for (String t : safn){
            if (t.equals(s)){
                saeti = true;
                break;
            }
        n++;
        }
        if (!saeti)
            n = -1;
            return n;
    }
    
    public static void main(String[] args) {
        String[] farartaeki = { "Bíll", "Strætó", "Rafhlaupahjól", "Hjól", "Gangandi" };
        // prófuð stök á jöðrum fylkisins sem er ekki á jöðrunum og sem er ekki í fylkinu
        String [] inntak = {"Bíll","Gangandi", "Flugvél", farartaeki[StdRandom.uniformInt(1, farartaeki.length - 1)]
       };
        for(String s: inntak) {
            System.out.println(s + " er í sæti " + ixFerdamati(s, farartaeki));
        }
    }
}