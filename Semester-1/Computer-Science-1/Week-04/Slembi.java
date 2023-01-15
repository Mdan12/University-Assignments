 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : Engin gögn eru lesin inn af skipanalínu.
* Skrifið main-fall sem kallar á fallið  StdRandom.uniform(0.0,1.0) og skrifar út slembitöluna sem uniform skilar
* á meðan slembitalan er minni en 0.8 (þ.e. forritið hættir um leið og slembitala ≥ 0.8). Notið while-lykkju til að
* leysa þetta verkefni.
*
*
 *****************************************************************************/
 public class Slembi {
    public static void main(String[] args) {
        double xtra = StdRandom.uniformDouble(0.0, 1.0);
        while (xtra <= 0.8) {
            System.out.println(xtra);
            xtra = StdRandom.uniformDouble(0.0, 1.0);
        }
    }
 }