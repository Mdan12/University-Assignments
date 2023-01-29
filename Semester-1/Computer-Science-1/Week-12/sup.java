 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class sup {
    public static int factorial(int n) { 
        if (n == 0) 
           return 1;
        else 
           return n *factorial(n-1);
  }
    public static void main(String[] args) {
        System.out.println(factorial(-5));
      }
}