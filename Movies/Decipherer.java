package Movies;

public class Decipherer {

    public static String reverse (String word)  {

        int len = word.length();
        String strReverse = "";
        for(int a = len - 1; a >= 0; a--) {

            strReverse = strReverse + word.charAt(a);
        }
        return strReverse;
    }

   public static String décoder (String message) {

        int length = message.length();
        int keyNumber = (int) length/2;
        int endIndex = (int) keyNumber + 5;
        String subChain = message.substring(5, endIndex );
        String corrected = subChain.replace("@#?"," ");
        String reversed = reverse(corrected);
        System.out.println(reversed);
        return reversed;
    }

    public static void main (String[] args) {

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
              
        décoder(message1);
        décoder(message2);
        décoder(message3);
    }
}