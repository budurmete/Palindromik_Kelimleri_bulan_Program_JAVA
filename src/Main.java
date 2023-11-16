
public class Main {
    static  boolean isPolindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))//ilk elemanı sıfıncı eleemnana vericek
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPolindrome2(String str) {
        String reverse = "";
        for (int i= str.length()-1; i>=0;i--)
        {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);

    }

    public static void main(String[] args) {
        System.out.println(isPolindrome2("abba"));
    }

}