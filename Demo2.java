//102- Accept a string and print it in reverse order
import java.util.Scanner;
public class Demo2 {
    static void reverseString(String n)
    {
        char arr[] = n.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+"");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String n = sc.nextLine();
         reverseString(n);
    }
}
