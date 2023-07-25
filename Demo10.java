//110- Leetcode 1704 - Determine if String Halves Are Alike
public class Demo10 {
    static boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2).toLowerCase();
        String b = s.substring(s.length() / 2).toLowerCase();

        int aVowel = 0;
        int bVowel = 0;

        for (int i = 0; i < a.length(); i++) {
            int ch1 = a.charAt(i);
            int ch2 = b.charAt(i);

            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                aVowel++;
            }
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                bVowel++;
            }
        }
        return aVowel == bVowel;
    }

    public static void main(String[] args) {
          String word = "book";
          boolean b = halvesAreAlike(word);
        System.out.println(b);
    }
}
