 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Ferdataska {
    public static void main(String[] args) {
        final String[] fatnadur = {
                "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13", "A14",
                "A15", "A16"
        };
        final int[] vigt = { 1, 2, 3, 2, 1, 4, 3, 2, 5, 7, 3, 1, 3, 6, 4, 2 };
        final int n=vigt.length;
        int mestiFjoldi = Integer.parseInt(args[0]);
        int mestaThyngd = Integer.parseInt(args[1]);
        int cntvigt = 0;
        int cntFjoldi = 0;
        for (int i = 0; i<mestiFjoldi && i<mestaThyngd; i++){
            int summa = StdRandom.uniform(i, n);
            if (cntvigt + vigt[summa] <= mestaThyngd) {
                cntvigt += vigt[summa];

                String a = fatnadur[i];
                fatnadur[i] = fatnadur[summa];
                fatnadur[summa] = a;

                int inta = vigt[i];
                vigt[i] = vigt[summa];
                vigt[summa] = inta;

                cntFjoldi++;

            }
        }

        System.out.println("Þú settir eftirfarandi " + cntFjoldi +  " hluti í ferðatöskuna sem vegur " + cntvigt + "kg");
        for (int i =0; i <cntFjoldi; i++) {
            System.out.print(fatnadur[i] + ":" + vigt[i] + " ");
        }
    }
}