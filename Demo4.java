//104- Pallindromic String using method and Two pointer algorithm (hint: Array reverse algo)
public class Demo4 {
    static  boolean isPallin(String n) {

        int i=0, j=n.length()-1;
        boolean ans =true;
        while(i<=j)
        {
            if(n.charAt(i)!=n.charAt(j))
            {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        return ans;
    }
    public static void main(String[] args) {
          String n ="naman";
         boolean s=  isPallin(n);
         String temp = (s)? "is Pallindromic": "is not pallindromic" ;
        System.out.println(temp);
    }
}
