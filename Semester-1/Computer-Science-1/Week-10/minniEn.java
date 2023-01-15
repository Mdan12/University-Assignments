 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class minniEn {
    public static int minniEn(int[] a, int i, int j, int tala){
        int midja = (i+j) /2;
        if (tala< a[midja]){
            return minniEn(a, i, midja-1, tala);
        } else if (tala> a[midja]){
            return minniEn(a, j, midja+1, tala);
        } else {
            return (i);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int minniEn = minniEn(a, 0, a.length-1, 6);
        System.out.println(minniEn);
      }
}