 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Deilanlegur {

    public static String runa(int fjoldi, int tala, int[] gogn){
        int fjoldi1 = 0;
        String a = "";
        for (int i = 0; i<gogn.length; i ++){
            if (fjoldi1 ==fjoldi) return a;
            if (gogn[i]%tala == 0){
                a += (fjoldi1++)+1 + "/" + fjoldi + ":" + gogn[i];
                if (fjoldi1 <fjoldi) a += "\n";
            }
            
        }
        return a;
    }
    public static void main(String[] args) {
        int fjoldi = 2;
        int tala = 5;
        int[] gogn = {5, 3, 25, 15};
        System.out.println(runa(fjoldi, tala, gogn));
      }
}