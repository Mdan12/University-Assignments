 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Counter {
    private final String name;
    private final int maxCount;
    private int count;
    public static void main(String[] args) {
        final int N = 2;
        Counter c = new Counter("Atkvæði", 1);
        c.increment();
        c.increment();
        System.out.println ("Fyrir lykkju: "+c);
        for (int i = 0; i < N; i++) {
            c.increment();
        }
        System.out.println ("Eftir lykkju: "+c);
        System.out.println ("Gildi á teljara: "+c.value());
      }
      public Counter(String nafn, int EfriMork){
        name = nafn;
        maxCount = EfriMork;
        count = 0;
      }
      public void increment(){
        if (count<maxCount) count++;
      }
      public int value(){
        return count;
      }
      public String toString(){
        return name + ": " + count;
      }
}