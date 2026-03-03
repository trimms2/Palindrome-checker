import java.util.*;
public class Main {
    public static void main(String[] args) {



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


    }

}
