import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Summa {
    public static void main(String[] args) {
        int[][] tolur = {
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
            { 4, 3, 2, 1 },
            { 1, 1, 1, 1 }
    };
    int test1 = summa(1, 1, tolur);
    int test2 = summa(2, 2, tolur);
    System.out.println(Arrays.deepToString(tolur));
    System.out.println(test1);
    System.out.println(test2);
      }

    public static int summa(int i, int j, int [][] tolur ) {
        int summa = 0;
        summa += tolur[i][j-1];
        summa += tolur[i-1][j];
        summa += tolur[i+1][j];
        summa += tolur[i][j+1];
        summa += tolur[i-1][j-1];
        summa += tolur[i+1][j+1];
        summa += tolur[i+1][j-1];
        summa += tolur[i-1][j+1];
        return summa;

    }
        
}