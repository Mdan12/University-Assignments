/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2(hjá)hi.is
 *
 *  Lýsing  : private aðferð sem reiknar út summu af tveimmur hæstu tölum í falli og skilar því.
 *  Í aðal aðferð er svo hægt að notfæra private aðferð til þess að reikna summu af hæstu tveimur tölum í falli.
 *
 *****************************************************************************/
public class Summa {

  public static int tveirStaerstu(int[] a) {
    int largestA = a[0]; //fyrsta stak i fylki a.
    int largestB = 0;
    for (int i = 0; i < a.length; i++) {
        //Ef stak í fylkinu a er stærra en fyrsta stakið í fylkinu þá breytist largestB í stærðina á því staki og largestA breytist í stakið.
      if (a[i] > largestA) {
        largestB = largestA;
        largestA = a[i];
        //Þegar LargestA er orðið stærsta stakið og largestB er orðin sama tala þá fer loopan aftur að leita að hæstu tölu í fylkinu sem er ekki
        //largestA en samt stærsta tala sem kemur á eftir largestA.
      } else if (a[i] > largestB && a[i] != largestA) {
        largestB = a[i];
      }
    }
    //Þetta skilar svo summuna af tveimur hæstu tölunum í þessu methodi.
    return largestA + largestB;
  }

  public static void main(String[] args) {
    int[] fylkiGefid1 = { 2, 3, 10, 11, 9 };
    System.out.println(tveirStaerstu(fylkiGefid1));
    int[] fylkiGefid2 = { 100, 200 };
    System.out.println(tveirStaerstu(fylkiGefid2));
  }
}
