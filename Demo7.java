import java.util.Scanner;

//107- Accept a space seperated sentence and split in into words.
//Print each word on a new line with first letter capitalized.
//      IN-        Hello bhai kaise ho
//      OP-        Hello
//                 Bhai
//                 Kaise
//                 Ho
public class Demo7 {
    public static String capitalize(String word) {
        if(word.length()<=2) return word.toUpperCase();

        String first = Character.toString(word.charAt(0)).toUpperCase();
        String second = word.substring(1, word.length() - 1);
        String third = Character.toString(word.charAt(word.length() - 1)).toUpperCase();
        return first +second +third;
}

    public static void main(String[] args) {
        String sentence = "hello bhai kaise a", res = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            res += capitalize(word) + " ";
        }
//        res = res.trim();
        System.out.println(res);
    }
}
