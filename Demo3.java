//103- Check if the string is Pallindromic or not
public class Demo3 {
    static Boolean isPallin(String s)
    {
        String rev = "";
        Boolean ans = false;

        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args) {
        String n = "naman";
        n = n.toLowerCase();
        boolean temp = isPallin(n);
        System.out.println(temp);

    }
}
