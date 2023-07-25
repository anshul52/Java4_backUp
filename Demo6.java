//106- Toggle each alphabet of String
//        In - AcgDfD Output - aCGdFd

public class Demo6 {
    static String toggleString(String s)
    {
        char [] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='A' && ch[i]<='Z'))
            {
                ch[i] = (char)(ch[i] + 'a'-'A');
            }
            else if (ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char)(ch[i] + 'A'-'a');
            }
        }
        String sm = String.valueOf(ch);
        return  sm;
    }
    public static void main(String[] args) {
        String n ="hiManShU";
        String p = toggleString(n);
        System.out.println(p);
    }
}
