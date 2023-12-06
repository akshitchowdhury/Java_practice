package Strings;

import org.w3c.dom.ls.LSOutput;

public class S_palindrome {

public static boolean ispalindrome(String st) {

    int start = 0;
    int end = st.length() - 1;

    while (start < end) {

        if (st.charAt(start) == st.charAt(end)) {

            return true;

        }
        start++;
        end--;
//        else
//            return false;

    }
return false;

}

    public static void main(String[] args) {
//        Check if string is palindrome or not
        System.out.println(ispalindrome("runurav"));

    }


}
