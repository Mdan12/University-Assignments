 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : Forritið tekur inn heiltöluna lengdOrms af skipanalínu  og fyrir hverja tölu i = 1,2,...lengdOrms  
prentar út jafnmargar störnur og talan i segir til um og þar á eftir töluna i. Þið getið reiknað með að lengdOrms sé > 0. 
* Ekki má nota if-setningu.
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