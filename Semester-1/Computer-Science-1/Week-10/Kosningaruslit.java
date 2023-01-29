import java.util.Scanner;
import java.util.Arrays;

public class Kosningaruslit{
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		int[] flokkar = new int[s.nextInt()];
		String svaedisplit = s.nextLine();
        String[] svaedi = svaedisplit.split(" ");
		int[] svaediSum = new int[svaedi.length];
		while(s.hasNextLine());{
			String[] lina = s.nextLine().split(" ");
			int stjornflokkur = Integer.parseInt(lina[0]);
			String kjordaemi = lina[1];
			int atkvaedi = Integer.parseInt(lina[2]);
			flokkar[stjornflokkur-1] += atkvaedi;
			for (int i = 0; i<svaediSum.length; i++){
				if (svaedi[i].equals(kjordaemi)){
					svaediSum[i] += atkvaedi;
                }
            }
        }
        System.out.println("akvaedi flokka" + Arrays.toString(flokkar));
        System.out.println("atkvaedi kjordaema" + Arrays.toString(svaediSum));
    }
} 
		
