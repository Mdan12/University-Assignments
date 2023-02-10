public class Card implements Comparable<Card>{
    private int rank;
    private int suit;
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public int compareTo(Card c) { 
      if (this.suit < c.suit) return -1; 
      if (this.suit > c.suit) return +1; 
      if (this.rank == 1) { 
          if (c.rank == 1) return 0; 
          else return +1; 
      } else { 
          if (c.rank == 1) return -1; 
          else { 
              if (this.rank < c.rank) return -1; 
              if (this.rank > c.rank) return +1; 
          } 
      } 
      return 0; 
  } 
    public String toString(){
        String suits[] = {"S", "H", "D", "C"};
        String ranks[] = {"A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"};
        return suits[this.suit] + "-" + ranks[this.rank-1];
    }

    public static void main(String[] args) {
      Card a = new Card(2, 1);
      System.out.println(a);
    }
}


