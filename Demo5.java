
public class Demo5 {
    public static void main(String[] args) {
        String s= "hello brother how are you";
        int consonent= 0 , vowel=0;
        for(char ch : s.toCharArray())
        {
            switch(ch)
            {
                case 'a','e','i','o','u'->vowel++;
                default -> consonent++;
            }
        }
        System.out.println("consonent : "+ consonent);
        System.out.println("vowel : "+ vowel);
    }
}
