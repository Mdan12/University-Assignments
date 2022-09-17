/******************************************************************************
*  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
* Lýsing  : Skrifið main fall sem fær inn á skipanalínunni
* heiltöluna N. Forritið notað hreiðraðar for-lykkjur til þess að prenta út
* þríhyrning úr stjörnum, sem hefur N línur og N dálka. 
*
*
 *****************************************************************************/
public class Triangle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){  
            for(int j=1;j<=i;j++){  
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}