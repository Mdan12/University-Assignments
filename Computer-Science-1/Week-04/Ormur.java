 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Ormur {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=n;++i){  
            for(int j=1;j<=i;++j){  
                    System.out.print("*");
            }
            System.out.print(i);
        }
    }
}