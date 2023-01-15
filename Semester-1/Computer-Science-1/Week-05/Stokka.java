/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn tölur sem args, setur í array og gerir svo random röðun
 *  á því array og prentar því á console.
 *
 *****************************************************************************/
public class Stokka {

  public static void main(String[] args) {
    int N = args.length;
    int[] fylki = new int[N];

    for (int i = 0; i < N; i++){
      fylki[i] = Integer.parseInt(args[i]);
    }

    for (int i = 0; i < N; i++){
      int r = StdRandom.uniform(i, N);
      int t = fylki[i];
      fylki[i] = fylki[r];
      fylki[r] = t;
      System.out.print(fylki[i]+ " ");
    }
  }
}


