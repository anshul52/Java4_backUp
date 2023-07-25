import java.util.Scanner;

//108- Extend the prev question and capitalize first & last character of each word in the sentence and
//  print the new sentence
//      Ex - 	Hello bhai Kaise ho a
//	         HellO BhaI KaisE HO Aap
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) {
                res = res + words[i].toUpperCase() + " ";
            } else {
                res += Character.toString(words[i].charAt(0)).toUpperCase();
                res = res + words[i].substring(1, words[i].length() - 1);
                res = res + words[i].substring(words[i].length() - 1).toUpperCase() + " ";
            }
        }
        System.out.println(res);
    }
}
