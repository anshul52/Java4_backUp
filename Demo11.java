//111- Take a string and to modify a word by bringing all the vowels in the word at the beginning
//followed by the consonants.
//         Example : ORIGINAL becomes OIIARGNL
import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String a = sc.nextLine();

          String vowel = "";
          String conso = "";

          for(int i=0;i<a.length();i++)
          {
              char ch = a.charAt(i);
              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              {
                  vowel += ch;
              }
              else {
                  conso +=ch;
              }
          }
        System.out.println(vowel.concat(conso));
    }
}
