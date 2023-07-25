//109- Accept a string and print the frequency of each character present in the string
import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String sen = sc.nextLine();

        int arr[] = new int[26];  //(bit map)
        for(int i=0;i<sen.length();i++)
        {
            char ch = sen.charAt(i);
            arr[ch-97]++;
        }

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]> 0)
            {
                System.out.println((char)(i+97) + "-->"+arr[i]);
            }
        }
    }
}
