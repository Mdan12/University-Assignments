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
        int n = 10;
        int k = 3;
        for(int i=0;i<=n;i+=2){  
            for(int j=0;j<k;j++){  
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}