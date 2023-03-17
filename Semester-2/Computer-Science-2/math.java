 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class math {

    public static int calc(int k){
        int answer = (3*k+5)%11;
        return answer;
    }

    public static void main(String[] args) {
        int [] a = {31, 67, 53, 34, 89, 40, 78, 77};
        for (int i=0; i<a.length;i++){
            int b = calc(a[i]);
            System.out.println("$(3*"+a[i]+"+5)%11=" + b + "$");
        }
      }
}