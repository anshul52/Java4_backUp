//113- Check Two Strings are Anagram or NotAnagrams words have the same word length & same character count
//        Examples of anagram words are arc and car, state and taste, night and thing etc.
public class Demo13 {
    static void isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();
        if (a != b) {
            System.out.println("not anagrams");
            System.exit(0);
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s.length();i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            arr1[ch1-97]++;
            arr2[ch2-97]++;
        }
        int temp =0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>0 && arr2[i]>0) {
                if(arr1[i]==arr2[i]) {
                    temp++;
                }
            }
        }
        String ans = (temp==s.length()) ? "is anagram":"is not anagram";
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String a = "caaar";
        String b = "arrrc";
        isAnagram(a, b);
    }
}
