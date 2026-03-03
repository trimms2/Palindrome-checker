import java.util.*;
public static void main(String[] args) {

    String original = "A man a plan a canal Panama";

    String normalized = original.replaceAll("\\s+", "").toLowerCase();

    int start = 0;
    int end = normalized.length() - 1;

    boolean isPalindrome = true;

    while (start < end) {
        if (normalized.charAt(start) != normalized.charAt(end)) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    if (isPalindrome) {
        System.out.println(original + " is a Palindrome.");
    } else {
        System.out.println(original + " is NOT a Palindrome.");
    }
}




}
