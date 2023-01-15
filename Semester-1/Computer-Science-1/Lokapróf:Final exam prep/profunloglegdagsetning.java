 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class  profunloglegdagsetning{

    public static boolean erHlaupAr (int ar){
        return (ar%4==0);
    }

    public static boolean erLogLegDagsetning (int d, int m, int ar){
        int dagar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (erHlaupAr(ar)){
            dagar[1]=29;
        }
        if (ar>=0 && ar<=2400){
            if (m>0 && m<=12){
            if(d<=dagar[m-1] && d>0){
                return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int ar = 2016;
        int d = 29;
        int m = 2;
        boolean a = erLogLegDagsetning(d, m, ar);
        boolean b = erHlaupAr(ar);
        System.out.println(a);
        System.out.println(b);
      }
}