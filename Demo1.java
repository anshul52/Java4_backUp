//101- Accept a string from user and print its each character on a new line
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  n = sc.nextLine();
        for(int i=0;i<n.length();i++)
        {
            System.out.println(n.charAt(i)+"");
        }
    }
}