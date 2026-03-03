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

        String reversed = "";


       char[] characters = original.toCharArray();



        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));

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




        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }


        String input="madam";
        boolean isPalindrome=true;
        String reversed="";
        int n=input.length();
        for(int i =n;i>=0;i--) {
            reversed=reversed+input.charAt(i);
        }

        if(input.equals(reversed)) {

            System.out.println("Is it Palindrome "+isPalindrome);
        }


        String input = "madams";

        boolean isPalindrome = true;


        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input Text: " + input);
        System.out.println("Is it Palindrome: " + isPalindrome);


    }



}
