 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/

public class DecHex {

    public static void main(String[] args) {
            int tala = Integer.parseInt(args[0]);
            String [ ] sextan = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F"};
            String s = "";
            int rem;
            while(tala != 0){
                rem = tala%16;
                s = sextan[rem] + s;
                tala = tala/16;
            }
            System.out.println(s);
        }   
    
    }