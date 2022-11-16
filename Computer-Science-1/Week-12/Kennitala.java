import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class Kennitala {
    public static void main(String[] args) {
         String kennitala = args[0];
         final int[] studull = { 3, 2, 7, 6, 5, 4, 3, 2 };
         int sum = 0;
         int[] kennitalaaASCII = new int [kennitala.length()];
         for (int i = 0; i<kennitala.length(); i++){
            kennitalaaASCII[i] = kennitala.charAt(i)-'0';
         }
         for (int j=0; j<8;j++){
            sum+=kennitalaaASCII[j] * studull[j];
         }
         int sumMod = 11 - (sum%11);
         System.out.print(sumMod);
    }
}